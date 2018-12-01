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
            int sizeOfArray;
            System.out.println("Please enter the size of the Array: \n");
            Scanner x = new Scanner(System.in);
            sizeOfArray = x.nextInt();
            int [] Arr= new int[sizeOfArray];
            System.out.println("Enter the "+sizeOfArray+" value in the Array:");
            for(int i=0;i<sizeOfArray;i++) {
                Scanner content = new Scanner(System.in);
                Arr[i] = content.nextInt();
            }
            System.out.println("The Most repeated value in the array is:"+ mostRepeatedVal(Arr));
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
            countPrime();
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
            getAverage();
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
            getAverage();
            ZeroIfLessThanZero();

            shiftarray();

            if(IntPalindrome())
                System.out.println("Palindrome: True");
            else
                System.out.println("Palindrome: false");
master
        }

    }

    public static int mostRepeatedVal(int array[]){
        int[][] tempArr=new int[array.length][2];
        int tempmax=0,index=0;//the index of most repeated value
        for(int i=0;i<array.length;i++){
            tempArr[i][0]=0;//initializing the 2nd table for counting the content of the 1st table
            tempArr[i][1]=array[i];//coping the content of the array in the TempArr;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(tempArr[i][1]==array[j])++tempArr[i][0];
            }
            System.out.println(tempArr[i][0]);
        }
        for(int i=0;i<array.length;i++){
            if(tempmax<=tempArr[i][0]) {
                tempmax = tempArr[i][0];
                index = i;
            }
        }
        return tempArr[index][1];

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

    public static void getAverage() {
        System.out.println("Get average of array Function");
	    System.out.print("Please Enter size of array: ");
	    int sz;
	    Scanner in = new Scanner(System.in);
	    sz = in.nextInt();
	    Integer[] array = new Integer[sz];
	    System.out.print("please Enter array elements: ");
        int result = 0;
	    for (int i = 0; i < sz; ++i) {
		    result += in.nextInt();
	    }

	    System.out.println("The average is: " + (float)result/sz);
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

	

	public static ArrayList<Integer> returnPrime(int[] arrayOfIntegers){
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		boolean isPrime = true;
		for(int i=0;i<arrayOfIntegers.length;i++){
			for(int j=2;j<=arrayOfIntegers[i]/2;j++){
				if(arrayOfIntegers[i] % j == 0){
					isPrime = false;
					break;
				}
				else{
					isPrime = true;
				}
			}
			if(isPrime){
				primeNumbers.add(arrayOfIntegers[i]);
			}
		}
		return primeNumbers;
	}


      public static void shiftarray(){
      String arr;
      arr="";
      int n;
      n=arr.length();
      int i;
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


    public static void countPrime()
    {
        System.out.println("Count primes");
        System.out.println("Please Enter size of array");
        int sz;
        Scanner in = new Scanner(System.in);
        sz = in.nextInt();
        Integer [] arr = new Integer[sz];
        System.out.println("Please Enter your array");
        for (int i = 0 ; i < sz ; ++i){
            arr[i] = in.nextInt();
        }
        int cp=0;
        
        int i=0;
        while(i<sz)
        {
            int c=0;
            for(int j=2; j<=9; j++)
            {
                if(arr[i]%j==0 && arr[i]!=j)
                {
                    c++;
                    break;
                }

            }
            if(c==0)
            {cp++;} i++;
        
        }
        
        System.out.print("the number of them is : "+ cp );
        
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
