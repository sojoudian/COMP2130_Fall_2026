import java.io.*;
import java.util.*;

public class TextVsBinary {
    // Imports: slide 5
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("points.dat", "rw")) {
            file.setLength(0);
            int[] points = {120, 45, 300, 80};
            for (int p : points) {
                file.writeInt(p);               // 4 records of 4 bytes
            }
            int i = 2;                          // record 2: the third int
            file.seek(i * 4);
            int old = file.readInt();
            file.seek(i * 4);                   // back to record 2
            file.writeInt(old + 50);
            file.seek(file.length());           // append: go to the end
            file.writeInt(10);
            file.seek(0);                       // read all records
            while (file.getFilePointer() < file.length()) {
                System.out.print(file.readInt() + " ");
            }
            System.out.println();
        }
    }






}
