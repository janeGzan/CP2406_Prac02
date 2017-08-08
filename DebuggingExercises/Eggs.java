import javax.swing.JOptionPane;
public class Eggs {

    public static void main(String[] args)
    {
        String inputAmountOfEggs;
        Integer amountOfEggs;
        Integer dozen = 0;
        final double DOZENCOST = 3.25;
        final double INDIVIDUALCOST = 0.45;
        inputAmountOfEggs = JOptionPane.showInputDialog(null, "Enter the amount of eggs:", "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        amountOfEggs = Integer.parseInt(inputAmountOfEggs);
        JOptionPane.showMessageDialog(null, "You ordered " + amountOfEggs + " eggs.", "Order",
                JOptionPane.INFORMATION_MESSAGE );
        while (amountOfEggs >= 12) {
            amountOfEggs = amountOfEggs - 12;
            dozen++;

        }
        JOptionPane.showMessageDialog(null, "That's " + dozen + " dozen at $ 3.25 per dozen and "
                + amountOfEggs + " loose eggs at 45 cents each for a total of $" + ((amountOfEggs * INDIVIDUALCOST)
                + (dozen * DOZENCOST)));

    }
}
