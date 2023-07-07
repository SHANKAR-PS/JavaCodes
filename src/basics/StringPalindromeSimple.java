package basics;

import java.util.Scanner;

public class StringPalindromeSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//Getting two inputs from user
        String s2 = sc.next();
        String s3 = s1+s2;//concatenating two strings
        System.out.println(s3);

        StringBuilder sb = new StringBuilder(s3).reverse();//reverse two strings using string builder
        //String utils also used this method
        System.out.println(sb);//sb is a string builder form it is not a string

        String str = sb.toString();
        System.out.println(str);//printing in string format

    }
}
