/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.rrhh.Factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DavidReyna
 */
public class POSTGRESQLConnectionDB extends ConexionBD{
    public POSTGRESQLConnectionDB(String[] parametro) {
        this.parametro = parametro;
        this.open();
    }
    @Override
    Connection open() {
         try {
            Class.forName("org.postgresql.Driver");
            this.conex = DriverManager.getConnection("jdbc:postgresql://localhost/academico"+this.parametro[0],this.parametro[1],this.parametro[2]);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.conex;
    }
    
}
