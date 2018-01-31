/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

/**
 *
 * @author shehan
 */
public class time {
    public static int currenttime(){
        return(int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }
}
