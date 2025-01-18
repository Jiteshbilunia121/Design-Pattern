//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int income = 1000;
       Taxcalculator taxcalculator = calculate(income);
        System.out.println(taxcalculator.calculateTax(income));
       System.out.println(taxcalculator.insurance(income));
    }

    public static Taxcalculator calculate(float income) {
      return new Taxcalculate2019();
    }
}