import java.sql.*;
import java.io.*;
import java.util.*;

// TODO Sustituya las NNNNNNNN por su nombre completo y las XXXXXXXX por su matricula
// en las clausulas @author del siguiente comentario Javadoc

/**
 Esta clase demuestra el uso de DriverManager para acceder a la base de datos
 controlconcursos_ad2020 para crear 4 tablas y colocar datos en una de ellas
    @author  NNNNNNNN
    @author  XXXXXXXX
 */
public class CreaTablasConDriverMan {
    // TODO Sustituir las XXX en los valores de los siguientes atributos por su matricula
    private final String nomInstitucion = "institucion_XXX";
    private final String nomSede = "sede_XXX";
    private final String nomConcurso = "concurso_XXX";
    private final String nomSedeConcurso = "sede_concurso_XXX";
    private final String[] nomtablas =
            { nomInstitucion, nomSede, nomConcurso, nomSedeConcurso};

    /**
     * Metodo principal de la clase que recibe la direccion del servidor,
     * nombre de la base de datos, usuario y clave; datos necesarios para
     * hacer la conexion con MySQL
     * @param args Arreglo con los 4 argumentos necesarios para poder ejecutar el programa
     */
    public static void main(String[] args) {
        int tipo=7;
        // Verifica que se hayan proporcionado 4 argumentos 
        if (args.length < 4) {
            System.out.println(
                "Uso: java CreaTablasConDriverMan"
                    + " dirServidor nombreBaseDatos cuenta password");
            System.exit(1);
        }
        // ESTE IF ES PARA LAS PRUEBAS, IGNORAR
        if (args.length>=5) {
            try {
                tipo=Integer.parseInt(args[4]);
            }
            catch (NumberFormatException exnum) { }
        }
        // Crea un objeto de clase CreaTablasConDriverMan
        CreaTablasConDriverMan creador = new CreaTablasConDriverMan();
        Connection con=null;
        try { // Intenta:
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // y crear la conexion con MySQL usando los 4 argumentos pasados al programa
            con = creador.creaConexion(args[0], args[1], args[2], args[3]);
        } catch (ClassNotFoundException e) {  
            // SI NO SE PUDO ENCONTRAR EL DRIVER SE DA LA EXCEPCION ClassNotFoundException
            System.err.print("No se encontro la clase solicitada: ");
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (SQLException esql) {
            // SI NO SE PUDO CREAR LA CONEXION SE DA LA EXCEPCION SQLException
            System.err.println("Error al crear conexion a MySQL: "
                    + esql.getMessage());
            System.exit(1);
        }
        if ((tipo&1)!=0) {
            if (con instanceof Connection) {
                System.out.println("Conexion a MySQL exitosa!");
            }
        }
        if ((tipo&2)!=0) {
            creador.creaTablas(con);
        }
        if ((tipo&4)!=0) {
            creador.llenaTablaInstitucion(con);
        }
        // TODO Sustituir NNNNNNNNN por su nombre completo
        System.out.println("PRACTICA DE NNNNNNNNN");
    }

    /**
     * Este metodo crea la conexion a MySQL con los datos recibidos
     * @param direccionServidor  String que representa direccion del servidor
     * @param nomBD  String con el nombre de la base de datos a utilizar
     * @param usuario String con el usuario a usar para conectarse
     * @param clave  String con la clave a usar para conectarse
     * @return  Objeto Connection que representa la conexion con MySQL
     * @throws SQLException  En caso de no poder crearse la conexion
     */
    public Connection creaConexion(String direccionServidor,
                                   String nomBD, String usuario,
                                   String clave)
      throws SQLException {
        // TODO Completar el codigo de creaConexion
        return null; // TODO: Esta linea se elimina una vez que coloque el codigo real

    } // fin del metodo creaConexion()

    /**
     * Este metodo crea las tablas, cuya definicion esta
     * en el archivo tablas_ad2020.txt
     * eliminandolas primero en caso de que ya existan
     * @param con Objeto Connection que representa la conexion a MySQL
     */
    public void creaTablas(Connection con) {
        // TODO Completar el codigo del metodo creaTablas

    } // fin del metodo creaTablas()


    /**
     * Metodo que coloca datos en la tabla institucion
     * Los datos son tomados del archivo datosInstitucion.txt
     * NOTA: El codigo demuestra el funcionamiento de una sentencia preparada
     * (PreparedStatement) y como se puede obtener el valor
     * de un campo autoincrementable despues de agregar el registro
     * @param con Objeto Connection que representa la conexion a MySQL
     */
    public void llenaTablaInstitucion(Connection con){
        // TODO completar el codigo del metodo llenaTablaInstitucion

    }  // fin del metodo llenaTablaInstitucion()
}
