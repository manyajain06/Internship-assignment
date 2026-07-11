import java.util.ArrayList;

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }
}

abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showRole();
}

class Member extends User {
    public Member(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is a Library Member.");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println(user.getName() + " borrowed " + title);
                    return;
                }
            }
        }
        System.out.println(title + " is not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Returned: " + title);
                    return;
                }
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Data Structures"));

        User member = new Member("Manya");
        member.showRole();

        library.borrowBook("Java Programming", member);
        library.returnBook("Java Programming");
    }
}
