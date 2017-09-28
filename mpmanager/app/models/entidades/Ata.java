package models.entidades;

import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.OneToMany;
//
// import play.data.validation.Constraints.Required;
// import play.db.ebean.Model;

// @Entity
public class Ata {

	// @Id
	public String id;

	// @Required
	public String data;

	// @OneToMany
	public List<Usuario> usuarios;
	// @OneToMany
	public List<Projeto> projetos;


	public Ata(String id, String data, List<Usuario> usuarios, List<Projeto> projetos){
		this.id = id;
		this.data = data;
		this.usuarios = usuarios;
		this.projetos = projetos;
	}

	public String getId(){
		return id;
	}

	public String getData(){
		return data;
	}

	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	public List<Projeto> getProjetos(){
		return projetos;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setData(String data){
		this.data = data;
	}

	public void setUsuarios(List<Usuario> usuarios){
		this.usuarios = usuarios;
	}

	public void setProjetos(List<Projeto> projetos){
		this.projetos = projetos;
	}
}
