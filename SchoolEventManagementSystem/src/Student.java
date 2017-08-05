import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by spartans on 7/30/17.
 */
public class Student implements User {

    public String name;

    public ArrayList<Parent> parent;
    private Scanner scan;
    public EventNotification noti;

    public Student (){

    }

    public  Student(String name){
        setUserName(name);
        scan = new Scanner(System.in);
        parent = new ArrayList<Parent>();

        //add parent
        addParent();
    }

    @Override
    public String getUserName() {
        return this.name;
    }

    @Override
    public void setUserName(String name) {
        this.name = name;
    }

    // add registered student's parents
    public void addParent(){

        System.out.print("Enter Parent Name");
        String parentName = scan.nextLine();

        parent.add(new Parent(parentName));
    }

    // get parent Information
    public void parentInfo(){

        Iterator<Parent> itr=parent.iterator();

        /*while(itr.hasNext())
        {
            System.out.println("\n"+itr.next().getUserName());

        }*/

        for(Parent obj:parent)
            System.out.println(obj.getUserName());
    }

    // send event notification to the students
    public void sendNotificationToStudents(){
        noti = new EventNotification();
        noti.sendEventNotificationtoStudents();
    }

    // send message to the students after winner declaration
    public void sendWinnerNotificationToStudents(){
        noti = new EventNotification();
        noti.sendWinnerMessage();
    }

}
