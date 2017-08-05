import util.Util;

/**
 * Created by spartans on 7/30/17.
 */

public class EndState implements State {

    public Util util;

    EndState(){
        util = Util.getInstance();
    }

    @Override
    public void doAction(StateContext stateContext) {
        if(util.notNull(stateContext)) {
            System.out.println("\nEvent is in end state");
            stateContext.setState(this);
        }
        else{
            stateContext = new StateContext();
            System.out.println("\nEvent is in end state");
            stateContext.setState(this);
        }
    }

    public String toString(){
        return "End State";
    }
}
