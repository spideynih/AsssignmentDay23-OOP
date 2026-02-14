package org.example;

public class Abstraction extends BaseModel.Layanan {

    @Override
    void tampilkanLayanan() {
        System.out.println("Layanan Poli Umum dan Poli Gigi tersedia");
    }

    public static void main(String[] args) {
        Abstraction layanan = new Abstraction();
        layanan.tampilkanLayanan();
    }
}
