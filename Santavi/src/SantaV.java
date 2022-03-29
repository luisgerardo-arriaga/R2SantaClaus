
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SantaV extends javax.swing.JFrame {

    
    int duende = 0, renos = 0;
    Thread hilo;
    
    SanatVreno sanR = new SanatVreno();
    SantaD sanD = new SantaD();
    SantayD sanyD = new SantayD();
    
    hilos h = new hilos();
    
    public SantaV() {
        initComponents();
        sanD.setVisible(true);
        sanR.setVisible(true);
        //sanR.setVisible(true);
        //sanyD.setVisible(true);  
        
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paDu = new javax.swing.JPanel();
        addDuende = new javax.swing.JButton();
        imgDu = new javax.swing.JLabel();
        cDu = new javax.swing.JLabel();
        nDu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paDu.setBackground(new java.awt.Color(255, 0, 51));

        addDuende.setBackground(new java.awt.Color(0, 153, 0));
        addDuende.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDuende.setForeground(new java.awt.Color(255, 255, 255));
        addDuende.setText(" Duende++ ");
        addDuende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDuendeActionPerformed(evt);
            }
        });

        imgDu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/duende.jpg"))); // NOI18N

        cDu.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        cDu.setForeground(new java.awt.Color(255, 255, 255));
        cDu.setText("Duende #");

        nDu.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        nDu.setForeground(new java.awt.Color(255, 255, 255));
        nDu.setText("0");

        javax.swing.GroupLayout paDuLayout = new javax.swing.GroupLayout(paDu);
        paDu.setLayout(paDuLayout);
        paDuLayout.setHorizontalGroup(
            paDuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paDuLayout.createSequentialGroup()
                .addComponent(imgDu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paDuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(cDu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nDu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addDuende)
                .addGap(53, 53, 53))
        );
        paDuLayout.setVerticalGroup(
            paDuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paDuLayout.createSequentialGroup()
                .addComponent(imgDu, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paDuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDu)
                    .addComponent(addDuende)
                    .addComponent(nDu))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paDu, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paDu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDuendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDuendeActionPerformed
        boolean ban = true;
        long aux = 0;
                if(duende <= 2){
                
            duende++;
            
            cDu.setText("Duende #");
            nDu.setText(Integer.toString(duende));
            if(duende >= 3){
                sanyD.setVisible(true);
                sanD.setVisible(false);
            }
          
            if(duendes(duende)){    
                sanD.setVisible(false);
                sanyD.setVisible(true);
               
                try { 
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SantaV.class.getName()).log(Level.SEVERE, null, ex);
                }
                sanD.setVisible(true);   
                sanR.duende = this.duende;
            }
            
            sanyD.setVisible(false);
        }
        else if(sanR.aux >= 4 && renos(duendes(duende), sanR.renos)){
            this.duende = 1;
            nDu.setText(Integer.toString(duende));
            sanR.renos = 0;
        }
    }//GEN-LAST:event_addDuendeActionPerformed

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
            java.util.logging.Logger.getLogger(SantaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SantaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SantaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SantaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SantaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDuende;
    private javax.swing.JLabel cDu;
    private javax.swing.JLabel imgDu;
    public javax.swing.JLabel nDu;
    private javax.swing.JPanel paDu;
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
 public static void dor(boolean ban) throws InterruptedException{
     if(ban){
         Thread.sleep(4010);
     }
 }
}
