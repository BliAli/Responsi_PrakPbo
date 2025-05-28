/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import java.util.List;
import DAO.PembelianDAO;
import DAOImplements.DataPembelianImplement;
import javax.swing.*;
import Models.*;
import Views.Home;
/**
 *
 * @author aliad
 */
public class PembelianController {
    Home homeView;
    DataPembelianImplement implementDataPembelian;
    List<ModelPembelian> dataPembelian;
    
    private int selectedId = -1;

    public PembelianController(Home homeView) {
        this.homeView = homeView;
        implementDataPembelian = new PembelianDAO();
        dataPembelian = implementDataPembelian.getAll();
    }
    
    public void loadDataTabel(){
        dataPembelian = implementDataPembelian.getAll();
        ModelTabelData modelTable = new ModelTabelData(dataPembelian);
        homeView.getTableData().setModel(modelTable);
    }
    
    public void create (){
        ModelPembelian pembelian = new ModelPembelian();
        
        JTextField[] dataBeli = {
            homeView.getTxtNamaCustomer(),
            homeView.getCbBarang(),
            homeView.getRb3bulan(),
            homeView.getRb6Bulan(),
            homeView.getRb12Bulan(),
        };
        pembelian.setNamaCustomer(homeView.getTxtNamaCustomer().getText());
        
        try {
            int harga = Integer.parseInt(homeView)
        } catch (Exception e) {
        }
    
    }
    
    public void edit(){
        ModelPembelian pembelian = new ModelPembelian();
        pembelian.setNamaCustomer(homeView.getTxtNamaCustomer().getText());
        
        try {
            
        } catch (Exception e) {
        }
    }
    
    public void delete(){
        int selectedRow = homeView.getTableData().getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(homeView, "Pilih data yang ingin dihapus");
            return;
        }
        else{
            ModelTabelData modelTable = (ModelTabelData) homeView.getTableData().getModel();
            ModelPembelian pembelian = modelTable.getData().get(selectedRow);
            int id = pembelian.getIdPembelian();
        }
    }
}
