package InterfazGrafica;

import Logica.Cliente;
import Logica.Evento;
import Logica.GestorEventos;
import Logica.GestorUsuarios;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import Logica.Direccion;

public class GestionEventos extends javax.swing.JFrame {

    private GestorUsuarios gestorUsuarios;
    private GestorEventos gestorEventos;
    private Cliente clienteActual;
    
    public GestionEventos(GestorUsuarios gestorUsuarios, GestorEventos gestorEventos) {
        this.gestorUsuarios = gestorUsuarios;
        this.gestorEventos = gestorEventos; 
        initComponents();
        cargarTablaEventos();
    }
    private void cargarTablaEventos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEventos.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        List<Evento> lista = gestorEventos.listarEventos();
        for (Evento e : lista) {
            modelo.addRow(new Object[]{
                e.getTitulo(),
                e.getTipo(),
                e.getDireccion().getCiudad(),
                e.getPrecio()
            });
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tablaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Tipo", "Ciudad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaEventos);

        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnAgregar)
                        .addGap(41, 41, 41)
                        .addComponent(btnEditar)
                        .addGap(37, 37, 37)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnSalir)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaEventos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un evento para eliminar.");
            return;
        }

        String titulo = (String) tablaEventos.getValueAt(fila, 0);
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el evento?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = gestorEventos.eliminarEvento(titulo);
            if (eliminado) {
                cargarTablaEventos();
                JOptionPane.showMessageDialog(this, "Evento eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el evento.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String titulo = JOptionPane.showInputDialog(this, "Título del evento:");
        String tipo = JOptionPane.showInputDialog(this, "Tipo del evento:");
        String ciudad = JOptionPane.showInputDialog(this, "Ciudad:");
        double precio;

        try {
            precio = Double.parseDouble(JOptionPane.showInputDialog(this, "Precio:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio inválido.");
            return;
        }

        Evento nuevo = new Evento(titulo, tipo, precio, new Direccion(ciudad));
        gestorEventos.agregarEvento(nuevo);
        cargarTablaEventos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tablaEventos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un evento para editar.");
            return;
        }

        String tituloOriginal = (String) tablaEventos.getValueAt(fila, 0);

        String nuevoTitulo = JOptionPane.showInputDialog(this, "Nuevo título:", tituloOriginal);
        String tipo = JOptionPane.showInputDialog(this, "Nuevo tipo:");
        String ciudad = JOptionPane.showInputDialog(this, "Nueva ciudad:");
        double precio;

        try {
            precio = Double.parseDouble(JOptionPane.showInputDialog(this, "Nuevo precio:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio inválido.");
            return;
        }

        Evento modificado = new Evento(nuevoTitulo, tipo, precio, new Direccion(ciudad));
        boolean resultado = gestorEventos.modificarEvento(tituloOriginal, modificado);

        if (resultado) {
            cargarTablaEventos();
            JOptionPane.showMessageDialog(this, "Evento modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el evento original.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaMenuAdministrador ventadm = new VentanaMenuAdministrador(gestorUsuarios, gestorEventos, clienteActual);
        ventadm.setVisible(true);
        ventadm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEventos;
    // End of variables declaration//GEN-END:variables
}
