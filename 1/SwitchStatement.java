import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any fruit name (Apple | Grape | Orange | Banana): ");
        String fruit = input.next();

        /**
         * if (fruit.equals("Apple")) {
         * System.out.println("Apple is a juicy fruit.");
         * }else if (fruit.equals("Grape")) {
         * System.out.println("Grape is a sweet fruit.");
         * }else if (fruit.equals("Orange")) {
         * System.out.println("Orange is a citrus fruit.");
         * }else if (fruit.equals("Banana")) {
         * System.out.println("Banana is a long fruit.");
         * }else{
         * System.out.println("Invalid fruit name.");
         * }
         */

        switch (fruit) {
            case "Apple":
                System.out.println("Apple is a juicy fruit.");
                break;
            case "Grape":
                System.out.println("Grape is a sweet fruit.");
                break;
            case "Orange":
                System.out.println("Orange is a citrus fruit.");
                break;
            case "Banana":
                System.out.println("Banana is a long fruit.");
                break;
            default:
                System.out.println("Invalid fruit name.");
        }

        // switch statement can also be written as :
        System.out.print("Enter the valid day number: ");
        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number.");
        }

        // Not uses break keyword :
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        // Advance Version : 
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day number.");
        }

        // We can also create nested switch cases : 
    }
}