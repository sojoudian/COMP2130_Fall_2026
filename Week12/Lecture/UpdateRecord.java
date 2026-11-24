import java.io.IOException;
import java.io.RandomAccessFile;

public class UpdateRecord {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("points.dat", "rw")) {
            file.setLength(0);
            int[] points = {120, 45, 300, 80};
            for (int p : points) {
                file.writeInt(p);
            }
            int i = 2;
            file.seek(i * 4);
            int old = file.readInt();
            file.seek(i * 4);
            file.writeInt(old + 50);
            file.seek(file.length());
            file.writeInt(10);
            file.seek(0);
            while (file.getFilePointer() < file.length()) {
                System.out.print(file.readInt() + " ");
            }
            System.out.println();
        }
    }
}
