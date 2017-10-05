package repositorios;

import models.Atividade;

import java.util.List;

public interface IRepositorioAtividade {
    public Atividade cadastrar(Atividade atividade);
    public Atividade buscarOndeUsuarioId(String usuarioId);
    public Atividade editar(Atividade atividade);
    public List<Atividade> buscarTodasAtividades();
}
