import java.util.Scanner;
public class grade{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
       
        System.out.println("Enter the score between(0-100):");
        int score=myObj.nextInt();
        if(score<0 || score>100){
            System.out.println("invalid input,Please enter a score between 0 and 100");
        }
        else{
            String grade;
            String feedback;
            if(score>=90){
                grade="A";
                feedback="Congratulations,keep it up.!";
            }
            else if(score>=80){
                grade="B";
                feedback="give more effort, to score high marks.";
            }
            else if(score>=70){
                grade="C";
                feedback="you will,give more effort";
            }
            else if(score>=60){
                grade="D";
                feedback="focus on studies..";
            }
            else{
                grade="F";
                feedback="it's fail, you try to get more marks.";            
            }
            System.out.println("Grade:"+grade);
            System.out.println("Feedback:"+feedback);
        }
        
        System.out.println("Thank  you for support. ");
        
        myObj.close();
    }

}
