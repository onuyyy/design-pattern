package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf2 implements Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf2() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator2(this);
    }
}
