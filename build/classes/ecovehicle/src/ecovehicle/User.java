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

public class User extends javax.swing.JFrame {

        String Username = LoginPage.user.getText();
        
    public User() {
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
        logout = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rentVehicle = new javax.swing.JLabel();
        trackVehicle = new javax.swing.JLabel();
        bookRoadTrip = new javax.swing.JLabel();
        giftBasket = new javax.swing.JLabel();
        searchVehicle = new javax.swing.JLabel();
        userSession = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 148, 175));

        logincapital.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        logincapital.setForeground(new java.awt.Color(255, 255, 255));
        logincapital.setText("User Page - Search Vehicle");

        logout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_logout_rounded_left_30px.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logincapital)
                    .addComponent(logout))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rentVehicle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rentVehicle.setForeground(new java.awt.Color(23, 148, 175));
        rentVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_car_rental_30px.png"))); // NOI18N
        rentVehicle.setText("Rent Vehicle ");
        rentVehicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(23, 148, 175), new java.awt.Color(23, 148, 175), null, null));
        rentVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleMouseClicked(evt);
            }
        });
        jPanel2.add(rentVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        trackVehicle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        trackVehicle.setForeground(new java.awt.Color(23, 148, 175));
        trackVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_track_order_30px.png"))); // NOI18N
        trackVehicle.setText("Track my Vehicle ");
        trackVehicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(23, 148, 175), new java.awt.Color(23, 148, 175), null, null));
        trackVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trackVehicleMouseClicked(evt);
            }
        });
        jPanel2.add(trackVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        bookRoadTrip.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookRoadTrip.setForeground(new java.awt.Color(23, 148, 175));
        bookRoadTrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_adventure_30px.png"))); // NOI18N
        bookRoadTrip.setText("Book Road Trip ");
        bookRoadTrip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(23, 148, 175), new java.awt.Color(23, 148, 175), null, null));
        bookRoadTrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRoadTripMouseClicked(evt);
            }
        });
        jPanel2.add(bookRoadTrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        giftBasket.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        giftBasket.setForeground(new java.awt.Color(23, 148, 175));
        giftBasket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_gift_30px.png"))); // NOI18N
        giftBasket.setText("Gift Basket ");
        giftBasket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(23, 148, 175), new java.awt.Color(23, 148, 175), null, null));
        giftBasket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giftBasketMouseClicked(evt);
            }
        });
        jPanel2.add(giftBasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        searchVehicle.setBackground(new java.awt.Color(255, 255, 255));
        searchVehicle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchVehicle.setForeground(new java.awt.Color(23, 148, 175));
        searchVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_search_30px.png"))); // NOI18N
        searchVehicle.setText("Search Vehicle ");
        searchVehicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(23, 148, 175), new java.awt.Color(23, 148, 175), null, null));
        searchVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchVehicleMouseClicked(evt);
            }
        });
        jPanel2.add(searchVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        userSession.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userSession.setForeground(new java.awt.Color(23, 148, 175));
        userSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecovehicle/icons/icons8_user_30px.png"))); // NOI18N
        userSession.setText(" ");
        jPanel2.add(userSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        HomePage a = new HomePage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void rentVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rentVehicleMouseClicked

    private void trackVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackVehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_trackVehicleMouseClicked

    private void bookRoadTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRoadTripMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRoadTripMouseClicked

    private void giftBasketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giftBasketMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_giftBasketMouseClicked

    private void searchVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchVehicleMouseClicked
        UserSearchVehicle a = new UserSearchVehicle();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchVehicleMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookRoadTrip;
    private javax.swing.JLabel giftBasket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logincapital;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel rentVehicle;
    private javax.swing.JLabel searchVehicle;
    private javax.swing.JLabel trackVehicle;
    private javax.swing.JLabel userSession;
    // End of variables declaration//GEN-END:variables
}
