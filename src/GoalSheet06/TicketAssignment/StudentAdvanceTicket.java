package GoalSheet06.TicketAssignment;


public class StudentAdvanceTicket extends AdvanceTicket {


    public StudentAdvanceTicket(int ticketNumber , int daysBefore) {
        super(ticketNumber, daysBefore);
    }
    public int getTicketPrice()
    {
        return super.getTicketPrice()/2;
    }
    public String toString()
    {
        return "Number " +number + " Price " + getTicketPrice() + " ID Required ";

    }
}
