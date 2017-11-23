package br.ufpe.cin.resources;

import br.ufpe.cin.db.AtividadesDB;
import br.ufpe.cin.models.Atividade;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cadastrar/atividade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CadastrarAtividadeResource {
    private AtividadesDB atividadesDB;

    public CadastrarAtividadeResource(AtividadesDB atividadesDB) {
        this.atividadesDB = atividadesDB;
    }

    @POST
    public Response cadastrarAtividade(Atividade atividade) {
        atividadesDB.addAtividade(atividade);
        return Response.ok().status(201).build();
    }

    @GET
    public Response isThereAtividade() {
        boolean retorno = atividadesDB.isThereAtividade();
        return Response.ok(retorno).build();
    }
}
