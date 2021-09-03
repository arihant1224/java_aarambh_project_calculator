import java.util.Scanner;

public class Calculator {
    
    //Addition
    public static int add(int x, int y){
        return x+y;
    }

    //Subtraction
    public static int subtract(int x, int y){
        return x-y;
    }

    //Multiplication
    public static int multiply(int x, int y){
        return x*y;
    }

    //Division
    public static int divide(int x, int y){
        return x/y;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        System.out.println("Choose operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        sc.close();

        int result = 0;

        if (operator == '+'){
            result = add(n1, n2);
            System.out.println("Answer: " + result);
        }else if (operator == '-'){
            result = subtract(n1, n2);
            System.out.println("Answer: " + result);
        }else if (operator == '*'){
            result = multiply(n1, n2);
            System.out.println("Answer: " + result);
        }else if (operator == '/'){
            result = divide(n1, n2);
            System.out.println("Answer: " + result);
        }else {
            System.out.println("Invalid Response!");
        }

    }
}