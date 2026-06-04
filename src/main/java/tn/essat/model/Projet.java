package tn.essat.model;
public class Projet {
	private int id;
	private String titre;
	private Departement dept;
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
	public Departement getDept() {
		return dept;
	}
	public void setDept(Departement dept) {
		this.dept = dept;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(int id, String titre, Departement dept) {
		super();
		this.id = id;
		this.titre = titre;
		this.dept = dept;
	}

}
