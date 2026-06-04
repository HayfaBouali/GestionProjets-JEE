package tn.essat.model;

public class Departement {
	private int id;
	private String titre;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

}
