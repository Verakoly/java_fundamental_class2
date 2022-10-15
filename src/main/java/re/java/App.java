package re.java;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "Programming";
        System.out.println(erik.getPersonInformation());
        System.out.println(erik.getFullName());


        Person vera = new Person();
        vera.firstName = "Vera";
        vera.lastName = "Okoli";
        vera.age = 35;
        vera.hobby = "cooking";
        System.out.println(vera.getPersonInformation());
        System.out.println(vera.getFullName());

        //default value for String is null, int = 0, when values are not defined.


        //calculator

        double n1 = 16;
        double n2 = 14;
        calculatorTrial.addition(n1, n2); //this will only execute in the memory without any printout.

        double result = calculatorTrial.addition(n1, n2);
        System.out.println(result);       //now we have a printout in the console.

        //note that data type should always be the same

        calculatorTrial.displayWelcomeMessage();   //method class name . method (i.e. function)

        //shortest word

        String w1 = "Veronica";
        String w2 = "Davies";
        getWord.getShortestWord(w1,w2);  //executes in the memory
        String myWord = getWord.getShortestWord(w1,w2);
        System.out.println("The shorter word is " + myWord + ".");


        // Scanner class to retrieve parameters from the console/user. Scanner is a built-in class in JDK

        Scanner scanner = new Scanner(System.in);
        calculatorTrial.displayMenu();
        System.out.println("Enter operation type (1 , 2)");
        String operationType = scanner.next();  // it could be next anything

        //char operationType2 = scanner.next().charAt(0);  //to use character instead of integers, then change
        //"enter operationType" from integers to characters.

        //switch method



        System.out.println("Enter your first number: ");
        double numb1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        double numb2 = scanner.nextInt();

        double outPut = calculatorTrial.addition(numb1, numb2);
        System.out.println(outPut);


        // Scanner class to retrieve parameters from the console/user. Scanner is a built-in class in JDK

        //Scanner scanner = new Scanner(System.in);
        calculatorTrial.displayMenu();
        System.out.println("Enter operation type (+ , -)");
        char operationType2 = scanner.next().charAt(0);  //to use character instead of integers

        //switch method
        /*ch (operationType2) {
            case '+':
                System.out.println("Enter your first number: ");
                double nu1 = scanner.nextInt();
                System.out.println("Enter your second number: ");
                double nu2 = scanner.nextInt();

                double see =calculatorTrial.addition(nu1, nu2);
                System.out.println(see);*/





    }
}
