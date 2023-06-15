package prodottiinvendita;

import java.sql.*;

public class DaoIngrediente {
    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_Ristorante";
    private static final String USER = "freedb_Lillo";
    private static final String PASS = "JXa#57@@UThE6*k";

    public static void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();


        String createQuery = """
                CREATE TABLE IF NOT EXISTS Ingredient(
                ingredient_id INT NOT NULL AUTO_INCREMENT,
                name VARCHAR(255),
                lactose_free BOOLEAN,
                vegetarian BOOLEAN,
                vegan BOOLEAN,
                gluten_free BOOLEAN,
                PRIMARY KEY (ingredient_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella ingrediente creata");
    }

    public static void insertIngredient(String name, boolean lactose_free, boolean vegetarian, boolean vegan, boolean gluten_free) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Ingredient (name, lactose_free, vegetarian, vegan, gluten_free) " +
                "VALUES ('" + name + "', " + lactose_free + ", " + vegetarian + ", " + vegan + ", " + gluten_free + ");";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

    public static void printAllIngredient() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Ingredient;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i + 1;
            System.out.println(resultSet.getString("name"));


        }

        conn.close();
    }
}
    /*public void updateQuery() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from Ingredient;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        String findName = null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            boolean lactose_free = resultSet.getString("lactose_free");
            if (team.equals(TeamName.XMAN.getName())) {
                findName = name;
            }
        }
        String updateTable = """
                UPDATE superHeroes
                SET power = 'high'
                WHERE name = '""" + findName + "';";

        statement.executeUpdate(updateTable);

        conn.close();

        System.out.println("");

    }

     */

