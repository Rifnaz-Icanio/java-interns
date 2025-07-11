import java.util.Scanner;
public class calculator{
public static void main(String[] args){
    Scanner Scanner=new Scanner(System.in);
    System.out.println("Enter first numbers:");
    double num1=Scanner.nextDouble();
    System.out.println("Enter second number:");
    double num2=Scanner.nextDouble();
    System.out.println("Enter the operators(+,-,*,/)");
    char operator=Scanner.next().charAt(0);
    double result;
    switch(operator){ 
        case '+':
        result=num1+num2;
        System.out.println("result:"+result);
        break;
        case '-':
        result=num1-num2;
        System.out.println("result:"+result);
        break;
        case '*':
        result=num1*num2;
        System.out.println("result:"+result);
        break;
        case '/':
            if(num2!=0){
        result=num1/num2;
        System.out.println("result:"+result);
            }else{
        System.out.println("error division by zero is not allowed");
        break;
        }  
        default:
        System.out.println("invalid operator!");
        break;
    }
}
}    

        
 
    


    
  
    

    
        
        
