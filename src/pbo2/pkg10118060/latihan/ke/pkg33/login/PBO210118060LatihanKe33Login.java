/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg33.login;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 */
public class PBO210118060LatihanKe33Login {
    private final String usName="RizkiAdam",passWord="terbaikselalu";

    public String getUsName() {
        return usName;
    }

    public String getPassWord() {
        return passWord;
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Username\t: ");
        Scanner us = new Scanner(System.in);
        String usr=us.nextLine();
        
        System.out.print("Masukan Password\t: ");
        Scanner pw = new Scanner(System.in);
        String pass=pw.nextLine();
        
        User user = new User();
        user.pengecekanLogin(usr,pass);
    }
    
}
