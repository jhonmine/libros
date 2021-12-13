/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.ArrayList;
import modelo.librito;

/**
 *
 * @author crimi
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarlibro = new javax.swing.JButton();
        buscarlibro = new javax.swing.JButton();
        eliminarlibro = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        imageninicio = new javax.swing.JLabel();
        tituloenunciado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        agregarlibro.setText("Agregar Libro");
        agregarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarlibroActionPerformed(evt);
            }
        });

        buscarlibro.setText("Buscar Libro");
        buscarlibro.setActionCommand("BusIn");
        buscarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarlibroActionPerformed(evt);
            }
        });

        eliminarlibro.setText("Eliminar Libro");
        eliminarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarlibroActionPerformed(evt);
            }
        });

        Salir.setText("Cerrar aplicación");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        inventario.setText("Ver Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        imageninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libros/img/libro.jpg"))); // NOI18N
        imageninicio.setText("jLabel1");

        tituloenunciado.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tituloenunciado.setText("Bienvenido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir)
                    .addComponent(agregarlibro)
                    .addComponent(buscarlibro)
                    .addComponent(eliminarlibro)
                    .addComponent(inventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(tituloenunciado)
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloenunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarlibro)
                        .addGap(32, 32, 32)
                        .addComponent(buscarlibro)
                        .addGap(29, 29, 29)
                        .addComponent(eliminarlibro)
                        .addGap(28, 28, 28)
                        .addComponent(inventario)
                        .addGap(49, 49, 49)
                        .addComponent(Salir))
                    .addComponent(imageninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarlibroActionPerformed
    AgregarLibro f = new AgregarLibro();

    f.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_agregarlibroActionPerformed

    private void buscarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarlibroActionPerformed
    BuscarLibro f = new BuscarLibro();

    f.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_buscarlibroActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        Inventario verinventario=new Inventario();
        verinventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void eliminarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarlibroActionPerformed
        EliminarLibro eliminacion=new EliminarLibro();
        eliminacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eliminarlibroActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Salir;
    public javax.swing.JButton agregarlibro;
    public javax.swing.JButton buscarlibro;
    public javax.swing.JButton eliminarlibro;
    public javax.swing.JLabel imageninicio;
    public javax.swing.JButton inventario;
    public javax.swing.JLabel tituloenunciado;
    // End of variables declaration//GEN-END:variables


}
