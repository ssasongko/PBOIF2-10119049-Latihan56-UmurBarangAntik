package BarangAntik;
public class BarangAntik {
    private int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
       System.out.printf("Umur barang antik ini adalah : %d tahun.\n", umur);
    }
}
