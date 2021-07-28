/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase EditorialDAO: contiene los metodos para crear, modificar, eliminar y actualizar una editorial
 * mediante sentencias DML a la base de datos bibliotecadb en la tabla editorial
 * @author Cristobal Cortés
 * @since 19/06/2020
 * @version 1.0
 * 
 */
public class EditorialDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Editorial e = new Editorial();
    
    /**
     * agregar: metodo publico que inserta los datos de una nueva 
     * editorial en la base de datos mediante una sentencia sql de insercion.
     * @param edi de tipo Editorial
     * @return la respuesta del PrepareStatement
     */
    public int agregar(Editorial edi){
        int r=0;
        String sql ="insert into editorial(Nombre_editorial,Id_editorial) values(?,?)";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, edi.getNombreEditorial());
            ps.setInt(2, edi.getIdEditorial());
            r = ps.executeUpdate();
            if (r==1) {
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            System.out.println(e);
        }
         return r;
    }
    
     /**
     * 
     * listar: metodo publico que se conecta en la base de datos
     * prepara una sentencia sql que selecciona todos los autores en la base de datos,
     * cuando el resultado este listo crea una nueva editorial y los almacena en la lista datos.
     * @return devuelve una lista con todas las editoriales en la base de datos.
     * 
     */
    public List listar() {
        List<Editorial> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from editorial");
            rs = ps.executeQuery();
            while(rs.next()){
                Editorial e = new Editorial();
                e.setNombreEditorial(rs.getString(1));
                e.setIdEditorial(rs.getInt(2));
                datos.add(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }
    
   /**
     * actualizar: metodo publico int que modifica los datos de una editorial ya existente mediante una 
     * sentencia sql donde se modificara desde el id seleccionado
     * @param edi de tipo Editorial
     * @return la respuesta del PrepareStatement
     */
    public int actualizar(Editorial edi){
        int r =0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update editorial set Nombre_editorial=? where Id_editorial=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, edi.getNombreEditorial());
            ps.setInt(2, edi.getIdEditorial());
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
     * eliminar: metodo public int que recibe el id de la editorial seleccionada y lo elimina mediante
     * una sentencia SQL DELETE 
     * @param idEditorial de tipo int
     * @return la respuesta del PrepareStatement
     */
    public int eliminar(int idEditorial){
        int r =0;
        String sql = "delete from editorial where Id_editorial="+idEditorial;
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
