package ru.peresadin.reflection;

import ru.peresadin.reflection.classes.B;
import ru.peresadin.reflection.classes.C;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.x = 300;
        System.out.println("C x = " + c.x);
        System.out.println("C get x= " + c.getX());
        B b = new B();
        b.setY(10);
        b.setZ(30);
        ReflectionUtils.createDerived(b, C.class);
        System.out.println(c.getX() + " " + c.getY() + " " + c.getZ());
    }
}
