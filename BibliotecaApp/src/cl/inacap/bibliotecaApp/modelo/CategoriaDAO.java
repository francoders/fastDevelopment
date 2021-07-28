package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase CategoriaDAO: contiene los metodos para crear, modificar, eliminar y actualizar una categoria
 * mediante sentencias DML a la base de datos bibliotecadb en la tabla categoria
 * 
 */
public class CategoriaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Categoria c = new Categoria();

    /**
     * agregar: metodo publico que inserta los datos de una nueva categoria en
     * la base de datos mediante una sentencia sql de insercion
     *
     * @param cate de tipo Categoria
     * @return la respuesta del PrepareStatement
     */
    public int agregar(Categoria cate) {
        int r = 0;
        String sql = "insert into categoria(Id_categoria, Nombre_categoria) values(?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cate.getIdCategoria());
            ps.setString(2, cate.getNombreCategoria());
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
     *
     * listar: metodo publico que se conecta en la base de datos prepara una
     * sentencia sql que selecciona todos las categorias en la base de datos,
     * cuando el resultado este listo crea una nueva Categoria y los almacena en
     * la lista datos.
     *
     * @return devuelve una lista con todas las categorias en la base de datos.
     *
     */
    public List listar() {
        List<Categoria> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from categoria");
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt(1));
                c.setNombreCategoria(rs.getString(2));
                datos.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    /**
     * actualizar: metodo publico int que modifica los datos de una categoria ya
     * existente mediante una sentencia sql donde se modificara desde el id
     * seleccionado
     *
     * @param cate de tipo Categoria
     * @return la respuesta del PrepareStatement
     */
    public int actualizar(Categoria cate) {
        int r = 0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update categoria set Nombre_categoria=? where Id_categoria=?";
        try {
            ps = con.prepareStatement(sql);
                        ps.setInt(1, cate.getIdCategoria());
            ps.setString(2, cate.getNombreCategoria());
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
     * eliminar: metodo public int que recibe el id de la categoria seleccionada
     * y lo elimina mediante una sentencia SQL DELETE
     *
     * @param idCategoria de tipo int
     * @return la respuesta del PrepareStatement
     */
    public int eliminar(int idCategoria) {
        int r = 0;
        String sql = "delete from categoria where Id_categoria=" + idCategoria;
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
