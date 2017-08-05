import util.Util;

/**
 * Created by spartans on 7/30/17.
 */
public class StartState implements State {

    public Util util;

    public StartState(){
        util = Util.getInstance();
    }

    @Override
    public void doAction(StateContext stateContext) {
        if(util.notNull(stateContext)) {
                System.out.println("\nEvent is in start state");
                stateContext.setState(this);
        }
        else{
            stateContext = new StateContext();
            System.out.println("\nEvent is in start state");
            stateContext.setState(this);
        }
    }

    public String toString(){
        return "Start State";
    }
}