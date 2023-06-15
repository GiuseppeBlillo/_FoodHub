package prodottiinvendita;import java.sql.*;

public class DaoPortata {

    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_Ristorante";
    private static final String USER = "freedb_Lillo";
    private static final String PASS = "JXa#57@@UThE6*k";

    public static void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Portata(
                portata_id INT NOT NULL AUTO_INCREMENT,
                name VARCHAR(255) UNIQUE,
                description VARCHAR(255),
                price DOUBLE,
                dish_type ENUM('Antipasto', 'Primo', 'Secondo', 'Dessert', 'Bevanda'),
                PRIMARY KEY (portata_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("nuova tabella creata");
    }

    public static void insertPortata(String name, String description, double price, String dish_type) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Portata (name, description, price, dish_type) VALUES ('" + name + "', '" + description + "', " + price + ", '"+dish_type+"' );";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

/*
 */

    public static void printAllPortate() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Portata;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i +1;
            System.out.println(" name " + resultSet.getString("name") + i);


        }

        conn.close();

    }
    /*

    public void updateQuery() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from superHeroes;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        String findName = null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String team = resultSet.getString("team");
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
        System.out.println("Update SuperHeroes" +findName);

    }

    public enum TeamName {
        XMAN("X-MAN_MUTANTI", 1),
        FANTASTIC4("FANTASTIC4ANDSPIDERMAN",2),
        FREELANCE("DA SOLO",3);

        private final String name;
        private final Integer id;

        TeamName(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Integer getId() {
            return id;
        }

        public static TeamName getTeamNameEnumFromId(Integer id) {

            TeamName teamNameSelected = null;

            for (TeamName teamNameEnum : TeamName.values()) {
                if(teamNameEnum.getId().equals(id)){
                    teamNameSelected = teamNameEnum;
                }
            }

            return teamNameSelected;
        }

    }

    public  void metodoRecuperoDatabase(Integer id) throws SQLException {
        SuperHero superHero = new SuperHero();

        superHero.createTable();
        superHero.insertHeroes("Spiderman", TeamName.XMAN);
        superHero.printAllHeroes();
        superHero.updateQuery();

        TeamName teamName = TeamName.getTeamNameEnumFromId(id);
    }
}
    public void insertTable(SuperHero superHero) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery =
                """
                 INSERT INTO superHeroes (name, team)
                 VALUES ('""" + superHero.getName() + "', '" + superHero.getTeamEnumJava7().getNameSuperHero() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();

    }
    */

    public static void main(String[] args) throws SQLException {

        DaoPortata.printAllPortate();
        DaoPortata.createTable();
        DaoPortata.insertPortata("Spaghetti allo scoglio", "Deliziosi spaghetti allo scoglio", 14, "PRIMO");


    }}


