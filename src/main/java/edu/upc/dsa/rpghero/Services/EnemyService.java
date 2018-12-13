package edu.upc.dsa.rpghero.services;

import edu.upc.dsa.rpghero.controladores.GameManagerImpl;
import edu.upc.dsa.rpghero.exceptions.UserNotFoundException;
import edu.upc.dsa.rpghero.modelos.Enemy;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Api(value = "/enemies", description = "Endpoint to Enemy Service")
@Path("/enemy")
public class EnemyService {
    private GameManagerImpl gm;


    public EnemyService() {
        this.gm = GameManagerImpl.getInstance();
    }

    //QUINS MÈTODES HI HA A ENEMY?

    /*PETA EL ADD -- Añade un enemy
    @POST
    @ApiOperation(value = "Post enemy", notes = "Añade un enemy a la lista de enemies")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response= Enemy.class),
    })
    @Path("/")
    
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newEnemy(Enemy enemy) {
        this.gm.addEnemy(Enemy.getIdPosition(), Enemy.getPain(), Enemy.getSpeed(),
                Enemy.getType(),Enemy.getIdEnemy());
        return Response.status(201).entity(this.gm.getEnemyById(enemy.getIdEnemy())).build();
    }*/

    //Get todos los enemies
    @GET
    @ApiOperation(value = "Get enemies", notes = "Responde una lista con los Enemies")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = Enemy.class)
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEnemies() {
        ArrayList<Enemy> enemy = this.gm.getEnemies();
        GenericEntity<List<Enemy>> entity = new GenericEntity<List<Enemy>>(enemy){};
        return Response.status(200).entity(entity).build();
    }

    //Get todas las estadísticas de un enemy 
    @GET
    @ApiOperation(value = "GetStatsOfEnemy", notes = "Responde con todos las Stats de un enemy")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = Enemy.class),
            @ApiResponse(code = 404, message = "enemy not found")
    })
    @Path("/{enemyId}/stats")
    @Produces(MediaType.APPLICATION_JSON)
    public Response GetStatsOfEnemy(@PathParam("enemyId") String enemyId) throws Exception {
        List<String> stats = this.gm.GetStatsOfEnemy(enemyId);
        GenericEntity<List<String>> entity = new GenericEntity<List<String>>(stats){};
        return Response.status(200).entity(entity).build();
    }
}