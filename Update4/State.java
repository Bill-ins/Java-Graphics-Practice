package forpractice;

import java.awt.*;

public abstract class State {

    protected static State currentState = null;

    public abstract void tick();
    public abstract void render(Graphics graphics);


    public static void setCurrentState(State currentState) {
        State.currentState = currentState;
    }

    public static State getCurrentState() {
        return currentState;
    }
}
