package com.homework.basicConstructions;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        byte b = 10;
        int a = 13 + b;
        short c = 200;
        int d = 60000;
        long myLongValue = 456789L;
        float myFloatValue = 23.56F;
        double myDoubleValue = 54.56;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("long = " + myLongValue);
        System.out.println("float = " + myFloatValue);
        System.out.println("double = " + myDoubleValue);

        double sum = a + b + c + d + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("Sum = " + sum);

        float floatResult = myFloatValue / 3;
        System.out.println("FloatResult = " + floatResult);

        double DoubleResult = myFloatValue / 3;
        System.out.println("DoubleResult = " + DoubleResult);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '~';
        char char5 = '©';
        System.out.println("Characters:");
        System.out.println("Character 1: "+char1);
        System.out.println("Character 2: "+char2);
        System.out.println("Character 3: "+char3);
        System.out.println("Character 4: "+char4);
        System.out.println("Character 5: "+char5);
        System.out.println("Sum characters:" + (char1+char2+char3+char4+char5));

    }
}
