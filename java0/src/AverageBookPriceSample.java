import java.util.ArrayList;

public class AverageBookPriceSample {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(100, "Author1", "Title1"));
        books.add(new Book(200, "Author2", "Title2"));
        books.add(new Book(300, "Author3", "Title3"));

                books.stream()
                        .mapToDouble(x -> x.price)
                        .average()
                        .ifPresent(x -> System.out.println("Average price: "+ x));

                books.stream()
                        .peek(x -> System.out.println(x.author))
                        .forEach(x -> System.out.println(x.title));

    }

    private static class Book{
        double price;
        String author;
        String title;

        public Book(double price, String author, String title) {
            this.price = price;
            this.author = author;
            this.title = title;
        }
    }
}
