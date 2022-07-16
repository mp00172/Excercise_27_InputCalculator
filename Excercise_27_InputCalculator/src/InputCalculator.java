import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        boolean isAnInt = true;
        int sum = 0;
        long avg = 0;
        int count = 0;
        double avgDbl = 0;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            isAnInt = scanner.hasNextInt();
            if(!isAnInt) {
                if(!(count == 0)) {
                    avgDbl = (double) sum / (double) count;
                    avg = (long) Math.round(avgDbl);
                }
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            } else {
                sum += scanner.nextInt();
                count++;
            }
            scanner.nextLine();

        }
    }

}
