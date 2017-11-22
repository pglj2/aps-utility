package br.ufpe.cin.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class Atividade {
    @NotEmpty
    private String data;
    @NotEmpty
    private String descricao;
    @NotEmpty
    private Usuario participante;

    @JsonCreator
    public Atividade(
            @JsonProperty("data") String data,
            @JsonProperty("descricao") String descricao,
            @JsonProperty("participante") Usuario participante) {
        this.data = data;
        this.descricao = descricao;
        this.participante = participante;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    @JsonProperty("participante")
    public Usuario getParticipante() {
        return participante;
    }
}
