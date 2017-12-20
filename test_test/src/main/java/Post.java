public class Post {
    public String author;
    public String text;

    public Post(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Author: "+this.author+" post: "+this.text;
    }
}
