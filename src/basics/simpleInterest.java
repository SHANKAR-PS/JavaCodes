package basics;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        //TO find the interest of taking principal ,time and rate
        System.out.println("TO find the interest of taking principal ,time and rate");
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        int ra = (int) Math.round(rate);
        int interest = principal * ra * time;
        System.out.println(interest/100+" avlo than...");

    }
}
