public class Pedometer {
    static void stepsToMiles(int sWalked) {
        if (sWalked < 0) {
            throw new ArithmeticException("Exception: negative step count entered.");
        }
        else {
            System.out.printf("%.2f", (double)(sWalked) / 2000);
        }
    }

    public static void main(String[] args) {

        int stepsWalked = -1000;
        stepsToMiles(stepsWalked);

    }

}