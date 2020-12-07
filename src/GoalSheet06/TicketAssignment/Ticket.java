package GoalSheet06.TicketAssignment;

public class Ticket {
    int number;
    public Ticket(int ticketNumber)
    {
        number = ticketNumber;
    }


    public String toString()
    {
      return "Number" + number ;
    }





    public static void main(String[] args)
    {
        Ticket newTicket = new StudentAdvanceTicket(1 ,10);
        System.out.println(newTicket);

        Ticket myTicket = new WalkupTicket(1);
        //int price = myTicket.getTicketPrice();

        //newTicket.
    }

}
