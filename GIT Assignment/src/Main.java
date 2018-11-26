import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter size of arr");
        int sz;
        Scanner in = new Scanner(System.in);
        sz = in.nextInt();
        char arr [] = new char[sz];
        System.out.println("Enter array elements");
        for (int i = 0 ; i<sz; ++i){
            char c = in.next().charAt(0);
            arr[i] = c;

        }
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
        int choice = in.nextInt();
        if (choice == 1){

        }
        else if (choice == 2){

        }
        else if (choice == 3){

        }
        else if (choice == 4){

        }
        else if (choice == 5){

        }
        else if (choice == 6){

        }
        else if (choice == 7){

        }
        else if (choice == 8){

        }
        else if (choice == 9){

        }
        else if (choice == 10){

        }
        else if (choice == 11){

        }
        else if (choice == 12){

        }
        else if (choice == 13){

        }
        else if (choice == 14){

        }
        else if (choice == 15){

        }
        else if (choice == 16){

        }
        else if (choice == 17){

        }
        else if (choice == 18){

        }






    }
}
