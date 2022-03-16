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

class Data2 {
    Path path;
    AsynchronousFileChannel file;
    ByteBuffer buffer;
}

public class AsynchronousFileChannelReadTest {
    public static void main(String[] args) throws Exception {
        int procs = Runtime.getRuntime().availableProcessors();
        ExecutorService exec = Executors.newFixedThreadPool(procs);

        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("C:\\Users\\ham.juyoung\\Documents\\KNOU\\Java\\java_project\\src\\main\\java\\com\\example\\project1\\nio\\file" + i + ".txt");

            Files.createDirectories(path.getParent());
            EnumSet<StandardOpenOption> ops = EnumSet.of(StandardOpenOption.READ);
            AsynchronousFileChannel file = AsynchronousFileChannel.open(path, ops, exec);
            ByteBuffer buffer = ByteBuffer.allocate((int) file.size());

            Data2 data = new Data2();
            data.path = path;
            data.file = file;
            data.buffer = buffer;

            CompletionHandler<Integer, Data2> handler = new CompletionHandler<Integer, Data2>() {
                @Override
                public void completed(Integer result, Data2 data) {
                    data.buffer.flip();
                    Charset charset = Charset.defaultCharset();
                    String txt = charset.decode(data.buffer).toString();
                    System.out.print(data.path.getFileName() + " : " + txt);
                    System.out.println(" - " + Thread.currentThread().getName());

                    try {
                        data.file.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

                @Override
                public void failed(Throwable exc, Data2 data) {
                    exc.printStackTrace();

                    try {
                        data.file.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };

            file.read(buffer, 0, data, handler);
        }

        exec.shutdown();
    }
}
