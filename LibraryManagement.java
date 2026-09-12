package libyaryManagementProject;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		while(true) {
			System.out.println("=======================");
			System.out.println("1.Add a Book");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Choose Any Option");
			int choose=sc.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Enter Book Id:");
				int BookId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Title");
				String title=sc.next();
				System.out.println("Enter Author");
				String Author=sc.next();
				Book book=new Book(BookId,title,Author);
				lib.addBook(book);
			case 2:
				System.out.println("Enter BookId for Update:");
				int id=sc.nextInt();
				System.out.println("Enter title");
				String newtitle=sc.nextLine();
				System.out.println("Enter Author");
				String newAuthor=sc.nextLine();
				lib.updateBook(id, newtitle, newAuthor);
				break;
			case 3:
				System.out.println("Enter BookId to delete");
				int newid=sc.nextInt();
				lib.deleteBook(newid);
				break;
			case 4:
				lib.displayAllBooks();
				break;
			case 5:
				System.out.println("Thank You!!!");
				System.exit(0);
				default:
					System.out.println("Invalid Choice!!!!");
				
			}
			sc.close();
		}

	}

}
