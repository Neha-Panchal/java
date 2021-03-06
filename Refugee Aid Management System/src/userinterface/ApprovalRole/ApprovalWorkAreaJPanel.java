/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ApprovalRole;

import Business.EcoSystem;
import Business.Enterprise.EmbassyEnterprise;
import Business.Enterprise.ImmigrationOfficeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.OfficerOrganization;
import Business.Organization.ApprovalOrganization;
import Business.Organization.CheckingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRegistration;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ManagerRole.RefugeeDetailPanel;

/**
 *
 * @author hp
 */
public class ApprovalWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ApprovalOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Network network;
    /**
     * Creates new form ApprovalWorkAreaJPanel
     */
    public ApprovalWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ApprovalOrganization organization, Enterprise enterprise,EcoSystem business,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem=business;
        this.network=network;
        populateRequestTable();
    
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
        Send = new javax.swing.JButton();
        Button_received = new javax.swing.JButton();
        Button_sendchecking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Button_seedeatil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        Send.setBackground(new java.awt.Color(51, 153, 255));
        Send.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Send.setText("Send To Country >>");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        Button_received.setBackground(new java.awt.Color(51, 153, 255));
        Button_received.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_received.setText("Receive");
        Button_received.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_receivedActionPerformed(evt);
            }
        });

        Button_sendchecking.setBackground(new java.awt.Color(51, 153, 255));
        Button_sendchecking.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_sendchecking.setText("Send To Checking >>");
        Button_sendchecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_sendcheckingActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sno", "RefugeeId", "Migrationcountry", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Button_seedeatil.setBackground(new java.awt.Color(51, 153, 255));
        Button_seedeatil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_seedeatil.setText("See Detail");
        Button_seedeatil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_seedeatilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_received)
                        .addGap(114, 114, 114)
                        .addComponent(Button_seedeatil)
                        .addGap(65, 65, 65)
                        .addComponent(Button_sendchecking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Send)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_received)
                    .addComponent(Button_seedeatil)
                    .addComponent(Button_sendchecking)
                    .addComponent(Send))
                .addGap(171, 171, 171))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setText("Welcome To Send Approval Work Area ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:

         int sr = jTable1.getSelectedRow();
        if(sr>=0)
        {
             WorkRegistration  wr =  (WorkRegistration) jTable1.getValueAt(sr, 1);
             if(wr.getEmbassyreceiver()==null)
             {
                 JOptionPane.showMessageDialog(null,"job Didnt assigned yet"); return;
             }
             Organization org = null;
             Enterprise epp=null;
             Network netw=null;
             if(!wr.getStatus().equals("checking done"))
             {
                 JOptionPane.showMessageDialog(null,"checking incomplete or already sent"); return;
             }
             for (Network network : this.ecosystem.getNetworkList()){
                 System.out.println(network.getName());
                 if(wr.getCountry().equals(network.getName()))
                 {
                      netw=network; break;
                 }      
             }
             if (netw==null){JOptionPane.showMessageDialog(null,"There is no such country"); return;}
             for (Enterprise enterprise : netw.getEnterpriseDirectory().getEnterpriseList()){
                 if (enterprise instanceof ImmigrationOfficeEnterprise){
                epp = enterprise;
                break;
               }
             }
             if (epp!=null){
             for (Organization organization : epp.getOrganizationDirectory().getOrganizationList()){
             if (organization instanceof OfficerOrganization){
                org = organization;
                break;
               }
              }
             }else {JOptionPane.showMessageDialog(null,"There is no ImmigrationOffice"); return;}
             
            if (org!=null){
            org.getWorkQueue().getRegistrationList().add(wr);
            userAccount.getWorkQueue().getRegistrationList().add(wr);
            wr.setStatus("sent to country");
            wr.setEmbassysender(this.userAccount);
            JOptionPane.showMessageDialog(null,"details sent ");
            }
            else
            {
            JOptionPane.showMessageDialog(null,"There is no OfficerOrganization");
            } 
            this.populateRequestTable();
        }else
        {
            JOptionPane.showMessageDialog(null,"Please Select a specific detail ");
        }
        
        

    }//GEN-LAST:event_SendActionPerformed

     public void populateRequestTable(){
        
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        
        model.setRowCount(0);
        int x=0;
        
                     for (WorkRegistration register : this.organization.getWorkQueue().getRegistrationList()){
                         if(register.getEmbassyreceiver()==null || register.getEmbassyreceiver()==this.userAccount)
                        {
                         Object[] row = new Object[4]; x++;
                         row[0] = x;
                         row[1]= register;
                         row[2] =register.getCountry();
                         row[3] = register.getStatus();
                         
                         model.addRow(row);
                         }
                     }
                 

        
    }

    
    private void Button_receivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_receivedActionPerformed
        // TODO add your handling code here:
        int sr = jTable1.getSelectedRow();
        if(sr>=0)
        {

            WorkRegistration  wr =  (WorkRegistration) jTable1.getValueAt(sr, 1);
            if(!wr.getStatus().equals("sent to ebmassy")){ JOptionPane.showMessageDialog(null,"Already Recieved"); return;}
            wr.setStatus("received at embassy");
            wr.setEmbassyreceiver(this.userAccount);
            JOptionPane.showMessageDialog(null,"received ");
            this.populateRequestTable();
        }else
        {
            JOptionPane.showMessageDialog(null,"Please Select a specific detail ");
        }
        
    }//GEN-LAST:event_Button_receivedActionPerformed

    private void Button_sendcheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_sendcheckingActionPerformed
        // TODO add your handling code here:
        
        int sr = jTable1.getSelectedRow();
        if(sr>=0)
        {

            WorkRegistration  wr =  (WorkRegistration) jTable1.getValueAt(sr, 1);
            if(wr.getEmbassyreceiver()==null)
             {
                 JOptionPane.showMessageDialog(null,"job Didnt assigned yet"); return;
             }
            if(!wr.getStatus().equals("received at embassy")){ JOptionPane.showMessageDialog(null,"Already sent"); return;}
            Organization org = null;
            for (Organization organization : this.enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CheckingOrganization){
                org = organization;
                break;
               }
           }
        if (org!=null){
            org.getWorkQueue().getRegistrationList().add(wr);
            wr.setStatus("sent to checking");
            userAccount.getWorkQueue().getRegistrationList().add(wr);
            JOptionPane.showMessageDialog(null,"sent to checking");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"There is no CheckingOrganization ");
        }
            
            this.populateRequestTable();
        }else
        {
            JOptionPane.showMessageDialog(null,"Please Select a specific detail ");
        }
        
    }//GEN-LAST:event_Button_sendcheckingActionPerformed

    private void Button_seedeatilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_seedeatilActionPerformed
        // TODO add your handling code here:
       int sr = jTable1.getSelectedRow();
        if(sr>=0)
        {
            WorkRegistration  wr =  (WorkRegistration) jTable1.getValueAt(sr, 1);
            RefugeeDetailPanel refufeedetail = new RefugeeDetailPanel(userProcessContainer, userAccount, enterprise, network, wr);
            userProcessContainer.add("refufeedetail", refufeedetail);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select a specific detail ");
        }
        
    }//GEN-LAST:event_Button_seedeatilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_received;
    private javax.swing.JButton Button_seedeatil;
    private javax.swing.JButton Button_sendchecking;
    private javax.swing.JButton Send;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
