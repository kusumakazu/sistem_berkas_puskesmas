/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 *
 * @author Master
 */
public class AddPendaftaranPasien extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    String sql, kelas;
    ResultSet res;
    Date jdc = new Date();

    /**
     * Creates new form AddPendaftaranPasien
     */
    public AddPendaftaranPasien() {
        initComponents();
        configDB k = new configDB();
        k.config();
        con = k.con;
        stat = k.stm;
        this.setLocationRelativeTo(null);
        kosong();
        showJK.setEditable(false); // disable teks field
        showStatus.setEditable(false); // disable teks field
    }

    private void kosong() {
        TXnamaLengkap.setText("");
        TXbpjs.setText("");
        TXumurPasien.setText("");
        TXtempatLahir.setText("");
        TXtanggalLahir.setText("");
        TXtelp.setText("");
        TXAlamat.setText("");

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
        TXAlamat = new javax.swing.JTextField();
        BSubmitPasienSelesai = new javax.swing.JButton();
        BKembaliPasienExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        TXtanggalLahir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXbpjs = new javax.swing.JTextField();
        comboJK = new javax.swing.JComboBox<>();
        TXtelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        showJK = new javax.swing.JTextField();
        showStatus = new javax.swing.JTextField();

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

        BKembaliPasienExit.setText("Kembali");
        BKembaliPasienExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliPasienExitActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Kelamin : ");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "ANAK", "DEWASA" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });

        jLabel4.setText("ID BPJS :");

        jLabel5.setText("No Telepon : ");

        jLabel6.setText("Status : ");

        TXbpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXbpjsActionPerformed(evt);
            }
        });

        comboJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select JK", "Laki - Laki", "Perempuan" }));
        comboJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJKActionPerformed(evt);
            }
        });

        showJK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                showJKFocusGained(evt);
            }
        });
        showJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showJKActionPerformed(evt);
            }
        });

        showStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                showStatusFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BKembaliPasienExit)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXbpjs, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(comboJK, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(showJK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24)
                                            .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(LumurPasien))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LtempatLahir)))
                                        .addComponent(LtanggalLahir)
                                        .addComponent(jLabel5)
                                        .addComponent(LAlamat))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TXtempatLahir)
                                        .addComponent(TXtanggalLahir)
                                        .addComponent(TXumurPasien)
                                        .addComponent(TXtelp)
                                        .addComponent(TXAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LnamaLengkap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXnamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(BSubmitPasienSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(BKembaliPasienExit)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnamaLengkap)
                    .addComponent(TXnamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXbpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LumurPasien)
                    .addComponent(TXumurPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXtempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtempatLahir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtanggalLahir)
                    .addComponent(TXtanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXtelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAlamat)
                    .addComponent(TXAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BSubmitPasienSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void TXnamaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXnamaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXnamaLengkapActionPerformed

    private void BSubmitPasienSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSubmitPasienSelesaiActionPerformed
        // Menyimpan Ke Database
        if (TXnamaLengkap.getText().equals("") || TXumurPasien.getText().equals("") || TXtempatLahir.getText().equals("") || TXtanggalLahir.getText().equals("") || TXAlamat.getText().equals("") || TXbpjs.getText().equals("") || showJK.getText().equals("") || showStatus.getText().equals("") || TXtelp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "LENGKAPI SEMUA DATA!");
        } else {
            try {
                String sql = "INSERT INTO pasien_tb VALUES (null,'" + TXnamaLengkap.getText() + "','" + TXbpjs.getText() + "','" + showJK.getText() + "','" + showStatus.getText() + "','" + TXumurPasien.getText() + "','" + TXtempatLahir.getText() + "','" + TXtanggalLahir.getText() + "','" + TXtelp.getText() + "','" + TXAlamat.getText() + "')";
                stat.executeUpdate(sql);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tambah  Data GAGAL! " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Tambah  Data Berhasil!");
            this.dispose();
    }//GEN-LAST:event_BSubmitPasienSelesaiActionPerformed
    }
    private void BKembaliPasienExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliPasienExitActionPerformed

        this.dispose(); // Keluar dari Form

    }//GEN-LAST:event_BKembaliPasienExitActionPerformed

    private void TXbpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXbpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXbpjsActionPerformed

    private void comboJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJKActionPerformed
        // Menampilkan teks dari combo box
        String jktext;
        jktext = (String) comboJK.getSelectedItem();
        showJK.setText(jktext);
    }//GEN-LAST:event_comboJKActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // Menampilkan teks dari combo box
        String statusText;
        statusText = (String) comboStatus.getSelectedItem();
        showStatus.setText(statusText);
    }//GEN-LAST:event_comboStatusActionPerformed

    private void showJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showJKActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_showJKActionPerformed

    private void showJKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_showJKFocusGained
        // disable teks field
        showJK.setEditable(false);
        showJK.setEnabled(false);
    }//GEN-LAST:event_showJKFocusGained

    private void showStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_showStatusFocusGained
        // disable teks field
        showStatus.setEditable(false);
        showStatus.setEnabled(false);
    }//GEN-LAST:event_showStatusFocusGained

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
    private javax.swing.JTextField TXbpjs;
    private javax.swing.JTextField TXnamaLengkap;
    private javax.swing.JTextField TXtanggalLahir;
    private javax.swing.JTextField TXtelp;
    private javax.swing.JTextField TXtempatLahir;
    private javax.swing.JTextField TXumurPasien;
    private javax.swing.JComboBox<String> comboJK;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField showJK;
    private javax.swing.JTextField showStatus;
    // End of variables declaration//GEN-END:variables
}
