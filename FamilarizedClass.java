package April8;
import April6.ArithmaticOperation;

public class FamilarizedClass {
    public static void main(String[] args) {
        int length = 5;
        int width = 8;
        double peri, area;
        int add, sub, multi, div;
// Using above two values for arithmatic operation //
        ArithmaticOperation ao = new ArithmaticOperation();//object ofArithmaticOperation
        add = ao.addition(length, width);
        sub = ao.substraction(length, width);
        multi = ao.multiplication(length, width);
        div = ao.division(length, width);
        //factorial method can not be access as it is PRIVATE
        //ao.factorial(length);

        //accessing the class property
        peri =  perimeter(ao.radius);
        area =  areaofCircle(ao.radius);
        System.out.println("Addition is : "+add+ " Subtraction is : "+sub+" Multiplication is : "+multi+ " division is : "+div);
        System.out.println(" Perimiter Of Circle is : "+peri+ " and AreaOfCircle : "+area);
    }

    private static double perimeter(int radius1) {
       double perimiterOfCircle= 2*3.14*radius1;//perimiterOfCircle


        return perimiterOfCircle;

    }

    private static double areaofCircle(int radius1) {
        double AreaOfCircle= (3.14*(radius1*radius1));//AreaOfCircle
        return AreaOfCircle;

    }
    }
