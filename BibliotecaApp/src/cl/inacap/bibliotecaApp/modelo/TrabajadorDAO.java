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
 *
 * @author Corvalan
 */
public class TrabajadorDAO {

    /**
     * Clase TrabajadorDAO: contiene los metodos para crear, modificar, eliminar
     * y actualizar un distribuidor mediante sentencias DML a la base de datos
     * bibliotecadb en la tabla distribuidor.
     */
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Trabajador tr = new Trabajador();

    // listar: metodo publico que se conecta en la base de datos
    // prepara una sentencia sql que selecciona todos los distribuidores en la base de datos,
    // cuando el resultado este listo crea un nuevo distribuidor y los almacena en la lista datos.
    // @return devuelve una lista con todos los distribuidores en la base de datos.
    
    public List<Trabajador> listar() {
        List<Trabajador> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from trabajador");
            rs = ps.executeQuery();
            while (rs.next()) {
                Trabajador tr = new Trabajador();
                tr.setIdTrabajador(rs.getInt(1));
                tr.setRutTrabajador(rs.getString(2));
                tr.setNombreTrabajador(rs.getString(3));
                tr.setApePaternoTr(rs.getString(4));
                tr.setApeMaternoTr(rs.getString(5));
                tr.setDireccionTr(rs.getString(6));
                tr.setTelefonoTrabajador(rs.getInt(7));
                tr.setCorreoTrabajador(rs.getString(8));
                tr.setFechaContratoTr(rs.getString(9));
                datos.add(tr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    /**
     * agregar: metodo publico que inserta los datos de un trabajador en la
     * base de datos mediante una sentencia sql de insercion
     *
     * @param trab de tipo Autor
     * @return la respuesta del PrepareStatement
     */
    
    
    public int agregar(Trabajador trab) {

        int r = 0;

        String sql = "insert into trabajador(Id_trabajador, Rut_trabajador, Nombre_trabajador, Ape_paterno_trabajador, Ape_materno_trabajador, Direccion_trabajador, Telefono_trabajador, Correo_trabajador, Fecha_contrato_t)values(?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, trab.getIdTrabajador());
            ps.setString(2, trab.getRutTrabajador());
            ps.setString(3, trab.getNombreTrabajador());
            ps.setString(4, trab.getApePaternoTr());
            ps.setString(5, trab.getApeMaternoTr());
            ps.setString(6, trab.getDireccionTr());
            ps.setInt(7, trab.getTelefonoTrabajador());
            ps.setString(8, trab.getCorreoTrabajador());
            ps.setString(9, trab.getFechaContratoTr());
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


    
}
