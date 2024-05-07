/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericPrograming;

/**
 *
 * @author tengku
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private String email;

    @Override
    public String toString() {
        return "{" + "nim=" + nim + ", nama=" + nama + ", email=" + email + '}';
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
