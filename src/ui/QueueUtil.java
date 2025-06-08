package util;

import java.util.Queue;  // Mengimpor antarmuka Queue dari package java.util

public class QueueUtil {
    // Method untuk memeriksa apakah antrean (Queue) kosong
    public static boolean isQueueEmpty(Queue<?> queue) {
        return queue.isEmpty();  // Mengembalikan hasil apakah antrean kosong atau tidak
    }
}
