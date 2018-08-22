/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubllesort;
import java.util.Random;
/**
 *
 * @author Roberta
 */
public class BublleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[7];
        int aux;
        Random num = new Random();
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i <vetor.length;i++) {
            vetor[i] = num.nextInt(10);
            System.out.println(vetor[i]+"  ");
            
        }
        for (int i = 0; i <vetor.length; i++) {
            for (int j = 0; j <vetor.length; j++) {
                if (vetor[i]> vetor[j]){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                }
            }
        }
        System.out.println("Vetores ordenados");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+" ");
        }
    }
    
    
}
