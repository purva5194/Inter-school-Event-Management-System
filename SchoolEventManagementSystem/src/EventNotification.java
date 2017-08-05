import java.util.Scanner;

/**
 * Created by spartans on 7/30/17.
 */
public class EventNotification{

    public Event event;
    public Scanner scan;

    public EventNotification(){
        scan = new Scanner(System.in);
    }

    // notification for the school
    public void sendEventNotification(String schoolName){
        System.out.print("\n\nSend notification to "+ schoolName);
    }

    // notification for the students
    public void sendEventNotificationtoStudents(){
        System.out.print("\nSend notification to the students and their parents");
    }

    // whether school accept or reject the event invitation
    public boolean invitationStatus(){

        System.out.print("\nEnter Event Invitation Status (Accepted/Rejected) : ");
        String status = scan.nextLine();

        if(status.equalsIgnoreCase("accepted") || status.equalsIgnoreCase("accept")) {
            return true;
        }
        else {
            return false;
        }
    }

    // send winner message to the students
    public void sendWinnerMessage(){
        System.out.print("\n\nSend message with the winner name to the students");
    }


}
