package br.ufpe.cin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class ServiceControladorUsuarioConfiguration extends Configuration {
    @NotEmpty
    private String appName;

    @JsonProperty
    public String getAppName() {
        return appName;
    }

    @JsonProperty
    public void setAppName(String appName) {
        this.appName = appName;
    }
}
