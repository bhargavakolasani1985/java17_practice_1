package com.kbc.java17.practice.var.type;

public class TestVarType2 {
    public static void scary(String animal) {
        var dino = (String s) -> "dino".equals(animal);
        var dragon = s -> "dragon".equals(animal);
        var combined = dino.or(dragon);
        System.out.println(combined.test(animal));
    }
    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }

}
