/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import interfaces.UsuarioInterface;
import java.sql.ResultSet;
import java.util.List;
import modelos.Usuario;
import pe.edu.upeu.rrhh.Factory.ConexionBD;
import pe.edu.upeu.rrhh.Factory.FactoryConnectionDB;

/**
 *
 * @author Docente
 */
public class UsuarioDAO implements UsuarioInterface{
    ConexionBD bD;

    @Override
    public Usuario validarUsuario(String user, String clave) {
        //select * from usuario where nom_user='dreyna' and clave='123';
        //System.out.println(""+user +","+clave);
        Usuario u = new Usuario();
   
        
        StringBuilder builder = new StringBuilder();
        builder.append("select *from usuario where nom_user='").append(user);
        builder.append("' and clave='").append(clave).append("'");
        try {
            this.bD = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
            ResultSet rs = bD.query(builder.toString());
            while(rs.next()){                
                u.setId(rs.getInt("idUsuario"));
                u.setUser(rs.getString("nom_user"));
                u.setPass(rs.getString("clave"));
            }
        } catch (Exception e) {
            this.bD.close();
        }
        
       return u;
    }

    @Override
    public boolean registrarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscarUsuario(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUser(String user, String clave) {
        Usuario u = new Usuario(); boolean r =false;     
        StringBuilder builder = new StringBuilder();
        builder.append("select *from usuario where nom_user='").append(user);
        builder.append("' and clave='").append(clave).append("'");
        try {
            this.bD = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
            ResultSet rs = bD.query(builder.toString());
            while(rs.next()){                
                r = true;
            }
        } catch (Exception e) {
            this.bD.close();
        }
        
       return r;
        
    }

    @Override
    public int validauser(String user, String clave) {
         Usuario u = new Usuario(); int r =0;     
        StringBuilder builder = new StringBuilder();
        builder.append("select *from usuario where nom_user='").append(user);
        builder.append("' and clave='").append(clave).append("'");
        try {
            this.bD = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
            ResultSet rs = bD.query(builder.toString());
            while(rs.next()){                
                r = rs.getInt("idUsuario");
            }
        } catch (Exception e) {
            this.bD.close();
        }
        
       return r;
        
    }

    @Override
    public Usuario listarUser(int id) {
         Usuario u = new Usuario(); int r =0;     
        StringBuilder builder = new StringBuilder();
        builder.append("select *from usuario where idUsuario=").append(id);
      
        try {
            this.bD = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
            ResultSet rs = bD.query(builder.toString());
            while(rs.next()){                
                u.setId(rs.getInt("idUsuario"));
                u.setUser(rs.getString("nom_user"));
                u.setPass(rs.getString("clave"));
            }
        } catch (Exception e) {
            this.bD.close();
        }
        
       return u;
        
    }

    @Override
    public List<Usuario> listarUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
