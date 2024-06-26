package Library;
public class Book {
	private String title;
	private String author;
	private boolean available;
	
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
		this.available = true;	//Initially all books are available
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	 public void setAvailable(boolean available) {
	        this.available = available;
	 }
	 
	@Override
	public String toString() {
		return " Title: " +title+ " Author: " +author+" Available: "+available;
	}
	
}
