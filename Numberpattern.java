import java.util.Scanner;
public class Numberpattern{
    public static void main(String[] args){
        Scanner s = new Scanner();
        System.out.println("enter the number of rows");
        int rows = s.nextInt();
        for( int i = 3;i <= rows; i++){
            for(int y = 3;y <= i; y++){
                
                System.out.print(y +" ");
               
            }
             System.out.println(" ");
        }
    }
}