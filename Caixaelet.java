/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubllesort;
import java.util.Scanner;
/**
 *
 * @author Roberta
 */
public class Caixaelet {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int saldo = 0 ;
        int acao, entrar = 2;
        System.out.println("------CAIXA ELETRONICO------");
        while (entrar == 2){
            System.out.println("1- Saldo");
            System.out.println("2- Deposito");
            System.out.println("3- Sacar");
            System.out.println("4- Sair");
            System.out.println("DIGITE O QUE QUER FAZER: ");
            int fazer = tcl.nextInt();
            switch (fazer){
            
                case 1:
                    System.out.println("Seu saldo é: "+ saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que quer depositar:");
                    int valor = tcl.nextInt();
                    saldo = saldo + valor;
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = tcl.nextInt();
                    saldo = saldo - valor;
                    break;
                case 4:
                    System.out.println("Volte sempre");
                    break;
            }
            
        }
    }
}
