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
public class ClienteDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Cliente cl = new Cliente();
    
    /**
     * agregar: metodo publico que inserta los datos de una nueva categoria en
     * la base de datos mediante una sentencia sql de insercion
     *
     * @param cate de tipo Categoria
     * @return la respuesta del PrepareStatement
     */
    public int agregar(Cliente cliente) {
        int r = 0;
        String sql = "insert into cliente(Id_cliente, Fecha_nacimiento_c, Ape_paterno_cliente, Ape_materno_cliente, Direccion_cliente, Correo_cliente, Telefono_cliente, Rut_cliente, Nombre_cliente) values(?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getFechaNacimientoCliente());
            ps.setString(3, cliente.getApePaternoCliente());
            ps.setString(4, cliente.getApeMaternoCliente());
            ps.setString(5, cliente.getDireccionCliente());
            ps.setString(6, cliente.getCorreoCliente());
            ps.setInt(7, cliente.getTelefonoCliente());
            ps.setString(8, cliente.getRutCliente());
            ps.setString(9, cliente.getNombreCliente());
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
        List<Cliente> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setIdCliente(rs.getInt(1));
                cl.setFechaNacimientoCliente(rs.getString(2));
                cl.setApePaternoCliente(rs.getString(3));
                cl.setApeMaternoCliente(rs.getString(4));
                cl.setDireccionCliente(rs.getString(5));
                cl.setCorreoCliente(rs.getString(6));
                cl.setTelefonoCliente(rs.getInt(7));
                cl.setRutCliente(rs.getString(8));
                cl.setNombreCliente(rs.getString(9));
                datos.add(cl);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    /**
     * eliminar: metodo public int que recibe el id de la categoria seleccionada
     * y lo elimina mediante una sentencia SQL DELETE
     *
     * @param idCategoria de tipo int
     * @return la respuesta del PrepareStatement
     */
    public int eliminar(int idCliente) {
        int r = 0;
        String sql = "delete from cliente where Id_cliente=" + idCliente;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int actualizar(Cliente cl) {
        int r = 0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update cliente set Fecha_nacimiento_c=?, Ape_paterno_cliente=?, Ape_materno_cliente=?, Direccion_cliente=?, Correo_cliente=?, Telefono_cliente=?, Rut_cliente=?, Nombre_cliente=? where Id_cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getFechaNacimientoCliente());
            ps.setString(2, cl.getApePaternoCliente());
            ps.setString(3, cl.getApeMaternoCliente());
            ps.setString(4, cl.getDireccionCliente());
            ps.setString(5, cl.getCorreoCliente());
            ps.setInt(6, cl.getTelefonoCliente());
            ps.setString(7, cl.getRutCliente());
            ps.setString(8, cl.getNombreCliente());
            ps.setInt(9, cl.getIdCliente());
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