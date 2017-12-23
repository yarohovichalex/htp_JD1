package src.by.htp.library;

public class MainApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book = new Book(2005, "Борис Годунов", "Пушкин");
		library.addBook(book);
		
		Book book2 = new Book(2003, "Нос", "Гоголь");
		library.addBook(book2);
		
		Book book3 = new Book(2002, "Виды ментальности", "Шевченко");
		library.addBook(book3);
                	
		Book book4 = new Book(2005, "Новая зямля", "Колос");
		library.addBook(book4);
		
		Book book5 = new Book(2009, "Идиот", "Достоевский");
		library.addBook(book5);
                
        Book book6 = new Book(2007, "Анна Коренина", "Толстой");
		library.addBook(book6);
		
		Book book7 = new Book(2002, "Спадчына", "Купала");
		library.addBook(book7);
		
		Book book8 = new Book(2005, "Новая зямля", "Колос");
		library.addBook(book8);
		
		Book book9 = new Book(2005, "Новая зямля", "Колос");
		library.addBook(book9);
		
		Book book10 = new Book(2002, "На ростанях", "Колос");
		library.addBook(book10);
		
		//library.printBooks(0);
		
		//library.search(library.books);
                //library.SortByYear(library.books);
                //library.SortByPeriodTime(library.books, 2003, 2005);
                library.searchAuthorName(library.books, "Гоголь");
                //library.deleteBook("Идиот", "Достоевский");
                //library.numberOfIdenticalBooks(book4);
                //library.printBooks(0);
               // library.sortByNameAndAuthorName();
                //library.printBooks(0);
                library.searchAuthorName("Новая зямля","Колос");

}
}