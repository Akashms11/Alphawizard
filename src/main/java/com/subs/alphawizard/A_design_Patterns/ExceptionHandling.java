package com.subs.alphawizard.A_design_Patterns;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int result = performOperation();
            System.out.println("Result: " + result);
        } catch (CustomException1 e) {
            System.out.println("CustomException1 caught: " + e.getMessage());
        } catch (CustomException2 e) {
            System.out.println("CustomException2 caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    // Inside try block.
    //Inside performOperation method.
    // Division by zero
    //CustomException2 caught:
    //"Finally block executed.


    public static int performOperation() throws CustomException1 {
        try {
            System.out.println("Inside performOperation method.");
            int result = divide(10, 0);
            return result;
        } catch (ArithmeticException e) {
            throw new CustomException1("Error in performOperation method", e);
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new CustomException2("Division by zero");
        }
        return dividend / divisor;
    }
}

class CustomException1 extends Exception {
    public CustomException1(String message, Throwable cause) {
        super(message, cause);
    }
}

class CustomException2 extends RuntimeException {
    public CustomException2(String message) {
        super(message);
    }
}
