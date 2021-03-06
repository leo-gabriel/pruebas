package Presentacion;

import Logica.Categoria;
import Logica.DataUsuario;
import Logica.ControladorUsuario;
import Logica.Fabrica;
import Logica.Fecha;
import Logica.IControladorUsuario;
import Logica.IControladorProducto;
import Logica.IControladorPedido;
import Logica.ManejadorCategoria;
import Logica.Restaurante;
import Presentacion.CargarFoto;
import Presentacion.RegistrarCliente;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;
import java.util.Iterator;
import java.util.Map;

public class Ventana extends javax.swing.JFrame {
    
    public Ventana() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        Registros = new javax.swing.JMenu();
        RegCliente = new javax.swing.JMenuItem();
        RegRestaurante = new javax.swing.JMenuItem();
        GenerarPedido = new javax.swing.JMenuItem();
        RegCategoria = new javax.swing.JMenuItem();
        GenPedido = new javax.swing.JMenuItem();
        Informacion = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        restaurante = new javax.swing.JMenuItem();
        producto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quick Order");
        setBackground(new java.awt.Color(51, 255, 204));
        setIconImages(null);
        setLocation(new java.awt.Point(500, 200));

        Inicio.setText("Inicio");
        jMenuBar2.add(Inicio);

        Registros.setText("Registros");
        Registros.setName(""); // NOI18N

        RegCliente.setText("Registrar Cliente");
        RegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegClienteActionPerformed(evt);
            }
        });
        Registros.add(RegCliente);

        RegRestaurante.setText("Registrar Restaurante");
        RegRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegRestauranteActionPerformed(evt);
            }
        });
        Registros.add(RegRestaurante);

        GenerarPedido.setText("Registrar Producto");
        GenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPedidoActionPerformed(evt);
            }
        });
        Registros.add(GenerarPedido);

        RegCategoria.setText("Registrar Categoria");
        RegCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCategoriaActionPerformed(evt);
            }
        });
        Registros.add(RegCategoria);

        GenPedido.setText("Generar Pedido");
        GenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenPedidoActionPerformed(evt);
            }
        });
        Registros.add(GenPedido);

        jMenuBar2.add(Registros);

        Informacion.setText("Informacion");

        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        Informacion.add(cliente);

        restaurante.setText("Restaurante");
        restaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restauranteActionPerformed(evt);
            }
        });
        Informacion.add(restaurante);

        producto.setText("Producto");
        Informacion.add(producto);

        jMenuBar2.add(Informacion);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegRestauranteActionPerformed
       RegistrarRestaurante registrarRestaurante = new RegistrarRestaurante();
       this.jDesktopPane1.add(registrarRestaurante);
       registrarRestaurante.show();
    }//GEN-LAST:event_RegRestauranteActionPerformed

    private void RegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClienteActionPerformed
       RegistrarCliente registrar = new RegistrarCliente();
       this.jDesktopPane1.add(registrar);
       registrar.show();
    }//GEN-LAST:event_RegClienteActionPerformed

    private void restauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restauranteActionPerformed
       InfoRestaurante infoRest = new InfoRestaurante();
       this.jDesktopPane1.add(infoRest);
       infoRest.show();
    }//GEN-LAST:event_restauranteActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        InfoCliente info = new InfoCliente();
        this.jDesktopPane1.add(info);
        info.show();
    }//GEN-LAST:event_clienteActionPerformed

    private void GenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPedidoActionPerformed
        RegistrarProducto registrarProducto = new RegistrarProducto();          
        this.jDesktopPane1.add(registrarProducto);
        registrarProducto.show();
    }//GEN-LAST:event_GenerarPedidoActionPerformed

    private void RegCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCategoriaActionPerformed
        RegistrarCategoria registrarCategoria = new RegistrarCategoria();
        this.jDesktopPane1.add(registrarCategoria);
        registrarCategoria.show();
    }//GEN-LAST:event_RegCategoriaActionPerformed

    private void GenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenPedidoActionPerformed
       GenerarPedido generarpedido = new GenerarPedido();
       this.jDesktopPane1.add(generarpedido);
       generarpedido.show();
    }//GEN-LAST:event_GenPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GenPedido;
    private javax.swing.JMenuItem GenerarPedido;
    private javax.swing.JMenu Informacion;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuItem RegCategoria;
    private javax.swing.JMenuItem RegCliente;
    private javax.swing.JMenuItem RegRestaurante;
    private javax.swing.JMenu Registros;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem restaurante;
    // End of variables declaration//GEN-END:variables
}
