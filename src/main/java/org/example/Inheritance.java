package org.example;

public class Inheritance extends BaseModel {

    public void tambahAntrian() {
        System.out.println("Pasien ditambahkan ke antrian");
    }

    public static void main(String[] args) {
        Inheritance antrian = new Inheritance();
        antrian.infoUmum();      // dari BaseModel
        antrian.tambahAntrian(); // dari subclass
        antrian.tutup();         // dari BaseModel
    }
}
