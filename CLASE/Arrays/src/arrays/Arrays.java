package arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import static java.time.Clock.system;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arrays {

    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        int nElementos;
//        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo:"));
//        char[] letras = new char[nElementos];
//
//        System.out.println("Digite los elemntos del arreglo: ");
//
//        for (int i = 0; i < nElementos; i++) {
//
//            System.out.print((i + 1) + ". Digite un caracter: ");
//            letras[i] = entrada.next().charAt(0);
//        }
//
//        System.out.println("\nLos caracteres del arreglo son: ");
//
//        for (int i = 0; i < nElementos; i++) {
//            System.out.println(letras[i]);
//        }
//        #
//        DE ELEMENTOS 
//        String[] nombres = {"Alejandro", "Maria", "Liliana", "Fiona", "Raquel"};
//
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//
//        }
// FOR EACH 
//        String[] nombres = {"Alejandro", "Maria", "Liliana", "Fiona", "Raquel"};
//
//        for (String i : nombres) {   // tipo de dato  nombre: nombre de el arreglo 
//            System.out.println(i);
//
//        }
//        LEER 5 NUMEROS, GUARDARLOS EN UN ARREGLO Y MOSTRARLOS EN EL MISMO ORDEN INTRODUCIDO 
//Scanner entrada= new Scanner( System.in);
//             float[]numeros=new float [5];
//             
//             System.out.println("Guardadndo los numeros dentro del arreglo ");
//             
//             for (int i =0;i<5;i++){
//                 System.out.print((i+1)+". Digite un numero: ");
//                 
//                 numeros[i]=entrada.nextFloat();
//                 
//             
//             }
//             
//             System.out.println("\n Imprimir los elementos del arreglo: ");
//             for(float i: numeros){
//                 System.out.println(i);
//             
//             }
//        LEER 5 NUMEROS, GUARDARLOS EN UN ARREGLO Y MOSTRARLOS EN EL ORDEN INVERSO INTRODUCIDO 

//        Scanner entrada = new Scanner(System.in);
//        int[] inverso = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ingrese un numero: ");
//            inverso[i] = entrada.nextInt();
//
//        }
//        System.out.println("Imprime los elementos del arreglo: ");
//        for (int i = 4; i >= 0; i--) {
//            System.out.println(inverso[i]);
//        }
//LEER 5 NUMEROS POR TECLADO,ALMACENARLOS EN UN ARREGLO Y A CONTINUACION REALIZAR LA MEDIA DE LOS NUMEROS 
//POSITIVOS, LA MEDIA DE LOS NEGATIVOS Y CONTAR EL NUMERO DE CEROS 
//        Scanner entrada = new Scanner(System.in);
//
//        float numeros[] = new float[5];
//        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
//        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;
//
//        System.out.println("Guardando los numeros en el arreglo");
//
//        for (int i = 0; i < 5; i++) {
//
//            System.out.print((i + 1) + ".Digite un numero: ");
//            numeros[i] = entrada.nextFloat();
//
//            if (numeros[i] == 0) {
//
//                conteo_ceros++;
//            } else if (numeros[i] > 0) {
//                suma_positivos += numeros[i];
//                conteo_positivos++;
//
//            } else {
//                suma_negativos += numeros[i];
//                conteo_negativos++;
//            }
//        }
//
//        //MEDIA POSITIVOS 
//        if (conteo_positivos == 0) {
//            System.out.println("NO se puede sacar la media de los numeros positivos");
//        } else {
//            media_positivos = suma_positivos / conteo_positivos;
//            System.out.println("La media de los numeros positivos: " + media_positivos);
//        }
//
//        //MEDIA NEGATIVOS 
//        if (conteo_negativos == 0) {
//            System.out.println("No se puede sacar la media d elos numeros negativos: ");
//        } else {
//
//            media_negativos = suma_negativos / conteo_negativos;
//            System.out.println("La media de los numeros negativos es: " + media_negativos);
//        }
//
//        System.out.println("La cantidad de ceros es: " + conteo_ceros);
//
//        
        // LEER 10 NUMEROS ENTEROS, GUARDARLOS EN UN ARREGLO. DEBEMOS MOSTRARLOS EN EL SIGUIENTE ORDEN:
        //EL PRIMERO,EL ULTIMO,EL SEGUNDO, EL PENULTIMO,EL TERCERO,ETC. 
        Scanner entrada = new Scanner(System.in);
        int numero[] = new int[10];
        int j=9;
         System.out.println("Ingrese 10 numeros: ");
        for(int i =0;i<10;i++){
           
            
            numero[i]=entrada.nextInt();
        
        }
        
        for(int i =0;i<5;i++){
        System.out.println(numero[i]);
        System.out.println(numero[j]);
        j--;
    }
       

    }

}
