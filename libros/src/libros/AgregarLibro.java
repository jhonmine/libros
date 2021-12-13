/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.librito;

/**
 *
 * @author crimi
 */
public class AgregarLibro extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLibro
     */
    public AgregarLibro() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        isbn = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        formato = new javax.swing.JComboBox<>();
        genero = new javax.swing.JComboBox<>();
        inicioagregar = new javax.swing.JButton();
        inventarioagregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar libro");

        jLabel1.setText("Nombre del libro:");

        jLabel2.setText("Autor: ");

        jLabel3.setText("Formato: ");

        jLabel4.setText("Genero: ");

        jLabel5.setText("ISBN:");

        jLabel6.setText("Costo:");

        agregar.setText("Agregar Libro");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        formato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "papel", "electronico", "interactivo" }));
        formato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatoActionPerformed(evt);
            }
        });

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "literario", "consulta", "informativo o manual", "Biografíco", "Libro sagrado", "Libro de bolsillo", "Cómic", "partitura" }));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        inicioagregar.setText("inicio");
        inicioagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioagregarActionPerformed(evt);
            }
        });

        inventarioagregar1.setText("Inventario");
        inventarioagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioagregar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(formato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(192, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inventarioagregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inicioagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventarioagregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatoActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void inicioagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioagregarActionPerformed
     Inicio volverinicio=new Inicio();
     volverinicio.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_inicioagregarActionPerformed

    private void inventarioagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioagregar1ActionPerformed
        Inventario verinventario=new Inventario();
        verinventario.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_inventarioagregar1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String nombre_libro;
        int isbn_libro;
        String nombre_autor;
        Double costo_libro;
        String formato_libro;
        String genero_libro;
        int Tformato = 1;
        int Tgenero = 1;
        if(nombre.getText().isEmpty()||
                isbn.getText().isEmpty()
                ||autor.getText().isEmpty()
                ||costo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos");
        }else{
        nombre_libro=nombre.getText();
        isbn_libro=Integer.valueOf(isbn.getText());
        nombre_autor=autor.getText();
        costo_libro=Double.parseDouble(costo.getText());
        formato_libro=(String) formato.getSelectedItem();
        genero_libro=(String) genero.getSelectedItem();
        //Elejir formato
        
        if(formato_libro=="papel"){
           Tformato=1;
        }else{
            if(formato_libro=="electronico"){
                Tformato=2;
                }else{
                    if(formato_libro=="interactivo"){
                        Tformato=3;
                }
                }
        }
        
        //Elejir genero
        
        if(genero_libro=="literario"){
           Tgenero=1;
        }else{
            if(genero_libro=="consulta"){
                Tgenero=2;
                }else{
                    if(genero_libro=="informativo o manual"){
                        Tgenero=3;
                    }else{
                        if(genero_libro=="Biografíco"){
                            Tgenero=4;
                        }else{
                            if(genero_libro=="Libro sagrado"){
                            Tgenero=5;
                            }else{
                                if(genero_libro=="Libro de bolsillo"){
                                    Tgenero=6;
                                }else{
                                    if(genero_libro=="Cómic"){
                                        Tgenero=7;
                                    }else{
                                        Tgenero=8;
                                    }
                                }
                            }
                        }
                    }
                }
        }
  
        //Base de datos
        String dbURL="jdbc:mysql://localhost:3306/inventario";
        String username= "root";
        String password="MADpad2379";
        try{
            Connection conn;
            conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null){
            System.out.println("Conexion Exitosa");
            
            String sql="INSERT INTO libros(id,ISBN,nombrelibro,autor,precio,formato,genero) VALUES (NULL,?,?,?,?,?,?);";  
            
            PreparedStatement statement=conn.prepareStatement(sql);
            statement.setInt(1,isbn_libro);
            statement.setString(2,nombre_libro);
            statement.setString(3,nombre_autor);
            statement.setDouble(4,costo_libro);
            statement.setInt(5,Tformato);
            statement.setInt(6,Tgenero);
            int rowInserted=statement.executeUpdate();
            if(rowInserted>0){
            JOptionPane.showMessageDialog(null,"Libro Agregado Exitosamente");
            }else{
            JOptionPane.showMessageDialog(null,"Libro NO Agregado");
            }
            }
            conn.close();
        }catch(SQLException ex){
        ex.printStackTrace();
        }
        /*librito librito=new librito(nombre_libro, isbn_libro, nombre_autor, costo_libro, formato_libro, genero_libro);
        Inicio.agregarlibrito(librito);*/
        }
    }//GEN-LAST:event_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar;
    public javax.swing.JTextField autor;
    public javax.swing.JTextField costo;
    public javax.swing.JComboBox<String> formato;
    public javax.swing.JComboBox<String> genero;
    public javax.swing.JButton inicioagregar;
    public javax.swing.JButton inventarioagregar1;
    public javax.swing.JTextField isbn;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}