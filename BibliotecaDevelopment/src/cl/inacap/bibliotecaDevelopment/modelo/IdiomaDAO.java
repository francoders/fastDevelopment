/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaDevelopment.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Corvalan
 */
public class IdiomaDAO {
    
    //REGISTRO IDIOMA DB
    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        List<Idioma> idiomas = new ArrayList<>();
        String sql="select * from idioma";
       
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Idioma i = new Idioma();
                i.setIdIdioma(rs.getInt(1));
                i.setNombreIdioma(rs.getString(2));
                i.setCodigoIdioma(rs.getString(3));
                idiomas.add(i);
            }
        } catch(Exception ex){
            
        }
        return idiomas;
    }
    
}
