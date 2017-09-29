package fachada;

import controladores.ControladorAtividade;
import models.Atividade;

import java.util.List;

public class Fachada {
    private static volatile Fachada instance;

    private ControladorAtividade controladorAtividade;

    private Fachada() {
        this.controladorAtividade = new ControladorAtividade();
    }

    public static Fachada getInstance() {
        if(instance == null) {
            synchronized (Fachada.class) {
                if(instance == null) {
                    instance = new Fachada();
                }
            }
        }
        return instance;
    }

    public Atividade cadastrarAtividade(Atividade atividade) {
        Atividade retorno = this.controladorAtividade.cadastrarAtividade(atividade);
        return retorno;
    }

    public List<Atividade> buscarTodasAtividades() {
        List<Atividade> retorno = this.controladorAtividade.buscarTodasAtividades();
        return retorno;
    }
}
