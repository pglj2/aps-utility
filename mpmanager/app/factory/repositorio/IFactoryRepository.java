package factory.repositorio;

import repositorios.IRepositorioAtividade;

public interface IFactoryRepository {
    
    public IRepositorioAtividade makeRepAtividade();

}