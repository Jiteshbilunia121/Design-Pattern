package Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<EditorState>();

    public void push(EditorState state) {
        states.add(state);
    }
    public EditorState pop() {
        var lastindex = states.size() - 1;
        EditorState laststate = states.get(lastindex);
        states.remove(laststate);

        return laststate;
    }
}
