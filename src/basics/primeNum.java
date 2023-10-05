package basics;
//Program that checks the entered number is prime or not
import java.util.Scanner;


public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check prime : ");
        int n = sc.nextInt();
        primeNum pn = new primeNum();
        boolean b = pn.checkPrime(n);
        if(b){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" is not prime");
        }

    }
    public boolean checkPrime(int n){
        if(n<=0){
            return false;
        }
        else {
            double m =  Math.sqrt(n);
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
