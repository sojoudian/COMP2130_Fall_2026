import java.io.*;
import java.util.*;


public class TextVsBinary {
    public static void main(String[] args) throws IOException{
        try (PrintWriter text = new PrintWriter("number.txt")){
            text.print(199); // char
        }
        try (DataOutputStream data = new DataOutputStream(new FileOutputStream("int.dat"))){
            data.write(199); // int
        }
        try (FileOutputStream bytes = new FileOutputStream("byte.dat")){
            bytes.write(199); // one byte
        }
        String[] names = {"number.txt", "int.dat", "byte.dat"};
        System.out.println(new File(names[0]).getAbsoluteFile());
        for (String name: names){
            long size = new File(name).length();
            System.out.println("Size of " + name + ": " + size);
        }

    }

}
