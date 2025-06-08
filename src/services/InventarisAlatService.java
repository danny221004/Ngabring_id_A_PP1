package services;

import entity.Alat;

public class InventarisAlatService {

    private final InventarisAlatKantor inventaris;


    public InventarisAlatService(InventarisAlatKantor inventaris) {
        this.inventaris = inventaris;
    }


    public void enqueue(Alat alat) {
        inventaris.enqueue(alat);
    }


    public void dequeue() {
        inventaris.dequeue();
    }


    public void displayAlat() {
        inventaris.displayAlat();
    }
}