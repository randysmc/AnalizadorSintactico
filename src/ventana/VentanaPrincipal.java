/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import analizador.Analizador;
import analizador.Lexema;
import controladores.ControladorLexema;
import controladores.ControladorVentana;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import ventana.*;

public class VentanaPrincipal extends javax.swing.JFrame {

    //ControladorLexema contrLexema;
    VentanaPrincipal ventana;
    //Analizador analizador;
    //ArrayList<Lexema> arregloLexemas;
    //ArrayList<Lexema> arregloErrores;
    ControladorVentana contrVentana;
    //private Object DefaultHighlighter;
    //private Object DefaultHighlighter;
    VentanaEditor ventanaEdit;
    

    public VentanaPrincipal() {

        initComponents();
        //crtlVentana = new ControladorVentana();
    }

    public void inicio() {
        this.setVisible(true);
        contrVentana = new ControladorVentana();
        //contrLexema = new ControladorLexema();
    }
    /*public void buscarpalabra(JTextArea area1, String texto) {
        if (texto.length() >= 1) {
            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
            Highlighter h = area1.getHighlighter();
            h.removeAllHighlights();
            String text = area1.getText();
            String caracteres = texto;
            Pattern p = Pattern.compile("(?i)" + caracteres);
            Matcher m = p.matcher(text);
            while (m.find()) {
                try {
                    h.addHighlight(m.start(), m.end(), highlightPainter);
                } catch (BadLocationException ex) {
                    Logger.getLogger(color.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(area1, "la palabra a buscar no puede ser vacia");
        }
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelEncabezado = new javax.swing.JPanel();
        labelIngresePalabra = new javax.swing.JLabel();
        textFBuscarPatron = new javax.swing.JTextField();
        btnCargarArchivo = new javax.swing.JButton();
        btnModificarArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarLexemas = new javax.swing.JButton();
        btnMostrarErrores = new javax.swing.JButton();
        panelArchivo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArArchivo = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        jbotonAnalisisSinta = new javax.swing.JButton();
        panelReportes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaErrores = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEncabezado.setForeground(new java.awt.Color(0, 51, 51));

        labelIngresePalabra.setText("Ingrese Palabra");
        labelIngresePalabra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCargarArchivo.setText("Cargar");
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });

        btnModificarArchivo.setText("Modificar");
        btnModificarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarArchivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Cargar un Archivo");

        btnMostrarLexemas.setText("Mostrar Tokens");
        btnMostrarLexemas.setBorder(new javax.swing.border.MatteBorder(null));
        btnMostrarLexemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLexemasActionPerformed(evt);
            }
        });

        btnMostrarErrores.setText("Mostrar Errores");
        btnMostrarErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarErroresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIngresePalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(textFBuscarPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addComponent(btnCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarLexemas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarErrores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngresePalabra)
                    .addComponent(textFBuscarPatron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLexemas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargarArchivo)
                            .addComponent(btnMostrarErrores))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarArchivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Archivo de Entrada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        textArArchivo.setColumns(20);
        textArArchivo.setRows(5);
        jScrollPane1.setViewportView(textArArchivo);

        btnAnalizar.setText("Analizar Lexemas");
        btnAnalizar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jbotonAnalisisSinta.setText("Analisis Sintactico");
        jbotonAnalisisSinta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbotonAnalisisSintaMouseClicked(evt);
            }
        });
        jbotonAnalisisSinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonAnalisisSintaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArchivoLayout = new javax.swing.GroupLayout(panelArchivo);
        panelArchivo.setLayout(panelArchivoLayout);
        panelArchivoLayout.setHorizontalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArchivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelArchivoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelArchivoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbotonAnalisisSinta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        panelArchivoLayout.setVerticalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArchivoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelArchivoLayout.createSequentialGroup()
                        .addComponent(jbotonAnalisisSinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelReportes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 51, 51))); // NOI18N

        tablaReportes.setForeground(new java.awt.Color(0, 51, 51));
        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fila", "Token", "Lexema", "Apariciones"
            }
        ));
        jScrollPane4.setViewportView(tablaReportes);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        tablaErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Indice", "Error"
            }
        ));
        jScrollPane5.setViewportView(tablaErrores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
        ////crtlVentana = new ControladorVentana();
        String texto = contrVentana.leerArhivo();
        textArArchivo.setText(texto);
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        String texto = getTextoArea(); //funcion que me permite llamar 
        contrVentana.analizarArchivo(texto);
        //textArArchivo.setText("");
    }//GEN-LAST:event_btnAnalizarActionPerformed

    
    
    
    private void btnMostrarLexemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLexemasActionPerformed
        contrVentana.obtenerTablaLex(tablaReportes);

    }//GEN-LAST:event_btnMostrarLexemasActionPerformed

    private void btnMostrarErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarErroresActionPerformed
        contrVentana.obtenerTablaErr(tablaErrores);
    }//GEN-LAST:event_btnMostrarErroresActionPerformed

    private void btnModificarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarArchivoActionPerformed
        String texto = getTextoArea();
        contrVentana.modificarArchivo(texto);
    }//GEN-LAST:event_btnModificarArchivoActionPerformed

    private void jbotonAnalisisSintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonAnalisisSintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbotonAnalisisSintaActionPerformed

    private void jbotonAnalisisSintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbotonAnalisisSintaMouseClicked
        this.ventana.setVisible(false);
        ventanaEdit = new VentanaEditor();
        ventanaEdit.setVisible(true);
        
    }//GEN-LAST:event_jbotonAnalisisSintaMouseClicked
    public String getTextoArea() {
        String texto = textArArchivo.getText() + " ";
        return texto;
    }

    public JButton getBtnAnalizar() {
        return btnAnalizar;
    }

    public void setBtnAnalizar(JButton btnAnalizar) {
        this.btnAnalizar = btnAnalizar;
    }



    public JButton getBtnCargarArchivo() {
        return btnCargarArchivo;
    }

    public void setBtnCargarArchivo(JButton btnCargarArchivo) {
        this.btnCargarArchivo = btnCargarArchivo;
    }

    public JButton getBtnIrReportes() {
        return btnMostrarLexemas;
    }

    public void setBtnIrReportes(JButton btnIrReportes) {
        this.btnMostrarLexemas = btnIrReportes;
    }

    public JButton getBtnModificarArchivo() {
        return btnModificarArchivo;
    }

    public void setBtnModificarArchivo(JButton btnModificarArchivo) {
        this.btnModificarArchivo = btnModificarArchivo;
    }

    public JPanel getjPanel2() {
        return panelArchivo;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.panelArchivo = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLabelIngresePalabra() {
        return labelIngresePalabra;
    }

    public void setLabelIngresePalabra(JLabel labelIngresePalabra) {
        this.labelIngresePalabra = labelIngresePalabra;
    }

    public JPanel getPanelEncabezado() {
        return panelEncabezado;
    }

    public void setPanelEncabezado(JPanel panelEncabezado) {
        this.panelEncabezado = panelEncabezado;
    }

    public JTextArea getTextArArchivo() {
        return textArArchivo;
    }

    public void setTextArArchivo(JTextArea textArArchivo) {
        this.textArArchivo = textArArchivo;
    }

    public JTextField getTextFBuscarPatron() {
        return textFBuscarPatron;
    }

    public void setTextFBuscarPatron(JTextField textFBuscarPatron) {
        this.textFBuscarPatron = textFBuscarPatron;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnModificarArchivo;
    private javax.swing.JButton btnMostrarErrores;
    private javax.swing.JButton btnMostrarLexemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbotonAnalisisSinta;
    private javax.swing.JLabel labelIngresePalabra;
    private javax.swing.JPanel panelArchivo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JTable tablaErrores;
    private javax.swing.JTable tablaReportes;
    private javax.swing.JTextArea textArArchivo;
    private javax.swing.JTextField textFBuscarPatron;
    // End of variables declaration//GEN-END:variables

}
