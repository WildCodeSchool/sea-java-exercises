package quests.jdbc;

import java.sql.*;

public class MySQLSample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Dieses Beispiel nutzt die "World" Beispieldatenbank, die bei der MySQL-Installation angelegt wird.

        // Wir nutzen try-with-resources hier, bitte nicht ohne benutzen!
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world", "alex", "q");
            CallableStatement callableStatement = connection.prepareCall("select population from city")) {

            try (ResultSet resultSet = callableStatement.executeQuery()) {
                while (resultSet.next()) {
                    String value = resultSet.getString(1);
                    System.out.println(value);
                }
            }
        }

        // INSERT INTO Person
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world", "alex", "q");
             PreparedStatement statement = connection.prepareStatement("insert into city (name, countrycode, district, population) values (?,?,?,?)")) {

            statement.setString(1, "Atlantis");
            statement.setString(2, "AFG");
            statement.setString(3, "Atlantis-City");
            statement.setInt(4, 2);
            int insertedRows = statement.executeUpdate();
        }
    }

}
