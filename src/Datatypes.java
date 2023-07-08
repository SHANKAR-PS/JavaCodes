public class Datatypes {
    public static void main(String[] args) {
        byte mByte = 84;
        int number = 90;
        short shortNum = 245;
        long mLong = 24324;
        boolean myBool = false;
        double mDouble= 7.4324;
        float mFloat = 324.4f;
        char character = 'y';

        System.out.println("Data types in Java :");
        System.out.println("byte " + mByte);
        System.out.println("integer is " +number);
        System.out.println("short "+shortNum);
        System.out.println("long datatype " +mLong);
        System.out.println("double datatype " +mDouble);
        System.out.println("float datatype " +mFloat);
        System.out.println("char datatype " +character);
        System.out.println("boolean value "+myBool);


        System.out.printf("\nByte MaxValue %d and MinValue %d",Byte.MAX_VALUE,Byte.MIN_VALUE);
        System.out.printf("\nShort MaxValue %d and MinValue %d",Short.MAX_VALUE,Short.MIN_VALUE);
        System.out.printf("\nInteger Maxvalue %d and MinValue %d",Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.printf("\nLong MaxValue %d and MinValue %d",Long.MAX_VALUE,Long.MIN_VALUE);
        System.out.printf("\nfloat Maxvalue %f and MinValue %f",Float.MAX_VALUE,Float.MIN_VALUE);
       //System.out.printf("\n double Maxvalue %L and MinValue %L",Double.MAX_VALUE,Double.MIN_VALUE);
        System.out.printf("\nCharacter MaxValue %c and MinValue %c",Character.MAX_VALUE,Character.MIN_VALUE);
        System.out.printf("\nBoolean %b",Boolean.TYPE);

    }
}
