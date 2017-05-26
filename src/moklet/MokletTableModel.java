/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author A455L
 */
public abstract class MokletTableModel extends AbstractTableModel{
// Kumpulan Data Orang
private ArrayList data;
 
public MokletTableModel() {
// Mendeklarasikan Data
data = new ArrayList();
}
 
// Menghapus Orang
public Moklet remove(int index) {
Moklet forReturn = (Moklet) data.remove(index);
// memberi tahu bahwa ada data yang dihapus
fireTableRowsDeleted(index, index);
return forReturn;
}
 
// Mendapatkan Orang
public Moklet get(int index) {
return (Moklet) data.get(index);
}
 
// Menambah Orang
public boolean add(Moklet e) {
boolean forReturn = data.add(e);
// Memberi tahu bahwa ada data yang masuk
fireTableRowsInserted(data.size() - 1, data.size() - 1);
return forReturn;
}
 
// Mengubah Orang
public Moklet set(int index, Moklet element) {
Moklet forReturn = (Moklet) data.set(index, element);
// Memberitahu bahwa ada data yang diupdate
fireTableRowsUpdated(index, index);
return forReturn;
}
// Panjang Baris
public int getRowCount() {
return data.size();
}
 
// Panjang Kolom
public int getColumnCount() {
return 4;
}
 

// Nama Kolom pada posisi ke-?
public String getColumnName(int column) {
switch (column) {
case 0:
return "Nama";
case 1:
return "Jenis Kelamin";
case 2:
return "Tanggal Lahir";
case 3:
return "Alamat";
default:
return null;
        }
    }
}
