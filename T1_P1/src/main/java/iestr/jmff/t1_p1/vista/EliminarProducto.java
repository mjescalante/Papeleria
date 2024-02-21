/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iestr.jmff.t1_p1.vista;

import iestr.jmff.t1_p1.controlador.TablapapeleriaJpaController;
import iestr.jmff.t1_p1.controlador.exceptions.NonexistentEntityException;
import iestr.jmff.t1_p1.modelo.Tablapapeleria;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *  Clase que representa el poder eliminar un producto y permite
 *  buscar un producto por su código y asi poder eliminar ese.  
 *  Esta clase hereda de javax.swing.JFrame.
 *  @author Sergio
 */
public class EliminarProducto extends javax.swing.JFrame {

    /**
     * Constructor de la clase EliminarProducto, le ponemos el titulo
     * al jFrame e se conecta con la base de datos.
     */
    public EliminarProducto() {
        //Nombre y configuración
        setTitle("Eliminar producto");
        
        //Base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        producto = new TablapapeleriaJpaController(emf);
        productos = producto.findTablapapeleriaEntities();
        
        initComponents();
    }

    /**
     * Este método es llamado desde el constructor para inicializar el formulario, el
     * contenido de este método siempre se regenera mediante el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txf1 = new javax.swing.JTextField();
        txf2 = new javax.swing.JTextField();
        txf3 = new javax.swing.JTextField();
        txf4 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl3.setText("Familia:");

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl4.setText("Precio:");

        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(153, 153, 153));
        lbl5.setText("Ingresa el código del producto a eliminar");

        txf2.setEditable(false);

        txf3.setEditable(false);

        txf4.setEditable(false);
        txf4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn1.setText("Elimina Producto");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btn3.setText("Buscar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl1.setText("Código:");

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setText("Reset");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl2.setText("Producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2)
                            .addComponent(lbl3)
                            .addComponent(lbl4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2)
                        .addGap(10, 10, 10)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método para la acción de eliminar.
     * @param evt
     */
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        //Control de campos vacíos
        if(txf1.getText().equals("")){
            Menu.error("Introduce un código");
            return;
        }

        //Control de si ya existe ese código
        if(Menu.codigoLibre(txf1.getText())){
            Menu.error("Ese código no existe");
            return;
        }
        
        //Control de si ha pulsado el botón de buscar
        if(txf2.getText().equals("")){
            Menu.error("Debes visualizar primero la información de ese código pulsando 'Buscar'");
            return;
        }
        
        for(Tablapapeleria p : productos){
            if(p.getCodigo().equals(txf1.getText())){
                try {
                    producto.destroy(p.getId());
                    productos.remove(p);
                    Menu.exito("Producto eliminado con éxito");
                    txf1.setText("");
                    txf2.setText("");
                    txf3.setText("");
                    txf4.setText("");
                    return;
                } catch (NonexistentEntityException ex) {
                    Menu.error("Error al elimninar el producto");
                    Logger.getLogger(EliminarProducto.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    /**
     * Método para gestionar la acción del botón de búsqueda.
     * @param evt
     */
    
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(txf1.getText().equals("")){
            Menu.error("Completa el campo");
            return;
        }

        for(Tablapapeleria p : productos){
            if(p.getCodigo().equals(txf1.getText())){
                txf2.setText(p.getProducto());
                txf3.setText(p.getFamilia());
                txf4.setText(p.getPrecio().toString());
                return;
            }
        }

        Menu.error("No se ha encontrado el código indicado");
    }//GEN-LAST:event_btn3ActionPerformed
    
    /* Método para gestionar la acción del botón de limpieza.
    * @param evt
    */
    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txf1.setText("");
        txf2.setText("");
        txf3.setText("");
        txf4.setText("");
    }//GEN-LAST:event_btn2ActionPerformed

    /** Método principal para iniciar la aplicación.
     * @param args Argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarProducto().setVisible(true);
            }
        });
    }

    private List<Tablapapeleria> productos;
    private TablapapeleriaJpaController producto;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JTextField txf1;
    private javax.swing.JTextField txf2;
    private javax.swing.JTextField txf3;
    private javax.swing.JTextField txf4;
    // End of variables declaration//GEN-END:variables
}
