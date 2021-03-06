/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Person.Person;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author aniketmirajkar
 */
public class WhoWeServe extends javax.swing.JPanel {

    /**
     * Creates new form WhoWeServe
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart barChart;
    
    public WhoWeServe(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateBarGraphByGender();
        populateBarGraphByAge();
        populateBarGraphBySpecialNeed();
    }
    
    public void populateBarGraphByGender() {

        Map<String, Integer> hMap = new HashMap<>();

        int femaleCount = 0;
        int maleCount = 0;
        for (Person p : system.getPersonDirectory().getPersonList()) {
            if ("Female".equalsIgnoreCase(p.getGender())) {
                hMap.put("Female", femaleCount + 1);
            } else {
                hMap.put("Male", maleCount + 1);
            }
        }
        barChart = ChartFactory.createPieChart(
                "By Gender",
                createDataset(hMap),
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }    
     
    public void populateBarGraphByAge() {
        Map<String, Integer> hMap = new HashMap<>();

        int ageGrp1 = 0;
        int ageGrp2 = 0;
        int ageGrp3 = 0;
        for (Person p : system.getPersonDirectory().getPersonList()) {
            if (p.getPersonAge() >= 0 && p.getPersonAge() <= 5) {
                hMap.put("AGES 0-5", ageGrp1 + 1);
            } else if (p.getPersonAge() > 5 && p.getPersonAge() <= 13) {
                hMap.put("AGES 6-13", ageGrp2 + 1);
            } else {
                hMap.put("AGES 14-18", ageGrp3 + 1);
            }
        }

        barChart = ChartFactory.createPieChart(
                "By Age",
                createDataset(hMap),
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel3.removeAll();
        jPanel3.add(chartPanel, BorderLayout.CENTER);
        jPanel3.validate();
    }
     
    public void populateBarGraphBySpecialNeed() {

        Map<String, Integer> hMap = new HashMap<>();

        int yes = 0;
        int no = 0;
        for (Person p : system.getPersonDirectory().getPersonList()) {
            if (p.isIsChallenged()) {
                hMap.put("Special Child", yes + 1);
            } else {
                hMap.put("Normal Child", no + 1);
            }
        }

        barChart = ChartFactory.createPieChart(
                "By Special Needs",
                createDataset(hMap),
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel2.removeAll();
        jPanel2.add(chartPanel, BorderLayout.CENTER);
        jPanel2.validate();
    }
    
    private PieDataset createDataset(Map<String, Integer> workReqMap) {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        for (String r : workReqMap.keySet()) {
            dataset.setValue(r, workReqMap.get(r));
        }
        return dataset;
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(246, 226, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 600));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 310, 610));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 600));
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 310, 610));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("                                Who We Serve");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 525, 54));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
