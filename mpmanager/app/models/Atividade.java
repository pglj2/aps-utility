package models;

import java.util.List;
import java.util.*;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.OneToMany;

// import play.data.validation.Constraints.Required;
// import play.db.ebean.Model;

// @Entity
public class Atividade {

	// @Id
	public String id;

	// @Required
	public String descricao;

	// @OneToMany
	//public List<Usuario> usuarios;

	public String data;

	public String status;

	private static Set<Atividade> atividades;
	static {atividades = new HashSet<Atividade>();}

	public Atividade() {
		//
	}

	public Atividade(String id, String descricao, String data, String status/*, List<Usuario> usuarios*/){
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.status = status;
		//this.usuarios = usuarios;
	}

	public String getId(){
		return id;
	}

	public String getDescricao(){
		return descricao;
	}

	public String getData(){
		return data;
	}

	public String getStatus(){
		return status;
	}

	/*public List<Usuario> getUsuarios(){
		return usuarios;
	}*/

	public void setId(String id){
		this.id = id;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setData(String data){
		this.data = data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	/*public void setUsuarios(List<Usuario> usuarios ){
		this.usuarios = usuarios;
	}*/

	public static Set<Atividade> findAll() {
		return new HashSet<Atividade>(atividades);
	}

	public static Atividade findById(String id) {
		for (Atividade atividade : atividades) {
			if (atividade.id.equals(id)) {
				return atividade;
			}
		}
		return null;
	}

	public static void add(Atividade atividade) {
		atividades.add(atividade);
	}

}
