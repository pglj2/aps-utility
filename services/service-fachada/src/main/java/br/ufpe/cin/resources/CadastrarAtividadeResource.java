package br.ufpe.cin.resources;

import br.ufpe.cin.models.Atividade;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/cadastrar/atividade")
@Produces(MediaType.APPLICATION_JSON)
public class CadastrarAtividadeResource {
    @POST
    public Response cadastrarAtividade(Atividade atividade) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String atividadeJson = mapper.writeValueAsString(atividade);
        System.out.println(atividadeJson);
        //.data("atividade", atividadeJson)
        int statusCode = Jsoup.connect("http://servicecadastroatividade:8080/cadastrar/atividade")
                .requestBody(atividadeJson)
                .header("Content-Type", "application/json")
                .method(Connection.Method.POST)
                .ignoreContentType(true)
                .execute()
                .statusCode();
        if (statusCode == 201) {
            return Response.ok().status(201).build();
        } else {
            return Response.serverError().build();
        }
    }

    @GET
    public Response pageAtividades() throws IOException {
        String url = "http://servicecadastroatividade:8080/cadastrar/atividade";
        String json = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .ignoreContentType(true)
                .execute()
                .body();
        return Response.ok(json).build();
    }
}
