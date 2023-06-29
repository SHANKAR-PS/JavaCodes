package basics;
import java.util.Scanner;
public class FindQuadrant {
    public static void main(String[] args) {

        //Find the Quadrant by using x and y values
        System.out.println("Find the Quadrant by using x and y values");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y==0){
            System.out.println("x axis");
        }
        else if (x==0){
            System.out.println("y axis");
        }
        else if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("4th Quadrant");
        }
        else{
            System.out.println("1st Quadrant");
        }
        System.out.println("avlo than....");
    }
}
