// StrukturQueue.java (Queue Implementation)
package services;

import entity.Alat;

public class StrukturQueue {
    private Node FRONT;  // Menyimpan node pertama
    private Node REAR;   // Menyimpan node terakhir

    // Node untuk menyimpan data Alat dan pointer ke node berikut nya
    private class Node {
        private Alat data;
        private Node next;

        public Node(Alat data) {
            this.data = data;
            this.next = null;
        }
    }

    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }

    // Memeriksa apakah antrean kosong
    public boolean isEmpty() {
        return FRONT == null;
    }

    // Menambahkan alat ke antrean
    public void enqueue(Alat alat) {
        Node newNode = new Node(alat);
        if (isEmpty()) {
            FRONT = newNode;
        } else {
            REAR.next = newNode;
        }
        REAR = newNode;
    }

    // Mengambil alat pertama dari antrean
    public Alat dequeue() {
        if (isEmpty()) {
            return null;  // Kembali null jika antrean kosong
        }
        Alat data = FRONT.data;
        FRONT = FRONT.next;
        if (FRONT == null) {
            REAR = null;
        }
        return data;
    }

    // Mengembalikan ukuran antrean
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }

    // Menampilkan semua alat dalam antrean
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        Node curNode = FRONT;
        while (curNode != null) {
            System.out.println(curNode.data);  // Menampilkan alat
            curNode = curNode.next;
        }
    }

    // Mendapatkan alat pertama dari antrean
    public Alat front() {
        return FRONT != null ? FRONT.data : null;
    }
}
