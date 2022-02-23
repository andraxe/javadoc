

import java.lang.Integer;

/**
 * declaring num 1 and num 2 variables and assigning them to class object passed to the arithmetic function
 */

public class Tester {


    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------");

        System.out.println("sum, subtraction, divide and multiply between 9 and 4 numbers ");
        System.out.println("---------------------------------------------------------------");
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.num1 = 9;
        arithmetic.num2 =  4;

        arithmetic.sum(arithmetic.num1,arithmetic.num2);
        System.out.printf("Sum Is: "+ arithmetic.sum(arithmetic.num1,arithmetic.num2 )+"%n");

        arithmetic.sub(arithmetic.num1,arithmetic.num2);
        System.out.printf("Subtraction Is: "+ arithmetic.sub(arithmetic.num1,arithmetic.num2) +"%n");


        arithmetic.div(9,4);
        System.out.printf("Division Is: "+ arithmetic.div(arithmetic.num1,arithmetic.num2 )+"%n");



        arithmetic.mul(9,4);
        System.out.printf("multiply Is: "+arithmetic.mul(arithmetic.num1,arithmetic.num2 )+"%n" );

        System.out.println("---------------------------------------------------------------");
    }




}



