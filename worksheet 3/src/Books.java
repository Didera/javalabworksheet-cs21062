class Books extends BorrowableItems{
    String title;
    String author;
    String ISBN;
    boolean available;
//constructor
    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }

//getter setter methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    void displayInfo() {
        System.out.println("The Title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The ISBN of the book is " + ISBN);
        System.out.println("The Availability of the book is " + available);
    }
}
