package com.sparta.jas;

import com.sparta.jas.packageDemo.MessageManager;

public class Main {

    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
        messageManager.setName("General Kenobi");
        String name = messageManager.getName();
        System.out.println("Hello There!\n" + name + "!");
    }
}
