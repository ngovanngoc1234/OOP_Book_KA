package book;

import java.util.ArrayList;

public class MainBook {
    public static ArrayList<Book> SortAndSearch(ArrayList<Book> bookLists) {
        Book num;
        for (int i = 0; i < bookLists.size() - 1; i++) {
            int j = 0;
            while (j < bookLists.size() - 1 - i) {
                if (bookLists.get(j).getPrice() > bookLists.get(j + 1).getPrice()) {
                    num = bookLists.get(j);
                    final Book set = bookLists.set(j, bookLists.get(j + 1));
                    bookLists.set(j + 1, num);
                }
                j++;
            }
        }
        return bookLists;
    }
    public static ArrayList<Book> search (ArrayList<Book> newBook) {

        return  newBook;
    }

}
