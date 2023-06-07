class Book {

    int bookNo;

    String bookName;

    double bookPrice;

    Book(int a, String b, double c) {

        this.bookNo = a;

        this.bookName = b;

        this.bookPrice = c;

    }

    public void display() {

        System.out.println(bookNo);

        System.out.println(bookName);

        System.out.println(bookPrice);

    }

}

class SpecialEditionBook extends Book {

    private double discount;

    public SpecialEditionBook(int a, String b, double c) {

        super(a, b, c);
        this.discount = 10;

    }

    public SpecialEditionBook(int a, String b, double c, double d) {

        super(a, b, c);
        this.discount = d;

    }

    public void display() {

        super.display();

        System.out.println(discount);

    }

    public void purchase(int bookNo, String bookName, int quantity) {

        this.bookNo = bookNo;

        this.bookName = bookName;

        System.out.println("Book you purchased: " + bookNo + " " + bookName);

        System.out.println("Number of copies purchased: " + quantity);

        System.out.println("Total Price: " + (quantity * bookPrice - discount));

    }

}

public class BookMain {

    public static void main(String[] args) {

        Book b = new Book(100, "Python", 200);

        b.display();

        SpecialEditionBook b1 = new SpecialEditionBook(101, "Java", 100);

        b1.display();

        b1.purchase(102, "CPP", 4);

    }

}
