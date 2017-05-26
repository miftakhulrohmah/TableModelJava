/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet;

/**
 *
 * @author A455L
 */
public class TableMoklet {

    private MokletTableModel modelOrang;
    
    public TableMoklet(){
        modelOrang = new MokletTableModel() {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        initComponents();
        TableMoklet.setModel(modelOrang);
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private static void setModel(MokletTableModel modelOrang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
