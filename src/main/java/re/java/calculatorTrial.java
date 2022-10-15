package re.java;

public class calculatorTrial {

    public static double addition (double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    public static double subtraction (double num1, double num2){
        return num1 - num2;
    }

    // return type = void in a print method syntax will only print to the console

    public static void displayWelcomeMessage (){
        System.out.println("Hello, Welcome to my first Java app.");

    }


    public static void displayMenu (){
        System.out.println("Hello, Welcome to my first Java app.");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Remainder");
        System.out.println("5. Percentage");

    }




}
