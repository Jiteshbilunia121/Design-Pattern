package Memento;

import java.util.ArrayList;
import java.util.List;

public class CodeEditor {
    private String content;


    public EditorState createEditorState() {
        return new EditorState(content);
    }

    public void restoreEditorState(EditorState editorState) {
        content = editorState.getContent();
    }

    public CodeEditor(String content) {
        this.content = content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
