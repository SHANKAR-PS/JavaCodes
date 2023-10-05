package basics;

import java.util.Scanner;

//Program to get the list of the prime numbers
public class primeNos {
    public static void main(String[] args) {
        System.out.println("Enter the start value and end value : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        for( ; s<=e ; s++){
            primeNum pn = new primeNum();
            boolean b = pn.checkPrime(s);
            if(b)
                System.out.print(s+" ");
        }


    }
}
