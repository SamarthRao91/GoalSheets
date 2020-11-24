package GoalSheet06;

public class AdvanceTicket extends Ticket{
    public AdvanceTicket(int ticketNumber, int ticketPrice, int daysBefore) {
        super(ticketNumber, ticketPrice);
        if(daysBefore <=10)
        {
            ticketPrice = 30;
        }
        else
        {
            ticketPrice = 40;
        }
    }
}
