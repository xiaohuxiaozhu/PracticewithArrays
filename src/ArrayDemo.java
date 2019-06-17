import java.util.Scanner;

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
        int average =0;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
            arr[i]=sc.nextInt();
        for(int i=0; i<10;i++)
            newSum+=arr[i];
        System.out.println("New Total is "+ newSum);
            average = newSum/10;
            System.out.println("Average is :" + average);

            /*
            5. Create an array to store 3 names, loop through that array to print out the names.
             */

        String[] name = {"Good","Bad","So far so good"};
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);


        }

        /*
        Create an array with the following values: [2,5,9,0,2,1,8,5,4]
        Loop through the array and print out the index each time the value equals 5.
         */


    }
}
