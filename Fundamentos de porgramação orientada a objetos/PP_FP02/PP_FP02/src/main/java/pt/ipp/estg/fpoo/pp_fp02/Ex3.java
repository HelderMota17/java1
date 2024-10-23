/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.fpoo.pp_fp02;

/**
 *
 * @author helde
 */public class Ex3
{
 public static void main(String[] args) 
    {
       int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
       
       
       int negativos = 0;
       int maior = lista[0];
       int produtospositivos = 0;
       
       
       for(int i = 0; i < lista.length; i++)
       {
           if(lista[i]>0)
           {
           produtospositivos *=lista[i];
           }
           
           if (lista[i] < 0)
           {
               negativos++;
           }
           if (lista [i] > maior)
           {
               maior = lista[i];
           }
         
       }
      
        System.out.println("Resultado da multiplicação dos numeros positivos: " + produtospositivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Maior número na lista: " + maior);

    }   
}
