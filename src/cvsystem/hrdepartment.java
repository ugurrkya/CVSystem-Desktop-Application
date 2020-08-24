/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvsystem;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Busra
 */
public class hrdepartment extends javax.swing.JFrame {

    /**
     * Creates new form hrdepartment
     */
    private login parentw;
     public hrdepartment (login parent ) {
         this.parentw = parent;
     
    }

    public hrdepartment(String hrcoming) {
        initComponents();
       hrid.setText(hrcoming);					//set text the coming data
       hrid.setVisible(true);						//make visible that data
        emppane.setVisible(false);					//hide the panel
   emptable.setVisible(false);						//hide the table
   cvpane.setVisible(false);						//hide the panel
   cvtable.setVisible(false);						//hide the table
       Connection cnn;								//identify connection
  Statement stt;									//identify statement
  ResultSet rst;									//identify result set

try
                        {
                            
                        hrimage.setText(hrcoming);		//take the data 
                            cnn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
                            stt = cnn.createStatement();
            rst = stt.executeQuery("SELECT * FROM `hrdept` WHERE `brandID` = '"+hrcoming+"'");			//retrieve all data from the database on the coming data
              
           
            while(rst.next()){
                
                byte[] imagee = rst.getBytes(4);			//identify a byte variable for the image of the HR department, put the image to page
				
				//create an image icon for put the image to page
            ImageIcon imageicon = new ImageIcon(new ImageIcon(imagee).getImage().getScaledInstance(hrimage.getWidth(), hrimage.getHeight(), Image.SCALE_DEFAULT));
            hrimage.setIcon(imageicon);			//put the image on to label
            cname.setText(rst.getString(2));		//put the company name to page
            cmail.setText(rst.getString(3));		//put the mail to page 
            cID.setText(rst.getString(1));			// put the company ID to page
            aboutme.setText(rst.getString(5));		//put the about me information to the page
           
            }
           
           
            
             }
                          catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     private hrdepartment () {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hrimage = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        seeemp = new javax.swing.JButton();
        seecvs = new javax.swing.JButton();
        emppane = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        cvpane = new javax.swing.JScrollPane();
        cvtable = new javax.swing.JTable();
        cmail = new javax.swing.JLabel();
        cID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutme = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
        entryid = new javax.swing.JTextField();
        poslabel = new javax.swing.JLabel();
        entrypos = new javax.swing.JTextField();
        yearlabel = new javax.swing.JLabel();
        entryyear = new javax.swing.JTextField();
        referancelabel = new javax.swing.JLabel();
        entryref = new javax.swing.JTextField();
        certlabel = new javax.swing.JLabel();
        entrycert = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        hrlogout = new javax.swing.JButton();
        hrback = new javax.swing.JLabel();
        hrid = new javax.swing.JLabel();
        employeeinfo = new javax.swing.JLabel();
        imageofemployee = new javax.swing.JLabel();
        empyname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("E-CV");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(hrimage);
        hrimage.setBounds(60, 30, 140, 130);

        cname.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(cname);
        cname.setBounds(210, 30, 140, 30);

        seeemp.setText("See Employees");
        seeemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeempActionPerformed(evt);
            }
        });
        getContentPane().add(seeemp);
        seeemp.setBounds(680, 20, 180, 23);

        seecvs.setText("See Employees's CV");
        seecvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seecvsActionPerformed(evt);
            }
        });
        getContentPane().add(seecvs);
        seecvs.setBounds(940, 20, 180, 23);

        emptable.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        emptable.setEnabled(false);
        emptable.setRowSelectionAllowed(false);
        emppane.setViewportView(emptable);

        getContentPane().add(emppane);
        emppane.setBounds(392, 50, 930, 300);

        cvtable.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        cvtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        cvpane.setViewportView(cvtable);

        getContentPane().add(cvpane);
        cvpane.setBounds(392, 50, 930, 300);

        cmail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(cmail);
        cmail.setBounds(210, 70, 210, 30);

        cID.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(cID);
        cID.setBounds(210, 110, 140, 30);

        aboutme.setEditable(false);
        aboutme.setBackground(new java.awt.Color(255, 0, 51));
        aboutme.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jScrollPane1.setViewportView(aboutme);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 320, 280, 270);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("ABOUT ME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 300, 150, 20);

        jPanel2.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("ADD INFORMATION");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 380, 150, 30);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        idlabel.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        idlabel.setText("ID:");
        idlabel.setPreferredSize(new java.awt.Dimension(38, 14));
        jPanel1.add(idlabel);

        entryid.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryid.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(entryid);

        poslabel.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        poslabel.setText("Position:");
        poslabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(poslabel);

        entrypos.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrypos.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(entrypos);

        yearlabel.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        yearlabel.setText("Year:");
        yearlabel.setPreferredSize(new java.awt.Dimension(39, 14));
        jPanel1.add(yearlabel);

        entryyear.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryyear.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(entryyear);

        referancelabel.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        referancelabel.setText("Referance:");
        jPanel1.add(referancelabel);

        entryref.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryref.setPreferredSize(new java.awt.Dimension(120, 20));
        entryref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryrefActionPerformed(evt);
            }
        });
        jPanel1.add(entryref);

        certlabel.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        certlabel.setText("Certificate:");
        jPanel1.add(certlabel);

        entrycert.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrycert.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(entrycert);

        addbutton.setText("Add Record");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(addbutton);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 410, 200, 180);

        hrlogout.setBackground(new java.awt.Color(255, 0, 51));
        hrlogout.setText("LOGOUT");
        hrlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(hrlogout);
        hrlogout.setBounds(1220, 650, 110, 30);

        hrback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvsystem/IMG-20171215-WA0083.jpg"))); // NOI18N
        getContentPane().add(hrback);
        hrback.setBounds(0, -2, 1366, 770);
        getContentPane().add(hrid);
        hrid.setBounds(200, 90, 160, 50);
        getContentPane().add(employeeinfo);
        employeeinfo.setBounds(560, 220, 0, 0);

        imageofemployee.setText("jLabel3");
        getContentPane().add(imageofemployee);
        imageofemployee.setBounds(640, 260, 34, 14);

        empyname.setText("jLabel3");
        getContentPane().add(empyname);
        empyname.setBounds(740, 310, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
       hrback.setSize(this.getSize());		//set label size with the frame size
    }//GEN-LAST:event_formComponentResized

    private void entryrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryrefActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
     Connection connn;			//identify connection
  Statement srt;				//identify the statement
  ResultSet rse;				//identify the result
try							
                        {
                            
                        String info=entryid.getText();	//get the text from hr department entring	
                            connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
                            srt = connn.createStatement();
							
							//retrieve all data from members table on the info entrying
            rse = srt.executeQuery("SELECT `memberID`,`memberfullname`,`memberimage` FROM `members` WHERE `memberID` = '"+info+"'");
              
           
            while(rse.next()){		//while statement
                
            employeeinfo.setText(rse.getString(1));			//set the employee ID
            empyname.setText(rse.getString(2));				//set the employee name
              byte[] img = rse.getBytes(3);					//set the employee image		
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(imageofemployee.getWidth(), imageofemployee.getHeight(), Image.SCALE_DEFAULT));
            imageofemployee.setIcon(imageIcon);					//create an image icon for displaying the image
 
          }
           
           
            
             }
                          catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
Connection cont;					//identify connection
	
 PreparedStatement prs;					//identify statement
try
                        {
                            
                        
                       Icon imgicon=imageofemployee.getIcon();		//create an icon with getting the image icon from employee info
                        
                            cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
							
							//the sql statement for adding the CV of employees
                            String adding="INSERT INTO `members_info` (`memberID`, `memberfullname`, `brandname`, `position`, `year`, `referance`, `certificate`,`memberimage`) VALUES(?,?,?,?,?,?,?,'"+imgicon+"')";
              
           prs = cont.prepareStatement(adding);			//create a statement with the adding variable
        prs.setString(1,employeeinfo.getText());			//set the member ID
         prs.setString(2,empyname.getText());				//set the member name
           
       prs.setString(3,cname.getText());					//set the company name
         prs.setString(4,entrypos.getText());				//set the position
         prs.setString(5,entryyear.getText());				//set the year
          prs.setString(6,entryref.getText());				//set the referance
           prs.setString(7,entrycert.getText());			//set the certificate
		   
          
            
           prs.executeUpdate();						//execute the statement
         
           
           
           
            
             JOptionPane.showMessageDialog(null, "Record Added!");		//if the statement is successful, display the message
                
        } catch(HeadlessException | SQLException ex){
             JOptionPane.showMessageDialog(null, "Record not Inserted");		//if the statement is not successful, display the message
        }

    
        



    }//GEN-LAST:event_addbuttonActionPerformed

    private void seeempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeempActionPerformed
     try {
              //connection and statement informations 
        Connection conct = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        Statement st = (Statement) conct.createStatement();
		
				//try the result set with the SQL statement and execute the statement
        try(ResultSet rs = st.executeQuery("SELECT `memberID`,`memberfullname`,`education`,`qualification` ,`wexperience`,`age`,`e-mail` FROM `members` ") ) { 
            int counter = rs.getMetaData().getColumnCount(); 	//count the column numbers from the database
            DefaultTableModel tm = new DefaultTableModel();			//create a default table model
			
            for(int i = 1;i<=counter;i++)			//the for loop
			
                tm.addColumn(rs.getMetaData().getColumnName(i)); 		//add columns from coming the database
            while(rs.next())			//while statement
                {
   
                    Object[] row = new Object[counter];			//identify the rows according to counter
                    for(int i=1;i<=counter;i++)					//start the loop for the counter
                        row[i-1] = rs.getObject(i);			//put the objects to the columns
                                     
            
                        
                    tm.addRow(row);					//add the rows according to columns
                }
            emptable.setModel(tm);				//set model the employee panel
        }
        conct.close();				//close the connection
    } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
    }
     emppane.setVisible(true);		//make visible the employee panel
   emptable.setVisible(true);		//make visible the employee table
   cvpane.setVisible(false);			//hide that
   cvtable.setVisible(false);			//hide that
          
    }//GEN-LAST:event_seeempActionPerformed

    private void seecvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seecvsActionPerformed
        try {
               //connection and statement informations 
        Connection conct = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        Statement st = (Statement) conct.createStatement();
        //try the result set with the SQL statement and execute the statement
		try(ResultSet rs = st.executeQuery("SELECT `memberID`,`memberfullname`,`brandname`,`position`, `year`,`referance`, `certificate` FROM `members_info` ") ) { 
            int counter = rs.getMetaData().getColumnCount(); //count the column numbers from the database
            DefaultTableModel tm = new DefaultTableModel();		//create a default table model
            for(int i = 1;i<=counter;i++)				//the for loop
                tm.addColumn(rs.getMetaData().getColumnName(i)); //add columns from coming the database
            while(rs.next())										//while statement
                {
   
                    Object[] row = new Object[counter];			//identify the rows according to counter
                    for(int i=1;i<=counter;i++)					//start the loop for the counter
                        row[i-1] = rs.getObject(i);				//put the objects to the columns
                                     
            
                        
                    tm.addRow(row);								//add the rows according to columns
                }
           cvtable.setModel(tm);							//set model the employee panel
        }
        conct.close();									//close the connection
    } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
    }
     emppane.setVisible(false);						//hide that
   emptable.setVisible(false);						//hide that	
   cvpane.setVisible(true);							//make visible the cv panel
   cvtable.setVisible(true);						//make visible the cv table
    }//GEN-LAST:event_seecvsActionPerformed

    private void hrlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrlogoutActionPerformed
       dispose();							//close the current page
       new login().setVisible(true);		//open the login page
    }//GEN-LAST:event_hrlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(hrdepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrdepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrdepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrdepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrdepartment().setVisible(true);			//the current page
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane aboutme;
    private javax.swing.JButton addbutton;
    private javax.swing.JLabel cID;
    private javax.swing.JLabel certlabel;
    private javax.swing.JLabel cmail;
    private javax.swing.JLabel cname;
    private javax.swing.JScrollPane cvpane;
    private javax.swing.JTable cvtable;
    private javax.swing.JLabel employeeinfo;
    private javax.swing.JScrollPane emppane;
    private javax.swing.JTable emptable;
    private javax.swing.JLabel empyname;
    private javax.swing.JTextField entrycert;
    private javax.swing.JTextField entryid;
    private javax.swing.JTextField entrypos;
    private javax.swing.JTextField entryref;
    private javax.swing.JTextField entryyear;
    private javax.swing.JLabel hrback;
    private javax.swing.JLabel hrid;
    private javax.swing.JLabel hrimage;
    private javax.swing.JButton hrlogout;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel imageofemployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel poslabel;
    private javax.swing.JLabel referancelabel;
    private javax.swing.JButton seecvs;
    private javax.swing.JButton seeemp;
    private javax.swing.JLabel yearlabel;
    // End of variables declaration//GEN-END:variables
}
