import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Create an array to hold the numbers 1-10.

        int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Create an array to hold the numbers 1-10.");
        /*
        Loop through that array and sum the numbers 1-10
        then print that total to the screen.
         */
        System.out.println("Loop through that array and sum the numbers 1-10, then print that total to the screen.");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(myNums[i]);
            sum += myNums[i];
        }
        System.out.println("The sum of this array is: " + sum);

        /*Create an array to hold 10 number inputs from
        the user and print that total to the screen.

         */


        System.out.println("Enter 10 number");
        int[] arr = new int[10];
        int newSum = 0;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i < 10; i++)
            arr[i]=sc.nextInt();
        for(int i=0; i<10;i++)
            newSum+=arr[i];
        System.out.println("New Total is "+ newSum);



    }
}
