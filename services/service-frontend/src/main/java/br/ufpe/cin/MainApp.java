package br.ufpe.cin;

import br.ufpe.cin.resources.AtividadeResource;
import br.ufpe.cin.resources.CadastrarAtividadeResource;
import br.ufpe.cin.resources.HomeResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApp extends Application<ServiceFrontendConfiguration> {
    public static void main(final String[] args) throws Exception {
        new MainApp().run(args);
    }

    @Override
    public void run(ServiceFrontendConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HomeResource());
        environment.jersey().register(new AtividadeResource());
        environment.jersey().register(new CadastrarAtividadeResource());
    }
}
