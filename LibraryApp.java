package Library;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		
		//Adding some book to library
		 library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
	     library.addBook(new Book("1984", "George Orwell"));
	     library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
	     
	     //Display available books
	     library.displayAvailableBooks();
	     
	     //Borrowing a book
	     library.borrowBook("1984");
	     
	     //Displaying available books after borrowing 
	     library.displayAvailableBooks();
	     
	     //Returning a book
	     library.returnBook("1984");
	     
	     //Display available books after returning
	     library.displayAvailableBooks();
	}

}
