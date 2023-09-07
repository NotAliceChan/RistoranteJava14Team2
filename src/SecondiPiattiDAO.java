import java.sql.*;
public class SecondiPiattiDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/localhost";
    private static final String USER = "root";
    private static final String PASS = "java14";

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();


        String createQuery = ""
                + "CREATE TABLE `secondi_piatti` ( "
                + "  `secondi_piatti_id` int NOT NULL AUTO_INCREMENT, "
                + "  `nome` varchar(100) NOT NULL, "
                + "  `prezzo` double NOT NULL, "
                + "  `origine` varchar(100) DEFAULT NULL, "
                + "  `tempo_di_cottura` int DEFAULT NULL, "
                + "  `menu_id` int DEFAULT NULL, "
                + "  `tipo_dieta` varchar(255) NOT NULL, "
                + "  PRIMARY KEY (`secondi_piatti_id`), "
                + "  KEY `secondi_piatti_FK` (`menu_id`), "
                + "  CONSTRAINT `secondi_piatti_FK` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`) ";

        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella secondi_piatti creata");
    }

    public void insertSecondoPiatto(SecondiPiatti secondoPiatto) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO secondi_piatti (nome, prezzo, tipo_dieta) VALUES ('" + secondoPiatto.getNome() + "', '" + secondoPiatto.getPrezzo() + "', '" + secondoPiatto.getTipoDieta() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

    public void printSeondiPiatti() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from secondi_piatti;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i + 1;
            System.out.println(" nome " + resultSet.getString("nome") + i);
            System.out.println(" - prezzo " + resultSet.getString("prezzo") + i);
            System.out.println(" - tipo dieta " + resultSet.getString("tipo_dieta") + i);
            System.out.println(" - origine " + resultSet.getString("origine") + i);
            System.out.println(" - tempo di cottura " + resultSet.getString("tempo_di_cottura") + i);

        }

        conn.close();

    }
/*
        public void updateQuery() throws SQLException {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String printQuery = """
                  SELECT * from secondi_piatti;

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

 */
}