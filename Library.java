package Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	private List<Book> books;
	
	public Library(){
		this.books = new ArrayList<>();
		
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	
	public void displayAvailableBooks() {
		System.out.println("Available Books: ");
		for(Book book: books) {
			if(book.isAvailable()) {
				System.out.println(book+ "\n");
			}
		}
	}
	public void borrowBook(String title) {
		for (Book book : books) {
			if(book.getTitle().equals(title) && book.isAvailable()) {
				book.setAvailable(false);
				System.out.println("You have borrowed: "+ book+ "\n");
				return;
			}
		}
		System.out.println("Book '"+title+ "' is not available for borrowing.");
	}
	
	public void returnBook(String title){
		for(Book book: books) {
			if(book.getTitle().equals(title) && !book.isAvailable()) {
				book.setAvailable(true);
				System.out.println("\nYou have returned: "+book+ "\n");
				return;
			}
		}
		System.out.println("\nBook '"+title+"'was not borrowed from the library.");
	}
}
