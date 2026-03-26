package com.homework.basicConstructions;

public class TaskOneOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int c = a + b;
        int d = c - b;

        int e = a * b;
        double f = (double) a / b;

        int g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        a += 5;
        b += 1;
        c++;
        System.out.println("new a = " + a);
        System.out.println("new b = " + b);
        System.out.println("new c = " + c);

        int n = 7;
        int m = 7;
        int res1 = 2 * n++;
        int res2 = 2 * ++m;

        System.out.println("Result 1: " + res1);
        System.out.println("Result 2: " + res2);

        int x = 5;
        int y = 7;
        int z = 10;

        boolean val1 = x == y;
        boolean val2 = y != z;
        boolean val3 = z < y;

        boolean result1 = val1 && val2;
        boolean result2 = val2 || val3;

        System.out.println("val1: " + val1);
        System.out.println("val2: " + val2);
        System.out.println("val3: " + val3);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int res = x > y ? x : y;
        System.out.println("result: "+res);

        int terRes = x > y || z > x ? x : y;
        System.out.println("result: "+terRes);



    }
}
