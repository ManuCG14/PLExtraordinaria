package InterfazGrafica;

import Logica.Cliente;
import Logica.GestorEventos;
import Logica.GestorUsuarios;


public class VentanaMenuCliente extends javax.swing.JFrame {

    private Cliente clienteActual;
    private GestorUsuarios gestorUsuarios;
    private GestorEventos gestorEventos;

    public VentanaMenuCliente(GestorUsuarios gestorUsuarios, GestorEventos gestorEventos, Cliente clienteActual) {
        this.gestorUsuarios = gestorUsuarios;
        this.gestorEventos = gestorEventos;
        this.clienteActual = clienteActual;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarEventos = new javax.swing.JButton();
        btnConsultarReservas = new javax.swing.JButton();
        btnModificarDatos = new javax.swing.JButton();
        btnReseñas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Cliente");

        btnBuscarEventos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBuscarEventos.setText("Buscar Eventos");
        btnBuscarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEventosActionPerformed(evt);
            }
        });

        btnConsultarReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnConsultarReservas.setText("Consultar Reservas");
        btnConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReservasActionPerformed(evt);
            }
        });

        btnModificarDatos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnModificarDatos.setText("Modificar Datos Personales");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        btnReseñas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnReseñas.setText("Hacer Reseña");
        btnReseñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseñasActionPerformed(evt);
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
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarEventos)
                    .addComponent(btnReseñas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarReservas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarDatos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarEventos)
                    .addComponent(btnConsultarReservas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarDatos)
                    .addComponent(btnReseñas))
                .addGap(66, 66, 66)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
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

    private void btnBuscarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEventosActionPerformed
        BuscarEventos buscar = new BuscarEventos(gestorUsuarios, clienteActual);
        buscar.setVisible(true);
        buscar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBuscarEventosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Principal princ = new Principal(gestorUsuarios, gestorEventos);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReservasActionPerformed
        ConsultaReservasCliente consultaReservasCliente = new ConsultaReservasCliente();
        consultaReservasCliente.setVisible(true);
        consultaReservasCliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConsultarReservasActionPerformed

    private void btnReseñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseñasActionPerformed
        Reseñas reseña = new Reseñas();
        reseña.setVisible(true);
        reseña.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReseñasActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        ModificarDatosPersonales modificar = new ModificarDatosPersonales(gestorUsuarios, gestorEventos, clienteActual);
        modificar.setVisible(true);
        modificar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnModificarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEventos;
    private javax.swing.JButton btnConsultarReservas;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnReseñas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
