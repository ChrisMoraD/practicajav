/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nombre;
        
        String apellido;
        
        double salario;
        
        double sem;
        
        double ivm;
        
        double asociaem;
        
        double impuesto;
        
        double salarioNeto;
        
        

        
        
        //datos del usuario nombre y apellido
        
        nombre = JOptionPane.showInputDialog("ingrese el nombre ");
        
        apellido = JOptionPane.showInputDialog("ingrese el apellido ");
        
        
        //  Double.parseDouble es para que el  JOptionPane.showInputDialog("ingrese el salario")
        
       //pueda procesar datos de tipo double
        
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario"));
        
        // Seguro de Enfermedad y Maternidad (SEM)
        
        // formula: salario * 0.0925 
        
        
        sem = salario * 0.0925;
        
        
        // Invalidez, Vejez y Muerte (IVM)
        
        //formula: salario *  0.0508
        
         ivm = salario *  0.0508;
        
        // Impuesto al salario
        
        if(salario <= 922000){
            
            impuesto = 0;
            

            
            }else if (salario <= 1352000) {
                
                
                impuesto = (salario - 922000) * 0.10;

   
                
            }else if (salario <= 2373000) {
                
                 impuesto = (1352000 - 922000) * 0.10 + (salario - 1352000) * 0.15;


                
                
            }else {
              
                impuesto = (1352000 - 922000) * 0.10 + (2373000 - 1352000) * 0.15 + (salario - 2373000) * 0.20;



                
                
              }  
                



                
                
                 
            
        
        
        
        
        
        
        //. Asociación de empleados
        
        //formula  salario * 0.025;
        
         asociaem = salario * 0.025;
         
         
        //salario neto
        
        //formula salarioNeto = salario - sem - ivm - impuesto - asociaem;

        salarioNeto = salario - sem - ivm - impuesto - asociaem;
        
        
        
        
        
        //salida final
        
        
        JOptionPane.showMessageDialog(null,"nombre del empleado: " + nombre + "\n" + "apellido: " + apellido + "\n" + "salario del empleado: " + sem );
         
        
        //"nombre del empleado: " + nombre + "\n" + "apellido; " + apellido + "\n" + "salario del empleado: " + sem
        
    }
    
}
