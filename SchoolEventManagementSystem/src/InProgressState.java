import util.Util;

/**
 * Created by spartans on 7/30/17.
 */

public class InProgressState implements State {

    public Util util;

    InProgressState(){
        util = Util.getInstance();
    }
    @Override
    public void doAction(StateContext stateContext) {

        if(util.notNull(stateContext)) {
            System.out.println("\nEvent is in InProgress state");
            stateContext.setState(this);
        }
        else
        {
            stateContext = new StateContext();
            System.out.println("\nEvent is in InProgress state");
            stateContext.setState(this);
        }
    }

    public String toString(){
        return "InProgress State";
    }
}