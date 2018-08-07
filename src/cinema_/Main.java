package cinema_;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
	

	public static void main(String[] args) {
		
	
		
		TicketPrices t = new TicketPrices();
		t.setChildPrice(15);
		int r = t.getChildPrice();
		System.out.println(r);
		
		//Tickets Standard = new TicketPrices();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
	
	}

}
