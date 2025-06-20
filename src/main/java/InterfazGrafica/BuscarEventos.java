package InterfazGrafica;

import Logica.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.util.List;

public class BuscarEventos extends javax.swing.JFrame {

    private GestorUsuarios gestorUsuarios;
    private GestorEventos gestorEventos;
    private GestorReservas gestorReservas;
    private Cliente clienteActual;

    public BuscarEventos(GestorUsuarios gestorUsuarios, Cliente clienteActual) {
        this.gestorUsuarios = gestorUsuarios;
        this.clienteActual = clienteActual;
        this.gestorEventos = new GestorEventos();
        this.gestorReservas = new GestorReservas();
        initComponents();
        mostrarEventos(gestorEventos.listarEventos());
    }

    private void mostrarEventos(List<Evento> eventos) {
        DefaultTableModel modelo = (DefaultTableModel) tablaEventos.getModel();
        modelo.setRowCount(0);  // Limpiar tabla
        for (Evento e : eventos) {
            modelo.addRow(new Object[]{e.getTitulo(), e.getTipo(), e.getDireccion().getCiudad(), e.getPrecio()});
        }
    }

    private Evento obtenerEventoSeleccionado() {
        int fila = tablaEventos.getSelectedRow();
        if (fila == -1) {
            return null;
        }
        String titulo = (String) tablaEventos.getValueAt(fila, 0);
        for (Evento e : gestorEventos.listarEventos()) {
            if (e.getTitulo().equalsIgnoreCase(titulo)) {
                return e;
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscarTipo = new javax.swing.JButton();
        btnMostrarEventos = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarTipo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBuscarTipo.setText("Buscar por Tipo");
        btnBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoActionPerformed(evt);
            }
        });

        btnMostrarEventos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnMostrarEventos.setText("Mostrar Todos");
        btnMostrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEventosActionPerformed(evt);
            }
        });

        btnReservar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
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
                "Titulo", "Tipo", "Ciudad", "Precio(€)"
            }
        ));
        jScrollPane1.setViewportView(tablaEventos);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

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
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarEventos)
                    .addComponent(btnBuscarTipo)
                    .addComponent(btnReservar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnBuscarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnMostrarEventos)
                        .addGap(61, 61, 61)
                        .addComponent(btnReservar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoActionPerformed
        String tipo = txtBuscar.getText().trim();
        if (tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un tipo para buscar.");
            return;
        }
        List<Evento> eventosFiltrados = gestorEventos.buscarPorTipo(tipo);
        mostrarEventos(eventosFiltrados);
    }//GEN-LAST:event_btnBuscarTipoActionPerformed

    private void btnMostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventosActionPerformed
        mostrarEventos(gestorEventos.listarEventos());
    }//GEN-LAST:event_btnMostrarEventosActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        Evento evento = obtenerEventoSeleccionado();
        if (evento == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un evento para reservar.");
            return;
        }

        // Pedir fecha de reserva y cantidad de entradas
        String fechaStr = JOptionPane.showInputDialog(this, "Ingrese fecha y hora de reserva (formato: yyyy-MM-ddTHH:mm):");
        if (fechaStr == null || fechaStr.trim().isEmpty()) {
            return; // Canceló
        }
        LocalDateTime fechaSeleccionada;
        try {
            fechaSeleccionada = LocalDateTime.parse(fechaStr.trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto.");
            return;
        }

        String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese cantidad de entradas:");
        int cantidadEntradas;
        try {
            cantidadEntradas = Integer.parseInt(cantidadStr.trim());
            if (cantidadEntradas <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.");
            return;
        }

        try {
            gestorReservas.añadirReserva(clienteActual, evento, fechaSeleccionada, cantidadEntradas);
            JOptionPane.showMessageDialog(this, "Reserva realizada correctamente.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error al reservar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaMenuCliente ventclt = new VentanaMenuCliente(gestorUsuarios, gestorEventos, gestorReservas, clienteActual);
        ventclt.setVisible(true);
        ventclt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTipo;
    private javax.swing.JButton btnMostrarEventos;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEventos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
