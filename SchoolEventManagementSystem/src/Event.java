import com.sun.tools.classfile.Annotation;

/**
 * Created by spartans on 7/30/17.
 */
public class Event {

    public String eventName;
    public String eventLocation;
    public  String eventDate;
    public  String eventTime;
    public String eventDesc;

    public Judge judge;
    public Winner winner;

    StateContext context;
    StartState startState;
    InProgressState inProgressState;
    EndState stopState;

    public Event(String eventName, String eventLocation, String eventDate, String eventTime, String eventDesc)
    {
        judge= new Judge();
        winner = new Winner();

        context = new StateContext();
        startState = new StartState();
        inProgressState = new InProgressState();
        stopState = new EndState();

        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventDesc = eventDesc;

        // start state of the event
        startState.doAction(context);
        System.out.println(context.getState().toString());
    }

    public void getEventInfo(){

        System.out.print("Event Name : "+ eventName);
        System.out.print("\nEvent Location : "+ eventLocation);
        System.out.print("\nEvent Date : "+ eventDate);
        System.out.print("\nEvent Time : "+ eventTime);
        System.out.print("\nEvent Description : "+ eventDesc);

    }

    public void eventProgress() {


        // in process state of the event
        inProgressState.doAction(context);
        System.out.println(context.getState().toString());

        // assign judge for event
        judge.assignJudge();

        // declare winner of the event
        System.out.print("\nDeclare Winner\n");
        winner.declareWinner();

        System.out.print("\nThe winner is : "+winner.getWinner());

        // send message to the students
        Student student = new Student();
        student.sendWinnerNotificationToStudents();

        // end state of the event
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
