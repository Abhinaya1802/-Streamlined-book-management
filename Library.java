package libyaryManagementProject;

public class Library {
	Book[] books=new Book[10];
	int count=0;
	void addBook(Book book) {
		System.out.println("Adding a Book....");
		if(count>books.length) {
			System.out.println("Library is full");
			return;
		}
		else {
			books[count]=book;
			count++;
			System.out.println("Book Successfully Added!!!!");
		}
	}
		public void displayAllBooks() {
			for(int i=0;i<count;i++) {
				books[i].displayBook();
			}
			System.out.println("=================================");
		}
		public void updateBook(int BookId,String newtitle,String newAuthor ) {
			for(int i=0;i<count;i++) {
				if(books[i].getBookId()==BookId) {
					books[i].setBookname(newtitle);
					books[i].setAuthor(newAuthor);
					System.out.println("Updated Successfully!!!");
					return;
					
				}
			}
		}
		public void deleteBook(int id) {
			for(int i=0;i<count;i++) {
				if(books[i].getBookId()==id) {
					for(int j=0;j<count-1;j++) {
						books[j]=books[j+1];
					}
					books[count-1]=null;
					count--;
					return;
				}
			}
			System.out.println("Book Not Found...");
			System.out.println("=================================");
		}
	}
	


