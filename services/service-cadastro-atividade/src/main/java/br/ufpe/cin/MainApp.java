package br.ufpe.cin;

import br.ufpe.cin.db.AtividadesDB;
import br.ufpe.cin.resources.CadastrarAtividadeResource;
import br.ufpe.cin.resources.ListarAtividadesResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApp extends Application<ServiceCadastroAtividadeConfiguration> {
    public static void main(final String[] args) throws Exception {
        new MainApp().run(args);
    }

    @Override
    public void run(ServiceCadastroAtividadeConfiguration configuration, Environment environment) throws Exception {
        AtividadesDB atividadesDB = new AtividadesDB();
        environment.jersey().register(new CadastrarAtividadeResource(atividadesDB));
        environment.jersey().register(new ListarAtividadesResource(atividadesDB));
    }
}
