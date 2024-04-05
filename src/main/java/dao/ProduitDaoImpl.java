package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import metier.entities.Produit;

public class ProduitDaoImpl implements  IProduitDao{

	@Override
	public Produit save(Produit p) {
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement
					("Insert INTO PRODUIT (Nom, quantite, prix, description) VALUES (?,?,?,?"); 
			ps.setString(1, p.getNom());
			ps.setInt(2, p.getQuantite());
			ps.setDouble(3,p.getPrix());
			ps.setString(4, p.getDescription());
			ps.executeUpdate();
			
			
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(ID) AS MAX_ID FROM PRODUIT");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				p.setId(rs.getLong("MAX_ID"));
			}
			
			ps.close();	
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<Produit> produitParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updat(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

}
