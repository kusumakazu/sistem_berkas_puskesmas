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

        BDaftarPasienMenu = new javax.swing.JButton();
        BArsipMenu = new javax.swing.JButton();
        BKeluarMenuExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProgramMenu = new javax.swing.JMenu();
        ExitProgram = new javax.swing.JMenuItem();
        DaftarMenu = new javax.swing.JMenu();
        RegistPasien = new javax.swing.JMenuItem();
        ArsipMenu = new javax.swing.JMenu();
        Arsip = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ePuskesmas");

        BDaftarPasienMenu.setText("PENDAFTARAN PASIEN");
        BDaftarPasienMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDaftarPasienMenuActionPerformed(evt);
            }
        });

        BArsipMenu.setText("ARSIP");
        BArsipMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArsipMenuActionPerformed(evt);
            }
        });

        BKeluarMenuExit.setText("KELUAR");
        BKeluarMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarMenuExitActionPerformed(evt);
            }
        });

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

        jMenuBar1.add(DaftarMenu);

        ArsipMenu.setText("Arsip");

        Arsip.setText("Arsip");
        Arsip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArsipActionPerformed(evt);
            }
        });
        ArsipMenu.add(Arsip);

        jMenuBar1.add(ArsipMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BKeluarMenuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BArsipMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BDaftarPasienMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(BDaftarPasienMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BArsipMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BKeluarMenuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed

        System.exit(0); //program keluar
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void RegistPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistPasienActionPerformed

        new AddPendaftaranPasien().setVisible(true); // memulai instance form register pasien baru
    }//GEN-LAST:event_RegistPasienActionPerformed

    private void BKeluarMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarMenuExitActionPerformed

        System.exit(0); //program keluar
    }//GEN-LAST:event_BKeluarMenuExitActionPerformed

    private void BArsipMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArsipMenuActionPerformed

        new MenuArsip().setVisible(true); // memulai instance form Arsip

    }//GEN-LAST:event_BArsipMenuActionPerformed

    private void BDaftarPasienMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDaftarPasienMenuActionPerformed

        new AddPendaftaranPasien().setVisible(true); // memulai instance form register pasien baru

    }//GEN-LAST:event_BDaftarPasienMenuActionPerformed

    private void ArsipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArsipActionPerformed

        new MenuArsip().setVisible(true); // memulai instance form Arsip

    }//GEN-LAST:event_ArsipActionPerformed

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
    private javax.swing.JMenuItem Arsip;
    private javax.swing.JMenu ArsipMenu;
    private javax.swing.JButton BArsipMenu;
    private javax.swing.JButton BDaftarPasienMenu;
    private javax.swing.JButton BKeluarMenuExit;
    private javax.swing.JMenu DaftarMenu;
    private javax.swing.JMenuItem ExitProgram;
    private javax.swing.JMenu ProgramMenu;
    private javax.swing.JMenuItem RegistPasien;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
