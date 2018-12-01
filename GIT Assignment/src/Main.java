import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter your choice");

        System.out.println("1  - most repeated value");
        System.out.println("2  - sort");
        System.out.println("3  - shuffle");
        System.out.println("4  - Find the Largest Prime");
        System.out.println("5  - Find ths smallest Prime");
        System.out.println("6  - Check Palindrome");
        System.out.println("7  - Check sorted");
        System.out.println("8  - Count Primes");
        System.out.println("9  - Reverse array");
        System.out.println("10 - Shift array");
        System.out.println("11 - Distinct array");
        System.out.println("12 - Get the maximum 3 numbers");
        System.out.println("13 - Get the minimum 3 numbers");
        System.out.println("14 - Get average");
        System.out.println("15 - Get median");
        System.out.println("16 - Return only primes");
        System.out.println("17 - Zero if less than zero");
        System.out.println("18 - Execute all functions");
        System.out.println("Enter your choice");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();




        if (choice == 1){

            //take array of integers
        }
        else if (choice == 2){
            //take array of integers
        }
        else if (choice == 3){
            //take array of integers
        }
        else if (choice == 4){
            //take array of integers

        }
        else if (choice == 5){
            //take array of integers

        }
        else if (choice == 6){
            //take string
        }
        else if (choice == 7){
            //take array of integers
        }
        else if (choice == 8){
            //take array of integers
        }
        else if (choice == 9){
            //take array of integers
        }
        else if (choice == 10){
            //take string
        }
        else if (choice == 11){
           distictarray();
        }
        else if (choice == 12){
            //take array of integers
        }
        else if (choice == 13){
            //take array of integers
        }
        else if (choice == 14){
            //take array of integers
        }
        else if (choice == 15){
            //take array of integers
        }
        else if (choice == 16){
            //take array of integers
        }
        else if (choice == 17){
            ZeroIfLessThanZero();
        }
        else if (choice == 18){
            //take array of integers
            distictarray();
            ZeroIfLessThanZero();
            
        }






    }
	public static void distictarray() {
        System.out.println("Distinct Array Function");
	    System.out.println("Please Enter size of array");
	    int sz;
	    Scanner in = new Scanner(System.in);
	    sz = in.nextInt();
	    Integer[] array = new Integer[sz];
	    System.out.println("please Enter array elements");
	    for (int i = 0; i < sz; ++i) {
		    array[i]=in.nextInt();
	    }
	    Set<Integer> Distinctarray = new TreeSet<Integer>();
	    Distinctarray.addAll(Arrays.asList(array));
	    System.out.println("Distinct elements are: " + Distinctarray);
    }



    public static void ZeroIfLessThanZero(){
        System.out.println("Zero If Less Than Zero Function");
        System.out.println("Please Enter size of array");
        int sz;
        Scanner in = new Scanner(System.in);
        sz = in.nextInt();
        Integer [] arr = new Integer[sz];
        for (int i = 0 ; i < sz ; ++i){
            arr[i] = in.nextInt();
        }
        for (int i = 0 ; i < sz ; ++i){
            if (arr[i] < 0)
                arr[i] = 0;
        }
        for (int i = 0 ; i < sz ; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
     public static void shiftarray(String arr,int n){
    n=arr.length();
    int i;
    arr="";
    String str1 = "";
    Scanner input=new Scanner(System.in);
    System.out.println("enter array you want to shifted");
    arr=input.nextLine();
    for(i=1;i<arr.length();i++){
        str1=str1 + arr.charAt(i);
                                    }
        str1=str1+arr.charAt(0);
         System.out.println(str1);


    }
}
