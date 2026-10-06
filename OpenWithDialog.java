import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
 
public class OpenWithDialog {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog dialog =
                new FileDialog(frame, "Open", FileDialog.LOAD);
        dialog.setVisible(true);
        String name = dialog.getFile();
        if (name == null) {
            System.out.println("No file selected");
        } else {
            File file = new File(dialog.getDirectory(), name);
            System.out.println("Selected: " + file);
        }
        frame.dispose();
    }
}

