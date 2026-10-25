package Projeckt;

public class Book {
	private String bookName;
	private int bookId;
	private String author;
	private int pageCount;
	private boolean isAvailable;
	
	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.isAvailable=true;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getİsAvaliable() {
		return this.isAvailable;
	}
	public void setİsAvaliable( boolean isAvaliable) {
		this.isAvailable = isAvaliable;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
	

}
