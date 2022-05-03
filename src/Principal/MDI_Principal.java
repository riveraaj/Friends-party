package Principal;

import Pantallas.PantallaRegistro;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MDI_Principal extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAmigos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JV Party");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenuAmigos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAmigos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuAmigos.setText("Lista");

        jMenuItem1.setText("Invitados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAmigos.add(jMenuItem1);

        jMenuBar1.add(jMenuAmigos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        iniRegistro();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
//</editor-fold>
       
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
    //Estos son varables globales que se usaran mas adelante
    private PantallaRegistro oPantallaRegistro;
    ImagenPanel fondo = new ImagenPanel();   
//</editor-fold>    
       
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAmigos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructores">
    //En este constructor vamos a iniciar todos los metodos principales
    public MDI_Principal() {
        initComponents();
        this.setContentPane(fondo);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Dimensiones personalizadas 64x64 px.png")));
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos">  
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
            java.util.logging.Logger.getLogger(MDI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Principal().setVisible(true);
            }
        });
    }
    //Este metodo sirve para llamar y hacer visible una pantalla interna
    void iniRegistro(){
        if (oPantallaRegistro == null || oPantallaRegistro.isClosed()) {
        oPantallaRegistro = new PantallaRegistro();
        this.add(oPantallaRegistro);
        oPantallaRegistro.setVisible(true);
        }
    }
    
    //Esta clase sirve para darle una imagen al jFrame Principal
     class ImagenPanel extends JPanel {
        
        private Image imagen;
        
        public void  paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Dimensiones personalizadas 766x810 px.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }  
    }
}
//</editor-fold>