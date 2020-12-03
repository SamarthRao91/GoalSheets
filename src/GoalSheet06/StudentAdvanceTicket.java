package GoalSheet06;


public class StudentAdvanceTicket extends AdvanceTicket {
    int price;

    public StudentAdvanceTicket(int ticketNumber) {
        super(ticketNumber);
    }
    public int getTicketPrice(int ticketPrice)
    {
        if(daysBefore <=10)
        {
            ticketPrice = 15;
        }
        else
        {
            ticketPrice = 20;
        }
        return ticketPrice;
    }
    public String toString()
    {
        return "Number" +new Ticket(number) + "Price" + getTicketPrice(ticketPrice) + "ID Required";

    }
}
