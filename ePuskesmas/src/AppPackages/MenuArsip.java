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
        visibilitasFalse();
        JT3.setEditable(false);
        JT4.setEditable(false);

    }

    private void visibilitasFalse() {

        JT1.setEditable(false);
        JT2.setEditable(false);
        JT5.setEditable(false);
        JT6.setEditable(false);
        JT7.setEditable(false);
        JT8.setEditable(false);
        JT9.setEditable(false);
    }

    private void visibilitasTrue() {

        JT1.setEditable(true);
        JT2.setEditable(true);
        JT5.setEditable(true);
        JT6.setEditable(true);
        JT7.setEditable(true);
        JT8.setEditable(true);
        JT9.setEditable(true);
    }

    public void simpan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pasien_db", "root", "");
            Statement statement = con.createStatement();

            FileOutputStream fileOut;
            // Hasil Export
            fileOut = new FileOutputStream("D:/Data_Pasien.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");

            // Nama Field
            Row row1 = worksheet.createRow((short) 0);
            row1.createCell(0).setCellValue("ID");
            row1.createCell(1).setCellValue("Nama Pasien");
            row1.createCell(2).setCellValue("ID Pasien");
            row1.createCell(3).setCellValue("Jenis Kelamin");
            row1.createCell(4).setCellValue("Status");
            row1.createCell(5).setCellValue("Umur");
            row1.createCell(6).setCellValue("Tempat Lahir");
            row1.createCell(7).setCellValue("Tanggal Lahir");
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

    private void clear() {
        JT1.setText("");
        JT2.setText("");
        JT5.setText("");
        JT6.setText("");
        JT7.setText("");
        JT8.setText("");
        JT9.setText("");

    }

    private void saveUpdate() {
        if (JT1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "LENGKAPI SEMUA DATA!");
        } else {
            try {
                String sql = "UPDATE pasien_tb SET nama_pasien='" + JT1.getText() + "',id_bpjs = '" + JT2.getText() + "',jk_pasien = '" + JT3.getText() + "',status_pasien = '" + JT4.getText() + "',umur_pasien = '" + JT5.getText() + "',tpl_pasien = '" + JT6.getText() + "',tgl_pasien = '" + JT7.getText() + "',telp_pasien ='" + JT8.getText() + "',alamat_pasien ='" + JT9.getText() + "' WHERE id_pasien='" + idPasien.getText() + "'";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil diUpdate!");
                visibilitasFalse();
                clear();
                load_table();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Update Data Gagal!\n" + e.getMessage());
                visibilitasTrue();
            }
            clear();
            load_table();
        }
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Pasien");
        model.addColumn("ID BPJS");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Status");
        model.addColumn("Umur");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
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

    public void hapus() {
        if (JT1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "PILIH DATA YANG AKAN DIDELETE!");
        } else {
            try {
                String sql = "DELETE FROM pasien_tb WHERE id_pasien='" + idPasien.getText() + "'";
                stat.execute(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil diHapus!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal diHapus!\n" + e.getMessage());
            }
            clear();
            load_table();
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
        SearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableArsip = new javax.swing.JTable();
        ExportButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        LoadArsipButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BCloseFormArsip2 = new javax.swing.JButton();
        TXSearch = new javax.swing.JTextField();
        JT1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LtanggalLahir = new javax.swing.JLabel();
        LAlamat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LumurPasien = new javax.swing.JLabel();
        LtempatLahir = new javax.swing.JLabel();
        JT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        JT4 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        JT6 = new javax.swing.JTextField();
        JT7 = new javax.swing.JTextField();
        JT8 = new javax.swing.JTextField();
        JT9 = new javax.swing.JTextField();
        BDeleteData1 = new javax.swing.JButton();
        EDITOR = new javax.swing.JLabel();
        BDeleteData2 = new javax.swing.JButton();
        komboStatus = new javax.swing.JComboBox<>();
        komboJK = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        idPasien = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProgramMenu = new javax.swing.JMenu();
        TutupMenuExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Arsip");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        SearchButton.setText("Cari Data Pasien");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        tableArsip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "NAMA PASIEN", "ID BPJS", "JENIS KELAMIN", "STATUS", "UMUR", "TEMPAT LAHIR", "TANGGAL LAHIR", "NO TELP", "ALAMAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        LoadArsipButton.setText("Load Database");
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

        TXSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXSearchKeyPressed(evt);
            }
        });

        jLabel3.setText("Nama Pasien : ");

        jLabel4.setText("ID BPJS : ");

        LtanggalLahir.setText("Tanggal Lahir : ");

        LAlamat.setText("Alamat :");

        jLabel5.setText("Jenis Kelamin : ");

        jLabel6.setText("No Telepon : ");

        jLabel7.setText("Status : ");

        LumurPasien.setText("Umur Pasien : ");

        LtempatLahir.setText("Tempat Lahir : ");

        JT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT7ActionPerformed(evt);
            }
        });

        BDeleteData1.setText("Update Data");
        BDeleteData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteData1ActionPerformed(evt);
            }
        });

        EDITOR.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        EDITOR.setText("EDITOR ARSIP");

        BDeleteData2.setText("Delete");
        BDeleteData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteData2ActionPerformed(evt);
            }
        });

        komboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "ANAK", "DEWASA" }));
        komboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komboStatusActionPerformed(evt);
            }
        });

        komboJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select JK", "Laki - Laki", "Perempuan" }));
        komboJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komboJKActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Pasien : ");

        ProgramMenu.setText("Program");

        TutupMenuExit.setText("Tutup Menu Arsip");
        TutupMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutupMenuExitActionPerformed(evt);
            }
        });
        ProgramMenu.add(TutupMenuExit);

        jMenuBar1.add(ProgramMenu);

        jMenu1.setText("Export");

        jMenuItem1.setText("Export File Excel");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

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
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoadArsipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BCloseFormArsip2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT1)
                            .addComponent(JT2)
                            .addComponent(idPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(komboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(komboJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT3)
                                    .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(LtempatLahir)
                            .addComponent(LumurPasien)
                            .addComponent(LtanggalLahir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JT5)
                            .addComponent(JT6)
                            .addComponent(JT7)
                            .addComponent(JT8, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BDeleteData2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BDeleteData1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LAlamat)
                                .addGap(18, 18, 18)
                                .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EDITOR)
                .addGap(389, 389, 389))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TXSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCloseFormArsip2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadArsipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(EDITOR)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LumurPasien)
                        .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LAlamat)
                        .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LtempatLahir)
                            .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LtanggalLahir)
                                .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BDeleteData2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(komboJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDeleteData1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(komboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        statusSearching = 1;
        DefaultTableModel model = new DefaultTableModel();

        if (TXSearch.getText().isEmpty()) {
            statusSearching = 0;
        } else if (statusSearching == 1) {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("Kode Barang");
            table.addColumn("Nama Barang");
            String cari = TXSearch.getText();
            try {
                String sql = ("SELECT * FROM pasien_tb WHERE nama_pasien LIKE '% " + cari + "% ' OR id_bpjs LIKE '%" + cari +"% 'OR alamat_pasien LIKE '% " + cari + "% ");
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
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "TIDAK ADA DATA YANG SESUAI!");

            }
        }
        
    }//GEN-LAST:event_SearchButtonActionPerformed

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
        // ketika sebuah kolom pada tabel di pilih
        visibilitasTrue();
        ExportButton.setEnabled(false);
        SearchButton.setEnabled(true);
        BCloseFormArsip2.setEnabled(true);
        ShowButton.setEnabled(true);
        int baris = tableArsip.rowAtPoint(evt.getPoint());

        String IDPasien = tableArsip.getValueAt(baris, 0).toString();
        idPasien.setText(IDPasien);

        String namaPasien = tableArsip.getValueAt(baris, 1).toString();
        JT1.setText(namaPasien);

        String idBPJS = tableArsip.getValueAt(baris, 2).toString();
        JT2.setText(idBPJS);

        String JenisKelamin = tableArsip.getValueAt(baris, 3).toString();
        JT3.setText(JenisKelamin);

        String JenisStatus = tableArsip.getValueAt(baris, 4).toString();
        JT4.setText(JenisStatus);

        String umurPasien = tableArsip.getValueAt(baris, 5).toString();
        JT5.setText(umurPasien);

        String TempatLahir = tableArsip.getValueAt(baris, 6).toString();
        JT6.setText(TempatLahir);

        String TanggalLahir = tableArsip.getValueAt(baris, 7).toString();
        JT7.setText(TanggalLahir);

        String TeleponPasien = tableArsip.getValueAt(baris, 8).toString();
        JT8.setText(TeleponPasien);

        String AlaamatPasien = tableArsip.getValueAt(baris, 9).toString();
        JT9.setText(AlaamatPasien);
    }//GEN-LAST:event_tableArsipMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // ketika menekan area form
        // menampilkan tombol
        load_table();
        ExportButton.setEnabled(true);
        LoadArsipButton.setEnabled(true);
    }//GEN-LAST:event_formMouseClicked

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        // Export Tabel
        simpan();
    }//GEN-LAST:event_ExportButtonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        // TODO add your handling code here:
        visibilitasTrue();

    }//GEN-LAST:event_ShowButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Export Tabel
        simpan();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT7ActionPerformed

    private void BDeleteData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteData1ActionPerformed
        // TODO add your handling code here:
        visibilitasFalse();
        saveUpdate();
    }//GEN-LAST:event_BDeleteData1ActionPerformed

    private void BDeleteData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteData2ActionPerformed
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_BDeleteData2ActionPerformed

    private void komboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komboStatusActionPerformed
        // Menampilkan teks dari combo box
        String statusText;
        statusText = (String) komboStatus.getSelectedItem();
        JT4.setText(statusText);
    }//GEN-LAST:event_komboStatusActionPerformed

    private void komboJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komboJKActionPerformed
        // Menampilkan teks dari combo box
        String JKText;
        JKText = (String) komboJK.getSelectedItem();
        JT3.setText(JKText);
    }//GEN-LAST:event_komboJKActionPerformed
    private int statusSearching = 0;
    private void TXSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXSearchKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_TXSearchKeyPressed

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
    private javax.swing.JButton BDeleteData1;
    private javax.swing.JButton BDeleteData2;
    private javax.swing.JLabel EDITOR;
    private javax.swing.JButton ExportButton;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JTextField JT6;
    private javax.swing.JTextField JT7;
    private javax.swing.JTextField JT8;
    private javax.swing.JTextField JT9;
    private javax.swing.JLabel LAlamat;
    private javax.swing.JButton LoadArsipButton;
    private javax.swing.JLabel LtanggalLahir;
    private javax.swing.JLabel LtempatLahir;
    private javax.swing.JLabel LumurPasien;
    private javax.swing.JMenu ProgramMenu;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JTextField TXSearch;
    private javax.swing.JMenuItem TutupMenuExit;
    private javax.swing.JLabel idPasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> komboJK;
    private javax.swing.JComboBox<String> komboStatus;
    public javax.swing.JTable tableArsip;
    // End of variables declaration//GEN-END:variables
}
