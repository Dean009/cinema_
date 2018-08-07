package cinema_;

public class Films {
	
	private String title, showDate;

	public Films(String aTitle, String aShowDate) {
		title = aTitle;
		showDate = aShowDate;
	}
	
	public void setTitle(String aTitle) {
		title = aTitle;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDate(String aDate) {
		showDate = aDate;
	}
	
	public String getDate() {
		return showDate;
	}
	
}
