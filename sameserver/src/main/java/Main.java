import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("ж/hello", (req, res) -> "<title>Какойто сайт</title><font size='5'<strong>Лучший сайт</strong></font>");
    }
}