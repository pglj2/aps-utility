package repositorios.impl;

import models.Atividade;
import repositorios.IRepositorioAtividade;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAtividadeLista implements IRepositorioAtividade {
    private List<Atividade> lista;

    public RepositorioAtividadeLista() {
        this.lista = new ArrayList<Atividade>();
    }

    @Override
    public Atividade cadastrar(Atividade atividade) {
        //fazer alguma verificacao?
        this.lista.add(atividade);
        //se nao puder adicionar
        //return null;
        //se puder adicionar
        return atividade;
    }

    @Override
    public List<Atividade> buscarOndeUsuarioId(int usuarioId) {
        return null;
    }

    @Override
    public Atividade editar(Atividade atividade) {
        return null;
    }

    @Override
    public List<Atividade> buscarTodasAtividades() {
        return this.lista;
    }
}
