package metier.entities;

public class Produit implements Serializable{
	private Long id;
	private String Nom;
	private int quantite;
	private double prix;
	private String description;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, int quantite, double prix, String description) {
		super();
		Nom = nom;
		this.quantite = quantite;
		this.prix = prix;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
