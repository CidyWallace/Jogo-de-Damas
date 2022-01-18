package com.example.jogodedamas;

public class Posicao {
    private int x;
    private int y;

    public Posicao(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "X "+x +" Y "+ y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
