package basics;
import java.math.BigInteger;

public class Bigintegers {
    public static void main(String[] args) {
        //Bigintegers

        BigInteger a = new BigInteger("99999999999999999999");
        BigInteger b = new BigInteger("99999999999999999999");

        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
