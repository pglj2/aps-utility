package controladores;

import cadastros.CadastroAtividade;
import models.Atividade;

import java.util.List;

public class ControladorAtividade {
    private CadastroAtividade cadastroAtividade;

    public ControladorAtividade() {
        this.cadastroAtividade = new CadastroAtividade();
    }

    public Atividade cadastrarAtividade(Atividade atividade) {
        Atividade retorno = this.cadastroAtividade.cadastrar(atividade);
        return retorno;
    }

    public List<Atividade> buscarTodasAtividades() {
        List<Atividade> retorno = this.cadastroAtividade.buscarTodasAtividades();
        return retorno;
    }
}
