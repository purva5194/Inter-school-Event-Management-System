import java.util.Scanner;

/**
 * Created by spartans on 7/30/17.
 */
public class Judge {
    Parent parent;
    private Scanner scan;

    public Judge(){
        scan = new Scanner(System.in);
    }

    // assign one judge for the event
    public void assignJudge()
    {
        System.out.print("Enter Judge name");
        String parentName = scan.nextLine();
        parent = new Parent(parentName);
    }
}
