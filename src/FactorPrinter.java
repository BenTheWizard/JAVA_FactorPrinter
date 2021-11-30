public class FactorPrinter {
    public static final String ERROR = "Invalid Value";
    public static void main(String[] args) {
        String test = printFactors(9);
        System.out.println(test);
    }

    public static String printFactors(int number) {
        if (number < 1) {
            return ERROR;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " is a factor number of " + number);
            }
        } return ERROR;
    }
}
