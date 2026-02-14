package org.example;

public class Polymorphism extends BaseModel {

    @Override
    public void infoUmum() {
        System.out.println("SmartAntrian RS: info pasien otomatis");
    }

    public void infoAntrian(String poli) {
        System.out.println("Layanan: " + poli);
    }

    public void infoAntrian(String poli, int nomor) {
        System.out.println("Layanan: " + poli + ", Nomor Antrian: " + nomor);
    }

    public static void main(String[] args) {
        Polymorphism smart = new Polymorphism();
        smart.infoUmum();
        smart.infoAntrian("Poli Umum", 6);
        smart.infoAntrian("Poli Gigi", 2);
        smart.tutup();
    }
}
