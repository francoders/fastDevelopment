package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase IdiomaDAO: contiene los metodos para crear, modificar, eliminar y actualizar un idioma
 * mediante sentencias DML a la base de datos bibliotecadb en la tabla idioma
 * 
 */
public class IdiomaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Idioma i = new Idioma();
    
    /**
     * 
     * listar: metodo publico que se conecta en la base de datos
     * prepara una sentencia sql que selecciona todos los idiomas en la base de datos,
     * cuando el resultado este listo crea un nuevo idioma y los almacena en la lista datos.
     * @return devuelve una lista con todas las categorias en la base de datos.
     * 
     */
     public List listar(){
        List<Idioma> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from idioma");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Idioma i = new Idioma();
                i.setNombreIdioma(rs.getString(2));
                i.setIdIdioma(rs.getInt(1));
                datos.add(i);
            }
        } catch (Exception e) {
        }
        return datos;
    }
     
    /**
     * agregar: metodo publico que inserta los datos de un nuevo idioma en la base de datos mediante 
     * una sentencia sql de insercion
     * @param idi de tipo Idioma
     * @return la respuesta del PrepareStatement
     */
     public int agregar(Idioma idi){
        int r = 0;
        String sql = "insert into idioma(Nombre_idioma, Id_idioma) values(?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, idi.getNombreIdioma());
            ps.setInt(2, idi.getIdIdioma());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            }else{
                return 2;
            }
        } catch (Exception e) {
        }
        return r;
    }
     
    /**
     * actualizar: metodo publico int que modifica los datos de un idioma ya existente mediante una 
     * sentencia sql donde se modificara desde el id seleccionado
     * @param idi de tipo Idioma
     * @return la respuesta del PrepareStatement
     */
     public int actualizar(Idioma idi){
        int r =0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update idioma set Nombre_idioma=? where Id_idioma=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idi.getNombreIdioma());
            ps.setInt(2, idi.getIdIdioma());
            r=ps.executeUpdate();
            if (r==1) {
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
     
    /**
     * eliminar: metodo public int que recibe el id del idioma seleccionada y lo elimina mediante
     * una sentencia SQL DELETE 
     * @param idIdioma de tipo int
     * @return la respuesta del PrepareStatement
     */
     public int eliminar(int idIdioma){
        int r =0;
        String sql = "delete from idioma where Id_idioma="+idIdioma;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error");
        }
        return r;
    }
     
}
