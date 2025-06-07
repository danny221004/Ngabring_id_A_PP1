package service;

import entity.Alat;

/**
 * Kelas ini menangani logika penyimpanan alat ke gudang tertentu setelah diproses.
 */
public class Penyimpanan {

    /**
     * Menyimpan alat ke gudang setelah diproses.
     * @param alat Alat yang akan disimpan
     */
    public void simpanKeGudang(Alat alat) {
        if (alat != null) {
            alat.setDiproses(true); // Tandai alat sebagai telah diproses
            System.out.println("Alat " + alat.getNama() + " telah dipindahkan ke gudang " + alat.getLokasiGudang());
        }
    }
}
