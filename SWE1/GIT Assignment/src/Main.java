import java.util.Scanner;

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
            System.out.println("Enter String to check Palindrome: ");
            String data = in.next();
            if(palindrome(data))
                System.out.println("Palindrome: True");
            else
                System.out.println("Palindrome: False");
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
            //take array of integers
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
            //take array of integers
        }
        else if (choice == 18){
            //take array of integers
            if(IntPalindrome())
                System.out.println("Palindrome: True");
            else
                System.out.println("Palindrome: false");
        }






    }

    public static boolean palindrome(String data)
    {
        int size = data.length();
        for(int i=0;i<size/2;i++)
            if(data.charAt(i) != data.charAt(size-1-i))
                return false;
        return true;
    }
    public static boolean IntPalindrome()
    {
        int size = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        size = in.nextInt();
        int [] data = new int[size];
        int val ;
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            val = in.nextInt();
            data[i]=val;
        }
        for(int i=0;i<size/2;i++)
            if(data[i] != data[size-1-i])
                return false;
        return true;
    }


}
