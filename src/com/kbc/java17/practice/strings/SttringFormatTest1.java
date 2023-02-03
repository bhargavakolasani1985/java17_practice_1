package com.kbc.java17.practice.strings;

public class SttringFormatTest1 {
    public static void main(String[] args) {
        var base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length();
        int translate = base.translateEscapes().length();

        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);
    }
}