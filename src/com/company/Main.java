package com.company;

public class Main{

    public static void main(String[] args) {
        System.out.println(section1());
        System.out.println(section2());
        System.out.println(section3());
        System.out.println(section4());
    }

    public static String section1() {
        // variable decralation
        int num = 42; double average = 95.5; char letter = 'A'; boolean isTrue = true;
//         return the values as a string
        return "num: " + num + "\n" +
                "average: " + average + "\n" +
                "letter: " + letter + "\n" +
                "isTrue: " + isTrue + "\n";
    }

    public static String section2() {
        // Write section 2
        int num = 42; double average = 95.5; char letter = 'A'; boolean isTrue = true;
        int sum = num +25;
        double product = average * 2;
        int modulus = num % 10;
        boolean logicAND = isTrue && false;

        // return the values as string
        return "Sum: " + sum + "\n"+
                "Product: " + product + "\n"+
                "Modulus: " + modulus + "\n"+
                "Logic And: " + logicAND + "\n";
    }

    public static String section3() {
        // Write section 3
        int num = 42; double average = 95.5; char letter = 'A'; boolean isTrue = true;
        // introduce new variable that hold the squared value
        int squaerdI = 0;
        int newNum =0;
        int i;
        for (i=1; i<= 10; i++){
            squaerdI = (int) Math.pow(i,2);
        };

        while (num < 100) {
            newNum = num * 2;
        }
        return "Squared iteration: "+ squaerdI + "\n" +
                "New Num value: "+ newNum +"\n";

    }

    public static String section4() {
        // Write section 4 code here
        int num = 42; double average = 95.5; char letter = 'A'; boolean isTrue = true;
        return "hello";
    }

}
