import java.util.ArrayList;
import java.util.Scanner;
class Meeting {
    String date;
    String time;
    String title;
    public Meeting(String date,String time,String title){
        this.date = date;
        this.time = time;
        this.title = title;
    }
    
    public String toString() {
        return date+"  "+time+" - "+title;
    }

    public static void main(String[] args){
        while (true) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Meeting> Meeting = new ArrayList<>();
            System.out.println("Welcome to the Meeting");
            System.out.println("1. Add Meetings");
            System.out.println("2. Show Meetings");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("enter the date(yyyy-mm-dd):");
                String date = sc.nextLine();
                System.out.println("enter the time(hh-mm):");
                String time = sc.nextLine();
                System.out.println("enter the title:");
                String title = sc.nextLine();
                boolean conflict = false;
                for (Meeting m : Meeting) {
                    if (m.date.equals(time)&& m.time.equals(time)){
                        conflict = true;
                        break;
                    }
                }
                if (conflict) {
                    System.out.println("A meeting is already exists.");
                } else{
                    Meeting.add(new Meeting(date,time,title));
                    System.out.println("Meeting is added.");
                }
                } else if (choice == 2) {
                    if(Meeting.isEmpty()){
                    System.out.println("Meetings are not scheduled.");
                }else{
                   System.out.println("\n scheduled Meetings:");
                   for(Meeting m :Meeting){
                      System.out.println(" - "+m);
                   }
                }
             } else if (choice == 3) {
                 System.out.println("goodbye!");
                 break;
             } else{
                 System.out.println("invalid option.");
                }
        }
    }
}


	
        

    


        


    