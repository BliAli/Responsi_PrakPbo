/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DAOImplements.DataPembelianImplement;
import java.sql.*;
import java.util.*;
import Koneksi.Connector;
import Models.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author aliad
 */
public class PembelianDAO implements DataPembelianImplement{
    Connection connection;
    final String createQuery = "INSERT INTO `pembelian`(`idBarang`, 'NamaCustomer', `cicilan`, `bungaPerBulan`, `angsuranPerBulan`, `totalPembayaran`) VALUES (?, ?,?,?,?,?)";
    final String selectQuery =  "SELECT * FROM pembelian";
    final String editQuery =  "UPDATE `pembelian` SET 'idBarang`='?',`namaCustomer`='?',`cicilan`='?',`bungaPerBulan`='?',`angsuranPerBulan`='?',`totalPembayaran`='?' WHERE idPembelian = ?";
    final String deleteQuery = "DELETE FROM `pembelian` WHERE idPembelian = ?";
    
    public PembelianDAO() {
        this.connection = Connector.connection();
    }
    
    
    @Override
    public void create(ModelPembelian pembelian) {
        PreparedStatement prepStatement = null;
        
        try {
            prepStatement = connection.prepareStatement(createQuery, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setInt(1, pembelian.getIdBarang());
            prepStatement.setString(2, pembelian.getNamaCustomer());
            prepStatement.setInt(3, pembelian.getCicilan());
            prepStatement.setInt(4, pembelian.getBungaPerBulan());
            prepStatement.setInt(5, pembelian.getAngsuranPerBulan());
            prepStatement.setInt(6, pembelian.getTotalPembayaran());
            
            prepStatement.executeUpdate();
            ResultSet result = prepStatement.getGeneratedKeys();
            while (result.next()){
                pembelian.setIdPembelian(result.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                prepStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(ModelPembelian pembelian) {
        PreparedStatement prepStatement = null;
        
        try {
            prepStatement = connection.prepareStatement(editQuery);
            prepStatement.setInt(1, pembelian.getIdBarang());
            prepStatement.setString(2, pembelian.getNamaCustomer());
            prepStatement.setInt(3, pembelian.getCicilan());
            prepStatement.setInt(4, pembelian.getBungaPerBulan());
            prepStatement.setInt(5, pembelian.getAngsuranPerBulan());
            prepStatement.setInt(6, pembelian.getTotalPembayaran());
            
            prepStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                prepStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int idPembelian) {
        PreparedStatement prepStatement = null;
        
        try {
            prepStatement = connection.prepareStatement(deleteQuery);
            
            prepStatement.setInt(1, idPembelian);
            prepStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                prepStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<ModelPembelian> getAll() {
        List<ModelPembelian> dataPembelian = null;
        
        try {
            dataPembelian = new ArrayList<ModelPembelian>();
            Statement statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectQuery);
            while (result.next()){
                ModelPembelian pembelian = new ModelPembelian();
                
                pembelian.setIdPembelian(result.getInt("idPembelian"));
                pembelian.setIdBarang(result.getInt("idBarang"));
                pembelian.setNamaCustomer(result.getString("namaCustomer"));
                pembelian.setCicilan(result.getInt("cicilan"));
                pembelian.setBungaPerBulan(result.getInt("bungaPerBulan"));
                pembelian.setAngsuranPerBulan(result.getInt("angsuranPerBulan"));
                pembelian.setTotalPembayaran(result.getInt("totalPembayaran"));
                
                dataPembelian.add(pembelian);
            }
        } catch (SQLException e) {
            Logger.getLogger(PembelianDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return dataPembelian;
    }
    
}
