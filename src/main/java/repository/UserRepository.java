package repository;

import model.User;

import java.sql.*;

public class UserRepository {
    public int addUser(User user) {
       String query = "INSERT INTO UserData VALUES ('" + user.firstName + "', '" + user.lastName + "', '" + user.mobileNumber +
         "', '" + user.address + "')";
        System.out.println(query);
        Connection connection = getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            int i = statement.executeUpdate(query);
            connection.close();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "root");
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
