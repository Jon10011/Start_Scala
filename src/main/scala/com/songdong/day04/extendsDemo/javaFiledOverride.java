package com.songdong.day04.extendsDemo;

public class javaFiledOverride {
    public static void main(String[] args) {


        /**
         * 1，对于同一个对象，用父类的引用去取值（字段）会获取到父类字段的值
         * 2，用子类的引用去取值（字段），则取到子类字段的值
         */

        Sub2 c1 = new Sub2();
        System.out.println(c1.s);//sub

        System.out.println(((Super2)c1).s);//强转，super

        Super2 c2 = new Sub2();
        System.out.println(c2.s);//super

    }
}

class Super2 {
    String s = "super";
}

class Sub2 extends Super2{
    String s = "sub";
}