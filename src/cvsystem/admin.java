/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvsystem;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Busra
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
      String s;				//identify the directory 
   private login parentw;		//identify parent
     public admin (login parent ) {
         this.parentw = parent;
     initComponents();
     addemppane.setVisible(false);			//hide that
     addhrpane.setVisible(false);			//hide that
      hrpane.setVisible(false);				//hide that
   hrtable.setVisible(false);			//hide that
    emppane.setVisible(false);				//hide that
   emptable.setVisible(false);					//hide that
   
    }

    public admin() {
        initComponents();
        
        
    }
    
    public ImageIcon ResizeImage(String imgPath){			//the method for resizing image
        ImageIcon MyImage = new ImageIcon(imgPath);			//create an image icon
        Image img = MyImage.getImage();					//define the image with getting from MyImage
        Image newImage = img.getScaledInstance(imagelabel.getWidth(), imagelabel.getHeight(),Image.SCALE_SMOOTH);	//the default statement
        ImageIcon image = new ImageIcon(newImage);			//create the image by image icon
        return image;
    }
    public ImageIcon ResizeImagee(String imgPathh){			//the method for resizing image
        ImageIcon MyImagee = new ImageIcon(imgPathh);		//create an image icon
        Image imgg = MyImagee.getImage();					//define the image with getting from MyImage
        Image newwImage = imgg.getScaledInstance(brandimagelabel.getWidth(), brandimagelabel.getHeight(),Image.SCALE_SMOOTH);		//the default statement
        ImageIcon imagee = new ImageIcon(newwImage);		//create the image by image icon
        return imagee;
    }

    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emppane = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        hrpane = new javax.swing.JScrollPane();
        hrtable = new javax.swing.JTable();
        empbutton = new javax.swing.JButton();
        addemppane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entryid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entrypass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entryname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entryedu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        browsebutton = new javax.swing.JButton();
        imagelabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        entryqual = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        entryexp = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        entryage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        entrymail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        entrygender = new javax.swing.JTextField();
        addemp = new javax.swing.JButton();
        hrbutton = new javax.swing.JButton();
        newempadd = new javax.swing.JButton();
        newhradd = new javax.swing.JButton();
        addhrpane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        entrybrandid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        entrybrandname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        entrybrandpass = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        entrybrandmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hrbrowse = new javax.swing.JButton();
        brandimagelabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrydescr = new javax.swing.JTextArea();
        addhr = new javax.swing.JButton();
        adminlogout = new javax.swing.JButton();
        adminback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("E-CV");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        emptable.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        emptable.setEnabled(false);
        emppane.setViewportView(emptable);

        getContentPane().add(emppane);
        emppane.setBounds(500, 50, 830, 402);

        hrtable.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        hrtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        hrtable.setEnabled(false);
        hrpane.setViewportView(hrtable);

        getContentPane().add(hrpane);
        hrpane.setBounds(500, 50, 830, 402);

        empbutton.setText("See Employees");
        empbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(empbutton);
        empbutton.setBounds(740, 20, 190, 23);

        jLabel1.setText("ID:");
        jLabel1.setPreferredSize(new java.awt.Dimension(46, 14));
        addemppane.add(jLabel1);

        entryid.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryid.setPreferredSize(new java.awt.Dimension(120, 20));
        addemppane.add(entryid);

        jLabel2.setText("Password:");
        addemppane.add(jLabel2);

        entrypass.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrypass.setPreferredSize(new java.awt.Dimension(120, 20));
        addemppane.add(entrypass);

        jLabel3.setText("Full Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 14));
        addemppane.add(jLabel3);

        entryname.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryname.setPreferredSize(new java.awt.Dimension(120, 20));
        addemppane.add(entryname);

        jLabel4.setText("Education:");
        jLabel4.setMinimumSize(new java.awt.Dimension(14, 14));
        jLabel4.setName(""); // NOI18N
        addemppane.add(jLabel4);

        entryedu.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryedu.setPreferredSize(new java.awt.Dimension(140, 20));
        addemppane.add(entryedu);

        jLabel5.setText("Image:");
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 14));
        addemppane.add(jLabel5);

        browsebutton.setText("Browse");
        browsebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebuttonActionPerformed(evt);
            }
        });
        addemppane.add(browsebutton);

        imagelabel.setPreferredSize(new java.awt.Dimension(120, 60));
        addemppane.add(imagelabel);

        jLabel6.setText("Qualifications");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(75, 14));
        addemppane.add(jLabel6);

        entryqual.setColumns(14);
        entryqual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        entryqual.setLineWrap(true);
        entryqual.setRows(7);
        entryqual.setTabSize(10);
        entryqual.setWrapStyleWord(true);
        jScrollPane3.setViewportView(entryqual);

        addemppane.add(jScrollPane3);

        jLabel7.setText("Experiences");
        jLabel7.setPreferredSize(new java.awt.Dimension(75, 14));
        addemppane.add(jLabel7);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 83));

        entryexp.setColumns(20);
        entryexp.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        entryexp.setLineWrap(true);
        entryexp.setRows(20);
        entryexp.setTabSize(10);
        entryexp.setWrapStyleWord(true);
        jScrollPane2.setViewportView(entryexp);

        addemppane.add(jScrollPane2);

        jLabel8.setText("            Age:");
        jLabel8.setPreferredSize(new java.awt.Dimension(70, 14));
        addemppane.add(jLabel8);

        entryage.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entryage.setPreferredSize(new java.awt.Dimension(40, 20));
        addemppane.add(entryage);

        jLabel9.setText("E-mail:");
        jLabel9.setPreferredSize(new java.awt.Dimension(52, 14));
        addemppane.add(jLabel9);

        entrymail.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrymail.setPreferredSize(new java.awt.Dimension(90, 20));
        addemppane.add(entrymail);

        jLabel10.setText("Gender:");
        addemppane.add(jLabel10);

        entrygender.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrygender.setPreferredSize(new java.awt.Dimension(70, 20));
        addemppane.add(entrygender);

        addemp.setText("ADD EMPLOYEE");
        addemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addempActionPerformed(evt);
            }
        });
        addemppane.add(addemp);

        getContentPane().add(addemppane);
        addemppane.setBounds(20, 40, 170, 640);

        hrbutton.setText("See HR Departments");
        hrbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(hrbutton);
        hrbutton.setBounds(1020, 20, 220, 23);

        newempadd.setText("Add New Employee");
        newempadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newempaddActionPerformed(evt);
            }
        });
        getContentPane().add(newempadd);
        newempadd.setBounds(20, 10, 140, 23);

        newhradd.setText("Add New HR Department");
        newhradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newhraddActionPerformed(evt);
            }
        });
        getContentPane().add(newhradd);
        newhradd.setBounds(270, 10, 160, 23);

        jLabel11.setText("Brand ID:");
        addhrpane.add(jLabel11);

        entrybrandid.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrybrandid.setPreferredSize(new java.awt.Dimension(120, 20));
        addhrpane.add(entrybrandid);

        jLabel15.setText("Brand Name:");
        addhrpane.add(jLabel15);

        entrybrandname.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrybrandname.setPreferredSize(new java.awt.Dimension(100, 20));
        addhrpane.add(entrybrandname);

        jLabel12.setText("Password:");
        addhrpane.add(jLabel12);

        entrybrandpass.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrybrandpass.setPreferredSize(new java.awt.Dimension(120, 20));
        addhrpane.add(entrybrandpass);

        jLabel13.setText("E-mail:");
        jLabel13.setPreferredSize(new java.awt.Dimension(47, 14));
        addhrpane.add(jLabel13);

        entrybrandmail.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrybrandmail.setMinimumSize(new java.awt.Dimension(120, 20));
        entrybrandmail.setPreferredSize(new java.awt.Dimension(120, 20));
        addhrpane.add(entrybrandmail);

        jLabel14.setText("Image:");
        addhrpane.add(jLabel14);

        hrbrowse.setText("Browse");
        hrbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrbrowseActionPerformed(evt);
            }
        });
        addhrpane.add(hrbrowse);

        brandimagelabel.setPreferredSize(new java.awt.Dimension(120, 60));
        addhrpane.add(brandimagelabel);

        jLabel16.setText("         Description:");
        jLabel16.setPreferredSize(new java.awt.Dimension(140, 14));
        addhrpane.add(jLabel16);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(120, 150));

        entrydescr.setColumns(14);
        entrydescr.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        entrydescr.setRows(7);
        entrydescr.setTabSize(10);
        entrydescr.setPreferredSize(new java.awt.Dimension(105, 150));
        jScrollPane1.setViewportView(entrydescr);

        addhrpane.add(jScrollPane1);

        addhr.setText("ADD HR DEPARTMENT");
        addhr.setPreferredSize(new java.awt.Dimension(139, 40));
        addhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhrActionPerformed(evt);
            }
        });
        addhrpane.add(addhr);

        getContentPane().add(addhrpane);
        addhrpane.setBounds(270, 40, 190, 430);

        adminlogout.setBackground(new java.awt.Color(255, 0, 51));
        adminlogout.setText("LOGOUT");
        adminlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(adminlogout);
        adminlogout.setBounds(1190, 640, 120, 30);

        adminback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvsystem/IMG-20171215-WA0008.jpg"))); // NOI18N
        getContentPane().add(adminback);
        adminback.setBounds(0, -2, 1366, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    adminback.setSize(this.getSize());
    }//GEN-LAST:event_formComponentResized

    private void browsebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebuttonActionPerformed
       JFileChooser fileChooser = new JFileChooser();		//create a new FileChooser structure for the image choice
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));			//set current directory
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");		//set current filters
		 
         fileChooser.addChoosableFileFilter(filter);			//add the file with its filters from file
         int result = fileChooser.showSaveDialog(null);			//save the image 
         if(result == JFileChooser.APPROVE_OPTION){			//if the approve the image
             File selectedFile = fileChooser.getSelectedFile();			//the selected file is identified as getting method
             String path = selectedFile.getAbsolutePath();					//identify the selected file and define the path
             imagelabel.setIcon(ResizeImage(path));						//set Icon from the file to page
            s=path;												//identify the file directory as path
              }
         else if(result == JFileChooser.CANCEL_OPTION){					// if the not choose the image
             JOptionPane.showMessageDialog(null, "No data");			//display the message
         }

    }//GEN-LAST:event_browsebuttonActionPerformed

    private void addempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addempActionPerformed
			//try the sql statement and set the texts
	  try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        PreparedStatement ps = con.prepareStatement("INSERT INTO `members`(`memberID`,`memberpass`,`memberfullname`,`memberimage`,`education`,`qualification`,`wexperience`,`age`,`e-mail`,`gender`) VALUES(?,?,?,?,?,?,?,?,?,?)");
          InputStream is = new FileInputStream(new File(s));		//identify the InputStream method

          
               ps.setString(1, entryid.getText());			//set the id
               ps.setString(2, entrypass.getText());		//set the pass
               ps.setString(3, entryname.getText());		//set the name
               ps.setBlob(4, is);							//set the image
               
               ps.setString(5, entryedu.getText());			//set the education
               ps.setString(6, entryqual.getText());			//set the qualification
               ps.setString(7, entryexp.getText());			//set the experience
               ps.setString(8, entryage.getText());			//set the age
               ps.setString(9, entrymail.getText());			//set the mail
               ps.setString(10, entrygender.getText());		//set the gender
               ps.executeUpdate();						//execute the statement
               JOptionPane.showMessageDialog(null, "Data Inserted");			//display the message if it is successful
           }catch(HeadlessException | SQLException ex){
             JOptionPane.showMessageDialog(null, "Data not Inserted");		//display the message if it is not done
           } catch (FileNotFoundException ex) {
              Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
          }

    }//GEN-LAST:event_addempActionPerformed

    private void newempaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newempaddActionPerformed
       addemppane.setVisible(true);			//make visible add employee panel
        
     addhrpane.setVisible(false);			//hide that
    }//GEN-LAST:event_newempaddActionPerformed

    private void hrbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrbrowseActionPerformed
       JFileChooser fileChooser = new JFileChooser();          //create a new FileChooser structure for the image choice
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));    //set current directory
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");      //set current filters
         fileChooser.addChoosableFileFilter(filter);          //add the file with its filters from file
         int result = fileChooser.showSaveDialog(null);         //save the image 
         if(result == JFileChooser.APPROVE_OPTION){             //if the approve the image
             File selectedFile = fileChooser.getSelectedFile();       //the selected file is identified as getting method
             String pathh = selectedFile.getAbsolutePath();          	//identify the selected file and define the path
             brandimagelabel.setIcon(ResizeImagee(pathh));                     	//set Icon from the file to page
            s=pathh;
              }
        else if(result == JFileChooser.CANCEL_OPTION){					// if the not choose the image
             JOptionPane.showMessageDialog(null, "No data");			//display the message
         }
    }//GEN-LAST:event_hrbrowseActionPerformed

    private void addhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhrActionPerformed
			//try the statement and set the texts
	  try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        PreparedStatement ps = con.prepareStatement("INSERT INTO `hrdept`(`brandID`,`brandname`,`e-mail`,`brandimage`,`description`,`brandpass`) VALUES(?,?,?,?,?,?)");
          InputStream is = new FileInputStream(new File(s));		//identify the InputStream for the  image

          
               ps.setString(1, entrybrandid.getText());		//set the brand id
               ps.setString(2, entrybrandname.getText());		//set the brand name
               ps.setString(3, entrybrandmail.getText());		//set the brand e-mail
               ps.setBlob(4, is);								//set the image
               
               ps.setString(5, entrydescr.getText());				//set the description
               ps.setString(6, entrybrandpass.getText());			//set the brand pass
               
               ps.executeUpdate();									//execute the statement
               JOptionPane.showMessageDialog(null, "Data Inserted");		//display the message if it successful
           }catch(HeadlessException | SQLException ex){
             JOptionPane.showMessageDialog(null, "Data not Inserted");			//display the message if it is not done
           } catch (FileNotFoundException ex) {
              Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_addhrActionPerformed

    private void newhraddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newhraddActionPerformed
        addemppane.setVisible(false);				//hide that
     addhrpane.setVisible(true);					//make visible the add hr panel
    }//GEN-LAST:event_newhraddActionPerformed

    private void hrbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrbuttonActionPerformed
        try {
               //connection and statement informations 
        Connection conct = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        Statement st = (Statement) conct.createStatement();
       
		//try the result set with the SQL statement and execute the statement
	   try(ResultSet rs = st.executeQuery("SELECT `brandID`,`brandname`,`e-mail`,`description`,`brandpass` FROM `hrdept` ") ) { 
            int counter = rs.getMetaData().getColumnCount(); 	//count the column numbers from the database
            DefaultTableModel tm = new DefaultTableModel();			//create a default table model
            for(int i = 1;i<=counter;i++)		//the for loop
                tm.addColumn(rs.getMetaData().getColumnName(i)); 		//add columns from coming the database
            while(rs.next())											//while statement
                {
   
                  Object[] row = new Object[counter];			//identify the rows according to counter
                    for(int i=1;i<=counter;i++)					//start the loop for the counter
                        row[i-1] = rs.getObject(i);			//put the objects to the columns
            
                        
                    tm.addRow(row);					//add the rows according to columns
                }
            hrtable.setModel(tm);					//set the model
        }
        conct.close();							//close the connection
    } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
    }
     hrpane.setVisible(true);			//make visible the hr panel
   hrtable.setVisible(true);			//make visible the hr table
   emppane.setVisible(false);			//hide that
   emptable.setVisible(false);			//hide that
  
    }//GEN-LAST:event_hrbuttonActionPerformed

    private void empbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbuttonActionPerformed
       try {
              //connection and statement informations 
        Connection conct = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvsystem?useUnicode=true&characterEncoding=UTF-8", "busra", "0987");
        Statement st = (Statement) conct.createStatement();
			//try the result set with the SQL statement and execute the statement
	  try(ResultSet rs = st.executeQuery("SELECT `memberID`,`memberpass`,`memberfullname`,`education`,`qualification`,`wexperience`,`age`,`e-mail`,`gender` FROM `members` ") ) { 
            int counter = rs.getMetaData().getColumnCount(); 	//count the column numbers from the database
            DefaultTableModel tm = new DefaultTableModel();		//create a default table model
            for(int i = 1;i<=counter;i++)			//the for loop
                tm.addColumn(rs.getMetaData().getColumnName(i));		//add columns from coming the database
            while(rs.next())				//while statement
                {
					Object[] row = new Object[counter];			//identify the rows according to counter
                    for(int i=1;i<=counter;i++)					//start the loop for the counter
                        row[i-1] = rs.getObject(i);			//put the objects to the columns
                                     
                                     
            
                        
                    tm.addRow(row);							//add the rows according to columns
                }
            emptable.setModel(tm);								//set model the employee panel
        }
        conct.close();								//close the connection
    } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
    }
     hrpane.setVisible(false);			//hide that
   hrtable.setVisible(false);				//hide that 
   emppane.setVisible(true);		//make visible the employee panel
   emptable.setVisible(true);			//make visible the employee table
    }//GEN-LAST:event_empbuttonActionPerformed

    private void adminlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminlogoutActionPerformed
         dispose();				//close the current page
            new login().setVisible(true);			//open the login page again
    }//GEN-LAST:event_adminlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);			//the current page 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemp;
    private javax.swing.JPanel addemppane;
    private javax.swing.JButton addhr;
    private javax.swing.JPanel addhrpane;
    private javax.swing.JLabel adminback;
    private javax.swing.JButton adminlogout;
    private javax.swing.JLabel brandimagelabel;
    private javax.swing.JButton browsebutton;
    private javax.swing.JButton empbutton;
    private javax.swing.JScrollPane emppane;
    private javax.swing.JTable emptable;
    private javax.swing.JTextField entryage;
    private javax.swing.JTextField entrybrandid;
    private javax.swing.JTextField entrybrandmail;
    private javax.swing.JTextField entrybrandname;
    private javax.swing.JTextField entrybrandpass;
    private javax.swing.JTextArea entrydescr;
    private javax.swing.JTextField entryedu;
    private javax.swing.JTextArea entryexp;
    private javax.swing.JTextField entrygender;
    private javax.swing.JTextField entryid;
    private javax.swing.JTextField entrymail;
    private javax.swing.JTextField entryname;
    private javax.swing.JTextField entrypass;
    private javax.swing.JTextArea entryqual;
    private javax.swing.JButton hrbrowse;
    private javax.swing.JButton hrbutton;
    private javax.swing.JScrollPane hrpane;
    private javax.swing.JTable hrtable;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newempadd;
    private javax.swing.JButton newhradd;
    // End of variables declaration//GEN-END:variables
}
