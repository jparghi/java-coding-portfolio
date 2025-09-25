class Book {
    String isbn, title; boolean borrowed;
    Book(String isbn, String title){ this.isbn=isbn; this.title=title; }
    public String toString(){ return isbn + " - " + title + (borrowed?" [OUT]":""); }
}
