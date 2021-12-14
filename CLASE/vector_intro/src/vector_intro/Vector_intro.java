
package vector_intro;

import javax.swing.JOptionPane;


public class Vector_intro {

    
    public static void main(String[] args) {
        int n; 
        int buscar;
        int vector[];
        //int [] vector2;
        
        vector = new int [5];
        
        for(int a=0;a<=4;a++){
        String texto = JOptionPane.showInputDialog("Introduce un  valor: ");
        n= Integer.parseInt(texto);
        vector[a]= n;
        }
        
        
        
       for (int a=0;a<=4;a++){
           System.out.println("Imprime valor: "+a+"del vector: "+vector[a]);
       }
    }
    
}
