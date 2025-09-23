package cw_task02;

public class CinemexTicket extends MovieTicket{

    public String ticketID;
    public static int total_tickets;
    public String genre;
    public String payment_status;

    public CinemexTicket(String movie_name,String show_time,String genre,String date){
        super(movie_name, date, show_time,0.0);
        this.genre = genre;
        this.payment_status = "Not Paid";
        super.seat = "Regular";
        total_tickets++;
        this.ticketID = getMovie()+"-"+super.seat.charAt(0)+"-"+total_tickets;
    }

    public CinemexTicket(String movie_name,String show_time,String genre,String date,String seat_type){
        super(movie_name, date, show_time,0.0);
        super.seat = seat_type;
        this.genre = genre;
        this.payment_status = "Not Paid";
        total_tickets++;
        this.ticketID = getMovie()+"-"+super.seat.charAt(0)+"-"+total_tickets;
    }

    public static int getTotalTickets(){
        return total_tickets; 
    }

    public String confirmPayment(){
        if(payment_status =="Not Paid"){
            payment_status = "Paid";
            return "Payment Successful.";
        }
        return "Ticket price is already paid!";
    }

    public void calculateTicketPrice(){ //This method is the main of this task.
        double base_price = 0.0;
        for(int i=0;i<MovieTicket.seatTypes.length;i++){
            if((MovieTicket.seatTypes[i]).equals(super.seat)){
                base_price= MovieTicket. seatPrices[i];
                super.setPrice(base_price);
            }
        }
        String [] parts = super.showtime.split(":");//This seperates hour and minutes.
        int hour = Integer.parseInt(parts[0]); // String "18" converts to int 18

        if(hour>=18 && hour<=23){
            base_price+=base_price*nightShowCharge/100.0;
        }
        super.setPrice(base_price);
        System.out.println("Ticket price is calculated successfully.");
    }
    public String toString() {
        return "Ticket ID :"+ticketID+"\n"+super.toString()+"\nGenre : "+genre+"\nSeat Type : "+super.seat+"\nPrice(tk) : "+super.getPrice()+"\nStatus : "+payment_status;
    }
}
