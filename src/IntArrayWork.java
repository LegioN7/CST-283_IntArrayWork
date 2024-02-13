import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


// CST-283 - Homework 3
// Aaron Pelto
// Winter 2024


public class IntArrayWork {
    static final String FILENAME = "intdata.txt";
    static final int ARRAY_SIZE = 50;
    public static void main(String[] args) {

        int[] data;
        File inputfile;

        inputfile = new File(FILENAME);
        data = new int[ARRAY_SIZE];

        try {
            Scanner input = new Scanner(inputfile);

            // Write the initial array to the java console
            // Write all elements on the same line with a space between each element
            for (int i = 0; i < ARRAY_SIZE && input.hasNextInt(); i++) {
                data[i] = input.nextInt();
                System.out.print(data[i] + " ");
            }
            System.out.println();

            // Sum every other array element and write the total to the console
            int sum = 0;
            for (int i = 0; i < ARRAY_SIZE; i += 2) {
                sum += data[i];
            }
            System.out.println("Sum of every other element: " + sum);

            // Write the array in reverse order but only print the odd numbers
            System.out.print("Odd numbers in reverse order: ");
            for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
                if (data[i] % 2 != 0) {
                    System.out.print(data[i] + " ");
                }
            }
            System.out.println();

            // Swap the first and last array elements and write the array to the console on a single line
            System.out.print("First and Last Element Swapped: ");
            int temp = data[0];
            data[0] = data[data.length - 1];
            data[data.length - 1] = temp;

            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();

            // Determine whether the first element or second element is greater. Replace all elements in the array with the greater value
            System.out.print("First/Second Element Greater: ");
            int greaterValue = java.lang.Math.max(data[0], data[1]);
            for (int i = 0; i < ARRAY_SIZE; i++) {
                data[i] = greaterValue;
                System.out.print(data[i] + " ");
            }

            // Close the input file
            input.close();

            // Catch the file not found exception
        } catch (FileNotFoundException e) {
            // Print the error message and exit the program
            System.out.println("File not found");
            System.exit(1);
        }
    }
}