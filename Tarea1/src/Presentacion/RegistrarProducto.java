/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Fabrica;
import Logica.IControladorPedido;
import Logica.IControladorProducto;
import Logica.IControladorUsuario;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistrarProducto extends javax.swing.JInternalFrame {
   
    private IControladorProducto ICP;

    /**
     * Creates new form RegistrarProducto
     */
    public RegistrarProducto() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICP = fabrica.getIControladorProducto();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botonoes = new javax.swing.ButtonGroup();
        IngreseDatosCliente = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        SeleccionarImagen = new javax.swing.JButton();
        Individual = new javax.swing.JRadioButton();
        Promocion = new javax.swing.JRadioButton();
        Productos = new javax.swing.JComboBox();
        SeleccioneProducto = new javax.swing.JLabel();
        Cant = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        ScrollProducto = new javax.swing.JScrollPane();
        Cantidad = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);

        IngreseDatosCliente.setText("Ingrese los siguientes datos:");

        CorreoElectronico.setText("Descripcion");

        Nombre.setText("Nombre");

        Apellido.setText("Precio");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        LabelImagen.setText("Imagen");
        LabelImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SeleccionarImagen.setText("Seleccionar Imagen");
        SeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarImagenActionPerformed(evt);
            }
        });

        Botonoes.add(Individual);
        Individual.setText("Individual");
        Individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndividualActionPerformed(evt);
            }
        });

        Botonoes.add(Promocion);
        Promocion.setText("Promocion");
        Promocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromocionActionPerformed(evt);
            }
        });

        Productos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });

        SeleccioneProducto.setText("Producto");

        Cant.setText("Cantidad");

        Agregar.setText("Agregar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(IngreseDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Individual)
                                    .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Promocion)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cant, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SeleccionarImagen))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(Registrar)
                                .addGap(60, 60, 60)
                                .addComponent(Cancelar))
                            .addComponent(ScrollProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Agregar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SeleccioneProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IngreseDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Individual)
                    .addComponent(Promocion))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoElectronico)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SeleccionarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cant)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeleccioneProducto))
                .addGap(18, 18, 18)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        //RegistrarCliente registrar = new RegistrarCliente();
        this.dispose();
        this.Individual.setSelected(false);
        this.Promocion.setSelected(false);
        this.txtNombre.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");
        this.Productos.setSelectedItem("");
        this.Cantidad.setValue("");
        this.ScrollProducto.setToolTipText("");
        //TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(!this.Individual.isSelected()){
            JOptionPane.showMessageDialog(this,"Seleccione si el producto es individual o promocion","REGISTRO",JOptionPane.WARNING_MESSAGE);
            Individual.requestFocus();
        } 
        if(!this.Promocion.isSelected()){
            JOptionPane.showMessageDialog(this,"Seleccione si el producto es individual o promocion","REGISTRO",JOptionPane.WARNING_MESSAGE);
            Promocion.requestFocus();
        }else if(this.Promocion.isSelected()){
           /* if(!this.Productos.getSelectedItem()){
            JOptionPane.showMessageDialog(this,"Ingrese el nombre","REGISTRO",JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocus();
        }*/
        } 
        
        if(this.txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese el nombre","REGISTRO",JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocus();
        }
        else if(this.txtDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese descripcion","REGISTRO",JOptionPane.WARNING_MESSAGE);
            txtDescripcion.requestFocus();
        }
        else if(this.txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese el precio","REGISTRO",JOptionPane.WARNING_MESSAGE);
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    File fichero;
    private void SeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarImagenActionPerformed
        // TODO add your handling code here:
        int resultado;

        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.FileChooser.setFileFilter(filtro);
        resultado= ventana.FileChooser.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado){
            fichero = ventana.FileChooser.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(LabelImagen.getWidth(), LabelImagen.getHeight(), Image.SCALE_DEFAULT));
                LabelImagen.setText(null);
                LabelImagen.setIcon( icono );

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
        }
    }//GEN-LAST:event_SeleccionarImagenActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosActionPerformed

    private void IndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndividualActionPerformed
        // TODO add your handling code here:
        this.SeleccioneProducto.setVisible(false);
        this.Productos.setVisible(false);
        this.Cant.setVisible(false);
        this.Cantidad.setVisible(false);
        this.Agregar.setVisible(false);
        this.ScrollProducto.setVisible(false);
    }//GEN-LAST:event_IndividualActionPerformed

    private void PromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromocionActionPerformed
        // TODO add your handling code here:
        this.SeleccioneProducto.setVisible(true);
        this.Productos.setVisible(true);
        this.Cant.setVisible(true);
        this.Cantidad.setVisible(true);
        this.Agregar.setVisible(true);
        this.ScrollProducto.setVisible(true);
    }//GEN-LAST:event_PromocionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Apellido;
    private javax.swing.ButtonGroup Botonoes;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cant;
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JRadioButton Individual;
    private javax.swing.JLabel IngreseDatosCliente;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel Nombre;
    private javax.swing.JComboBox Productos;
    private javax.swing.JRadioButton Promocion;
    private javax.swing.JButton Registrar;
    private javax.swing.JScrollPane ScrollProducto;
    private javax.swing.JButton SeleccionarImagen;
    private javax.swing.JLabel SeleccioneProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
