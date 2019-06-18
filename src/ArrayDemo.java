import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Create an array to hold the numbers 1-10.

        int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Create an array to hold the numbers 1-10.");
        /*
        2. Loop through that array and sum the numbers 1-10
        then print that total to the screen.
         */
        System.out.println("Loop through that array and sum the numbers 1-10, then print that total to the screen.");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(myNums[i]);
            sum += myNums[i];
        }
        System.out.println("The sum of this array is: " + sum);

        /*3. Create an array to hold 10 number inputs from
        the user and print that total to the screen.

         */

         /* 4. Get 10 number inputs from the user,
       store them in an array and get the average of those 10 numbers.

        */

        System.out.println("Enter 10 number");
        int[] arr = new int[10];
        int newSum = 0;
        int average = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < 10; i++)
            newSum += arr[i];
        System.out.println("New Total is " + newSum);
        average = newSum / 10;
        System.out.println("Average is :" + average);

            /*
            5. Create an array to store 3 names, loop through that array to print out the names.
             */

        String[] name = {"Good", "Bad", "So far so good"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);


        }

        /*
        Create an array with the following values: [2,5,9,0,2,1,8,5,4]
        Loop through the array and print out the index each time the value equals 5.
         */

        int[] newValues = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        System.out.println("Loop through the array and print out the index each time the value equals 5.");

        for (int index = 0; index < newValues.length; index++) {
            if (newValues[index] == 5) {
                {
                    System.out.println("Print out the index each time the value equals  " + index);
                }

            }


        }

        /*
        7. Declare an array with the numbers 1-10.
        Print the numbers 1-10 backwards from the array.
         */
        //create an array of integers

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Arry :" + Arrays.toString(arr1));
        Collections.reverse(Arrays.asList(arr1));
        System.out.println("Modified Array:" + Arrays.toString(arr1));



        /*
        Given the following array: ['w','t','y','h','k']
        Loop through the array and replace the the letter 't'
        with the word "hello" once it's found.
         */

        String[] gArray = {"w", "t", "y", "h", "k"};
    //    String[] gArray = new String[]{"w", "t", "y", "h", "k"};
        for (int i = 0; i < gArray.length; i++) {
            if (gArray[i] == "t") {
                gArray[i] = "Hello";
                System.out.println(gArray[i]);
            }
        }


        //   String originalString ="w,t,y,h,k";
        //   String newString=originalString.replace('t','Hello');

        /*
        Given array 1: [1,7,6,5,9] and
        array 2: [2,7,6,3,4]
        Write a program that will print out
        all matching pairs from arrays 1 and 2.
        Expected output:
        (7,7) and (6,6)
         */


        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};
        for (int x=0;x<array1.length;x++){
            for (int y=0; y<array2.length;y++){
                if (array1[x]==array2[y]){
                    System.out.println("(" + array1[x] + ","+  array2[y] +")");
                }
            }
        }
     //   System.out.println("Interger Array as List:" +Arrays.asList(array1));
   //                 System.out.println("Print out the index each time the value equals  " + index1 +","+index2);
                }
            }



