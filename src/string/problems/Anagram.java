package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a ="CAT";
        String b ="ACT";
        String c ="ARMY";
        String d ="MARY";

        System.out.println(anagramMethod(a,b));
        System.out.println(anagramMethod(c,d));
        System.out.println(anagramMethod(a,c));
    }

    public static boolean anagramMethod(String k, String l) {

        char[] ArrayOfCharFromStringK = k.toCharArray();
        char[] ArrayOfCharFromStringL= l.toCharArray();
        Arrays.sort(ArrayOfCharFromStringK);
        Arrays.sort(ArrayOfCharFromStringL);

        return Arrays.equals(ArrayOfCharFromStringK,ArrayOfCharFromStringL);


    }
}
