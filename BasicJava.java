
import java.util.Scanner;

public class SSSGSS {

    public static void main(String... s) {
        // int phone = 123456789;
        // long phone2 = 12345678900L;
        // float phone3 = 3.14F;
        String name = "Kushant";
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
        // System.out.println(name.replace(oldChar, newChar));
        // int arr[] = new int[3];
        // arr[0] = 99;
        // arr[1] = 92;
        // arr[2] = 100;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println();
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        //2d array
        // int marks[][] = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        // System.out.println(marks[1][2]);
        // // }
        // int number = 1;
        // System.out.println(++number);
        // System.out.println(number);
        // System.out.println("Enter any number between 1-7");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thrusday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Bye");
        // }
        // for (int i = 100; i >= 1; i--) {
        //     System.out.println(i);
        // }
        // int i = 100;
        // while (i >= 1) {
        //     System.out.println(i);
        //     i = i - 1;
        // }
        // int i = 100;
        // do {
        //     System.out.println(i);
        //     i = i - 1;
        // } while (i >= 1);
        System.out.println("Guess a number between 1-100");
        System.out.println("Hint = number is divisible by 5 and of two values");
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter your guess: ");
            number = sc.nextInt();

            if (number == 50) {
                System.out.println("Right Answer");
            } else if (number < 50) {
                System.out.println("Number is  smaller ");
            } else {
                System.out.println("Number is Bigger");
            }
        } while (number >= 0);
        System.out.println("My number was = 50 ");

    }
}
