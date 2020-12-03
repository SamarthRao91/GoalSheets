package GoalSheet06;

public class Ticket {
    int number;
    int ticketPrice;
    public Ticket(int ticketNumber)
    {

    }
    public int getTicketPrice(int ticketPrice)
    {
        return ticketPrice;
    }
    public String toString()
    {
      return "Number" +new Ticket(number) + "Price" + getTicketPrice(ticketPrice);
    }
    public static void main(String[] args)
    {
        Ticket newTicket = new Ticket(1);
        newTicket.getTicketPrice(50);
        //newTicket.
    }

}
