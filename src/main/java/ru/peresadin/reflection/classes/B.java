package ru.peresadin.reflection.classes;

public class B {
    public int x;
    public int y;
    protected int z;

    public B() {

    }

    public B(int x) {
        y = 30;
        z = 40;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
