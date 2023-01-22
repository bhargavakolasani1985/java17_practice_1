public class StringTest3 {
    public static void main(String[] args) {
        String s1 = """
        abc
        """;
        String s2 = """
        abc""";
        String s3 = """
        abc\n""";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println(s3);
        System.out.println(s3.length());
    }
}