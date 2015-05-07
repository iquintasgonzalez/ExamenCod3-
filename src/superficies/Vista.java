/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author iquintasgonzalez
 */
public class Vista {
    
    public static void imprimir(Modelo contenedor){
        
        
        JOptionPane.showMessageDialog(null, contenedor.getResultado());
    
        
    }
        
    
}
