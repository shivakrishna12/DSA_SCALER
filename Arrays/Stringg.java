package Arrays;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class Stringg {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String stmt = "shivakrishna";
        int start = 0;
        int end = stmt.length() - 1;
        while (start < end) {
            if (stmt.charAt(start) != stmt.charAt(end)) {
                System.out.println("nooo");
                break;
            }
        }
        System.out.println("yesss");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

// Convert to milliseconds (optional)
        double elapsedTimeInMilli = (double) elapsedTime / 1000000;

        System.out.println("Execution time: " + elapsedTime + " nanoseconds");
// Or
        System.out.println("Execution time: " + elapsedTimeInMilli + " milliseconds");
    }
}
