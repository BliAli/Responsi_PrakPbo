/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplements;
import java.util.List;
import Models.*;
/**
 *
 * @author aliad
 */
public interface DataPembelianImplement {
    public void create(ModelPembelian pembelian);
    public void update(ModelPembelian pembelian);
    public void delete(int idPembelian);
    public List<ModelPembelian> getAll();
}
