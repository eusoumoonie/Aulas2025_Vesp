/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u1845853
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... componentes){
    for (int i = 0; i < componentes.length; i++){
        if(componentes[i] instanceof JTextField){
        ((JTextField)componentes[i]).setText("");}
        if(componentes[i] instanceof JComboBox){
        ((JComboBox) componentes[i]).setSelectedIndex(-1);
        }
        if(componentes[i] instanceof JCheckBox){
        ((JCheckBox) componentes[i]).setSelected(false);
        }
    }
    
}
    public static void mensagem(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    public static void pergunta(String cad){
        JOptionPane.showConfirmDialog(null, cad);
    }
    public static int strToInt(String num){
        return Integer.valueOf(num);
    }
}

