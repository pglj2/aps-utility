package factory.repositorio.impl;

import factory.repositorio.IFactoryRepository;
import repositorios.IRepositorioAtividade;
import repositorios.impl.RepositorioAtividadeLista;

public class FactoryRepositoryList implements IFactoryRepository{

    @Override
    public IRepositorioAtividade makeRepAtividade() {
        return new RepositorioAtividadeLista();
    }
}
