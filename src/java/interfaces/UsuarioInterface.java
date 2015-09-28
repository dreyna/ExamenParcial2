/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelos.Usuario;

/**
 *
 * @author Docente
 */
public interface UsuarioInterface {
    public Usuario listarUser(int id);
    public List<Usuario> listarUser();
    public Usuario validarUsuario(String user, String clave);
    public boolean validarUser(String user, String clave);
    public int validauser(String user, String clave);
    
    public boolean registrarUsuario(Usuario u);
    public boolean editarUsuario(Usuario u);
    public boolean eliminarUsuario(int id);
    public Usuario buscarUsuario(String user);
}
