package pboif2.pkg10119049.latihan56.umurbarangantik;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Output Nama dan Barang antik
**/
import BarangAntik.Radio;

public class PBOIF210119049Latihan56UmurBarangAntik {
    public static void main(String[] args) {
        Radio rd1 = new Radio(234);
        rd1.setName("Radio AM");
        System.out.printf("Nama barang antik : %s\n", rd1.getName());
        rd1.tampilUmur();
    }
    
}
