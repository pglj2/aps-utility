package models.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Usuario extends Model{
	
	@Id
	public String id;
	
	@Required
	public String RFID;
	
	@Required
	public String nome;
	
	@Required
	public String email;
	
	public Usuario(String id, String RFID, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.RFID = RFID;
	}
	
	
	public String getId(){
		return id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getRFID(){
		return RFID;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setRFID(String RFID){
		this.RFID = RFID;
	}
	
}