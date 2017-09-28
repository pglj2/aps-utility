package models.entidades;

import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.OneToMany;

// import play.data.validation.Constraints.Required;
// import play.db.ebean.Model;

// @Entity
public class Projeto {

	// @Id
	public String id;
	public String nome;
	// @Required
	public String data;

	// @OneToMany
	public List<Atividade> atividades;


	public Projeto(String id, String nome, List<Atividade> atividades){
		this.id = id;
		this.nome = nome;
		this.atividades = atividades;
	}

	public String getId(){
		return id;
	}

	public String getNome(){
		return nome;
	}

	public List<Atividade> getAtividades(){
		return atividades;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setAtividades(List<Atividade> atividades){
		this.atividades = atividades;
	}

}
