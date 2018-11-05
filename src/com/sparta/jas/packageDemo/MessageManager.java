package com.sparta.jas.packageDemo;

public class MessageManager {
    public MessageManager(){

    }
    public MessageManager(String name){
        this.name = name;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
