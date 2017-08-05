import java.util.Scanner;

/**
 * Created by spartans on 7/30/17.
 * Singleton Class
 */
public class Winner {

    String winnerName;
    public Scanner scan;

    /* A private Constructor prevents any other
    * class from instantiating.
    */
    public Winner(){
        scan = new Scanner(System.in);
    }

    // declare winner of the event
    protected void declareWinner()
    {
        System.out.print("Enter Winner name");
        winnerName = scan.nextLine();
    }

    // get winner info
    protected String getWinner(){
        return winnerName;
    }
}
