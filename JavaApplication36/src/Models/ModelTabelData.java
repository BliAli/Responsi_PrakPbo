/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aliad
 */
public class ModelTabelData extends AbstractTableModel{
    List<ModelPembelian> dataPembelian;
    private final String[] columNames = {
        "Nama Customer",
        "Barang",
        "Harga",
        "Cicilan",
        "Bunga / bulan",
        "Angsuran / bulan",
        "Total Pembayaran",
    };
    
    public ModelTabelData(List<ModelPembelian> dataPembelian){
        this.dataPembelian = dataPembelian;
    }
    
    public List<ModelPembelian> getData(){
        return dataPembelian;
    }

    @Override
    public int getRowCount() {
        return dataPembelian.size();
    }

    @Override
    public int getColumnCount() {
        return  columNames.length;
    }

    public String getColumNames(int column) {
        switch (column) {
            case 0:
                return "Nama Customer";
            case 1:
                return "Barang";
            case 2:
                return "Harga";
            case 3:
                return "Cicilan";
            case 4:
                return "Bunga / bulam";
            case 5:
                return "Angsuran / bulan";
            case 6:
                return "Total Pembayaran";
            default:
                throw new AssertionError();
        }
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                return dataPembelian.get(rowIndex).getNamaCustomer();
            case 2:
                return dataPembelian.get(rowIndex).getNamaBarang();
            case 3:
                return dataPembelian.get(rowIndex).getHargaBarang();
            case 4:
                return dataPembelian.get(rowIndex).getCicilan();
            case 5:
                return dataPembelian.get(rowIndex).getBungaPerBulan();
            case 6:
                return dataPembelian.get(rowIndex).getAngsuranPerBulan();
            case 7:
                return dataPembelian.get(rowIndex).getTotalPembayaran();
            default:
                throw new AssertionError();
        }
    }
    
}
