import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String hello = "Hello world!";
        int k = 0;
        while (k < hello.length()) {
            System.out.println(hello.charAt(k));
            k++;
        }

        for (int j = 0; j < hello.length(); j++) {
            System.out.println(hello.charAt(j));
        }

        // infinite for loop printing "Check" to the console
//        for (;;) {
//            System.out.println("Check!");
//        }

        // if no need for increment, while loop is recommended
        while (hello.equals("Hello world!")) {
            System.out.println(hello);
            hello = "something";
        }

        // everything what we can achieve with wile loop, can be achieved with for as well, just not recommended
        for ( ; hello.equals("Hello world!"); ) {
            System.out.println(hello);
            hello = "something";
        }

        // continue
        hello = "Hello World!";
        for (int j = 0; j < hello.length(); j++) {
            if (j < 6) {
                continue; // going to the next iteration
            }
            System.out.println(hello.charAt(j));
        }

        //break, searching for the index of 5 in the array
        int[] numbers = {4,8,23,45,5,0,8,9,99,34};
        int indexOfFive = -1;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 5) {
                indexOfFive = j;
                break; // breaking the execution of the loop
            }
            System.out.println("Loop: " + (j + 1));
        }
        System.out.println("Index of number 5 in the array is: " + indexOfFive);
    }
}