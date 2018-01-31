/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.sql.SQLException;

/**
 *
 * @author shehan
 */
public class Keystroke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        database db=new database();
       Firstpage p1=new Firstpage();
       p1.show();
        
    }
    
}
