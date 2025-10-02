/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada.pkg1;

/**
 *
 * @author lcast
 */
import javax.swing.JOptionPane;
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Toma de datos.
        String nombre = JOptionPane.showInputDialog("Cual es su nombre: ");
        String apellido = JOptionPane.showInputDialog("Cual es su apellido: ");
        String lectura = JOptionPane.showInputDialog("Cual es su salario: ");
        double salario = Integer.parseInt(lectura);
        
        //deducciones fijas.
        double sem = salario * 0.0952;
        double IVM = salario * 0.0508;
        double asociacion = salario * 0.025;
        
        //empiezan las comparativas para carlucar el salario.
        double impuesto = 0;
        if (salario > 922000 && salario <= 1352000) {
            impuesto = (salario - 922000) * 0.10;
        } else if (salario > 1352000 && salario <= 2373000){
            impuesto = (1352000 - 92200) * 0.10 + (salario - 1352000) * 0.15;
        } else if  (salario > 2373000){
            impuesto = (1352000 - 922000) * 0.10 + (2373000 - 1352000) * 0.15 + (salario - 2373000) * 0.20;
        }
         double total = sem + IVM + asociacion + impuesto;
         
         JOptionPane.showMessageDialog(null,"El salario de "+ nombre + " " + apellido + " es de  " + total);
         
         
         
                
        
        
        
        
         
    }
    
}
