/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonCare;

import Business.EcoSystem;
import Business.Organizations.Organization;
import Business.Organizations.PersonCareOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PersonCareWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author aniketmirajkar
 */
public class ProcessAcquiredPerson extends javax.swing.JPanel {

    /**
     * Creates new form ProcessAcquiredPerson
     */
    
    JPanel userProcessContainer;
    PersonCareWorkRequest request;
    Person person;
    PersonDirectory personDirectory;
    PersonCareOrganization personCareOrganization;
    UserAccount account;
    EcoSystem business;
    
    public ProcessAcquiredPerson(JPanel userProcessContainer, Organization organization, PersonCareWorkRequest request, PersonDirectory personDirectory, Person person, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.personCareOrganization = (PersonCareOrganization) organization;
        this.request = request;
        this.business = business;
        this.person = person;
        this.account = account;
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
        jLabel1 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));

        jPanel1.setBackground(new java.awt.Color(246, 226, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Enter Remarks");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 123, 25));

        txtRemarks.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtRemarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 300, 127));

        submitBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        submitBtn.setText("Save");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 110, 33));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 52, 58));
        jLabel2.setText("Process person");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 30));

        jLabel4.setBackground(new java.awt.Color(246, 226, 187));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7eedb8511846a6b6ed4db46508ec0e7e.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 910, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (txtRemarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the remarks");
            return;
        }
        String remarks = txtRemarks.getText();
        request.setMessage(remarks);
        request.setStatus("Acquired");
        person.setStatus("Acquired");
        person.setMedicalStatus(person.getMedicalStatus() + "\n" + "Medically Fit on date" + new Date());

        for (WorkRequest req : account.getWorkQueue().getWorkRequestList()) {
            if (request.getSender().getRole().equals(Role.RoleType.Pharmacist.getValue())) {
                if (req instanceof MedicalAssistanceWorkRequest) {
                    if (req.getPersonId() == person.getPersonId()) {
                        String result = ((MedicalAssistanceWorkRequest) req).getTestResult();
                        if (((MedicalAssistanceWorkRequest) req).getTestResult().equalsIgnoreCase("Under Examination")) {
                            ((MedicalAssistanceWorkRequest) req).setTestResult("Test and medicine comepleted");
                        }
                    }
                }
            }
        }
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AcquirePerson panel = (AcquirePerson) component;
        panel.populateWorkRequest();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtRemarks;
    // End of variables declaration//GEN-END:variables
}
