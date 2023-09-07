import java.sql.*;

public class BevandeDao {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/localhost";
    private static final String USER = "root";
    private static final String PASS = "Gaspare1";

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();


        String createQuery = ""
           + "CREATE TABLE bevande ( "
+ "  bevande_id int NOT NULL AUTO_INCREMENT, "
+ "  Nome varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL, "
+ "  Prezzo double NOT NULL, "
+ "  grado_alcolico double NOT NULL, "
+ "  is_cold tinyint(1) NOT NULL, "
+ "  menu_id int DEFAULT NULL, "
+ "  PRIMARY KEY (bevande_id), "
+ "  KEY bevande_FK (menu_id), "
+ "  CONSTRAINT bevande_FK FOREIGN KEY (menu_id) REFERENCES menu (menu_id)";


        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella Bevande creata");
    }

    public void insertBevande(Bevande bevande) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO bevande (nome, prezzo, grado_alcolico, is_cold, ) VALUES ('" + bevande.getNome()+ "', '" + bevande.getPrezzo() + "', '" + bevande.getGradoAlcolico() + "', '" + bevande.getCold()+ "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

    public void printAllBevande() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from bevande;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i +1;
            System.out.println(" Nome " + resultSet.getString("nome") + i);
            System.out.println(" - Prezzo " + resultSet.getString("prezzo") + i);
            System.out.println(" - Grado alcolico " + resultSet.getString("grado_alcolico") + i);
            System.out.println(" - is cold " + resultSet.getString("is_cold") + i);

        }

        conn.close();
//
//    }
//
//    public void updateQuery() throws SQLException {
//        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//        Statement statement = conn.createStatement();
//        String printQuery = """
//                  SELECT * from superHeroes;
//
//                """;
//        ResultSet resultSet = statement.executeQuery(printQuery);
//
//        String findName = null;
//        while (resultSet.next()) {
//            String name = resultSet.getString("name");
//            String team = resultSet.getString("team");
//            if (team.equals(TeamName.XMAN.getName())) {
//                findName = name;
//            }
//        }
//        String updateTable = """
//                UPDATE superHeroes
//                SET power = 'high'
//                WHERE name = '""" + findName + "';";
//
//        statement.executeUpdate(updateTable);
//
//        conn.close();
//        System.out.println("Update SuperHeroes" +findName);
//
//    }
//
//    public enum TeamName {
//        XMAN("X-MAN_MUTANTI", 1),
//        FANTASTIC4("FANTASTIC4ANDSPIDERMAN",2),
//        FREELANCE("DA SOLO",3);
//
//        private final String name;
//        private final Integer id;
//
//        TeamName(String name, int id) {
//            this.name = name;
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Integer getId() {
//            return id;
//        }
//
//        public static TeamName getTeamNameEnumFromId(Integer id) {
//
//            TeamName teamNameSelected = null;
//
//            for (TeamName teamNameEnum : TeamName.values()) {
//                if(teamNameEnum.getId().equals(id)){
//                    teamNameSelected = teamNameEnum;
//                }
//            }
//
//            return teamNameSelected;
//        }
//
//    }
//
//    public  void metodoRecuperoDatabase(Integer id) throws SQLException {
//        SuperHero superHero = new SuperHero();
//
//        superHero.createTable();
//        superHero.insertHeroes("Spiderman", TeamName.XMAN);
//        superHero.printAllHeroes();
//        superHero.updateQuery();
//
//        TeamName teamName = TeamName.getTeamNameEnumFromId(id);
//    }
//}
//
//
//
}
}
