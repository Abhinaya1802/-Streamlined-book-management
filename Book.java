package libyaryManagementProject;

public class Book {

		private int BookId;
		private String Bookname;
		private String Author;
		public int getBookId() {
			return BookId;
		}
		public void setBookId(int bookId) {
			BookId = bookId;
		}
		public String getBookname() {
			return Bookname;
		}
		public void setBookname(String bookname) {
			Bookname = bookname;
		}
		public String getAuthor() {
			return Author;
		}
		public void setAuthor(String author) {
			Author = author;
		}
		public Book(int BookId,String Bookname,String Author) {
			super();
			this.BookId=BookId;
			this.Bookname=Bookname;
			this.Author=Author;
		}
		public void displayBook() {
			System.out.println(BookId+"|"+Bookname+"|"+Author);
		}
		

	

}
