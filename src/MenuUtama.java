/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MyBook Hype AMD
 */
public class MenuUtama extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuUtama.class.getName());
    
    public String userLevel;
    /**
     * Creates new form MenuUtama
     */
    
    public MenuUtama() {
        initComponents();
        if (userLevel == null) {
        userLevel = ""; 
    }
    }
    public MenuUtama(String level) {
        initComponents();
        this.userLevel = level;
        cekAkses(); // Panggil fungsi cek akses
    }
    
    public void cekAkses() {
        // Cek kalau levelnya Operator, kita kunci menu User dan Add User
        if (userLevel != null && userLevel.equalsIgnoreCase("Operator")) {
            txtMaster.setEnabled(false);
            menuUser.setEnabled(false); // Menu master user mati
            menuAdd.setEnabled(false);  // Menu tambah user mati
        }
        // Kalau Admin, otomatis kebuka semua karena default-nya kebuka
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        menuMaster = new javax.swing.JMenuBar();
        txtMaster = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuMahasiswa = new javax.swing.JMenuItem();
        menuMatkul = new javax.swing.JMenuItem();
        menuDosen = new javax.swing.JMenuItem();
        txtTransaksi = new javax.swing.JMenu();
        menuKRS = new javax.swing.JMenuItem();
        menuNilaiArray = new javax.swing.JMenuItem();
        txtSettings = new javax.swing.JMenu();
        menuAdd = new javax.swing.JMenuItem();
        menuPassword = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setText("User");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, -1));

        txtMaster.setText("File Master");

        menuUser.setText("User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        txtMaster.add(menuUser);

        menuMahasiswa.setText("Mahasiswa");
        menuMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMahasiswaActionPerformed(evt);
            }
        });
        txtMaster.add(menuMahasiswa);

        menuMatkul.setText("Mata Kuliah");
        menuMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMatkulActionPerformed(evt);
            }
        });
        txtMaster.add(menuMatkul);

        menuDosen.setText("Dosen");
        menuDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDosenActionPerformed(evt);
            }
        });
        txtMaster.add(menuDosen);

        menuMaster.add(txtMaster);

        txtTransaksi.setText("Transaction");

        menuKRS.setText("KRS");
        menuKRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKRSActionPerformed(evt);
            }
        });
        txtTransaksi.add(menuKRS);

        menuNilaiArray.setText("Nilai");
        menuNilaiArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNilaiArrayActionPerformed(evt);
            }
        });
        txtTransaksi.add(menuNilaiArray);

        menuMaster.add(txtTransaksi);

        txtSettings.setText("Settings");

        menuAdd.setText("Add User");
        menuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddActionPerformed(evt);
            }
        });
        txtSettings.add(menuAdd);

        menuPassword.setText("Ganti Password");
        menuPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasswordActionPerformed(evt);
            }
        });
        txtSettings.add(menuPassword);

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        txtSettings.add(menuLogout);

        menuMaster.add(txtSettings);

        setJMenuBar(menuMaster);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMahasiswaActionPerformed
        new Mahasiswa(userLevel).setVisible(true);
    }//GEN-LAST:event_menuMahasiswaActionPerformed

    private void menuMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatkulActionPerformed
        new MataKuliah(userLevel).setVisible(true);
    }//GEN-LAST:event_menuMatkulActionPerformed

    private void menuNilaiArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNilaiArrayActionPerformed
        new FormNilaiArray(userLevel).setVisible(true);
    }//GEN-LAST:event_menuNilaiArrayActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        new User(userLevel).setVisible(true);
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDosenActionPerformed
        new Dosen(userLevel).setVisible(true);
    }//GEN-LAST:event_menuDosenActionPerformed

    private void menuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddActionPerformed
        new User(userLevel).setVisible(true);
    }//GEN-LAST:event_menuAddActionPerformed

    private void menuKRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKRSActionPerformed
        new Krs(userLevel).setVisible(true);
    }//GEN-LAST:event_menuKRSActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        new LoginSystem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasswordActionPerformed
        String userAktif = lblUsername.getText(); 
    
    // Kirim dua data: username dan userLevel
    ChangePassword cp = new ChangePassword(userAktif, userLevel);
    cp.setVisible(true);
    
    // Hapus baris "new MenuUtama(userLevel).setVisible(true);" di sini 
    // karena form utama harus ditutup saja, bukan dibuka baru lagi.
    this.dispose();
    }//GEN-LAST:event_menuPasswordActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuUtama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblUsername;
    private javax.swing.JMenuItem menuAdd;
    private javax.swing.JMenuItem menuDosen;
    private javax.swing.JMenuItem menuKRS;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuMahasiswa;
    private javax.swing.JMenuBar menuMaster;
    private javax.swing.JMenuItem menuMatkul;
    private javax.swing.JMenuItem menuNilaiArray;
    private javax.swing.JMenuItem menuPassword;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JMenu txtMaster;
    private javax.swing.JMenu txtSettings;
    private javax.swing.JMenu txtTransaksi;
    // End of variables declaration//GEN-END:variables
}
