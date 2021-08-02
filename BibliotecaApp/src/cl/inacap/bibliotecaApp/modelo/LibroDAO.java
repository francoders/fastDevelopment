package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Corvalan
 */
public class LibroDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Libro l = new Libro();

    public int agregar(Libro li) {
        int r = 0;
        String sql = "insert into librito (N_serie, Isbn, Titulo, N_paginas, P_referencia, Anio_publicacion, Idioma, Autor, Categoria, Editorial) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, li.getNSerie());
            ps.setInt(2, li.getIsbn());
            ps.setString(3, li.getTitulo());
            ps.setInt(4, li.getNumeroDePag());
            ps.setInt(5, li.getPrecioReferencia());
            ps.setInt(6, li.getAñoDePublicacion());
            ps.setString(7, li.getIdiomas());
            ps.setString(8, li.getAutores());
            ps.setString(9, li.getCategorias());
            ps.setString(10, li.getEditorial());
 //           ps.setInt(11, li.getEstado());
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

    public int actualizar(Libro li) {
        int r = 0;
        con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql = "update librito set Isbn, Titulo, N_paginas, P_referencia, Anio_publicacion, Idioma, Autor, Categoria, Editorial where N_serie=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, li.getIsbn());
            ps.setString(2, li.getTitulo());
            ps.setInt(3, li.getNumeroDePag());
            ps.setInt(4, li.getPrecioReferencia());
            ps.setInt(5, li.getAñoDePublicacion());
            ps.setString(6, li.getIdiomas());
            ps.setString(7, li.getAutores());
            ps.setString(8, li.getCategorias());
            ps.setString(9, li.getEditorial());
            ps.setInt(10, li.getNSerie());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return r;
    }

    public List listar() {
        List<Libro> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from librito");
            rs = ps.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setNSerie(rs.getInt(1));
                l.setIsbn(rs.getInt(2));
                l.setTitulo(rs.getString(3));
                l.setNumeroDePag(rs.getInt(4));
                l.setPrecioReferencia(rs.getInt(5));
                l.setAñoDePublicacion(rs.getInt(6));
                l.setIdiomas(rs.getString(7));
                l.setAutores(rs.getString(8));
                l.setEditorial(rs.getString(9));
                l.setCategorias(rs.getString(10));
                datos.add(l);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    public int eliminar(int nSerie) {
        int r = 0;
        String sql = "delete from librito where N_serie=" + nSerie;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error");
        }
        return r;
    }

    public void buscarCategoria(JComboBox cbxCategoria) {

        String sql = "select * from categoria";
        int idCategoria = 0;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbxCategoria.removeAllItems();
            while (rs.next()) {
                cbxCategoria.addItem(rs.getString("Nombre_categoria") + "");
            }
            //ArrayList<Autor> lista = con.ge
        } catch (Exception e) {
        }

    }

    public void buscarIdioma(JComboBox cbxIdioma) {
        String sql = "select * from idioma";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbxIdioma.removeAllItems();
            while (rs.next()) {
                cbxIdioma.addItem(rs.getString("Nombre_idioma") + "");
            }
            //ArrayList<Autor> lista = con.ge
        } catch (Exception e) {
        }

    }

    public void buscarEditorial(JComboBox cbxEditorial) {
        String sql = "select * from editorial";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbxEditorial.removeAllItems();
            while (rs.next()) {
                cbxEditorial.addItem(rs.getString("Nombre_editorial") + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error editorial");
        }
    }

    public void buscarEstado(JComboBox cbxEstado) {
        String sql = "select * from estado";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbxEstado.removeAllItems();
            while (rs.next()) {
                cbxEstado.addItem(rs.getString("Nombre_estado") + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error estado");
        }
    }

    public void buscarAutor(JComboBox cbxAutor) {
        String sql = "select * from autor";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cbxAutor.removeAllItems();
            while (rs.next()) {
                cbxAutor.addItem(rs.getString("Nombre_autor") + "");

            }
            //ArrayList<Autor> lista = con.ge
        } catch (Exception e) {
        }

    }
}
