package encapsulation_practice;

public class CallingFlightTicket {

	public static void main(String[] args) {
		
		FlightTicket ft = new FlightTicket();
		
		ft.setPassengerName("Malvi");
		ft.setTicketNumber("dgd56vnbv67");
		ft.setSeatNumber("A34");
		ft.setFlightNumber("SD454KL66");;
		ft.setPrice(3006.89);
		ft.setDate("1 Dec 2025");
		ft.setDepartureCity("Chhatrapati Samabhajinagar");
		ft.setArrivalCity("Pune");
		
		System.out.println("<-------Flight Ticket Details----------->");
		System.out.println("Passenger Name         : " + ft.getPassengerName());
		System.out.println("Ticket Numaber         : " + ft.getTicketNumber());
		System.out.println("Seat Number            : " + ft.getSeatNumber());
		System.out.println("Passenger Name         : " + ft.getPassengerName());
		System.out.println("Ticket Price           : " + ft.getPrice());
		System.out.println("Flight Date            : " + ft.getDate());
		System.out.println("Flight Depature City   : " + ft.getDepartureCity());
		System.out.println("Flight Arrival City    : " + ft.getArrivalCity());

	}

}
