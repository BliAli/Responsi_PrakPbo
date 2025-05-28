package Models;

/**
 *
 * @author aliad
 */
public class ModelPembelian {
    private int idPembelian;
    private int idBarang;
    private int namaBarang;
    private int hargaBarang;
    private String namaCustomer;
    private int cicilan;
    private int bungaPerBulan;
    private int angsuranPerBulan;
    private int totalPembayaran;

    public int getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(int idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public int getCicilan() {
        return cicilan;
    }

    public void setCicilan(int cicilan) {
        this.cicilan = cicilan;
    }

    public int getBungaPerBulan() {
        return bungaPerBulan;
    }

    public void setBungaPerBulan(int bungaPerBulan) {
        this.bungaPerBulan = bungaPerBulan;
    }

    public int getAngsuranPerBulan() {
        return angsuranPerBulan;
    }

    public void setAngsuranPerBulan(int angsuranPerBulan) {
        this.angsuranPerBulan = angsuranPerBulan;
    }

    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public int getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(int namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    
    
    
}
