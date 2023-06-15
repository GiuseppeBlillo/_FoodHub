package miscellaneous;


import java.sql.*;

public class DaoRistorante {
    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_Ristorante";
    private static final String USER = "freedb_Lillo";
    private static final String PASS = "JXa#57@@UThE6*k";

    public static void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Ristorante(
                ristorante_id INT NOT NULL AUTO_INCREMENT,
                name VARCHAR(255),
                cover_charge INT,
                cuisine_type ENUM('ITALIANA', 'CINESE', 'GIAPPONESE', 'INDIANA', 'THAILANDESE', 'MESSICANA', 'GOURMET', 'FUSION', 'VEGETARIANA', 'VEGANA'),
                PRIMARY KEY (ristorante_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("nuova tabella creata");
    }

    public static void insertRistorante(String name, Integer cover_charge, String cuisine_type) throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Ristorante (name, cover_charge, cuisine_type) VALUES ('" + name +   "', " + cover_charge + ", '"+cuisine_type+"' );";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

    public static void printRistorante() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Ristorante;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i + 1;
            System.out.println(" name: '" + resultSet.getString("name") +"', id:" + i);


        }

        conn.close();

    }
}
