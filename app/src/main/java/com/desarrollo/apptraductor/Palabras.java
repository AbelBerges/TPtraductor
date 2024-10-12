package com.desarrollo.apptraductor;

import android.media.Image;

public class Palabras {
    private String enEsp;
    private String enIng;
    private int imag;

    public Palabras(String enEsp, String enIng, int imag){
        this.enEsp = enEsp;
        this.enIng = enIng;
        this.imag = imag;
    }

    public String getEnEsp(){
        return this.enEsp;
    }

    public void setEnEsp(String esp){
        this.enEsp = esp;
    }

    public String getEnIng(){
        return this.enIng;
    }

    public void setEnIng(String ing){
        this.enIng = ing;
    }

    public int getImag(){
        return this.imag;
    }

    public void setImag(int imag){
        this.imag = imag;
    }
}
