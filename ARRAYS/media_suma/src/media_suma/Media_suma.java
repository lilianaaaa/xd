/*
 Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
Obtén la suma de todos ellos y la media.
 */
package media_suma;

import javax.swing.JOptionPane;

public class Media_suma {
    public static void main(String[] args) {
      int numero[]= new int [100];
      double suma=0,media=0; 
      
      
      //SUMA DEL 1 AL 100
        for (int i = 0; i < 100; i++) {
           numero[i]=i+1;
           suma=suma+numero[i];
        }
        //MEDIA DEL 1 AL 100
        
        for (int i = 0; i < 100; i++) {
           media= suma/100;
        }
        JOptionPane.showMessageDialog(null,"Suma es: "+suma+" \n La media es: "+media,"RESULTADO",JOptionPane.CLOSED_OPTION);
      
    }
    
}
