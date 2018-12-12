package edu.upc.dsa.services;

import edu.upc.dsa.controladores.GameManagerImpl;
import edu.upc.dsa.exceptions.enemyFullException;
import edu.upc.dsa.exceptions.enemyNotFoundException;
import edu.upc.dsa.exceptions.UserNotFoundException;
import edu.upc.dsa.modelo.Bike;
import edu.upc.dsa.modelo.enemy;
import edu.upc.dsa.to.enemyTO;
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
public class enemyService {
    private GameManagerImpl gm;


    public enemyService() {
        this.gm = GameManagerImpl.getInstance();
    }

    //QUINS MÈTODES HI HA A ENEMY?

    //Añade un enemy
    @POST
    @ApiOperation(value = "Post enemy", notes = "Añade un enemy a la lista de enemies")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response= enemy.class),
    })
    @Path("/")
    
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newEnemy(Enemy enemy) {
        this.gm.addEnemy(enemy.getIdenemy(), enemy.getDescription(), enemy.getMax(), enemy.getLat(), enemy.getLon());
        return Response.status(201).entity(this.gm.getEnemyById(enemy.getIdenemy())).build();
    }

    //Get todos los enemies
    @GET
    @ApiOperation(value = "Get enemies", notes = "Responde una lista con los Enemies")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = enemy.class)
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
            @ApiResponse(code = 200, message = "Successful", response = enemy.class),
            @ApiResponse(code = 404, message = "enemy not found")
    })
    @Path("/{enemyId}/stats")
    @Produces(MediaType.APPLICATION_JSON)
    public Response GetStatsOfEnemy(@PathParam("enemyId") String enemyId) throws enemyNotFoundException {
        List<String> stats = this.gm.GetStatsOfEnemy(enemyId);
        GenericEntity<List<String>> entity = new GenericEntity<List<String>>(stats){};
        return Response.status(200).entity(entity).build();
    }
}