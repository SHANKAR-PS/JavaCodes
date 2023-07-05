package basics;
import java.util.Scanner;
public class recArea {

    public void getArea(int length, int breath) {
        int area = length * breath;
        System.out.println("The area of the Rectangle is "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath :");
        int length = sc.nextInt();
        int breath = sc.nextInt();

        recArea obj = new recArea();
        obj.getArea(length, breath);
    }
}
