package GoalSheet06;


public class AdvanceTicket extends Ticket {
    int price;
    int daysBefore;

    public AdvanceTicket(int ticketNumber ) {
        super(ticketNumber);
    }
    public int getTicketPrice(int ticketPrice)
    {
        if(daysBefore <=10)
        {
            ticketPrice = 30;
        }
        else
        {
            ticketPrice = 40;
        }
        return ticketPrice;
    }
}
