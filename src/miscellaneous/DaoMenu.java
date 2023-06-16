package miscellaneous;

import java.sql.*;
import java.util.List;

public class DaoMenu {

    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_Ristorante";
    private static final String USER = "freedb_Lillo";
    private static final String PASS = "JXa#57@@UThE6*k";

    public static void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Menu(
                menu_id INT NOT NULL AUTO_INCREMENT,
                name VARCHAR(255) UNIQUE,
                chef VARCHAR(255),
                average_price DOUBLE,
                tipo ENUM('Carne', 'Pesce', 'Onnivoro', 'Vegano', 'Vegetariano'),
                PRIMARY KEY (menu_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Nuova tabella creata");
    }

    public static void insertMenu(String name, String chef, double prezzoMedio, String tipo) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Menu (name, chef, average_price, tipo) VALUES ('" + name + "', '" + chef + "', " + prezzoMedio + ", '" + tipo + "' );";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");
    }

    public static void printAllMenus() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Menu;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i + 1;
            System.out.println("Name: " + resultSet.getString("name") + ", Chef: " + resultSet.getString("chef") + ", Menu ID: " + i);
        }

        conn.close();
    }
}
