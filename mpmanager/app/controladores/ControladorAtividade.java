package controladores;

import cadastros.CadastroAtividade;
import factory.repositorio.IFactoryRepository;
import models.Atividade;
import repositorios.IRepositorioAtividade;

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

    public Atividade buscarAtividadePorId(String id) {
        Atividade retorno = this.cadastroAtividade.buscarAtividadePorId(id);
        return retorno;
    }

    public void initRep(IFactoryRepository fr) {
        IRepositorioAtividade repositorio = fr.makeRepAtividade();
        this.cadastroAtividade.initRep(repositorio);
    }
}
