/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Bicola;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class Colas extends javax.swing.JFrame {

    /**
     * Creates new form Colas
     */
    public Colas() {
        initComponents();
        jLabel1.setText("Tamaño:");
        this.setLocationRelativeTo(null);
        jLabel2.setVisible(false);
        jTextField2.setVisible(false);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        btnEliminarINI.setVisible(false);
        btnInsertarINI.setVisible(false);
        btnInsertarFIN.setVisible(false);
        btnEliminarFIN.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtValor = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarINI = new javax.swing.JButton();
        btnInsertarINI = new javax.swing.JButton();
        btnInsertarFIN = new javax.swing.JButton();
        btnEliminarFIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        btnGrupo.add(jRadioButton1);
        jRadioButton1.setText("Bicola");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        btnGrupo.add(jRadioButton2);
        jRadioButton2.setText("Prioridad");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor: ");

        jLabel2.setText("Prioridad: ");

        btnEliminarINI.setText("EliminarINI");
        btnEliminarINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarINIActionPerformed(evt);
            }
        });

        btnInsertarINI.setText("InsertarINI");
        btnInsertarINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarINIActionPerformed(evt);
            }
        });

        btnInsertarFIN.setText("InsertarFIN");
        btnInsertarFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFINActionPerformed(evt);
            }
        });

        btnEliminarFIN.setText("EliminarFIN");
        btnEliminarFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminarINI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2)
                                    .addComponent(txtValor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarINI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarFIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarFIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertarINI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertarFIN)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarFIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarINI))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed
    private void mostrarColaPrioridad() {
        String cadena = "Resultado->> \n";
        for (int i = colap.ini; i <= colap.fin; i++) {
            cadena += "[" + i + "] Valor: " + colap.cola[i].valor + " Prioridad: " + colap.cola[i].prioridad + "\n";
            txtArea.setText(cadena);
        }
    }

    public void mostrarColaBicola() {
        if (bicola.valorIni() == -1) {
            txtArea.setText("Cola vacia");
            return;
        }
        String cadena = "";
        int copiaIni = bicola.valorIni();
        int copiaFin = bicola.valorFin();
        char copiaCola[] = bicola.contenidoCola();

        for (int i = copiaIni; i <= copiaFin; i++) {
            cadena += "[" + i + "]" + copiaCola[i] + " ";
        }
        cadena = "Ini: " + copiaIni + "\nFin: " + copiaFin + "\n" + cadena;
        txtArea.setText(cadena);

    }
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jRadioButton2.isSelected() == true) {
                //Cola PRIORIDAD
                try {
                    jTextField2.setVisible(true);
                    jLabel2.setVisible(true);

                    Data dato = new Data();
                    dato.valor = txtValor.getText().charAt(0);
                    dato.prioridad = Integer.parseInt(jTextField2.getText());

                    boolean resultado = colap.insertar(dato);
                    if (resultado == true) {
                        setTitle("se insertó valor: " + dato.valor);
                        txtValor.setText("");
                        jTextField2.setText("");
                        btnEliminarINI.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error, cola llena.");
                    }
                    mostrarColaPrioridad();
                } catch (NumberFormatException error) {
                    txtArea.setText("NO INSERTE CARACTERES O SIMBOLOS en la Prioridad.");
                }
            }

        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (jLabel1.getText() == "Tamaño:") {
                    //establecer el tamaño del arreglo.
                    bicola.setTamaño(Integer.parseInt(txtValor.getText()));
                    colap.setTamaño(Integer.parseInt(txtValor.getText()));
                    colap.inicializararreglo();
                    bicola.inicializararreglo();
                    txtValor.setText("");
                    jLabel1.setText("Valor:");
                    jRadioButton1.setVisible(true);
                    jRadioButton2.setVisible(true);
                    txtValor.setFocusable(false);
                    if ((txtValor.isFocusable() == false)) {
                        txtValor.setFocusable(true);
                    }
                }
            } catch (NumberFormatException error) {
            }
        }
    }//GEN-LAST:event_txtValorKeyPressed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected() == true) {
            jTextField2.setVisible(true);
            jLabel2.setVisible(true);
            btnEliminarINI.setVisible(true);
            btnInsertarINI.setVisible(false);
            btnInsertarFIN.setVisible(false);
            btnEliminarFIN.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnEliminarINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarINIActionPerformed
        // TODO add your handling code here:
        try {
            if (jRadioButton2.isSelected() == true) {
                boolean resultado = colap.eliminar();
                if (resultado == false) {
                    JOptionPane.showMessageDialog(this, "Cola LLena");
                } else {
                    //JOptionPane.showMessageDialog(this, colap.valorEliminado + "");
                    mostrarColaPrioridad();
                }
            }
            if (jRadioButton1.isSelected() == true) {
                boolean resultadoINI = bicola.eliminar();
                if (resultadoINI == false) {
                    JOptionPane.showMessageDialog(this, "Cola vacia");
                }
                if (resultadoINI == true) {
                    //JOptionPane.showMessageDialog(this, "valor eliminado: " + bicola.valorEliminador());
                    mostrarColaBicola();
                }
            }
        } catch (NumberFormatException error) {

        } catch (ArrayIndexOutOfBoundsException error) {
            txtArea.setText("Cola Vacía");
        }
    }//GEN-LAST:event_btnEliminarINIActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected() == true) {
            //Cola Bicola:
            jLabel2.setVisible(false);
            jTextField2.setVisible(false);
            btnEliminarINI.setVisible(true);
            btnInsertarINI.setVisible(true);
            btnInsertarFIN.setVisible(true);
            btnEliminarFIN.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnInsertarFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFINActionPerformed
        // TODO add your handling code here:
        try {
            if (jRadioButton1.isSelected() == true) {
                boolean resultadoFIN = bicola.insertar(txtValor.getText().charAt(0));
                if (resultadoFIN == false) {
                    setTitle("Cola Llena por FIN");
                    txtValor.setText("");
                    jTextField2.setText("");
                    btnEliminarINI.setVisible(true);
                    btnEliminarFIN.setVisible(true);
                    return;
                }
                mostrarColaBicola();
            }
        } catch (StringIndexOutOfBoundsException error) {
            mostrarColaBicola();
            setTitle("Cola Llena por FIN");
            return;
        }
    }//GEN-LAST:event_btnInsertarFINActionPerformed

    private void btnInsertarINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarINIActionPerformed
        // TODO add your handling code here:
        try {
            if (jRadioButton1.isSelected() == true) {
                boolean resultadoFIN = bicola.insertarPorIni(txtValor.getText().charAt(0));
                if (resultadoFIN == false) {
                    setTitle("Cola Llena por INI");
                    txtValor.setText("");
                    jTextField2.setText("");
                    btnEliminarINI.setVisible(true);
                    btnEliminarFIN.setVisible(true);
                    return;
                }
                mostrarColaBicola();
            }
        } catch (StringIndexOutOfBoundsException error) {
            mostrarColaBicola();
            setTitle("Cola Llena por INI");
            return;
        }
    }//GEN-LAST:event_btnInsertarINIActionPerformed

    private void btnEliminarFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFINActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected() == true) {
            boolean resultadoINI = bicola.eliminarPorFin();
            if (resultadoINI == false) {
                JOptionPane.showMessageDialog(this, "Cola vacia");
            }
            if (resultadoINI == true) {
                JOptionPane.showMessageDialog(this, "valor eliminado: " + bicola.valorEliminador());
                mostrarColaBicola();
            }
        }
    }//GEN-LAST:event_btnEliminarFINActionPerformed
    private Prioridad colap = new Prioridad();
    private Bicola bicola = new Bicola();

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
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarFIN;
    private javax.swing.JButton btnEliminarINI;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnInsertarFIN;
    private javax.swing.JButton btnInsertarINI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
