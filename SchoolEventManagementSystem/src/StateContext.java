/**
 * Created by spartans on 7/30/17.
 */
public class StateContext {
    private State state;

    public StateContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}