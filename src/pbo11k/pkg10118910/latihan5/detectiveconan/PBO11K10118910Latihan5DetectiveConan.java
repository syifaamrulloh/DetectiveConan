/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan5.detectiveconan;

/**
 *
 * @author
 * Nama     : Muhamad Syifa Amruloh
 * Kelas    : IF11K
 * NIM      : 10118910
 * 
 * Description : Program Character Conan Dengan Konsep Objek,Inheritence + Polymorphisme
 */
public class PBO11K10118910Latihan5DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==== Program Character Detective Conan =====");
        Conan_edogawa con = new Conan_edogawa();
        con.Conan();
        con.Golongan();
        con.Profesi();
        
        Ran_Mouri ran = new Ran_Mouri();
        ran.Ran();
        ran.Golongan();
        ran.Profesi();
        
        Kogoro_Mouri kog = new Kogoro_Mouri();
        kog.Kog();
        kog.Golongan();
        kog.Profesi();
        
        Ai_Haibara ai = new Ai_Haibara();
        ai.Ai();
        ai.Golongan();
        ai.Profesi();
        
        Hiroshi_Agasa hir = new Hiroshi_Agasa();
        hir.Hiro();
        hir.Golongan();
        hir.Profesi();
    }
    
}
