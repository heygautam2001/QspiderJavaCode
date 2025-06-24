package BasicJava;

public class Book {
    String authorName;
    int price;
    int bookId;

    Book(String authorName , int price , int bookId){
        this.authorName = authorName;
        this.price = price;
        this.bookId = bookId;
    }

    public void read()
    {
        System.out.println(this.authorName+" "+this.price+" "+this.bookId);
    }

    public void edit(String authorName, int price , int bookId ){
     this.authorName = authorName;
     this.price = price;
     this.bookId = bookId;

    }

    public static void main(String[] args) {
        Book b = new Book("Dennis Riche" , 300 , 101);
        b.read();
        b.edit("Gautam" , 400 , 101);
        b.read();


    }
}
