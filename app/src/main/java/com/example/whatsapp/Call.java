package com.example.whatsapp;

public class Call {

    private int image_call;
    private String Call_name;
    private int call_img ;

    public Call(int image_call, String call_name) {
        this.image_call = image_call;
        this.Call_name = call_name;
        this.call_img = R.drawable.ic_call_black_24dp;
    }

    public int getImage_call() {
        return image_call;
    }

    public String getCall_name() {
        return Call_name;
    }

    public int getCall_img() {
        return call_img;
    }
}
