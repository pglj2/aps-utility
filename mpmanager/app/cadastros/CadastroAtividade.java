package cadastros;

import models.Atividade;
import repositorios.IRepositorioAtividade;
import repositorios.impl.RepositorioAtividadeLista;

import java.util.List;

public class CadastroAtividade {
    private IRepositorioAtividade repositorioAtividade;

    public CadastroAtividade() {
        this.repositorioAtividade = new RepositorioAtividadeLista();
    }

    public Atividade cadastrar(Atividade atividade) {
        Atividade retorno = this.repositorioAtividade.cadastrar(atividade);
        return retorno;
    }

    public List<Atividade> buscarTodasAtividades() {
        List<Atividade> retorno = this.repositorioAtividade.buscarTodasAtividades();
        return retorno;
    }

    public void initRep(IRepositorioAtividade repositorio) {
        this.repositorioAtividade = repositorio;
    }
}
