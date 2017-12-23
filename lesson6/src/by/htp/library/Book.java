package src.by.htp.library;

public class Book {
    private int year;
    private String name;
    private String authorName;
	
	public Book() {
	}
	public Book(int year, String name, String authorName) {
		this.year = year;
                this.name = name;
                this.authorName = authorName;
	}	
		
	
	public void setYear(int year) {
		if(year>1995) {
			this.year = year;
		}
	}
	public int getYear() {
		return year;
	}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name + " " + authorName + " " + year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
