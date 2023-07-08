package basics;

import java.util.Scanner;

public class StringPalindromeSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//Getting two inputs from user
        String s2 = sc.next();
        String s3 = s1+s2;//concatenating two strings
        System.out.println(s3);

        String one = s3.replaceAll("[^a-zA-Z]","");
        //replaceAll function omits the all special characters and returns only alphabets
        //if we want numbers put ^a-zA-z0-9 it accepts numbers also

        reverse(one);


    }
    static void reverse(String one){


        StringBuilder sb = new StringBuilder(one.toLowerCase()).reverse();//reverse two strings using string builder
        //String utils also used this method
        System.out.println("StringBuilder form "+sb);//sb is a string builder form it is not a string

        String str = sb.toString();//converting string builder into string
        System.out.println(str);//printing in string format

        //perform palindrome
        if(str.equals(one)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
