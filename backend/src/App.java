import database.PolyNamesDatabase;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        PolyNamesDatabase db = new PolyNamesDatabase("localhost", 3306, "polynames", "root", "");
        try {
            db.connect();
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur de connexion !");
        }
    }
}
