package iterator;


import java.util.Iterator;

/*
    for문 안에 i를 하나씩 증가시키면, 배열 arr의 요소를 처음부터 순서대로 검색하게 된다.
    여기에 사용되는 변수 i의 기능을 추상화하여 일반화한 것을 iterator.Iterator 패턴이라고 한다.
    무언가 많이 모여 있을 때 이를 순서대로 가리키며 전체를 검색하고 처리를 반복하는 것이다.
 */

public class Main {

    /*
        public interface iterator.Iterator<E> {
            public abstract boolean hasNext();  다음 요소가 존재하는지?
            public abstract E next();   다음 요소를 가져옴
        }
     */
    public static void main(String[] args) {
        BookShelf2 bookShelf = new BookShelf2();
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));

        Iterator<Book> it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }

}

