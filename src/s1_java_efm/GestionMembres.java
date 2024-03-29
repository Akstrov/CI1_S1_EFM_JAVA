/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s1_java_efm;


import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author yalam
 */
public class GestionMembres extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private int clubId;
    
    /**
     * Creates new form GestionMembres
     */
    public GestionMembres() {
        initComponents();
    }
    public GestionMembres(int clubId){
        initComponents();
        this.clubId = clubId;
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMembreId = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMembreId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMakeGerant = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMembres = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        lblTitle.setText("Membres de");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Telephone");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        lblMembreId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMembreId.setText("ID");

        txtMembreId.setEditable(false);

        btnAdd.setText("Ajouter");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Modifier");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Supprimer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMakeGerant.setText("Assigner gerant");
        btnMakeGerant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeGerantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblMembreId))
                .addGap(83, 83, 83)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtTelephone)
                    .addComponent(txtNom)
                    .addComponent(txtMembreId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMakeGerant)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnMakeGerant, btnUpdate});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnMakeGerant))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMembreId)
                            .addComponent(txtMembreId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tMembres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tMembres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMembresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tMembres);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(52, 152, 219));
        btnBack.setForeground(new java.awt.Color(44, 62, 80));
        btnBack.setText("Home");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(122, 122, 122)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String clubTitle(){
        try {
            pst = con.prepareStatement("SELECT `nom` FROM `club` WHERE `id` = ?");
            pst.setInt(1, clubId);
            rs = pst.executeQuery();
            rs.next();
            return rs.getString("nom");

        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private void FillClubMembers(){
        try {
            pst = con.prepareStatement("SELECT `id`, `nom`, `telephone`, `email`,"
                    + " `date_inscription` as 'date inscription', `role` FROM `membre`"
                    + " inner join club_membre on membre.id = club_membre.id_membre"
                    + " WHERE club_membre.id_club = ?");
            pst.setInt(1, clubId);
            rs = pst.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();
            for(int i = 1;i<=columnCount;i++)
                model.addColumn(metadata.getColumnName(i));
            while(rs.next()){
                Object[] row = new Object[columnCount];
                for(int i = 1;i<=columnCount;i++)
                    row[i-1] = rs.getObject(i);
                model.addRow(row);
            }
            tMembres.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblMembreId.setVisible(false);
        txtMembreId.setVisible(false);
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnMakeGerant.setVisible(false);
        con = AppConfig.connexion();
        lblTitle.setText(lblTitle.getText() + " " + clubTitle());
        FillClubMembers();
    }//GEN-LAST:event_formWindowOpened

    private void tMembresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMembresMouseClicked
        // TODO add your handling code here:
        txtMembreId.setText(tMembres.getModel().getValueAt(tMembres.getSelectedRow(), 0).toString());
        txtNom.setText(tMembres.getModel().getValueAt(tMembres.getSelectedRow(), 1).toString());
        txtTelephone.setText(tMembres.getModel().getValueAt(tMembres.getSelectedRow(), 2).toString());
        txtEmail.setText(tMembres.getModel().getValueAt(tMembres.getSelectedRow(), 3).toString());
        lblMembreId.setVisible(true);
        txtMembreId.setVisible(true);
        btnDelete.setVisible(true);
        btnUpdate.setVisible(true);
        //change it so that if the member is already a gerant we don't show it
        if ( !tMembres.getModel().getValueAt(tMembres.getSelectedRow(), 5).equals("gerant")){
            btnMakeGerant.setVisible(true);
        }else{
            btnMakeGerant.setVisible(false);
        }
    }//GEN-LAST:event_tMembresMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            String sqlQuery = "INSERT INTO `membre`(`nom`, `telephone`, `email`,"
                    + " `date_inscription`, `role`, `id_club`) VALUES "
                    + "(?,?,?,?,?,?)";
            pst = con.prepareStatement(sqlQuery);
            pst.setString(1, txtNom.getText());
            pst.setString(2, txtTelephone.getText());
            pst.setString(3, txtEmail.getText());
            pst.setDate(4, Date.valueOf(LocalDate.now()));
            pst.setString(5, "membre");
            pst.setInt(6, clubId);
            pst.executeUpdate();
            FillClubMembers();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sqlQuery = "UPDATE `membre` SET `nom`=?,`telephone`=?,"
                    + "`email`=?,`date_inscription`=? WHERE `id` = ?";
            pst = con.prepareStatement(sqlQuery);
            pst.setString(1, txtNom.getText());
            pst.setString(2, txtTelephone.getText());
            pst.setString(3, txtEmail.getText());
            pst.setDate(4, Date.valueOf(LocalDate.now()));
            pst.setInt(5, Integer.parseInt(txtMembreId.getText()));
            pst.executeUpdate();
            FillClubMembers();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            String sqlQuery = "DELETE FROM `membre` WHERE `id` = ?";
            pst = con.prepareStatement(sqlQuery);
            pst.setInt(1, Integer.parseInt(txtMembreId.getText()));
            pst.executeUpdate();
            FillClubMembers();
            txtEmail.setText("");
            txtMembreId.setText("");
            txtNom.setText("");
            txtTelephone.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Dashboard.getInstance().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMakeGerantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeGerantActionPerformed
        try {
            // TODO add your handling code here:
            pst = con.prepareStatement("SELECT `membre`.`id` FROM `membre` \n" +
"	LEFT JOIN `club_membre` ON `club_membre`.`id_membre` = `membre`.`id` \n" +
"	LEFT JOIN `club` ON `club`.`id_gerant` = `membre`.`id` WHERE `membre`.`role` = 'gerant'"
                    + " and `club`.`id` = ?;");
            pst.setInt(1, clubId);
            ResultSet rs = pst.executeQuery();
            rs.next();
            int oldGerantId = rs.getInt("id");
            removeGerant(oldGerantId);
            new NewUser(Integer.parseInt(txtMembreId.getText()), clubId).setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMakeGerantActionPerformed

    private void removeGerant(int gerantId){
        try {
            pst = con.prepareStatement("UPDATE `membre` SET `role` = 'user' WHERE `id` = ?");
            pst.setInt(1, gerantId);
            pst.executeUpdate();
            pst = con.prepareStatement("DELETE FROM `users` WHERE `id_gerant` = ?");
            pst.setInt(1, gerantId);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMembres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(GestionMembres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMembres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMembres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMembres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionMembres().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMakeGerant;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMembreId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tMembres;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMembreId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
