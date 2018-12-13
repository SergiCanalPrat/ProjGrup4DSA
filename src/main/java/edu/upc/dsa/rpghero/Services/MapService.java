package edu.upc.dsa.rpghero.services;

import edu.upc.dsa.rpghero.controladores.GameManager;
import edu.upc.dsa.rpghero.controladores.GameManagerImpl;
import edu.upc.dsa.rpghero.exceptions.MapNotFoundException;
import edu.upc.dsa.rpghero.exceptions.UserNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import java.util.Map;

@Api(value = "/maps", description = "Endpoint to edu.upc.dsa.rpghero.rpghero.modelos.Map Service")
@Path("/maps")
public class MapService {

    private GameManager gm;


    public MapService() {
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
        /*try {
            PETA -- Map b = this.gm.getMap(mapId,userId);
            if (b == null)
                return Response.status(404).build();
            else
                return Response.status(200).entity(b).build();
        } catch (UserNotFoundException e) {
            return Response.status(405).build();
        } catch (MapNotFoundException e) {
            return Response.status(404).build();
            */
        return null;
        }

    }