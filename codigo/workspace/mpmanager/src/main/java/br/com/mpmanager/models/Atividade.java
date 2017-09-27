package br.com.mpmanager.models;

public class Atividade {

	private String atividade;
	private String responsável;
	private String dataLimite;
	
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getResponsável() {
		return responsável;
	}
	public void setResponsável(String responsável) {
		this.responsável = responsável;
	}
	public String getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}
	
	@Override
	public String toString() {
		return "Atividade [atividade=" + atividade + ", responsável=" + responsável + ", dataLimite=" + dataLimite
				+ "]";
	}
	
}
