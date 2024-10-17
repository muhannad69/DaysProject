package days;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day number (1 for MONDAY, 2 for TUESDAY, etc.):");
        int dayNumber = in.nextInt();

        Day selectedDay = Day.values()[dayNumber - 1];  // Access the correct enum value

        Weekdays t = new Weekdays();
        t.printDay(selectedDay);  // Call method to print the selected day

        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);  // Print all days using the enum
        }
    }
}
