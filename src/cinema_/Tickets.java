package cinema_;

public interface Tickets {
	int price = 0;

	public default void setPrice(int newPrice) {
	}
	
	public default int getPrice() {	
		return price;
	}
	
}
