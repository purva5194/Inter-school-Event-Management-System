import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by spartans on 7/30/17.
 */
public class SchoolEventApplication {


    public static void main(String[] st){

        SchoolModel[] schools = new SchoolModel[3];

        //store school names
        String[] schoolName = new String[schools.length];
        Scanner scan = new Scanner(System.in);
        Event event;
        Payment payment = new Payment();
        boolean eventFlag = false;

        System.out.print("\n***** School Registration *****");

        for(int i=0; i<schools.length;  i++ )
        {
            System.out.print("\nPlease Enter School Name : ");
            schoolName[i] = scan.nextLine();

            schools[0] = new SchoolModel(schoolName[i]);

            System.out.print("Assign Admin for "+ schoolName[i] + "\n");
            schools[0].assignAdmin();
        }

        for(int i=0; i<schools.length;  i++ )
        {
            System.out.print("\n***** Student and Parent Registration for "+schoolName[i]+ " *****");

            System.out.print("\nAdd Students and Parents : \n");
            schools[0].addStudent();
            schools[0].addStudent();
            schools[0].addStudent();

            System.out.print("\n***** Display Admin Info "+schoolName[i]+" *****\n");
            schools[0].adminInfo();
            System.out.print("\n***** Display Student Info "+schoolName[i]+" *****\n");
            schools[0].studentInfo();
            System.out.print("\n***** Display Parent Info "+schoolName[i]+" *****\n");
            schools[0].parentInfo();

        }

        //display school list
        System.out.print("\n***** Display Registered School List *****\n");
        for (String school : schoolName) {
            System.out.println(school);
        }

        //organize the event
        System.out.print("\nPlease Enter Event Name : ");
        String eventName = scan.nextLine();

        System.out.print("\nPlease Enter Event Location : ");
        String eventLocation = scan.nextLine();

        System.out.print("\nPlease Enter Event Date : ");
        String eventDate = scan.nextLine();

        System.out.print("\nPlease Enter Event Time : ");
        String eventTime = scan.nextLine();

        System.out.print("\nPlease Enter Event Description : ");
        String eventDesc = scan.nextLine();

        System.out.print("\nPlease Enter Organizing School Name : ");
        String eventSchool = scan.nextLine();

        System.out.print("\n");

        if(Arrays.asList(schoolName).contains(eventSchool)) {
            event = new Event(eventName, eventLocation, eventDate, eventTime, eventDesc);

            //event
            System.out.print(("\n "+eventSchool+" organizes technical event\n"));

            System.out.print("\n***** Display Event Info *****\n");
            event.getEventInfo();

            //send invitation to other school
            for(int i=0; i< schoolName.length; i++)
            {
                if(!schoolName[i].equals(eventSchool)){
                    if(schools[0].sendNotificationToSchool(schoolName[i])) {
                        System.out.print("Invitation Accepted by " + schoolName[i] + " \n");
                        eventFlag = true;
                    }
                    else
                        System.out.print("Invitation Rejected by "+ schoolName[i] +" \n");
                }

            }

            System.out.print("\nEnter number of student volunteers for event : ");
            int num = scan.nextInt();

            System.out.print("\n***** Payment *****");
            System.out.print("\ncost for student to attend the event : $10 ");
            System.out.print("\nEvent is free for volunteer students ");

            System.out.print("\ncost for parent to attend the event : $15 ");

            //payment for students and parents
            payment.studentPayment(num);
            payment.parentPayment(num);


            if(eventFlag)
            {
                //send invitation to the students
                Student student = new Student();
                student.sendNotificationToStudents();

                //event states
                System.out.print("\n****** Event State *****");
                System.out.print("\nEvent Starts\n");
                event.eventProgress();
            }
            else {
                System.out.print("No one accept your invitation");
            }

        }else {
            System.out.print("\nPlease First Register your school..!! ");
        }

    }
}
