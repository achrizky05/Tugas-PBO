/*
NIM : 13020220120
Nama : Achmad Rizky Maulana
Hari/Tanggal : Rabu 13/03/2024
Waktu Pengerjaan : 08:30
*/
import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

   /**
    * @param args
    * @throws IOException 
    */
   public static void main(String[] args) throws IOException {
         // TODO Auto-generated method stub
        /* Kamus */ 
        String str; 


	BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in));
	/* Program */

	System.out.print ("\nBaca string dan Integer: \n"); 

	System.out.print("masukkan sebuah string: "); 

	str= datAIn.readLine();

	System.out.print ("String yang dibaca : "+ str);
   }

}