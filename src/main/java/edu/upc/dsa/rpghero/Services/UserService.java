package edu.upc.dsa.services;
import edu.upc.dsa.controladores.GameManager;
import edu.upc.dsa.controladores.GameManagerImpl;
import edu.upc.dsa.exceptions.mapFullException;
import edu.upc.dsa.exceptions.mapNotFoundException;
import edu.upc.dsa.exceptions.UserNotFoundException;
import edu.upc.dsa.modelo.Bike;
import edu.upc.dsa.modelo.map;
import edu.upc.dsa.rpghero.modelos.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/users", description = "Endpoint to User Service")
@Path("/users")
public class UserService {

    private GameManager gm;


    public UserService() {
        this.gm = GameManagerImpl.getInstance();
    }

    
    //Añadir un user
    @POST
    @ApiOperation(value = "Post user", notes = "Añade un user")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=User.class),
    })
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newUser(User user) {
        //this.gm.getUsers().put(user.getIdUser(), user);
        //this.gm.addUser(

        //);
        return Response.status(201).entity(user).build();
    }


    //Get de todos los games de un user
    @GET
    @ApiOperation(value = "GetGamesByUser", notes = "Responde con todos los games de un user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = map.class),
            @ApiResponse(code = 404, message = "User not found")
    })
    @Path("/{userId}/games")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGamesByUser(@PathParam("userId") String userId) {
        try {
            List<Game> games = this.gm.gamesByUser(userId);
            GenericEntity<List<Game>> entity = new GenericEntity<List<Game>>(games){};
            return Response.status(200).entity(entity).build();
        } catch (UserNotFoundException e) {
            return Response.status(404).build();
        }
    }


}