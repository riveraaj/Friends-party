package Pantallas;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaRegistro extends javax.swing.JInternalFrame { 

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTblInvitados = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jTextComida = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel3 = new javax.swing.JLabel();
    jTextNombre = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    jBttnCrear = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTblAmigos = new javax.swing.JTable();
    jLabel4 = new javax.swing.JLabel();
    jTxtInvitados = new javax.swing.JTextField();
    jSeparator3 = new javax.swing.JSeparator();
    jLabel5 = new javax.swing.JLabel();
    jTxtComida = new javax.swing.JTextField();
    jSeparator4 = new javax.swing.JSeparator();
    Obtener = new javax.swing.JButton();
    jSeparator5 = new javax.swing.JSeparator();
    jBttnImprimir = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 100, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 100, Short.MAX_VALUE)
    );

    setBackground(new java.awt.Color(0, 0, 0));
    setBorder(null);
    setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    setFocusCycleRoot(false);
    setFocusable(false);
    setPreferredSize(new java.awt.Dimension(766, 810));
    setRequestFocusEnabled(false);
    setVerifyInputWhenFocusTarget(false);
    setVisible(true);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setDoubleBuffered(false);
    jPanel1.setFocusable(false);
    jPanel1.setPreferredSize(new java.awt.Dimension(1040, 502));
    jPanel1.setRequestFocusEnabled(false);
    jPanel1.setVerifyInputWhenFocusTarget(false);
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
    jLabel1.setText("Invitados de Fiesta");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

    jScrollPane1.setBorder(null);

    jTblInvitados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jTblInvitados.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "Nombre", "Platillos"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(jTblInvitados);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 340, 320));

    jLabel2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
    jLabel2.setText("Nombre");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, 30));

    jTextComida.setBorder(null);
    jTextComida.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextComidaActionPerformed(evt);
      }
    });
    jPanel1.add(jTextComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 273, 30));

    jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
    jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 270, 10));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
    jLabel3.setText("Cantidad de Platillos");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, 30));

    jTextNombre.setBorder(null);
    jTextNombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextNombreActionPerformed(evt);
      }
    });
    jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 273, 30));

    jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 270, 10));

    jBttnCrear.setBackground(new java.awt.Color(0, 0, 0));
    jBttnCrear.setForeground(new java.awt.Color(255, 255, 255));
    jBttnCrear.setText("Agregar");
    jBttnCrear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBttnCrearActionPerformed(evt);
      }
    });
    jPanel1.add(jBttnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

    jScrollPane2.setBorder(null);

    jTblAmigos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jTblAmigos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "Nombre", "Platillos"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(jTblAmigos);

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 340, 240));

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
    jLabel4.setText("Invitados: ");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 130, 30));

    jTxtInvitados.setEditable(false);
    jTxtInvitados.setBackground(new java.awt.Color(255, 255, 255));
    jTxtInvitados.setToolTipText("");
    jTxtInvitados.setBorder(null);
    jPanel1.add(jTxtInvitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 270, 30));

    jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
    jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 270, 30));

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
    jLabel5.setText("Platillos:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 80, 30));

    jTxtComida.setEditable(false);
    jTxtComida.setBackground(new java.awt.Color(255, 255, 255));
    jTxtComida.setToolTipText("");
    jTxtComida.setBorder(null);
    jPanel1.add(jTxtComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 270, 30));

    jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
    jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 270, 30));

    Obtener.setBackground(new java.awt.Color(0, 0, 0));
    Obtener.setForeground(new java.awt.Color(255, 255, 255));
    Obtener.setText("Obtener");
    Obtener.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ObtenerActionPerformed(evt);
      }
    });
    jPanel1.add(Obtener, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, -1, -1));

    jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
    jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
    jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 650, 10));

    jBttnImprimir.setBackground(new java.awt.Color(0, 0, 0));
    jBttnImprimir.setForeground(new java.awt.Color(255, 255, 255));
    jBttnImprimir.setText("Imprimir");
    jBttnImprimir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBttnImprimirActionPerformed(evt);
      }
    });
    jPanel1.add(jBttnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, -1, -1));

    jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 0, 0));
    jButton1.setText("●");
    jButton1.setBorder(null);
    jButton1.setBorderPainted(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setDefaultCapable(false);
    jButton1.setFocusPainted(false);
    jButton1.setFocusable(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 20, 30));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 800));

    pack();
  }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jTextComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextComidaActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jBttnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnCrearActionPerformed
        guardarAmigo();
        limpiarCampos();
    }//GEN-LAST:event_jBttnCrearActionPerformed

    private void ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerActionPerformed
        modeloTabla2.getDataVector().removeAllElements();
        jTblInvitados.updateUI();
        obtenerLista();   
    }//GEN-LAST:event_ObtenerActionPerformed

    private void jBttnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnImprimirActionPerformed
        CrearArchivo();
    }//GEN-LAST:event_jBttnImprimirActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
  }//GEN-LAST:event_jButton1ActionPerformed
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
    
    //Variables Globales que se usaran mas adelante
  private JComponent Barra;
    private Dimension DimensionBarra;
    Map<String, Integer> Invitados = new TreeMap();
    Map <String, Integer>Manuel_Arce = new HashMap <>();
    Map <String, Integer> Miguel_Segura = new HashMap <>();
    Map <String, Integer> Adriana_Fallas = new HashMap();
    Map <String, Integer> Lorena_Torres = new HashMap();
    Map <String, Integer> Mariela_Salazar = new HashMap();
    Map <String, Integer> Rebeca_Morera = new HashMap();
    Map <String, Integer> Luis_Salas = new HashMap();
    Map <String, Integer> Oscar_Ulate = new HashMap();
    Map<String, Integer> ListaFinal = new HashMap();
    int cantComida = 0, cantInvitados = 0;
    DefaultTableModel modeloTabla;
    DefaultTableModel modeloTabla2;
    BufferedWriter bf = null;
    final static String outputFilePath = "C:\\Users\\Jonathan_Rivera\\Desktop\\Lista Invitados.txt";
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Obtener;
  private javax.swing.JButton jBttnCrear;
  private javax.swing.JButton jBttnImprimir;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JTable jTblAmigos;
  private javax.swing.JTable jTblInvitados;
  private javax.swing.JTextField jTextComida;
  private javax.swing.JTextField jTextNombre;
  private javax.swing.JTextField jTxtComida;
  private javax.swing.JTextField jTxtInvitados;
  // End of variables declaration//GEN-END:variables
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructores">  
    
    //Este constructor inicializa los metodos principales
    public PantallaRegistro() {
        initComponents();
        QuitarLaBarraTitulo();
        modeloTablas();
        IngresoLista();
        CompararManuel();
        compararAdriana();
        CompararMiguel();
        compararLorena();
        compararLuis();
        compararMarianela();
        compararOscar();
        compararRebeca();
        ListaFinal();
        sumasLista();
    }   
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodos"> 
    
    //Este metodo Guarda la informacion de un Amigo nuevo
    void guardarAmigo(){          
        int comida = Integer.parseInt(jTextComida.getText());
        String nombre = jTextNombre.getText();
        String comida2 = jTextComida.getText();
        if (nombre.isEmpty()){ 
            if (comida2.isEmpty()){
                JOptionPane.showMessageDialog(null, "Los campos deben de estar llenos");
            }
        }
        else {
            Invitados.put(nombre, comida);
            cantComida +=comida;
            cantInvitados++;
            Object[] fila = new Object[2];
            fila [0] = nombre;
            fila [1] = comida;
            modeloTabla.addRow(fila);
        }    
    }
    //Este metodo limpia los campos jText   
    void limpiarCampos(){
        jTextNombre.setText(null);
        jTextComida.setText(null);
    }
    
    //Este metodo da formato a el jTable
    void modeloTablas(){        
        modeloTabla2 = new DefaultTableModel();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Platillos");
        jTblAmigos.setModel(modeloTabla);
        modeloTabla2.addColumn("Nombre");
        modeloTabla2.addColumn("Platillos");
        jTblInvitados.setModel(modeloTabla2);            
    }
    //Este metodo obtiene la lista de invitados y la muestra
    void obtenerLista(){    
        jTxtComida.setText(String.valueOf(cantComida));
        jTxtInvitados.setText(String.valueOf(cantInvitados));
        for (Map.Entry<String, Integer>entry1 : Invitados.entrySet()){          
            String key = entry1.getKey();
            int valor = entry1.getValue();  
            Object[] fila = new Object[2];
            fila [0] = key;
            fila[1] = valor;
            modeloTabla2.addRow(fila);
        }      
    }
    //Este metodo crea un .txt en el escritorio con la lista de invitados 
    void CrearArchivo(){
        try {
            File file = new File(outputFilePath);
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream s = new ObjectOutputStream(f);
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, Integer> entry : Invitados.entrySet()){ 
                 bf.write(entry.getKey() + ":" + entry.getValue());
                 bf.newLine();
                 bf.flush();
            }    
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
                bf.close();
                JOptionPane.showMessageDialog(null, "Su lista de invitados se creo en su Escritorio");
            }
            catch (HeadlessException | IOException e) {
                System.out.println(e.toString());
            }
    }
    //Este metodo hace el ingreso de la lista de amigos
    void IngresoLista(){     
        Manuel_Arce.put("Laura Rojas", 1);
        Manuel_Arce.put("Rebeca Jara",2);
        Manuel_Arce.put("Olman Ulate",1);
        Manuel_Arce.put("Diego Sancho",3);
        Manuel_Arce.put("Teresa Oviedo",4);
        
        Miguel_Segura.put("Mario Vargas",4);
        Miguel_Segura.put("Manuel Lopez",2);
        Miguel_Segura.put("Diego Solis",1);
        Miguel_Segura.put("Rebeca Jara",2);
        
        Adriana_Fallas.put("Olman Ulate",1);
        Adriana_Fallas.put("Diego Sandi",3);
        Adriana_Fallas.put("Sergio Romero",5);
        Adriana_Fallas.put("Cristiano Ronaldo",3);
        
        Lorena_Torres.put("Luis Sandi",1);
        Lorena_Torres.put("Sergio Romero",5);
        Lorena_Torres.put("Laura Rojas", 1);
        Lorena_Torres.put("Eduardo Ramos",5);
        Lorena_Torres.put("Oscar Moreno",4);
        
        Mariela_Salazar.put("Diego Calvo",3);
        Mariela_Salazar.put("Diego Solis",1);
        Mariela_Salazar.put("Mario Vargas",4);
        Mariela_Salazar.put("Rebeca Jara",2);
        
        Rebeca_Morera.put("Oscar Maroto",4);
        Rebeca_Morera.put("Lorena Torres",2);
        Rebeca_Morera.put("Teresa Oviedo",4);
        Rebeca_Morera.put("Rebeca Jara",2);
        Rebeca_Morera.put("Oscar Ruiz",2);
        
        Luis_Salas.put("Teresa Oviedo",4);
        Luis_Salas.put("Rebeca Jara",2);
        Luis_Salas.put("Diego Fallas",3);
        Luis_Salas.put("Olman Ulate",1);
        Luis_Salas.put("Fabricio Ramirez",3);
        
        Oscar_Ulate.put("Maria Paz Vargas", 1);
        Oscar_Ulate.put("Mario Salazar",3);
        Oscar_Ulate.put("Enrique Pena",5);
        Oscar_Ulate.put("Diego Pais",2);
        Oscar_Ulate.put("Cristiano Ronaldo",3);
        
        Invitados.put("Manuel Arce",1);
        Invitados.put("Miguel Segura",4);
        Invitados.put("Adriana Fallas",1);
        Invitados.put("Lorena Torres",1);
        Invitados.put("Marianela Salazar",3);
        Invitados.put("Rebeca Morera",4);        
        Invitados.put("Luis Salas",4);
        Invitados.put("Oscar Ulate",4);              
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void CompararManuel(){          
       for (Map.Entry <String, Integer> entry1 : Manuel_Arce.entrySet()){  
            String key = entry1.getKey();
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }            
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        } 
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void CompararMiguel(){   
        for (Map.Entry <String, Integer> entry1 : Miguel_Segura.entrySet()){
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            } 
        }         
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void compararAdriana(){   
        for (Map.Entry <String, Integer> entry1 : Adriana_Fallas.entrySet()){ 
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            } 
        }  
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void compararLorena(){
        for (Map.Entry <String, Integer> entry1 : Lorena_Torres.entrySet()){  
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        }      
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void compararMarianela(){    
        for (Map.Entry <String, Integer> entry1 : Mariela_Salazar.entrySet()){
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        }      
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void compararRebeca(){        
        for (Map.Entry <String, Integer> entry1 : Rebeca_Morera.entrySet()){   
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        } 
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal  
    void compararLuis(){       
        for (Map.Entry <String, Integer> entry1 : Luis_Salas.entrySet()){
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Oscar_Ulate.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        } 
    }
    //Este metodo compara si hay datos iguales y si los hay los guarda en un map ListaFinal
    void compararOscar(){      
        for (Map.Entry <String, Integer> entry1 : Oscar_Ulate.entrySet()){ 
            String key = entry1.getKey();
            if (Manuel_Arce.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Adriana_Fallas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Miguel_Segura.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Lorena_Torres.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Rebeca_Morera.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Mariela_Salazar.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
            if (Luis_Salas.containsKey(key)){       
                String value = entry1.getKey();
                int value2 = entry1.getValue();
                ListaFinal.put(value, value2);
            }
        } 
    }     
    //Este metodo compara si hay datos iguales y si los hay va contando para pasar al otro filtro de dos if y si los cumplen lo indicado se depura la lista y se guarda en un map Invitados
    void ListaFinal(){     
        for(Map.Entry<String, Integer> entry1 : ListaFinal.entrySet()){
            int cont=0;
            String key = entry1.getKey();
            int value = entry1.getValue();
            if (Manuel_Arce.containsKey(key)){ 
                if(value <= 3){
                   cont++;  
                }
            }         
            if  (Miguel_Segura.containsKey(key)){
                if(value <= 3){
                   cont++;  
                } 
            }   
            if (Lorena_Torres.containsKey(key)){
                if(value <= 3){
                   cont++;  
                } 
            } 
            if (Luis_Salas.containsKey(key)){
                if(value <= 3){
                   cont++;  
                }
            }
            if (Rebeca_Morera.containsKey(key)){
                if(value <= 3){
                   cont++;  
                }
            }
            if (Oscar_Ulate.containsKey(key)){
                if(value <= 3){
                   cont++;  
                }              
            }
            if (Mariela_Salazar.containsKey(key)){
                if(value <= 3){
                   cont++;  
                }
            }
            if (Adriana_Fallas.containsKey(key)){
                if(value <= 3){
                   cont++;  
                } 
            }
            if ((cont > 2)&& (value <= 2)){
               String nombre = entry1.getKey(); 
               int comida = entry1.getValue();
               Invitados.put(nombre, comida);
            }
            if ((cont < 4) && (cont > 1) && (value < 4) && (value > 1)){
               String nombre = entry1.getKey(); 
               int comida = entry1.getValue();
               Invitados.put(nombre, comida);      
            }
        }
    }
    //Este metodo suma la cantidad de invitados y platillos
    void sumasLista(){       
        for (Map.Entry<String, Integer>entry1 : Invitados.entrySet()){
            String key = entry1.getKey();
            int valor = entry1.getValue();            
            cantComida += valor;
            cantInvitados++;
        }
    }  
    
    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
    
}
//</editor-fold>

