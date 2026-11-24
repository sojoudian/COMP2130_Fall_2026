import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream old = new FileOutputStream("ints.dat")) {
            old.write(new byte[40]);
        }
        try (RandomAccessFile file = new RandomAccessFile("ints.dat", "rw")) {
            file.setLength(0);
            for (int i = 1; i <= 5; i++) {
                file.writeInt(i * 100);
            }
            System.out.println("Length: " + file.length());
            System.out.println("Pointer: " + file.getFilePointer());
            file.seek(0);
            System.out.println("First: " + file.readInt());
            file.seek(2 * 4);
            System.out.println("Third: " + file.readInt());
            System.out.println("Pointer: " + file.getFilePointer());
        }
    }
}
