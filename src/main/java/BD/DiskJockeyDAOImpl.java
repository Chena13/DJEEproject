package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiskJockeyDAOImpl implements DiskJockeyDAO {
	
	
	public List<DiskJockey> findByQuery(String query) {
        List<DiskJockey> djs = new ArrayList<>();
        
        Connection connection = DBManager.getInstance().getConnection();
        Statement statement;
		ResultSet rs;
		
        try {
        	statement = connection.createStatement();
			rs = statement.executeQuery(query);
            while (rs.next()) {
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nomDeScene = rs.getString("nom_de_scene");
                LocalDate dateDeNaissance = rs.getDate("date_de_naissance").toLocalDate();
                String lieuDeResidence = rs.getString("lieu_de_residence");
                String styleMusical = rs.getString("style_musical");

                DiskJockey dj = new DiskJockey(nom, prenom, nomDeScene, dateDeNaissance, lieuDeResidence, styleMusical);
                djs.add(dj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return djs;
    }
	
	
	public List<DiskJockey> findByAll() {
		return findByQuery("select * from DJ");
	}
}
