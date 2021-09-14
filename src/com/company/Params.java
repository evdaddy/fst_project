package com.company;

public class Params {
    int x, y;
    public Params(int x , int y){
        this.x = x;
        this.y = y;
    }

    public Params() {
        this.x = (int)(Math.random() * 50);
        this.y = (int)(Math.random() * 50);
    }

    @Override
    public String toString() {
        return "Params{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

}
