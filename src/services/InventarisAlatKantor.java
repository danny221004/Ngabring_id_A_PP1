package services;

import entity.Alat;  //
import java.util.LinkedList;
import java.util.Queue;

public class InventarisAlatKantor {
    private Queue<Alat> antreanAlat = new LinkedList<>();


    public void enqueue(Alat alat) {
        antreanAlat.add(alat);
    }
    public void dequeue() {
        if (!antreanAlat.isEmpty()) {
            Alat alat = antreanAlat.poll();
            alat.setStatus("Telah diproses");
            System.out.println("Alat diproses: " + alat);
        } else {
            System.out.println("Tidak ada alat yang perlu diproses.");
        }
    }
    public void displayAlat() {
        if (!antreanAlat.isEmpty()) {
            System.out.println("Alat yang belum diproses:");
            for (Alat alat : antreanAlat) {
                System.out.println(alat);
        } else {
            System.out.println("Tidak ada alat yang belum diproses.");
        }
    }
}