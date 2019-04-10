package April6;

import java.util.Scanner;
public class ArithmaticOperation {
    public int radius =10; //Proprty of  a class//
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = addition(a, b);
        int sub = substraction(a, b);
        int multi = multiplication(a, b);
        int div = division(a, b);
        int fact = factorial(a);
        System.out.println("factorial is " + fact + ", multi is " + multi + ", div is " + div+ ", addition is "+sum+ ", substraction is "+sub);
    }

    public  static int addition(int num1, int num2) {
        return num1 + num2;

    }
    public static int substraction(int num8, int num9) {
        return num8 - num9;
    }

    public static int multiplication(int num3, int num4) {
        return num3 * num4;
    }
    public static int division(int num5, int num6) {
        return num5 / num6;
    }
    private static int factorial(int num7) {
        int i;
        int count = 1;
        for (i = num7; i >= 1; i--) {
            count = count * i;
        }
        return count;


    }
}