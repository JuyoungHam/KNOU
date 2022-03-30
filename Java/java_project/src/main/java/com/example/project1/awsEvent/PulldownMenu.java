package com.example.project1.awsEvent;

import java.awt.*;
import java.awt.event.ActionListener;

public class PulldownMenu extends Frame {
    MenuBar menuBar;
    ActionListener listener;

    public void setMenu() {
        Menu menu, subMenu;
        menuBar = new MenuBar();
        menu = new Menu("Menu1");
        menu.add(new MenuItem("MenuItem1"));
        subMenu = new Menu("SubMenu1", true);
        subMenu.add(new MenuItem("SubMenuItem1"));
        subMenu.add(new MenuItem("SubMenuItem2"));
        menu.add(subMenu);
        menu.add(new MenuItem("MenuItem2"));
        menuBar.add(menu);
        setMenuBar(menuBar);

        for (int i = 0; i < menuBar.getMenuCount(); i++) {
            menu = menuBar.getMenu(i);
            registerListener((MenuItem) menu);
        }
    }

    private void registerListener(MenuItem mi) {
        mi.addActionListener(listener);
        if (mi instanceof Menu) {
            Menu mm = (Menu) mi;
            for (int i = 0; i < mm.getItemCount(); i++) {
                registerListener(mm.getItem(i));
            }
        }
    }

    public PulldownMenu() {
        super("Pulldown");
        listener = new MyListener();
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        PulldownMenu f = new PulldownMenu();
        f.setMenu();
    }
}
