/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackages;

import java.io.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Master
 */
public class MenuArsip extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    String sql, kelas;
    ResultSet res;
    Date jdc = new Date();
    PreparedStatement prepare;
    /**
     * Creates new form MenuArsip
     */
    public MenuArsip() {
        initComponents();
        load_table();
        configDB k = new configDB();
        k.config();
        con = k.con;
        stat = k.stm;
        this.setLocationRelativeTo(null);
        
    }

    private void simpan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pasien_db", "root", "");
            Statement statement = con.createStatement();

            FileOutputStream fileOut;
            // Hasil Export
            fileOut = new FileOutputStream("D:/export.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");

            // Nama Field
            Row row1 = worksheet.createRow((short) 0);
            row1.createCell(0).setCellValue("ID");
            row1.createCell(1).setCellValue("ID BPJS");
            row1.createCell(2).setCellValue("Nama Pasien");
            row1.createCell(3).setCellValue("Jenis Kelamin");
            row1.createCell(4).setCellValue("Status");
            row1.createCell(5).setCellValue("Umur");
            row1.createCell(6).setCellValue("Tanggal Lahir");
            row1.createCell(7).setCellValue("Tempat Lahir");
            row1.createCell(8).setCellValue("No Telepon");
            row1.createCell(9).setCellValue("Alamat");

            Row row2;
            ResultSet rs = statement.executeQuery("SELECT * FROM pasien_tb");
            while (rs.next()) {
                int a = rs.getRow();
                row2 = worksheet.createRow((short) a);

                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                row2.createCell(4).setCellValue(rs.getString(5));
                row2.createCell(5).setCellValue(rs.getString(6));
                row2.createCell(6).setCellValue(rs.getString(7));
                row2.createCell(7).setCellValue(rs.getString(8));
                row2.createCell(8).setCellValue(rs.getString(9));
                row2.createCell(9).setCellValue(rs.getString(10));
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
            rs.close();
            statement.close();
            con.close();
            System.out.println("Export Success");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            JOptionPane.showMessageDialog(null, "Export Berhasil!!!, silahkan Cek");
        }

    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("ID BPJS");
        model.addColumn("Nama Pasien");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Status");
        model.addColumn("Umur");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Tempat Lahir");
        model.addColumn("NO Telepon");
        model.addColumn("Alamat");
        tableArsip.setModel(model);

        try {
            String sql = "SELECT * FROM pasien_tb";
            res = stat.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7),
                    res.getString(8),
                    res.getString(9),
                    res.getString(10)});
            }
            tableArsip.setModel(model);
        } catch (Exception e) {
        }
    }
    
 public void hapus(){
  PreparedStatement prep;
  Statement state;
  // Jika Data Belum dipilih
  if (tableArsip.getSelectedRow()<0){
    JOptionPane.showMessageDialog(this, "Pilih Data Pada Tabel ","Perhatian",JOptionPane.WARNING_MESSAGE);
    } else {
       
     
         try {                                         
            
            configDB hapus = new configDB();
            state = hapus.con.createStatement();
            String sql = "DELETE FROM data WHERE id=?";
            
            prep = hapus.config().prepareStatement(sql);
            prep.setString(1, tableArsip.getValueAt(tableArsip.getSelectedRow(),0).toString());          
            
            try {
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil di Hapus",null,JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "hapus data gagal",null,JOptionPane.ERROR_MESSAGE);
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "koneksi gagal",null,JOptionPane.WARNING_MESSAGE);
            }
        }         
 }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        DeleteSelectedButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableArsip = new javax.swing.JTable();
        ExportButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        LoadArsipButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BCloseFormArsip2 = new javax.swing.JButton();
        TXSearch = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProgramMenu = new javax.swing.JMenu();
        TutupMenuExit = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        DeleteSelectedButton.setText("Delete Terpilih");
        DeleteSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSelectedButtonActionPerformed(evt);
            }
        });

        tableArsip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "ID BPJS", "NAMA PASIEN", "JENIS KELAMIN", "STATUS", "UMUR", "TANGGAL LAHIR", "TEMPAT LAHIR", "NO TELP", "ALAMAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArsip.getTableHeader().setReorderingAllowed(false);
        tableArsip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableArsipMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableArsip);
        if (tableArsip.getColumnModel().getColumnCount() > 0) {
            tableArsip.getColumnModel().getColumn(0).setMaxWidth(30);
            tableArsip.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        ExportButton.setText("Export Tabel");
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });

        ShowButton.setText("Tampilkan Terpilih");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        LoadArsipButton.setText("Load Data");
        LoadArsipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadArsipButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("ARSIP");

        jLabel2.setText("CARI DATA PASIEN");

        BCloseFormArsip2.setText("Tutup Form Arsip");
        BCloseFormArsip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCloseFormArsip2ActionPerformed(evt);
            }
        });

        ProgramMenu.setText("Program");

        TutupMenuExit.setText("Tutup Menu Arsip");
        TutupMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutupMenuExitActionPerformed(evt);
            }
        });
        ProgramMenu.add(TutupMenuExit);

        jMenuBar1.add(ProgramMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteSelectedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoadArsipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BCloseFormArsip2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteSelectedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCloseFormArsip2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadArsipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSelectedButtonActionPerformed
    // TODO add your handling code here:
    hapus();
    }//GEN-LAST:event_DeleteSelectedButtonActionPerformed

    private void TutupMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutupMenuExitActionPerformed

        this.dispose(); //Menutup Form

    }//GEN-LAST:event_TutupMenuExitActionPerformed

    private void LoadArsipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadArsipButtonActionPerformed
        // TODO add your handling code here:
        load_table();
    }//GEN-LAST:event_LoadArsipButtonActionPerformed

    private void BCloseFormArsip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCloseFormArsip2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BCloseFormArsip2ActionPerformed

    private void tableArsipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableArsipMouseClicked
        // TODO add your handling code here:
        ExportButton.setEnabled(false);
        DeleteSelectedButton.setEnabled(true);
        BCloseFormArsip2.setEnabled(true);
        ShowButton.setEnabled(true);
        int baris = tableArsip.rowAtPoint(evt.getPoint());


    }//GEN-LAST:event_tableArsipMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // ketika menekan area form
        // menampilkan tombol
        ExportButton.setEnabled(true);
        LoadArsipButton.setEnabled(true);
    }//GEN-LAST:event_formMouseClicked

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        // Export Tabel
        simpan();
    }//GEN-LAST:event_ExportButtonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuArsip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuArsip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuArsip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuArsip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuArsip().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCloseFormArsip2;
    private javax.swing.JButton DeleteSelectedButton;
    private javax.swing.JButton ExportButton;
    private javax.swing.JButton LoadArsipButton;
    private javax.swing.JMenu ProgramMenu;
    private javax.swing.JButton ShowButton;
    private javax.swing.JTextField TXSearch;
    private javax.swing.JMenuItem TutupMenuExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTable tableArsip;
    // End of variables declaration//GEN-END:variables
}
