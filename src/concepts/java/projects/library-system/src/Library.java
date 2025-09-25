import java.util.*;
class Library {
    Map<String,Book> byIsbn = new LinkedHashMap<>();
    void add(Book b){ byIsbn.put(b.isbn, b); }
    Book find(String isbn){ return byIsbn.get(isbn); }
    List<Book> list(){ return new ArrayList<>(byIsbn.values()); }
    boolean borrow(String isbn){
        Book b = byIsbn.get(isbn); if (b==null || b.borrowed) return false; b.borrowed=true; return true;
    }
    boolean giveBack(String isbn){
        Book b = byIsbn.get(isbn); if (b==null || !b.borrowed) return false; b.borrowed=false; return true;
    }
}
