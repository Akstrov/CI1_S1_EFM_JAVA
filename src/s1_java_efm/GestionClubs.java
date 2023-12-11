/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s1_java_efm;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yalam
 */
public class GestionClubs extends javax.swing.JFrame {

    /**
     * Creates new form GestionClubs
     */
    public GestionClubs() {
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

        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtClubName = new javax.swing.JTextField();
        btnClubAdd = new javax.swing.JButton();
        btnClubUpdate = new javax.swing.JButton();
        txtClubId = new javax.swing.JTextField();
        lblClubId = new javax.swing.JLabel();
        btnShowMembers = new javax.swing.JButton();
        btnShowEvents = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClubs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Gestion des clubs");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nom");

        btnClubAdd.setText("Ajouter");
        btnClubAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubAddActionPerformed(evt);
            }
        });

        btnClubUpdate.setText("Modifier");
        btnClubUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubUpdateActionPerformed(evt);
            }
        });

        txtClubId.setEditable(false);

        lblClubId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClubId.setText("ID");

        btnShowMembers.setText("Afficher les membres");
        btnShowMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMembersActionPerformed(evt);
            }
        });

        btnShowEvents.setText("Afficher les evenements");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClubId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClubName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClubId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnShowMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClubAdd)
                            .addComponent(btnClubUpdate))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnShowEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addGap(68, 68, 68))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClubName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClubAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClubId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClubUpdate)
                    .addComponent(lblClubId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowMembers)
                    .addComponent(btnShowEvents))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tClubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClubsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tClubs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean nomValide(String nom){
        return !nom.isBlank();
    }
    
    private void btnClubAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubAddActionPerformed
        if(!nomValide(txtClubName.getText())){
            JOptionPane.showMessageDialog(this, "Veuillez entrer le nom du club!","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        try {
            // TODO add your handling code here:
            st = con.prepareCall("INSERT INTO `club`(`nom`, `date_creation`) VALUES (?,?)");
            st.setString(1, txtClubName.getText());
            st.setDate(2, Date.valueOf(LocalDate.now()));
            st.executeUpdate();
            fillClubsTable();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClubs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClubAddActionPerformed

    private void fillClubsTable(){
        String query = "SELECT * FROM club";
        try {
            st = con.prepareStatement(query);
            rs = st.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int i = 1;i<=columnCount;i++)
                model.addColumn(metaData.getColumnName(i));
            while(rs.next()){
                Object[] row = new Object[columnCount];
                for(int i = 1;i<=columnCount;i++)
                    row[i-1] = rs.getObject(i);
                model.addRow(row);
            }
            tClubs.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        con = AppConfig.connexion();
        txtClubId.setVisible(false);
        btnClubUpdate.setVisible(false);
        lblClubId.setVisible(false);
        btnShowEvents.setVisible(false);
        btnShowMembers.setVisible(false);
        fillClubsTable();
    }//GEN-LAST:event_formWindowOpened

    private void tClubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClubsMouseClicked
        // TODO add your handling code here:
        txtClubName.setText((String) tClubs.getModel().getValueAt(tClubs.getSelectedRow(), 1));
        txtClubId.setVisible(true);
        txtClubId.setText( tClubs.getModel().getValueAt(tClubs.getSelectedRow(), 0).toString());
        btnClubUpdate.setVisible(true);
        lblClubId.setVisible(true);
        btnShowEvents.setVisible(true);
        btnShowMembers.setVisible(true);
    }//GEN-LAST:event_tClubsMouseClicked

    private void btnClubUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubUpdateActionPerformed
        if(!nomValide(txtClubName.getText())){
            JOptionPane.showMessageDialog(this, "Veuillez entrer le nom du club!","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtClubId.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Veuillez selectionner un club pour le modifier!","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            // TODO add your handling code here:
            st = con.prepareStatement("update club set nom = ? where id = ?");
            st.setString(1, txtClubName.getText());
            st.setInt(2, Integer.parseInt(txtClubId.getText()));
            st.executeUpdate();
            fillClubsTable();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClubs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClubUpdateActionPerformed

    private void btnShowMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMembersActionPerformed
        // TODO add your handling code here:
        new GestionMembres().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnShowMembersActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClubs().setVisible(true);
            }
        });
    }

    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClubAdd;
    private javax.swing.JButton btnClubUpdate;
    private javax.swing.JButton btnShowEvents;
    private javax.swing.JButton btnShowMembers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClubId;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tClubs;
    private javax.swing.JTextField txtClubId;
    private javax.swing.JTextField txtClubName;
    // End of variables declaration//GEN-END:variables
}
