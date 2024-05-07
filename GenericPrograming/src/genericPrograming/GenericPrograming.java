/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericPrograming;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author ilhamrgn
 */
public class GenericPrograming {

    public static void main(String[] args) {
        List<Mahasiswa> listV = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            Mahasiswa m = new Mahasiswa();
            m.setNim(i);
            m.setNama("Ilham "+i);
            m.setEmail("rigan22@gmail.com");
            listV.add(m);
        }
        for (Mahasiswa mhs : listV) {
            var nim = mhs.getNim();
            var nama = mhs.getNama();
            var email = mhs.getEmail();
            System.out.println("nim="+nim);
            System.out.println("nama="+nama);
            System.out.println("email="+email);
            System.out.println("==========");
        }
    }

}
