import java.util.ArrayList;

// The Reading class is designed to help me learn Java classes.

public class Reading {

    public boolean readingStatus(boolean isReading, String book) {
        if (isReading) {
            System.out.println("You have finished reading " + book + ".");
            return false;
        } else {
            isReading = true;
            System.out.println("You are now reading " + book + ".");
            return true;
        }
    }

    public int pagesRead(int pagesRead, int pagesToRead) {
        if (pagesRead == pagesToRead) {
            System.out.println("You have finished reading the book.");
            return 0;
        } else {
            System.out.println("You have read " + pagesRead + " pages. You have " + (pagesToRead - pagesRead) + " pages left to read.");
            return pagesRead;
        }
    }
}


class Main {
    public static void main(String[] args) {

        String book = "The Great Gatsby";
        Reading gatsby = new Reading();
        gatsby.readingStatus(false, book);
        gatsby.pagesRead(10, 100);
        gatsby.readingStatus(true, book);

        ArrayList<String> books = new ArrayList<String>();
        books.add("The Great Gatsby");
        books.add("Pride and Prejudice");
        books.add("The Catcher in the Rye");
        books.add("The Lord of the Rings");
        books.add("The Hobbit");
        books.add("The Hunger Games");
        books.add("The Fault in Our Stars");

        books.remove(3); // Remove The Lord of the Rings.
        books.remove(5); // Remove The Fault in Our Stars.
        
        System.out.println("\nThese are the books on your reading list: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

    }
}
