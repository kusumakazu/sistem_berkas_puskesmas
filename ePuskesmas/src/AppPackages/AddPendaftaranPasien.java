/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackages;
import javax.swing.*;
import java.util.*;

 /*
 *
 * @author Master
 */
public class AddPendaftaranPasien extends javax.swing.JFrame {
 
    /**
     * Creates new form AddPendaftaranPasien
     */
    public AddPendaftaranPasien() {
        initComponents();
    }
    public void ArrayGenList()
    {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LnamaLengkap = new javax.swing.JLabel();
        TXnamaLengkap = new javax.swing.JTextField();
        LumurPasien = new javax.swing.JLabel();
        LtempatLahir = new javax.swing.JLabel();
        LtanggalLahir = new javax.swing.JLabel();
        LAlamat = new javax.swing.JLabel();
        TXumurPasien = new javax.swing.JTextField();
        TXtempatLahir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        TXAlamat = new javax.swing.JTextField();
        BSubmitPasienSelesai = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        BKembaliPasienExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Pendaftaran Pasien Baru");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Form Pendaftaran Pasien Baru");

        LnamaLengkap.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        LnamaLengkap.setText("Nama Lengkap :");

        TXnamaLengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXnamaLengkapActionPerformed(evt);
            }
        });

        LumurPasien.setText("Umur Pasien : ");

        LtempatLahir.setText("Tempat Lahir : ");

        LtanggalLahir.setText("Tanggal Lahir : ");

        LAlamat.setText("Alamat :");

        TXumurPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXumurPasienActionPerformed(evt);
            }
        });

        TXtempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXtempatLahirActionPerformed(evt);
            }
        });

        jLabel8.setText("/M/");

        jLabel9.setText("D/");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel10.setText("/Y/");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "19", "20" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        TXAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXAlamatActionPerformed(evt);
            }
        });

        BSubmitPasienSelesai.setText("Submit");
        BSubmitPasienSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSubmitPasienSelesaiActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));

        BKembaliPasienExit.setText("Kembali");
        BKembaliPasienExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliPasienExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LAlamat)
                    .addComponent(LtanggalLahir)
                    .addComponent(LtempatLahir)
                    .addComponent(LumurPasien)
                    .addComponent(LnamaLengkap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXnamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(TXAlamat)
                    .addComponent(TXumurPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXtempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BKembaliPasienExit)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BSubmitPasienSelesai)
                        .addGap(284, 284, 284))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BKembaliPasienExit)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnamaLengkap)
                    .addComponent(TXnamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LumurPasien)
                    .addComponent(TXumurPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtempatLahir)
                    .addComponent(TXtempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtanggalLahir)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(BSubmitPasienSelesai)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXumurPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXumurPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXumurPasienActionPerformed

    private void TXtempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXtempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXtempatLahirActionPerformed

    private void TXAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXAlamatActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void TXnamaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXnamaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXnamaLengkapActionPerformed

    private void BSubmitPasienSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSubmitPasienSelesaiActionPerformed

        if (TXnamaLengkap.getText().isEmpty() || TXtempatLahir.getText().isEmpty() || TXAlamat.getText().isEmpty()) // perbandingan jika teks field kosong
        {
            JOptionPane.showMessageDialog(null, "Masukan Input"); // memunculkan pesan error 
        }
        else
        {
        String namaPasien = TXnamaLengkap.getText().trim();
        String tempatLahirPasien = TXtempatLahir.getText().trim();
        String alamatPasien = TXAlamat.getText().trim();
        
        }
        
        
    }//GEN-LAST:event_BSubmitPasienSelesaiActionPerformed

    private void BKembaliPasienExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliPasienExitActionPerformed
       
        System.exit(0); // program keluar

    }//GEN-LAST:event_BKembaliPasienExitActionPerformed

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
            java.util.logging.Logger.getLogger(AddPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPendaftaranPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKembaliPasienExit;
    private javax.swing.JButton BSubmitPasienSelesai;
    private javax.swing.JLabel LAlamat;
    private javax.swing.JLabel LnamaLengkap;
    private javax.swing.JLabel LtanggalLahir;
    private javax.swing.JLabel LtempatLahir;
    private javax.swing.JLabel LumurPasien;
    private javax.swing.JTextField TXAlamat;
    private javax.swing.JTextField TXnamaLengkap;
    private javax.swing.JTextField TXtempatLahir;
    private javax.swing.JTextField TXumurPasien;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
