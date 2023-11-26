package com.kbc.java17.practice.innerclass;

public class InnerClassTest9 {
    private int hue = 10;
    private static int x = 20;
    private enum Range {HIGH, LOW;}
    public class Shade {
        private static int x = 30;
        public int hue = InnerClassTest9.this.hue;
    }
    public static class Color {
        private int x = 40;
    }
    public static void main(String... lighting) {
        System.out.println(new InnerClassTest9().new Shade().hue);
        System.out.println(x);
        System.out.println(Shade.x);
        System.out.println(new Color().x);
    }

}
