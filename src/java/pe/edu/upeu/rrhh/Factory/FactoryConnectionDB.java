/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.Factory;

/**
 *
 * @author Docente
 */
public class FactoryConnectionDB {
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int POSTGRESQL = 3;
    public static String[] configMYSQL ={"bd_prueba","root","root"};
    public static String[] configORACLE ={"bd_sysdgp","",""};
    public static String[] configPOSTGRESQL ={"academico","postgres","plsql"};
    public static ConexionBD open(int typeDB){
        switch(typeDB){
            case FactoryConnectionDB.MYSQL:
                return new MYSQLConnectionDB(configMYSQL);
                
            case FactoryConnectionDB.ORACLE:
                return new ORACLEConnectionDB(configORACLE);
                
            case FactoryConnectionDB.POSTGRESQL:
                return new ORACLEConnectionDB(configORACLE);
            default:
                return null;
        }
    }
            
}
