import java.util.*;
public class CustomStack{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        Stack<String> word=new Stack<String>();
        String choice;
        do{
        System.out.println("Enter a word to push into stack:");
        String words=myObj.nextLine();
        word.push(words); 
        System.out.println("Do you want to continue(yes/no):");
        choice=myObj.nextLine().trim().toLowerCase();
        }while(choice.equals("yes"));
        System.out.println("\nAll elements in the stack (from top to bottom):");
        while (!word.isEmpty()) {
            System.out.println(word.pop());
        }
        System.out.println("Good Bye..!!!!");
        myObj.close();
    }
}
