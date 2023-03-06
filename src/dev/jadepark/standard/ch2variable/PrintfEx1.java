package dev.jadepark.standard.ch2variable;

public class PrintfEx1 {

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        float d = 100.1f;

        int finger = 10;
        long big = 100_000_000_000L;    //long bing = 100000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   //8진수 10, 10진수로 8
        int hexNum = 0x10;  //16진수 10, 10진수로 16
        int binNum = 0b10;  //2진수 10, 10진수로 2


        String str = "+" + Double.toString(d);
        System.out.println(str);
        double num = Double.parseDouble(str);
        System.out.println(num);

        System.out.println(Double.parseDouble(String.valueOf(d)));
        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);

    }
}
