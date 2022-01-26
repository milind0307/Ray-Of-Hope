/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.OrganizationDirectory;
import Business.Organizations.PharmacyOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aniketmirajkar
 */
public class PharmacistWorkArea extends javax.swing.JPanel {

    /** Creates new form PharmacistWorkArea */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private PharmacyOrganization pharmacyOrganization;
    private OrganizationDirectory directory;
    Enterprise enterprise;
    Person person;
    private UserAccount userAccount;
    PersonDirectory personDirectory;
    
    public PharmacistWorkArea(JPanel userProcessContainer, UserAccount account, PharmacyOrganization pharmacyOrganization, Enterprise enterprise ,EcoSystem ecosystem, PersonDirectory personDirectory) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;   
        this.userAccount = account;
        this.enterprise = enterprise;
        this.ecosystem=ecosystem;
        this.pharmacyOrganization = (PharmacyOrganization)pharmacyOrganization;
        this.enterprise = enterprise;
        this.personDirectory = personDirectory;
        this.userAccount = account;

    }
    
     private void managePharmacyWorkAreaJPanel(){
        PharmacyJPanel panel = new PharmacyJPanel(rightSystemAdminPanel, userAccount, pharmacyOrganization, enterprise, ecosystem, personDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel",panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightSystemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        managePharmacyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PharmacyWorkArea = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managePharmacyPanel.setBackground(new java.awt.Color(0, 153, 102));
        managePharmacyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePharmacyPanelMousePressed(evt);
            }
        });
        managePharmacyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 204, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePharmacyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, -1));

        PharmacyWorkArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        PharmacyWorkArea.setText("Pharmacist Work Area");
        PharmacyWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PharmacyWorkAreaMousePressed(evt);
            }
        });
        managePharmacyPanel.add(PharmacyWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 225, 36));

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        managePharmacyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, -1));

        jPanel3.add(managePharmacyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4512612.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 200));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyWorkAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PharmacyWorkAreaMousePressed
        managePharmacyWorkAreaJPanel();
    }//GEN-LAST:event_PharmacyWorkAreaMousePressed

    private void managePharmacyPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyPanelMousePressed
        // TODO add your handling code here:
        managePharmacyWorkAreaJPanel();
    }//GEN-LAST:event_managePharmacyPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PharmacyWorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel managePharmacyPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}