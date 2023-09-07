import java.sql.*;

public class DessertDao {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASS = "Totti10totti";

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();

        String createQuery = ""
                + "CREATE TABLE IF NOT EXIST `dessert` ( "
                + "  `dessert_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL, "
                + "  `price` double NOT NULL, "
                + "  `diet_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL, "
                + "  `calories` double NOT NULL, "
                + "  `alcoholic` tinyint(1) NOT NULL, "
                + "  `gluten_free` tinyint(1) NOT NULL, "
                + "  `menu_id` int DEFAULT NULL, "
                + "  PRIMARY KEY (`dessert_id`), "
                + "  KEY `dessert_FK` (`menu_id`), "
                + "  CONSTRAINT `dessert_FK` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`) "
                + ")";
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella dessert creata");
    }

    public void insertDessert(Dessert dessert) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO dessert (nome,prezzo,tipo_dieta,calorie,alcolico,gluten_free ) VALUES ('" + dessert.getNome() + "', '" + dessert.getPrezzo() + "', '"+ dessert.getTipoDieta() + "', '"+dessert.getAmountOfCalories()+"', '"+dessert.isAlcoholic() + "', '" +dessert.getGlutenFree()+"');";
        statement.executeUpdate(insertQuery);
        conn.close();

        System.out.println("Tabella popolata");
    }
    public void printAllDessert() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from superHeroes;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i +1;
            System.out.println(" nome " + resultSet.getString("nome") + i);
            System.out.println(" - prezzo " + resultSet.getString("prezzo") + i);
            System.out.println(" - tipo dieta" + resultSet.getString("tipo_dieta") + i);
            System.out.println(" - calorie" + resultSet.getString("calorie") + i);
            System.out.println(" - alcolico" + resultSet.getString("alcolico") + i);
            System.out.println(" - gluten free" + resultSet.getString("gluten_free") + i);

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
    }*/
}
