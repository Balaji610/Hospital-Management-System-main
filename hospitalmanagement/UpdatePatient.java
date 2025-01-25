package hospitalmanagement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammmad Kashif
 */
public class UpdatePatient extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatient
     */
    public UpdatePatient() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patientid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        date = new javax.swing.JTextField();
        aadhar_no = new javax.swing.JTextField();
        patienttype = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        searchpatient = new javax.swing.JMenuBar();
        addpatient = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deletepatient = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        spatient = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        updatepatient = new javax.swing.JMenu();
        viewpatient = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE PATIENTS");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 38, 1080, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 165, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 202, 105, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 133, -1, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Maritial Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 277, -1, 35));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 267, 105, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 472, 105, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Aadhar no.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 472, 90, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 340, -1, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Last Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 202, -1, 35));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 411, 105, 35));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Patient Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 544, 105, 35));
        getContentPane().add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 136, 193, 32));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 414, 557, 32));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 205, 193, 32));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 205, 162, 32));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 270, 193, 32));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 343, 192, 33));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 204));
        jLabel15.setText("Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 352, 48, 35));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married", "Engaged" }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 280, 162, 33));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 343, 187, 32));

        aadhar_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar_noActionPerformed(evt);
            }
        });
        getContentPane().add(aadhar_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 475, 202, 32));

        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient Type", "Indoor Patient", "Outdoor Patient" }));
        patienttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypeActionPerformed(evt);
            }
        });
        getContentPane().add(patienttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 540, 192, 33));

        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 475, 182, 32));

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 181, 280, 273));

        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setText("SEARCH PATIENT");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 126, -1, 49));

        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/UPDATESMALL.png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 119, 155, 51));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patientdetals.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        addpatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ADD (6)_1.png"))); // NOI18N
        addpatient.setText("Add Patient");
        addpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpatientMouseClicked(evt);
            }
        });
        addpatient.add(jSeparator1);

        searchpatient.add(addpatient);

        deletepatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/removeuser.png"))); // NOI18N
        deletepatient.setText("Delete Patient");
        deletepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletepatientMouseClicked(evt);
            }
        });
        deletepatient.add(jSeparator3);

        searchpatient.add(deletepatient);

        spatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchuser.png"))); // NOI18N
        spatient.setText("Search Patient");
        spatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spatientMouseClicked(evt);
            }
        });
        spatient.add(jSeparator2);

        searchpatient.add(spatient);

        updatepatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updateuser (2).png"))); // NOI18N
        updatepatient.setText("Update Patient");
        updatepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatepatientMouseClicked(evt);
            }
        });
        searchpatient.add(updatepatient);

        viewpatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/viewuser.png"))); // NOI18N
        viewpatient.setText("View Patient");
        viewpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpatientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewpatientMouseEntered(evt);
            }
        });
        searchpatient.add(viewpatient);

        setJMenuBar(searchpatient);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpatientMouseClicked
        PatientDetails pd=new PatientDetails();
        pd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addpatientMouseClicked

    private void deletepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletepatientMouseClicked
        DeletePatient dp=new DeletePatient();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletepatientMouseClicked

    private void spatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spatientMouseClicked
        SearchPatient sp=new SearchPatient();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatientMouseClicked

    private void updatepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatepatientMouseClicked
        UpdatePatient up=new UpdatePatient();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatepatientMouseClicked

    private void viewpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseClicked
        ViewPatient vp=new ViewPatient();
        vp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_viewpatientMouseClicked

    private void viewpatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseEntered

    }//GEN-LAST:event_viewpatientMouseEntered

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void aadhar_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar_noActionPerformed

    private void patienttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypeActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
 try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
            PreparedStatement pst = conn.prepareStatement("UPDATE patient SET FirstName=?,LastName=?,Age=?,MaritialStatus=?,Gender=?,Address=?,Aadhar_no=?,PatientType=?,Date=?,PhoneNo=? WHERE P_id=?");
            pst.setString(1,firstname.getText());
            pst.setString(2,lastname.getText());
            pst.setString(3,age.getText());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6,address.getText());
            pst.setString(7,aadhar_no.getText());
            pst.setString(8, (String) patienttype.getSelectedItem());
            pst.setString(9,date.getText());
            pst.setString(10,phoneno.getText());
           
             pst.setString(11,patientid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
             patientid.setText(null);
       firstname.setText(null);
       lastname.setText(null);
       age.setText(null);
       address.setText(null);
       aadhar_no.setText(null);
       date.setText(null);
       phoneno.setText(null);
      
       gender.setSelectedIndex(0);
        status.setSelectedIndex(0);
         patienttype.setSelectedIndex(0);
          patientid.setText(null);
       firstname.setText(null);
       lastname.setText(null);
       age.setText(null);
       address.setText(null);
       aadhar_no.setText(null);
       date.setText(null);
       phoneno.setText(null);
      
       gender.setSelectedIndex(0);
        status.setSelectedIndex(0);
         patienttype.setSelectedIndex(0);
         image.setIcon(null);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       try {
 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
     PreparedStatement pst = conn.prepareStatement( "select *from patient where P_id=?");
    pst.setString(1,patientid.getText());
     ResultSet rs=pst.executeQuery();
     
 if(rs.next()){
     String fname=rs.getString("FirstName");
     firstname.setText(fname);
     String sname=rs.getString("lastname");
    lastname.setText(sname);
     String age1=rs.getString("Age");
    age.setText(age1);
    String mstatus=rs.getString("MaritialStatus");
   status.setSelectedItem(mstatus);
                String gen=rs.getString("Gender");
   gender.setSelectedItem(gen);
                   String add=rs.getString("Address");
     address.setText(add);  
      String Aadhar_no=rs.getString("Aadhar_no");
     aadhar_no.setText(Aadhar_no);
      String ptype=rs.getString("PatientType");
     patienttype.setSelectedItem(ptype);
     String datey=rs.getString("Date");
     date.setText(datey);
     String pno=rs.getString("Phoneno");
     phoneno.setText(pno);
   
   byte[]imagedata =rs.getBytes("Patientphoto");
        ImageIcon path=new ImageIcon(imagedata);
   image.setIcon(path);
 }
 else{
     JOptionPane.showMessageDialog(null,"No Specific Id Found");
 }
}
        
catch (Exception e) 
{
JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       adminPanel ap=new adminPanel();
      ap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_no;
    private javax.swing.JMenu addpatient;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletepatient;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField patientid;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton search;
    private javax.swing.JMenuBar searchpatient;
    private javax.swing.JMenu spatient;
    private javax.swing.JComboBox status;
    private javax.swing.JButton update;
    private javax.swing.JMenu updatepatient;
    private javax.swing.JMenu viewpatient;
    // End of variables declaration//GEN-END:variables
}
