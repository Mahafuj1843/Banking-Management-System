
import com.placeholder.PlaceHolder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B.T. INSTITUTE
 */
public class Card extends javax.swing.JFrame {
     int hour,secound,minute,month,year,day;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    PlaceHolder p1;
    int counter = 3;
    public Card() {
        initComponents();
        con = connection.connected();
         //count();
         p1=new PlaceHolder(cardno,"Card No");
        p1=new PlaceHolder(pin,"Password");
        p1=new PlaceHolder(Amount,"Amount");
        p1=new PlaceHolder(Bkash,"Bkash No");
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
        jLabel2 = new javax.swing.JLabel();
        sent = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jCheckpin = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        cardno = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Bkash = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Card No #");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pin");

        sent.setBackground(new java.awt.Color(0, 204, 153));
        sent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sent.setText("Sent");
        sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("  JAVA BANK LIMITED");

        pin.setBackground(new java.awt.Color(0, 255, 0));
        pin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jCheckpin.setBackground(new java.awt.Color(0, 255, 0));
        jCheckpin.setText("Show Pin");
        jCheckpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckpinActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cardno.setBackground(new java.awt.Color(0, 255, 0));
        cardno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Amount");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bkash No");

        Amount.setBackground(new java.awt.Color(0, 255, 0));
        Amount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Bkash.setBackground(new java.awt.Color(0, 255, 0));
        Bkash.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2)
                                    .addComponent(pin)
                                    .addComponent(cardno)
                                    .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckpin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(sent, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4)
                                        .addComponent(Bkash)))))
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Bkash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckpin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sent)
                    .addComponent(jButton2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckpinActionPerformed
         if(jCheckpin.isSelected()){
            pin.setEchoChar((char)0);
            cardno.setEchoChar((char)0);
        }else{
            pin.setEchoChar('*');
            cardno.setEchoChar('#');
        }
    }//GEN-LAST:event_jCheckpinActionPerformed
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        start s = new start();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    public Boolean count(){
         try {
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");
             pst = con.prepareStatement("select * from balance where card_no = ? ");
             pst.setString(1, cardno.getText());
             rs=pst.executeQuery();
             if(rs.next()==true){
                 if("1".equals(rs.getString(8))){
                 return true;
             }
         }
             //String c = rs.getString("count");
         } catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
     }
    private void sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentActionPerformed
      
      if( count()==true){
        try {
                pst = con.prepareStatement("select * from balance where card_no = ? and pin_num = ? ");
                pst.setString(1, cardno.getText());
                 pst.setString(2, pin.getText());
                rs=pst.executeQuery();
                if(rs.next() == false)
                {
                    counter--;
            switch (counter) {
                case 1: 
                    JOptionPane.showMessageDialog(this, "Again give wrong password you card will be deactiveted","Warrning", JOptionPane.WARNING_MESSAGE);
                    break;
                case 0:
                    sent.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Now your card is deactiveted.Please contract the bank","Information", JOptionPane.INFORMATION_MESSAGE);
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");
                    pst=con.prepareStatement("update balance set count = ? where card_no = ?");
                    pst.setString(1, "0");
                    pst.setString(2, cardno.getText());
                    pst.executeUpdate();
                    pst=con.prepareStatement("select * from balance where card_no = ?");
                    pst.setString(1, cardno.getText());
                    rs=pst.executeQuery();
                    if(rs.next()){
                    javamail.sendmail(rs.getString("email"),"HI "+rs.getString("name")+"\n\nYour card has been deactivated.\nSomeone is trying to use your card.\nYou can contact the bank to active the card.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Incotrect Card no or Pin","Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
                }
                else{
                    int bal =Integer.parseInt (rs.getString(4));
                    String account_num = rs.getString(1);
                    String name = rs.getString(3);
                    String mail = rs.getString(5);
                    int num2 = Integer.parseInt(Amount.getText());
                    if(bal<num2){
                     JOptionPane.showMessageDialog(this, "Insufficient balance!!");
                    }else{
                     String sum = String.valueOf(bal - num2);
                      Class.forName("com.mysql.jdbc.Driver");
                      con=DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");
                      pst=con.prepareStatement("update balance set balance= ? where card_no= ?");
                      pst.setString(1, sum);
                      pst.setString(2, cardno.getText());
                      int k=pst.executeUpdate();
                      Management M = new Management();
                      M.Transection(account_num,name,"Card",Bkash.getText(),Amount.getText(),run());
                      if(k==1)
           {
               JOptionPane.showMessageDialog(this,"Succesfull sent!!");
               pst=con.prepareStatement("select * from balance where accNo= ?");
               pst.setString(1, account_num);
               javamail.sendmail(rs.getString("email"),"HI "+name+"\n\nAmount has been sent from your account to Bkash No. "+Bkash.getText()+"\n\n BDT. "+Amount.getText()+" Taka\n\n Your current balance Tk. "+sum);
               cardno.setText("");
               pin.setText("");
               Amount.setText("");
               Bkash.setText("");
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Error");
           }
                    }  
                }

            } catch (SQLException ex) {
                Logger.getLogger(ForgottenPasswrd.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
             Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
         }
       }else {
          sent.setEnabled(false);
          JOptionPane.showMessageDialog(this, "Your card is deactiveted.\nPlease contract the bank","Information", JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_sentActionPerformed

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
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField Bkash;
    private javax.swing.JPasswordField cardno;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckpin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField pin;
    private javax.swing.JButton sent;
    // End of variables declaration//GEN-END:variables
    public String run() {
         //To change body of generated methods, choose Tools | Templates.
         while(true){
             Calendar cal = Calendar.getInstance();
             
             SimpleDateFormat sdfdate = new SimpleDateFormat("dd-MM-yyyy");
             java.util.Date d1 = cal.getTime();
             return sdfdate.format(d1);
         }
    }
}
