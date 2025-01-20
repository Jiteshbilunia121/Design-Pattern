import Abstraction.Email;
import Memento.CodeEditor;
import Memento.History;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int income = 1000;
        Taxcalculator taxcalculator = calculate(income);

        // Display Encapsulation

        Email email = new Email();
        email.sendEmail();

//        System.out.println(taxcalculator.calculateTax(income));
//        System.out.println(taxcalculator.insurance(income));


        // Demonstrate Memento pattern

        CodeEditor editor = new CodeEditor("a");
        History history = new History();
        history.push(editor.createEditorState());

        editor.setContent("b");
        history.push(editor.createEditorState());

        editor.setContent("c");
        editor.restoreEditorState(history.pop());


        System.out.println("current content = " + editor.getContent());


    }

    // Demonstrate Interface in Java
    public static Taxcalculator calculate(float income) {
      return new Taxcalculate2019();
    }

}