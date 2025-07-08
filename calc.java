import java.util.Scanner;
import java.io.*;
class calc{
    static void Add(float x,float y){
        float result= x+y;
        System.out.println("Addition of "+x+ " and " +y+ " is " +result);
    }
    static void Sub(float x,float y){
        float sub= x-y;
        System.out.println("Subraction of " +x+ " and "+y+ " is " +sub);
    }
    static void Mul(float x,float y){
        float mul= x*y;
        System.out.println("Multiplication of " +x+ " and " +y+ " is " +mul);
    }
    static void Div(float x,float y){
        float div= x/y;
        System.out.println("Division of " +x+ " and " +y+ " is " +div);
    }
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter value of x:");
        float x=myObj.nextFloat();
        System.out.println("Enter value of y:");
        float y=myObj.nextFloat();
        System.out.println("Enter the operator to perform operations:");
        String oper=myObj.next();
        switch (oper) {
            case "+":
            Add(x,y);
            break;
            case "-":
            Sub(x,y);
            break;
            case "*":
            Mul(x,y);
            break;
            case "/":
            Div(x,y);
            break;
            default:
            System.out.println("Invalid input,Enter valid input.");
                break;
        }

    }
}