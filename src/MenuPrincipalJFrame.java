import javax.swing.JDesktopPane;

/* @author santos */
public class MenuPrincipalJFrame extends javax.swing.JFrame {
    private FormularioJInternalFrame v;

    public MenuPrincipalJFrame() {
        initComponents();
    }
        
    private static MenuPrincipalJFrame instancia;
    public synchronized static MenuPrincipalJFrame getInstancia(){
        if(instancia==null){
            instancia=new MenuPrincipalJFrame();
        }
        return instancia;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuILlamarJDIALOG = new javax.swing.JMenuItem();
        jMenuILlamarJINTERNALFRAME = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuInicio.setText("Inicio");

        jMenuILlamarJDIALOG.setText("Mostrar JDIALOG");
        jMenuILlamarJDIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuILlamarJDIALOGActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuILlamarJDIALOG);

        jMenuILlamarJINTERNALFRAME.setText("Mostrar JINTERNALFRAME");
        jMenuILlamarJINTERNALFRAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuILlamarJINTERNALFRAMEActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuILlamarJINTERNALFRAME);

        jMenuBar1.add(jMenuInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuILlamarJDIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuILlamarJDIALOGActionPerformed
        //mostramos el formulario del jdialog
        FormularioJDialog.getInstancia().setVisible(true);
    }//GEN-LAST:event_jMenuILlamarJDIALOGActionPerformed

    private void jMenuILlamarJINTERNALFRAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuILlamarJINTERNALFRAMEActionPerformed
        
        if(!escritorio.isAncestorOf(FormularioJInternalFrame.getInstancia())){
            escritorio.add(FormularioJInternalFrame.getInstancia());
            FormularioJInternalFrame.getInstancia().setVisible(true);
        }else{
            escritorio.setSelectedFrame(FormularioJInternalFrame.getInstancia());
        }       
    }//GEN-LAST:event_jMenuILlamarJINTERNALFRAMEActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalJFrame().getInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuILlamarJDIALOG;
    private javax.swing.JMenuItem jMenuILlamarJINTERNALFRAME;
    private javax.swing.JMenu jMenuInicio;
    // End of variables declaration//GEN-END:variables
}
