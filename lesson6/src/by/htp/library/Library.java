package src.by.htp.library;



public class Library {
	
	Book[] books = new Book[3];
	int bookCount = 0;
	
	
	public void addBook(Book book) {
		
		if (bookCount < books.length) {
			this.books[bookCount] = book;

		} else {
			Book[] oldBooks = books;
			books = new Book[books.length + 1];
			for (int i = 0; i < oldBooks.length; i++) {
				books[i] = oldBooks[i];
			}
			books[bookCount] = book;
		}
		bookCount++;
	}
	public void printBooks() {
		for (Book book : books) {
			System.out.println(book.getYear());
		}
	}
	
	public void printBooks(int startI) {
		for (int i = startI; i <books.length; i++) {
			System.out.println(books[i].getYear()+" "+books[i].getAuthorName()+" "+books[i].getName());
		}
	}
	public void search(Book[]books) {
		int maxOld = books[0].getYear();
		for (int i = 0; i < books.length; i++) {
			if(books[i].getYear() < maxOld) {
				maxOld = books[i].getYear();
			}
		}
		System.out.println("max old " + maxOld);		
	}
        //4
        public void SortByYear(Book[] books){
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = i + 1; j < books.length; j++) {
                    if(books[i].getYear() > books[j].getYear()){
                        int tmp = books[i].getYear();
                        books[i].setYear(books[j].getYear());
                        books[j].setYear(tmp);
                    }
                }
            }
            for(int i = 0; i < books.length; i++){
                System.out.println(books[i].getYear() + " " + books[i].getName());
            }
        }
        //5
        public void SortByPeriodTime(Book[]books,int min, int max){
            for (int i = 0; i < books.length; i++) {
                if(books[i].getYear() <= max && books[i].getYear() >= min){
                    System.out.println("diap " + books[i].getName() + " " + books[i].getYear());
                }
                
            }
            
        }
        //6
        public void searchAuthorName(Book[]books, String strName){
            boolean index = false;
            for (int i = 0; i < books.length; i++) {
                if(strName.equalsIgnoreCase(books[i].getAuthorName())){
                    System.out.println("книга автора: " + books[i]);
                    index = true;
                }               
            }
            if(index != true){
                System.out.println("Книг не найдено, сори");
            }
        }
        //7
        public void searchAuthorName(String bookName, String authorName){
            boolean index = false;
            for (int i = 0; i < books.length; i++) {
                if(authorName.equalsIgnoreCase(books[i].getAuthorName()) && bookName.equalsIgnoreCase(bookName)){
                    System.out.println("книга автора: " + books[i]);
                    index = true;
                }               
            }
            if(index != true){
                System.out.println("Книг не найдено, сори");
            }
        }
        //8
        public void deleteBook(String strNameBook, String strNameAuthor){         
            for (int i = 0; i < books.length; i++) {
                if(strNameBook.equalsIgnoreCase(books[i].getName()) && strNameAuthor.equalsIgnoreCase(books[i].getAuthorName())){
                    Book[] oldBooks = books;
                    books = new Book[books.length - 1];
                    for (int j=0, k = 0; j < books.length; j++, k++) {
                    	books[j] = oldBooks[k];
                    	if(j == (i-1)) {
                    		k++;
                    	}
                    }
                }               
            }            
        }
        //9
        public void numberOfIdenticalBooks(Book book) {
        	int count = 0;
        	int index = 0;
        	for (int i = 0; i < books.length; i++) {
				if(book.getName().equalsIgnoreCase(books[i].getName()) && book.getAuthorName().equalsIgnoreCase(books[i].getAuthorName()) && book.getYear() == book.getYear()) {
					count++;
				}
				index = i;
			}
        	System.out.println(books[index] + " " + count);        	
        }
        //10.1
        public void SortByName(Book[] books){
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = i + 1; j < books.length; j++) {
                    if(books[j].getName().compareToIgnoreCase(books[i].getName()) < 0){
                        String tmp = books[j].getName();
                        books[j].setName(books[i].getName());
                        books[i].setName(tmp);
                    }
                }
            }
            for(int i = 0; i < books.length; i++){
                System.out.println(books[i].getName() + " " + books[i].getYear());
            }
        }
        //10.2
        public void sortByNameAndAuthorName(){
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = i + 1; j < books.length; j++) {
                    if(books[j].getAuthorName().compareToIgnoreCase(books[i].getAuthorName()) < 0){
                        Book tmp = books[j];
                        books[j] = books[i];
                        books[i] = tmp;
                    }
                    else if(books[j].getAuthorName().compareToIgnoreCase(books[i].getAuthorName()) == 0){                    	
                        if(books[j].getName().compareToIgnoreCase(books[i].getName()) < 0){
                            Book tmp = books[j];
                            books[j] = books[i];
                            books[i] = tmp;
                        }                        
                    }
                }
            }         
        }      
}
