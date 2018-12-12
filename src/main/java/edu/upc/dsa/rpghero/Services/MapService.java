package edu.upc.dsa.services;

import edu.upc.dsa.controladores.GameManager;
import edu.upc.dsa.controladores.GameManagerImpl;
import edu.upc.dsa.exceptions.mapFullException;
import edu.upc.dsa.exceptions.mapNotFoundException;
import edu.upc.dsa.exceptions.UserNotFoundException;
import edu.upc.dsa.modelo.Map;
import edu.upc.dsa.modelo.map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;

@Api(value = "/maps", description = "Endpoint to edu.upc.dsa.rpghero.modelos.Map Service")
@Path("/maps")
public class mapService {

    private GameManager gm;


    public mapService() {
        this.gm = GameManagerImpl.getInstance();
    }
    
    //Get un map
    @GET
    @ApiOperation(value = "Get de un map", notes = "Get de un map pasando mapId y UserId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = Map.class),
            @ApiResponse(code = 404, message = "map not found"),
            @ApiResponse(code = 405, message = "User not found")
    })
    @Path("/{mapId}/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMap(@PathParam("mapId") String mapId,
                            @PathParam("userId") String userId) {
        try {
            Map b = this.gm.getMap(mapId,userId);
            if (b == null)
                return Response.status(404).build();
            else
                return Response.status(200).entity(b).build();
        } catch (UserNotFoundException e) {
            return Response.status(405).build();
        } catch (MapNotFoundException e) {
            return Response.status(404).build();
        }

    }
}