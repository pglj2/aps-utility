package br.ufpe.cin.resources;

import br.ufpe.cin.db.AtividadesDB;
import br.ufpe.cin.models.Atividade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/listar/atividade")
@Produces(MediaType.APPLICATION_JSON)
public class ListarAtividadesResource {
    private AtividadesDB atividadesDB;

    public ListarAtividadesResource(AtividadesDB atividadesDB) {
        this.atividadesDB = atividadesDB;
    }

    @GET
    public Response listarAtividades() {
        Atividade atividade = atividadesDB.listarAtividade();
        return Response.ok(atividade).build();
    }
}
