/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecovehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserSearchVehicle extends javax.swing.JFrame {

        String Username = LoginPage.user.getText();
        
    public UserSearchVehicle() {
        initComponents();
        userSession.setText(Username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logincapital = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rentVehicle = new javax.swing.JLabel();
        searchMoto = new javax.swing.JLabel();
        searchBike = new javax.swing.JLabel();
        searchCar = new javax.swing.JLabel();
        userSession = new javax.swing.JLabel();
        searchVan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 148, 175));

        logincapital.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        logincapital.setForeground(new java.awt.Color(255, 255, 255));
        logincapital.setText("User Page - Search Vehicle");

        back.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_back_30px.png"))); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/LogoEcoSmallWhite.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logo)
                .addGap(50, 50, 50)
                .addComponent(logincapital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logincapital)
                    .addComponent(back))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rentVehicle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rentVehicle.setForeground(new java.awt.Color(23, 148, 175));
        rentVehicle.setText("Select Category");
        rentVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleMouseClicked(evt);
            }
        });
        jPanel2.add(rentVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        searchMoto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchMoto.setForeground(new java.awt.Color(23, 148, 175));
        searchMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_motorcycle_30px.png"))); // NOI18N
        searchMoto.setText("Moto");
        jPanel2.add(searchMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        searchBike.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchBike.setForeground(new java.awt.Color(23, 148, 175));
        searchBike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_bicycle_30px.png"))); // NOI18N
        searchBike.setText("Bike");
        jPanel2.add(searchBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        searchCar.setBackground(new java.awt.Color(255, 255, 255));
        searchCar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchCar.setForeground(new java.awt.Color(23, 148, 175));
        searchCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_car_30px_1.png"))); // NOI18N
        searchCar.setText("Car");
        jPanel2.add(searchCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        userSession.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userSession.setForeground(new java.awt.Color(23, 148, 175));
        userSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_user_30px.png"))); // NOI18N
        userSession.setText(" ");
        jPanel2.add(userSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 40));

        searchVan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchVan.setForeground(new java.awt.Color(23, 148, 175));
        searchVan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_van_30px.png"))); // NOI18N
        searchVan.setText("Van");
        jPanel2.add(searchVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        User a = new User();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void rentVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rentVehicleMouseClicked

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
            java.util.logging.Logger.getLogger(UserSearchVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSearchVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSearchVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSearchVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSearchVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logincapital;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel rentVehicle;
    private javax.swing.JLabel searchBike;
    private javax.swing.JLabel searchCar;
    private javax.swing.JLabel searchMoto;
    private javax.swing.JLabel searchVan;
    private javax.swing.JLabel userSession;
    // End of variables declaration//GEN-END:variables
}
