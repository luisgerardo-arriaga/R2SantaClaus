
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SanatVreno extends javax.swing.JFrame {
 
   
    int renos = 0, duende = 0, aux = 0;
    
    SantaD sanD = new SantaD();
    SantayR sanyR = new SantayR();
    public SanatVreno() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pReno = new javax.swing.JPanel();
        lReno = new javax.swing.JLabel();
        btReno = new javax.swing.JButton();
        txReno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pReno.setBackground(new java.awt.Color(255, 0, 0));
        pReno.setForeground(new java.awt.Color(255, 0, 0));

        lReno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reno2.jpg"))); // NOI18N

        btReno.setBackground(new java.awt.Color(0, 153, 0));
        btReno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btReno.setForeground(new java.awt.Color(255, 255, 255));
        btReno.setText("Reno++");
        btReno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRenoActionPerformed(evt);
            }
        });

        txReno.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txReno.setForeground(new java.awt.Color(255, 255, 255));
        txReno.setText("Reno #0");

        javax.swing.GroupLayout pRenoLayout = new javax.swing.GroupLayout(pReno);
        pReno.setLayout(pRenoLayout);
        pRenoLayout.setHorizontalGroup(
            pRenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRenoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lReno))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRenoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txReno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btReno)
                .addGap(25, 25, 25))
        );
        pRenoLayout.setVerticalGroup(
            pRenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRenoLayout.createSequentialGroup()
                .addComponent(lReno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pRenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReno)
                    .addComponent(txReno))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pReno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pReno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRenoActionPerformed
     
        if(duende >= 3){
            aux = duende + 1;
            duende = 0;
        }
        if(renos <=6 && duendes(aux)){
            if(duendes(aux)){

                renos++;
                txReno.setText("Reno # " + Integer.toString(renos));

                if(renos(duendes(aux), renos)){
                    
                    try {
                        sanD.setVisible(false);
                        sanyR.setVisible(true);
                        sleep(1500);
                    } 
                    catch (InterruptedException ex) {
                        Logger.getLogger(SanatVreno.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    sanD.setVisible(true);
                    sanyR.setVisible(false);
                    txReno.setText("Reno # " + 0);
                }            
            }
        }
    }//GEN-LAST:event_btRenoActionPerformed

    
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
            java.util.logging.Logger.getLogger(SanatVreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanatVreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanatVreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanatVreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanatVreno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReno;
    private javax.swing.JLabel lReno;
    private javax.swing.JPanel pReno;
    private javax.swing.JLabel txReno;
    // End of variables declaration//GEN-END:variables
public static boolean renos(boolean duendes, int renos){
    
    boolean renosB = false;
    
    if(duendes){
        if(renos >= 7){
            renosB = true;
        }
    }
    return renosB;
}  
public static boolean duendes(int duendes){
    
    boolean duenB = false;
    if(duendes == 0){
        duenB = false;
    }
    if(duendes >= 3){
        duenB = true;
    }
    return duenB;
}   
}
