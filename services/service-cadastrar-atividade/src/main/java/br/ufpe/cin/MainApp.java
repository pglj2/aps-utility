package br.ufpe.cin;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApp extends Application<ServiceCadastrarAtividadeConfiguration> {
    public static void main(final String[] args) throws Exception {
        new MainApp().run(args);
    }

    @Override
    public void run(ServiceCadastrarAtividadeConfiguration configuration, Environment environment) throws Exception {
        //environment.jersey().register(new Topster);
    }
}
