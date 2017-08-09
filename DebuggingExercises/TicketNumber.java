import javax.swing.JOptionPane;
public class TicketNumber
{
    public static void main(String[] args)
    {
         String inputTicketNumber;
         String ticketNumber;
         String inputLastNumber;
         Integer validationLastNumber;
         Integer validation;
         Boolean status = false;
         inputTicketNumber = JOptionPane.showInputDialog(null, "Enter ticket number:", "Ticket Number",
                 JOptionPane.INFORMATION_MESSAGE );
         while (inputTicketNumber.length() < 6){
             JOptionPane.showMessageDialog(null, "Ticket number must be 6 digits", "Error", JOptionPane.ERROR_MESSAGE );
             inputTicketNumber = JOptionPane.showInputDialog(null, "Enter ticket number:", "Ticket Number",
                     JOptionPane.INFORMATION_MESSAGE );
         }
         inputLastNumber = inputTicketNumber.substring(inputTicketNumber.length() -1);
         System.out.println(inputLastNumber);
         validationLastNumber = Integer.parseInt(inputLastNumber);
         ticketNumber = inputTicketNumber.substring(0, inputTicketNumber.length()- 1);
         System.out.println(ticketNumber);
         validation = Integer.parseInt(ticketNumber);
         if (validation % 7 == validationLastNumber) {
             status = true;
         } else if (validation % 7 != validationLastNumber){
             status = false;
         }
         JOptionPane.showMessageDialog(null, inputTicketNumber + "; the comparison should evaluate to " + status,
                 "Result", JOptionPane.INFORMATION_MESSAGE);


    }
}
