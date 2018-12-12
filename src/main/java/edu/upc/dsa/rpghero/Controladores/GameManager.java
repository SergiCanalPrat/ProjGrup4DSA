package edu.upc.dsa.controladores;

import edu.upc.dsa.exceptions.StationFullException;
import edu.upc.dsa.exceptions.UserNotFoundException;
import edu.upc.dsa.modelo.Bike;
import edu.upc.dsa.modelo.Station;

import java.util.List;

public interface GameManager {
        //
        //USER
        /**
         * Registrar usuario
         * @param idUser identifier of the user
         * @param name name of the user
         * @param surname surname of the user
         */
        public void addUserBBDD(int idUser, String userName, String password);
        //public void editUserName(int idUser, String oldUserName, String newUserName);
        public int editPassword(int idUser, String oldPassword, String newPassword);
        public void deleteUser(int idUser, String userName, string Password);
        public List<Game> gamesByUser(String userId) throws UserNotFoundException;
        public int numUsers();
        
        //ENEMY
        /**Ejm: Insert("idPosition", "idEnemy", "pain", "speed", "type") 
         *      Insert("1", "2", "30", "5", "1")
        */ 
        public void addEnemyBBDD(int idPosition, int idEnemy, int pain, int speed, int type);
        public int numEnemies(String idMap) throws MapNotFoundException; 
        
        //OBJETO
        /**Ejm: Insert("idObjeto", "Nombre", "idMapa", "idPos", "precio") 
         *      Insert("1", "Llave", "1", "3", "4")
        */ 
        public void addObjectBBDD(String idObject);
        public int numObjects(String idMap) throws MapNotFoundException; 
        public void addObjectHero(String idObject);
        
        //Mapa
        /**Ejm: Insert("numFilas", "numCol", "numObj", "idMap", "numEnemigos") 
         *      Insert("4", "5", "4", "2", "2")
         *      este ejemplo nos crea un mapa de 4x5, con 4 obj 2 enemigos.
         *      nosotros como admins, insertamos un enmigo en un cierta posicion.
         *      en la tabla de mapas tendremos todos los mapas, no te molaria tener varios tipos de mapas
         *      y elegir, aunque solo usemos 2. peero no es mas faena eh, si solo cambiaremos las filas y las 
         *      columnas. y entonces depues en la tabla de enemigos tenemos en que mapa se encuentra y en q posicion.
        */
                
        public void addMapBBDD(int idMap, int numEnemies, int numObjects, int numRows, int numColumns); 
        public void addEnemyToMap(int idPosition, int idEnemy, int pain, int speed, int type);
        public void addPNJToMap(int idPosition, int idEnemy, int pain, int speed, int type);
        public void addObjectToMap(int idObject, String name, int price, int idPosition, int idMap);
        
        //PNJ
        /* Insert("idPNJ", "idMap", "dialogo1","dialogo2","dialogo3","dialogo4") 
        si le hablo me dice dialogo 1 
        si le vuelvo a hablar y no tenemos lo q pide me dice dialogo 2
        si le vuelvo a hablar y tenemos lo q pide me dice dialogo 3
        si hemos acabado con el me dice dialogo 4
        */ 
        
 }