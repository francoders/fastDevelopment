package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase AutorDAO: contiene los metodos para crear, modificar, eliminar y actualizar un autor
 * mediante sentencias DML a la base de datos bibliotecadb en la tabla autor
 * @author Cristobal Cortés
 * @since 29/07/2021
 * @version 1.0
 * 
 */
public class AutorDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Autor a = new Autor();

    /**
     *
     * listar: metodo publico que se conecta en la base de datos prepara una
     * sentencia sql que selecciona todos los autores en la base de datos,
     * cuando el resultado este listo crea un nuevo autor y los almacena en la
     * lista datos.
     *
     * @return devuelve una lista con todos los autores en la base de datos.
     *
     */
    public List listar() {
        List<Autor> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from autor");
            rs = ps.executeQuery();
            while (rs.next()) {
                Autor a = new Autor();
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setApellidoPaterno(rs.getString(3));
                a.setApellidoMaterno(rs.getString(4));
                datos.add(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    /**
     * agregar: metodo publico que inserta los datos de un nuevo autor en la
     * base de datos mediante una sentencia sql de insercion
     *
     * @param au de tipo Autor
     * @return la respuesta del PrepareStatement
     */
    public int agregar(Autor au) {
        int r = 0;
        String sql = "insert into autor(Id_autor, Nombre_autor, Apellido_paterno, Apellido_materno) values(?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, au.getId());
            ps.setString(2, au.getNombre());
            ps.setString(3, au.getApellidoPaterno());
            ps.setString(4, au.getApellidoMaterno());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 2;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    /**
     * actualizar: metodo publico int que modifica los datos de un autor ya
     * existente mediante una sentencia sql donde se modificara desde el id
     * seleccionado
     *
     * - au de tipo Autor
     * @return la respuesta del PrepareStatement
     */
    public int actualizar(Autor au) {
        int r = 0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update autor set Nombre_autor=?, Apellido_paterno=?, Apellido_materno=? where Id_autor=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, au.getNombre());
            ps.setString(2, au.getApellidoPaterno());
            ps.setString(3, au.getApellidoMaterno());
            ps.setInt(4, au.getId());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    /**
     * eliminar: metodo public int que recibe el id del autor seleccionado y lo
     * elimina mediante una sentencia SQL DELETE
     *
     * id de tipo int
     * @return la respuesta del PrepareStatement
     */
    public int eliminar(int id) {
        int r = 0;
        String sql = "delete from autor where Id_autor=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;

    }
}
