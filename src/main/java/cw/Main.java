package cw;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sql = "SELECT * FROM BookStore";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?serverTimezone=Europe/Moscow",
                "root", "1111");
             Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int number = resultSet.getInt("number");
                String author = resultSet.getString("author");
                int count = resultSet.getInt("count");

            }
            System.out.println("(1) Добавить книгу"); //увеличить count, либо добавить новую
            System.out.println("(2) Получить книгу по номеру");//получить информацию
            System.out.println("(3) Удалить книгу по номеру");
            System.out.println("(4) Получить  n-книг по номеру");
            System.out.println("(5) Получить книги по автору");
            System.out.println("(6) Получить все книги");

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}