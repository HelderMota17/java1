/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.fpoo.pp_fp02;

/**
 *
 * @author helde
 */
public class Ex2 
{
    public static void main(String[] args) 
    {
       int [][] matriz = {{11,7,333},{-20,-23,63},{-22,501,10000}};
       int soma = 0;
       float media;
       for (int i=0; i<3; i++)
       for (int j=0; i<3; i++)
           soma += matriz[i][j];
        media = soma / 9;
        System.out.println("Soma dos valores da matriz: "+ soma);
        System.out.println("Media dos valores da matriz; "+ media);
       
    }
}
    

