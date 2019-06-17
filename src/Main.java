import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Create an array to hold the numbers 1-10.
        System.out.println("Create an array to hold the numbers 1-10.");
        int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Loop through that array and sum the numbers 1-10, then print that total to the screen.");
        int total = 0;
        for(int i = 0; i < myNums.length; i++){
            System.out.println(myNums[i]);
            total += myNums[i];
        }
    }
}
