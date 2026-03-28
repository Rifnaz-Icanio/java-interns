import java.util.Scanner;
public class Studentgrade{
    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the Student mark");
        int mark = grade.nextInt();
        System.out.println("Enter the Student name");
        String name =grade.next();
        String grad;
        String feedback;
        if(mark >= 90 && mark >= 100){
            grad ="O";
            feedback ="Excellant performance";
        }else if(mark >= 80){
            grad ="A";
            feedback = "very good";
        }else if(mark >= 70){
            grad ="B";
            feedback = "good";
        }else if(mark >= 60){
            grad ="c";
            feedback = "Satisfaction";
        }else if(mark >= 50){
            grad="D";
            feedback = "Need improvement";
        }else if(mark >= 40){
            grad="E";
            feedback = "Fail";
        }else {
            grad="invalid";
            feedback ="invalid marks has entered";
        }
        System.out.println("Student report");
        System.out.println("name:"+ name);
        System.out.println("mark:"+ mark);
        System.out.println("grade:"+ grad);
        System.out.println("feedback:"+ feedback);
    }
}
            
        
      