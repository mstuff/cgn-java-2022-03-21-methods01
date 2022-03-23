public class MainMethods {
    public static void main(String[] args) {
        int summand1 = 3, summand2 = 4;
        int result = calculateSum(summand1, summand2);
        String forPrintout = makeString(result);
        printString(forPrintout);
    }

    public static int calculateSum(int a, int b){
        return a + b;
    }

    public static String makeString(int result){
        return "Summe: " + result;
    }

    public static void printString(String printOut){
        System.out.println(printOut);
    }
}
