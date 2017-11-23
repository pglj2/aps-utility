package br.ufpe.cin.db;

import br.ufpe.cin.models.Atividade;

import java.util.ArrayList;

public class AtividadesDB {
    private ArrayList<Atividade> atividades;

    public AtividadesDB() {
        atividades = new ArrayList<>();
    }

    public void addAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public Atividade listarAtividade() {
        return atividades.get(0);
    }

    public boolean isThereAtividade() {
        if (atividades.size() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
