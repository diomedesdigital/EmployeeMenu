

package employeemenu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainMenu extends javax.swing.JFrame {


    public MainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEmp = new javax.swing.JButton();
        punchEmployee = new javax.swing.JButton();
        empReport = new javax.swing.JButton();
        exitMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEmp.setText("Add New Employee");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });

        punchEmployee.setText("Punch In/Out");
        punchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punchEmployeeActionPerformed(evt);
            }
        });

        empReport.setText("Report");
        empReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empReportActionPerformed(evt);
            }
        });

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Press a Button to proceed, or press Exit to end program. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmp)
                    .addComponent(empReport))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(punchEmployee)
                    .addComponent(exitMenu))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmp)
                    .addComponent(punchEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitMenu)
                    .addComponent(empReport))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Exit Button Code
    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
         System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed
// Report Button Code
    private void empReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empReportActionPerformed
           {
        
        Scanner sc = new Scanner(System.in);
        String choice = "";
       
        {        
        
    System.out.println("Welcome to the Report Screen");
    System.out.println();
    System.out.println("Enter I to see individual employee report or press A to see all employees report: ");
    choice = sc.next();
    
        if (choice.equalsIgnoreCase("I"))
            {
            System.out.println("This is the Individual Employee Report");
            System.out.println("Enter your ID Number: ");
            choice = sc.next(); 
            
            //Display Text File
        String fileName = "/users/XXXX/desktop/filename.txt";

        String line = null;

        try {

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }	

            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) 
        {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");				
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }					
            System.out.println();            
            System.out.println("Do you want to continue (y/n (Press N to return to Main Menu)): " );
            choice = sc.next();
            System.out.println();
            }
        else if (choice.equalsIgnoreCase("A"))
            {
            System.out.println("This is the All Employee report");
            System.out.println();
                       //Display Text File
        String fileName = "/users/XXXX/desktop/filename.txt";

        String line = null;

        try {

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }	

            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) 
        {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");				
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }					
            System.out.println("Do you want to continue (y/n (Press N to return to Main Menu)):" );
            choice = sc.next();
            System.out.println();
            }
        else
             {
                System.out.println("Error! Try Again");
                System.out.println();    
        
            }
        }
    }
    }//GEN-LAST:event_empReportActionPerformed
// Punch In/Out Code
    private void punchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punchEmployeeActionPerformed
        {
 
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
    // Enter Employee ID    
    System.out.println("Enter your Employee ID: ");
    int empId = sc.nextInt();
    System.out.println();
        
        
        do
        {          
                  System.out.println("Press 'I' to Punch In or Press 'O' to Punch Out: ");  
                  choice = sc.next();
               
                  
                  if (choice.equalsIgnoreCase("I"))
                  {
                      PrintWriter out = null;
                      try {
                          System.out.println();
                          System.out.println("Employee " + empId + " you are punching in at: ");
                          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                          //get current date time with Date()
                          Date date = new Date();
                          System.out.println(dateFormat.format(date));
                          System.out.println();
                          out = new PrintWriter(
                                  new BufferedWriter(
                                          new FileWriter("/users/XXXX/desktop/filename.txt", true)));
                          out.print("\nYou punched in at: " + dateFormat.format(date));
                          out.close();
                          break;                       
                      } catch (IOException ex) {
                          Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                      } finally {
                          out.close();
                      }
                      
                  }
                  else if (choice.equalsIgnoreCase("O"))
                  {
                      PrintWriter out = null;
                      try {
                          System.out.println("Employee " + empId + " you are punching out at: ");
                          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                          //get current date time with Date()
                          Date date = new Date();
                          System.out.println(dateFormat.format(date));
                          System.out.println();
                          out = new PrintWriter(
                                  new BufferedWriter(
                                          new FileWriter("/users/XXXXX/desktop/filename.txt", true)));
                          out.print("\nYou punched out at: " + dateFormat.format(date));
                          out.close();                       
                          break;
                      } catch (IOException ex) {
                          Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                      } finally {
                          out.close();
                      }
                    
                  }
                  else
                  {
                      System.out.println("Try Again! ");
                      System.out.println();
                  }
               
        }
        while (!choice.equalsIgnoreCase("n"));
    }
    }//GEN-LAST:event_punchEmployeeActionPerformed
//Add Employee Code
    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
    {
        // Loop within loop
       Scanner sc = new Scanner(System.in);  
       String choice = "y";  
       
      do
       {                  
       // Variables
        String firstName = "First Name";
        String lastName = "Last Name";
                
        System.out.println("Welcome to Add Employe Screen");
        System.out.println();
        
// First Name
        System.out.print("Type in First Name: ");
        if (sc.hasNext())
        {
        firstName = sc.next();
        }
        else 
        {
            sc.nextLine();
            System.out.println("Error! Please do not enter numerical values! Try again");
            continue; 
        }
                
        System.out.print("Type in Last Name: ");  
        if (sc.hasNext())
        {
        lastName = sc.next();    
        }
        else
        {
         sc.nextLine();
         System.out.println("Error! Please do not enter numerical values! Try again");
         continue;          
        }
        System.out.println();
        
        // Full Name 
        System.out.print(firstName + " " + lastName);
        System.out.println();
        
        //Add ID Number
        int idNumber = 0;
        for (int i = 1; i > idNumber; i++)
        {
        
        idNumber = i + 1;
        System.out.println("Your Id Number is: " + idNumber);
        System.out.println();
        
                {
		try {
 
			String content = "Your name is: " + firstName + " " + lastName +  " \nYour ID Number is: " +idNumber+  "\nYour Employee Records are below:";
 
			File file = new File("/users/XXXX/desktop/filename.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
        
        }
        System.out.println("Enter another Employee's name (y/n)");
        choice= sc.next();
        System.out.println();
        }
        while (!choice.equalsIgnoreCase("n")); 
     }
    }//GEN-LAST:event_addEmpActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp;
    private javax.swing.JButton empReport;
    private javax.swing.JButton exitMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton punchEmployee;
    // End of variables declaration//GEN-END:variables
}
