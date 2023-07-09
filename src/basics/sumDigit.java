package basics;


//Program to add each and every digit in a number for eg:1212 = 6
//if the added number in greater than 10 then again add that number for eg : 5323 => 13 => 4
import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to add ");
        int num = sc.nextInt();
        int rem = 0;

        while (num > 0) {
            rem += num % 10;
            num /= 10;
        }
        while(num >=10 || rem >= 10 ){
            if (num >= 10) {
                while (num > 0) {
                    rem += num % 10;
                    num /= 10;
                }
            }
            if (rem >= 10) {
                while (rem > 0) {
                    num += rem % 10;
                    rem /= 10;
                }
            }
        }
        System.out.println(Math.max(num, rem));
    }
}