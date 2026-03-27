import java.util.Scanner;
public class NumberPattern{
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a number for pattern:");
        int n=myObj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        myObj.close();
    }
    
}
