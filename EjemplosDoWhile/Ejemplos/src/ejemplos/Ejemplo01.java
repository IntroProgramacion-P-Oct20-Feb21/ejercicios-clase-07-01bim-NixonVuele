/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 100;
        do{
            System.out.printf("%d\n", contador);
            contador = contador + 2;
        }while(contador <= 10);
    }
    
}
