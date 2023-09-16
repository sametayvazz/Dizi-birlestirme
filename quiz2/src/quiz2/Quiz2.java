/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int boyut,boyut2;
       Scanner deger = new Scanner(System.in);
       Random rnd=new Random(); 
        System.out.print("Lütfen Birinci Dizinin Boyutunu Giriniz: ");
        boyut=deger.nextInt();
        System.out.print("Lütfen İkinci Dizinin Boyutunu Giriniz: ");
        boyut2=deger.nextInt();         
        int []dizi1=new int[boyut];
        int []dizi2=new int[boyut2];
        int []dizi3=new int[boyut+boyut2];
        for (int i = 0; i < boyut; i++)
        {
            dizi1[i]=rnd.nextInt(100);
        }        
        for (int i = 0; i < boyut2; i++)
        {
            dizi2[i]=rnd.nextInt(100);
        }
        System.out.println("Diziler oluşturuldu: ");        
        diziGoster(dizi1, dizi2);
         System.out.println("\nDiziler sıralandı:");
        diziSirala(dizi1);
        diziSirala(dizi2);
        diziGoster(dizi1, dizi2);
        diziBirlestir(dizi1, dizi2,dizi3);
       
        }
    public static int[] diziSirala(int[] dizi)
    {
       
        for (int i = 0; i < dizi.length - 1; i++) 
        {
            int indis = i;
            for (int j = i+1; j < dizi.length; j++) 
            {
                if (dizi[j]<dizi[indis]) 
                {
                    indis=j;
                }
            }
            int eks=dizi[indis];
            dizi[indis]=dizi[i];
            dizi[i]=eks;            
        }      
       return dizi;
    }
    public static int[] diziBirlestir(int[] dizi1,int[]dizi2,int[] dizi3)           
    {    
        for (int i = 0; i < dizi3.length; i++) {
               if (i<dizi1.length)
               {
                   dizi3[i]=dizi1[i];
               }
               else
               {
               dizi3[i]=dizi2[i-dizi1.length];
               }              
           }    
           System.out.print("\nDiziler sıralı şekilde birleştirildi: \nDizi 3: ");
           for (int i = 0; i < dizi3.length - 1; i++) 
        {
            int indis = i;
            for (int j = i+1; j < dizi3.length; j++) 
            {
                if (dizi3[j]<dizi3[indis]) 
                {
                    indis=j;
                }
            }
            int eks=dizi3[indis];
            dizi3[indis]=dizi3[i];
            dizi3[i]=eks; 
            
        }  
            for (int i = 0; i < dizi3.length; i++) {
            System.out.print(dizi3[i]+",");            
        }
            return dizi3;
    }
     public static void diziGoster(int[] dizi1, int [] dizi2)
    {        
        System.out.print("Dizi1: ");
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i]+",");            
        }
        System.out.print("\nDizi2: ");
        for (int i = 0; i < dizi2.length; i++) {
            System.out.print(dizi2[i]+",");            
        }    
    }
    }
    

