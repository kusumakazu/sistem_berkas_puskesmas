/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackages;

/**
 *
 * @author Master
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        ProgramMenu = new javax.swing.JMenu();
        ExitProgram = new javax.swing.JMenuItem();
        DaftarMenu = new javax.swing.JMenu();
        RegistPasien = new javax.swing.JMenuItem();
        RegistDokter = new javax.swing.JMenuItem();
        ArsipMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ePuskesmas");

        ProgramMenu.setText("Program");

        ExitProgram.setText("Keluar");
        ExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramActionPerformed(evt);
            }
        });
        ProgramMenu.add(ExitProgram);

        jMenuBar1.add(ProgramMenu);

        DaftarMenu.setText("Daftar");

        RegistPasien.setText("Registrasi Pasien");
        RegistPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistPasienActionPerformed(evt);
            }
        });
        DaftarMenu.add(RegistPasien);

        RegistDokter.setText("Registrasi Dokter");
        RegistDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistDokterActionPerformed(evt);
            }
        });
        DaftarMenu.add(RegistDokter);

        jMenuBar1.add(DaftarMenu);

        ArsipMenu.setText("Arsip");
        jMenuBar1.add(ArsipMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
    
        System.exit(0); //program keluar
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void RegistPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistPasienActionPerformed
        
        new AddPendaftaranPasien().setVisible(true);
    }//GEN-LAST:event_RegistPasienActionPerformed

    private void RegistDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistDokterActionPerformed
       
         new AddRegistDokter().setVisible(true);
    }//GEN-LAST:event_RegistDokterActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ArsipMenu;
    private javax.swing.JMenu DaftarMenu;
    private javax.swing.JMenuItem ExitProgram;
    private javax.swing.JMenu ProgramMenu;
    private javax.swing.JMenuItem RegistDokter;
    private javax.swing.JMenuItem RegistPasien;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
