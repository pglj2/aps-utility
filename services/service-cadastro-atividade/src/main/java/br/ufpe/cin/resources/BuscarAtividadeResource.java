package br.ufpe.cin.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/buscar/atividade")
@Produces(MediaType.APPLICATION_JSON)
public class BuscarAtividadeResource {
    @GET
    public Response buscarAtividade(@QueryParam("usuario-id")) {

    }
}
