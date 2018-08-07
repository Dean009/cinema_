package cinema_;

public class TicketPrices {

	private int Standard = 8, 
			OAP = 6, 
			Student = 6, 
			Child = 4;
	
	// setters 
	
	public void setStandardPrice(int price) {
		Standard = price;
	}
	
	public void setOAPPrice(int price) {
		OAP = price;
	}
	
	public void setStudentPrice(int price) {
		Student = price;
	}
	
	public void setChildPrice(int price) {
		Child = price;
	}


	//getters
	
	public int getStandardPrice() {
		return Standard;
	}

	public int getOAPPrice() {
		return OAP;
	}

	public int getStudentPrice() {	
		return Student;
	}

	public int getChildPrice() {
		return Child;
	}
	
	
	
}
