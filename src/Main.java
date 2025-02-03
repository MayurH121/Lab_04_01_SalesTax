//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double itemPrice = 6.99;
        double SALES_TAX = 0.05; //constant value, so all letters are uppercase
        double itemTax = 0; // initial assignment to 0
        itemTax = itemPrice * SALES_TAX; // To get item tax
        System.out.println("The computed sales tax for the purchase price of $" +itemPrice+ " is " +itemTax);
    }
}