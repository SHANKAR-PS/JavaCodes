import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        //conversion of Celsius to Fahrenheit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value of the Fahrenheit (0-80): ");
        int fa = sc.nextInt();
        System.out.println("Enter the end value (st value - 900) :");
        int end = sc.nextInt();
        System.out.println("Enter the increment value (0-40) :");
        int w = sc.nextInt();
        int celsius;
        if(fa>=0 && fa<=80){
            if(fa<=end && end<=900){
                if(w>=0 && w<=40){
                    for(;fa<=end;fa+=w){
                        celsius = (fa-32)* 5/9;
                        System.out.println(fa+"\t"+celsius);
                    }
                    System.out.println("Avlo than..");
                }
            }
        }
    }
}
