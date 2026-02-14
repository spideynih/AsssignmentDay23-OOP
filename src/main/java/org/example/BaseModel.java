package org.example;

public class BaseModel {
    public void infoUmum() {
        System.out.println("Informasi umum: semua pasien tercatat.");
    }

    public void tutup() {
        System.out.println("Sistem Antrian ditutup.");
    }

    public static abstract class Layanan {
        abstract void tampilkanLayanan();
    }

    public interface Prioritas {
        void cekPrioritas();
    }

    public static void main(String[] args) {
        BaseModel base = new BaseModel();
        base.infoUmum();
        base.tutup();
    }
}
