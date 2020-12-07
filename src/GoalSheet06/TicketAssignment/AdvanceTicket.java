package GoalSheet06.TicketAssignment;


public class AdvanceTicket extends Ticket {
    int daysBefore;

    public AdvanceTicket(int ticketNumber,int days ) {
        super(ticketNumber);
        daysBefore = days;
    }
    public int getTicketPrice()
    {
        if(daysBefore <=10)
        {
            return 30;
        }
        else
        {
            return 40;
        }

    }
    public String toString()
    {
        return "Number " +number + " Price " + getTicketPrice();

    }
}
