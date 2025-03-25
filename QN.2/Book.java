class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 500);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 300);
        
        book1.displayDetails();
        book2.displayDetails();
    }
}
