import java.io.IOException;
import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;

        nama = JOptionPane.showInputDialog("Masukkan nama: ");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur: "));

        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
    }
}