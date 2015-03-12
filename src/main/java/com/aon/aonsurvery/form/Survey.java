package com.aon.aonsurvery.form ;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Survey extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Company
     */
    public Survey() {
        initComponents();
        setLocationRelativeTo(null);
        txtSurveyID.setVisible(false);
        
        //String aaa = txtSurveyName.getText(); 
       //txtSurveyName.setOpaque(true);
        //txtSurveyName.setVisible(true);
    }
    
   
   
   
    
 private void Reset()
{
    txtSurveyName.setText("");
   // SurveysDescription.setText("");
    txtSurveyID.setText("");
    btnSave.setEnabled(true);
    btnDelete.setEnabled(false);
    btnUpdate.setEnabled(false);
    //SurveysDescription.requestDefaultFocus();
   
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textField3 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSurveyName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCreationDate = new java.awt.TextField();
        txtExpiryDate = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        ComboBoxIsOpen = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJobCode = new javax.swing.JTextField();
        txtBenchmarkPosition = new javax.swing.JTextField();
        txtSurveyJobFamily = new javax.swing.JTextField();
        txtSurveyJobSubFamily = new javax.swing.JTextField();
        txtBenchmarkLevel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        txtSurveyID = new javax.swing.JTextField();
        SurveyDetails = new javax.swing.JButton();
        SurveyHeaders = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aon Surveys : Survey");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Survey"));

        jLabel1.setText("Survey Name");

        jLabel2.setText("Job Code");

        txtSurveyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurveyNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Creation Date");

        jLabel4.setText("Expiry Date");

        jLabel6.setText("Is Open");

        txtCreationDate.setName(""); // NOI18N
        txtCreationDate.setColumns(11);
        txtCreationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreationDateActionPerformed(evt);
            }
        });
        txtCreationDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCreationDateInputMethodTextChanged(evt);
            }
        });

        label2.setText("(dd-mm-yyyy)");

        label3.setText("(dd-mm-yyyy)");

        ComboBoxIsOpen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));

        jLabel7.setText("Benchmark Position");

        jLabel8.setText("Survey Job Family");

        jLabel9.setText("Survey Job Sub-Family");

        jLabel10.setText("Benchmark Level");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxIsOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSurveyJobSubFamily, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtBenchmarkLevel))))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJobCode, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSurveyName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBenchmarkPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSurveyJobFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSurveyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJobCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBenchmarkPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSurveyJobFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSurveyJobSubFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBenchmarkLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxIsOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnGetData.setText("View All Surveys");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSurveyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurveyIDActionPerformed(evt);
            }
        });

        SurveyDetails.setText("Survey Details");
        SurveyDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SurveyDetailsMouseClicked(evt);
            }
        });
        SurveyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurveyDetailsActionPerformed(evt);
                SurveyDetails(evt);
            }
        });
        SurveyDetails.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SurveyDetailsPropertyChange(evt);
            }
        });

        SurveyHeaders.setText("Survey Headers");
        SurveyHeaders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SurveyHeadersMouseClicked(evt);
            }
        });
        SurveyHeaders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurveyHeadersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurveyID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SurveyDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SurveyHeaders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSurveyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SurveyHeaders)
                        .addGap(19, 19, 19)
                        .addComponent(SurveyDetails)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Survey");

        getAccessibleContext().setAccessibleName("Aon Surveys");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            con=Connect.ConnectDB();
            if (txtSurveyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter survey name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtJobCode.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Job Code is required","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select SurveyName from Surveys where SurveyName= '" + txtSurveyName.getText() + "'" ;
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
                Reset();
                return;
            }
              String fmt = "dd-mm-yyyy";
            String sql= "insert into Surveys(SurveyName,JobCode,BenchmarkPosition,SurveyJobFamily,SurveyJobSubFamily,BenchmarkLevel,CreatedOn,ExpireOn,CreatedBy,IsOpen)values('"+ txtSurveyName.getText() + "','" + txtJobCode.getText() + "','" + txtBenchmarkPosition.getText() + "','" + txtSurveyJobFamily.getText() + "','" + txtSurveyJobSubFamily.getText() + "','" + txtBenchmarkLevel.getText() + "','" + txtCreationDate.getText() + "','" + txtExpiryDate.getText() + "','Admin','" + ComboBoxIsOpen.getSelectedItem()+ "')";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"New Survey Created, Successfully!","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        // create an excel file
    try{
        String destinationFilePath = "C:/uploads/" + txtSurveyName.getText() + ".xls";
 
    // Create object of FileOutputStream
    FileOutputStream fout = new FileOutputStream(destinationFilePath);
     
    // Build the Excel File
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    HSSFWorkbook workBook = new HSSFWorkbook();
 
    // Create the spreadsheet
    HSSFSheet spreadSheet = workBook.createSheet("Hello_World");
     
    // Create the first row
    HSSFRow row = spreadSheet.createRow((short) 0);
     
    // Create the cells and write to the file
    HSSFCell cell;
     
    // Write Hello
    cell = row.createCell(0);
    cell.setCellValue(new HSSFRichTextString("Hello"));
     
    // Write World
    cell = row.createCell(1);
    cell.setCellValue(new HSSFRichTextString("World"));
     
    workBook.write(outputStream);
     
    outputStream.writeTo(fout);
    outputStream.close();
    fout.close();

       
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       
       
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            con=Connect.ConnectDB();

            String sql= "Update Surveys set SurveyName='"+ txtSurveyName.getText() + "',JobCode='" + txtJobCode.getText() + "',BenchmarkPosition='" + txtBenchmarkPosition.getText() + "',SurveyJobFamily='" + txtSurveyJobFamily.getText() + "',SurveyJobSubFamily='" + txtSurveyJobSubFamily.getText() + "',BenchmarkLevel='" + txtBenchmarkLevel.getText() + "',CreatedOn='" + txtCreationDate.getText() + "',ExpireOn='" + txtExpiryDate.getText() + "',IsOpen='" + ComboBoxIsOpen.getSelectedItem() + "' where SurveyID= " + txtSurveyID.getText() + "";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);
            }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Surveys where SurveyID = " + txtSurveyID.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();

            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
 this.hide();
 SurveyRecord frm= new SurveyRecord();
 frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void txtSurveyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurveyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurveyIDActionPerformed

    private void SurveyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurveyDetailsActionPerformed
        // TODO add your handling code here:
         //SurveyDetails s = new SurveyDetails(txtSurveyName.getText());
        //s.setVisible(true);
        //String numberStr = txtSurveyName.getText();
        //add(s, txtSurveyName.getText());
        
        
    }//GEN-LAST:event_SurveyDetailsActionPerformed

    private void SurveyDetails(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurveyDetails
        // TODO add your handling code here:
        //close();
        SurveyDetails s = new SurveyDetails();
        s.setVisible(true);
    }//GEN-LAST:event_SurveyDetails

    private void txtSurveyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurveyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurveyNameActionPerformed

    private void txtCreationDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCreationDateInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCreationDateInputMethodTextChanged

    private void txtCreationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreationDateActionPerformed
        // TODO add your handling code here:
        //txtCreationDate.setSize(10);
    }//GEN-LAST:event_txtCreationDateActionPerformed

    private void SurveyDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SurveyDetailsMouseClicked
        // TODO add your handling code here:
        String csurveyid = txtSurveyID.getText(); 
        String csurveyname = txtSurveyName.getText();
        
        
             SurveyDetails surveydetails=new SurveyDetails();
             surveydetails.setVisible(true);
            
             JLabel surveyid = new JLabel();
             surveyid.setBounds(60, 20, 140, 30);
             surveydetails.add(surveyid);
             surveyid.setText("Survey ID: " + csurveyid);
             surveyid.setOpaque(true);
             surveyid.setForeground(Color.black);
             //surveyid.setBackground(Color.green);
              //public String bbb; = surveyid.setText(csurveyid);
               JLabel surveyname = new JLabel();
               surveyname.setBounds(200, 20, 250, 30);
               surveydetails.add(surveyname);
               surveyname.setText("Survey Name: " + csurveyname);
               surveyname.setOpaque(true);
               surveyname.setForeground(Color.black);
               //surveyname.setBackground(Color.red);
               
               //firePropertyChange("textchange", "", txtSurveyName.getText()); 
              //SurveyDetails.surveyname(csurveyname);
               
               
    }//GEN-LAST:event_SurveyDetailsMouseClicked

    private void SurveyHeadersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SurveyHeadersMouseClicked
        // TODO add your handling code here:
         String csurveyid = txtSurveyID.getText(); 
         String csurveyname = txtSurveyName.getText();
        
        
        SurveyHeaders surveyheaders=new SurveyHeaders();
             surveyheaders.setVisible(true);
            
             JLabel surveyid = new JLabel();
             surveyid.setBounds(60, 20, 140, 30);
             surveyheaders.add(surveyid);
             surveyid.setText("Survey ID: " + csurveyid);
             surveyid.setOpaque(true);
             surveyid.setForeground(Color.black);
             //surveyid.setBackground(Color.green);
              
               JLabel surveyname = new JLabel();
               surveyname.setBounds(200, 20, 250, 30);
               surveyheaders.add(surveyname);
               surveyname.setText("Survey Name: " + csurveyname);
               surveyname.setOpaque(true);
               surveyname.setForeground(Color.black);
               //surveyname.setBackground(Color.red);
    }//GEN-LAST:event_SurveyHeadersMouseClicked

    private void SurveyDetailsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SurveyDetailsPropertyChange
        // TODO add your handling code here:
        //txtSurveyName.SurveyDetailsPropertyChange();
    }//GEN-LAST:event_SurveyDetailsPropertyChange

    private void SurveyHeadersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurveyHeadersActionPerformed
        // TODO add your handling code here:
        
       
        //String surveyname = txtSurveyName.getText();
        //txtSurveyName.surveyname(text); // when the button is pushed, field's text gets shoved into Frame1's label
      
    }//GEN-LAST:event_SurveyHeadersActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Survey().setVisible(true);
                new SurveyDetails();
            }
        });
    }
     public javax.swing.JLabel surveyid;
     public javax.swing.JLabel surveyname;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox ComboBoxIsOpen;
    public javax.swing.JButton SurveyDetails;
    public javax.swing.JButton SurveyHeaders;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    public java.awt.TextField textField3;
    public javax.swing.JTextField txtBenchmarkLevel;
    public javax.swing.JTextField txtBenchmarkPosition;
    public java.awt.TextField txtCreationDate;
    public java.awt.TextField txtExpiryDate;
    public javax.swing.JTextField txtJobCode;
    public javax.swing.JTextField txtSurveyID;
    public javax.swing.JTextField txtSurveyJobFamily;
    public javax.swing.JTextField txtSurveyJobSubFamily;
    public static javax.swing.JTextField txtSurveyName;
    // End of variables declaration//GEN-END:variables
}
