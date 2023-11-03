package Data_Structures.Array;

import static java.lang.System.out;
/*    Program for Array functions and operations
    1)Declaration and initialization of the Array
    2)Printing the Array by element and loop
    3)Printing the Array using toString() method
    4)Reverse the Array
    5)Find the maximum of Array
    6)Identify the minimum of Array


*/
public class Array_eg {
    public static void main(String[] args) {

        int[] arr1 ; //Declaration of Array
        arr1 = new int[]{1, 2, 3, 4, 5}; //Initialization of Array
        System.out.println("First element of the array "+arr1[0]);
        out.println("Printing all elements in the array in loop ");
        for (int i = 0; i < arr1.length; i++) { //For loop to print array
            out.println("Element " + i + " is " + arr1[i]);
        }

        int[] arr2 = {2,4,6,8,10}; //Declaration & initialization of Array in one line
        out.println("\nPrinting element in one line");
        for (int i : arr2) {        //Printing Array using Enhances For loop (for each)
            out.printf("%d ",i);
        }

        out.println("\nReverse the Array");
        for(int i = arr2.length - 1;i >= 0;i--){
            out.printf("%d ",arr2[i]);
        }

        //Maximum element in the array
        out.println("\nMaximum element in the array is "+maxEle(arr2));

        //Minimum element in the array
        Array_eg ag = new Array_eg();   //Create object for calling minimum element
        out.println("Minimum element in the array is "+ag.minEle(arr2));

    }
    static int maxEle(int[] arr2){  //static method
        int max;
        if(arr2.length < 1){
            return -1;
        }
        else {
            max = arr2[0];  //Initialize first element of the array to max
            for (int j : arr2) { //Using Enhanced for(for each) loop
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }

    public int minEle(int[] arr){   //Non-static method
        int min;
        if(arr.length < 1){
            return -1;
        }
        else {
            min = arr[0];  //Initialize first element of the array to min
            int i = 0;
            while (i < arr.length) {    //Using while loop
                if(min > arr[i]){
                    min = arr[i];
                }
                i++;
            }
        }
        return min;

    }

}
