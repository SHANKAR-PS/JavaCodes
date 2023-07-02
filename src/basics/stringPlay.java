package basics;

public class stringPlay {
    public static void main(String[] args) {
        String text = "radar";
        String blank = " ";
        String name = "radar";
        String greet = text + blank+name;
        System.out.println(greet);
        System.out.println("hello"+" "+"john"); //perform concatenation
        System.out.println("lower case : name= "+name.toLowerCase()); //Convert to lowercase
        System.out.println("Uppercase text" + text.toUpperCase()); //convert to uppercase
        System.out.println("Length : text= "+text+" "+text.length()); //length

        //compares two strings like palindrome
        if(text.equals(name)){
            System.out.println("Text and name are equal");
        }
        else{
            System.out.println("Text and name are not equal");
        }

    }
}
