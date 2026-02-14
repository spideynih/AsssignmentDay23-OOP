package org.example;

public class Encapsulation {
    private String namaPasien;
    private int nomorAntrian;
    private String poli;

    public void setNamaPasien(String nama) { this.namaPasien = nama; }
    public void setNomorAntrian(int nomor) { this.nomorAntrian = nomor; }
    public void setPoli(String poli) { this.poli = poli; }
    public String getNamaPasien() { return namaPasien; }
    public int getNomorAntrian() { return nomorAntrian; }
    public String getPoli() { return poli; }

    public static void main(String[] args) {
        Encapsulation pasien = new Encapsulation();
        pasien.setNamaPasien("Adinda Nimas");
        pasien.setNomorAntrian(8);
        pasien.setPoli("Poli Gigi");

        System.out.println("Nama Pasien: " + pasien.getNamaPasien());
        System.out.println("Nomor Antrian: " + pasien.getNomorAntrian());
        System.out.println("Nama Poli: " + pasien.getPoli());
    }
}
