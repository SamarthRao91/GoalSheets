package GoalSheet06.TicketAssignment;

import GoalSheet06.TicketAssignment.Ticket;

public class WalkupTicket extends Ticket {

    public WalkupTicket(int ticketNumber) {
        super(ticketNumber);
    }
    public int getTicketPrice()
    {
        return 50;
    }
    public String toString()
    {
        return "Number " +number + " Price " + getTicketPrice();

    }


}
