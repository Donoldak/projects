import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String userId = reader.readLine();

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=6966288LoL");

        PreparedStatement statement = connection.prepareStatement("update users set login = ? where  id = ? \n");

        connection.setAutoCommit(false);


        statement.setString(1, "Egor");
        statement.setInt(2,1);

        statement.executeUpdate();


        statement.setString(1, "Mendeldog");
        statement.setInt(2,2);

        statement.executeUpdate();

        connection.commit();


//        PreparedStatement statement = connection.prepareStatement("select login, text from\n" +
//                "users join link_post_user join posts\n" +
//                "on (users.id = link_post_user.user_id and posts.id = link_post_user.post_id) \n" +
//                "where users.id = ?");
//
//        statement.setString(1, userId);
//
//        ResultSet resultSet = statement.executeQuery();
//        List<Post> posts = new ArrayList<Post>();
//        while (resultSet.next()){
//            int loginIndex = resultSet.findColumn("login");
//            int textIndex = resultSet.findColumn("text");
//            String author = resultSet.getString(loginIndex);
//            String text = resultSet.getString(textIndex);
//            posts.add(new Post(author, text));
//        }
//
//        for (Post post : posts){
//            System.out.println(post.toString());
//        }

    }
}
