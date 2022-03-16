package com.example.project1.nio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Data {
    Path path;
    AsynchronousFileChannel file;
}

public class AsynchronousFileChannelWriteTest {
    public static void main(String[] args) throws Exception {
        int procs = Runtime.getRuntime().availableProcessors();
        ExecutorService exec = Executors.newFixedThreadPool(procs);

        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\file" + i + ".txt");

            Files.createDirectories(path.getParent());
            EnumSet<StandardOpenOption> ops = EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            AsynchronousFileChannel file = AsynchronousFileChannel.open(path, ops, exec);

            Data data = new Data();
            data.path = path;
            data.file = file;

            Charset charset = Charset.defaultCharset();
            ByteBuffer buffer = charset.encode("안녕하세요");

            CompletionHandler<Integer, Data> handler = new CompletionHandler<Integer, Data>() {
                @Override
                public void completed(Integer result, Data data) {
                    System.out.print(data.path.getFileName() + " : " + result);
                    System.out.println(" bytes written : " + Thread.currentThread().getName());

                    try {
                        data.file.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

                @Override
                public void failed(Throwable exc, Data data) {
                    exc.printStackTrace();
                    try {
                        data.file.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };

            file.write(buffer, 0, data, handler);
        }

        exec.shutdown();
    }
}
