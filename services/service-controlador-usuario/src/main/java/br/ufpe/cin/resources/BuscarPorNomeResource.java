package br.ufpe.cin.resources;

import io.dropwizard.jersey.params.NonEmptyStringParam;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/buscar/usuario")
@Produces(MediaType.APPLICATION_JSON)
public class BuscarPorNomeResource {
    @GET
    public Response buscarPorNome(@QueryParam("nome") NonEmptyStringParam nome) throws IOException {
        Document doc = Jsoup.connect("http://service-cadastro-usuario:8080/buscar/usuario?nome=" + nome).get();
        return Response.ok(doc.body()).build();
    }
}
