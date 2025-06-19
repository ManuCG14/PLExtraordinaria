package InterfazGrafica;

import Logica.GestorUsuarios;
import Logica.GestorEventos;

public class VentanaMenuAdministrador extends javax.swing.JFrame {

    private GestorUsuarios gestorUsuarios;
    private GestorEventos gestorEventos;

    public VentanaMenuAdministrador(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionEventos = new javax.swing.JButton();
        btnConsultaReservas = new javax.swing.JButton();
        btnConsultaEventos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnConsultaUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Administrador");

        btnGestionEventos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnGestionEventos.setText("Gestión de Eventos");
        btnGestionEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEventosActionPerformed(evt);
            }
        });

        btnConsultaReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnConsultaReservas.setText("Consulta de Reservas");
        btnConsultaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaReservasActionPerformed(evt);
            }
        });

        btnConsultaEventos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnConsultaEventos.setText("Consulta de Eventos");
        btnConsultaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEventosActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnConsultaUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnConsultaUsuarios.setText("Consulta de Usuarios");
        btnConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnConsultaEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btnConsultaReservas)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnGestionEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultaUsuarios)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnGestionEventos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnConsultaUsuarios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaEventos)
                    .addComponent(btnConsultaReservas))
                .addGap(39, 39, 39)
                .addComponent(btnSalir)
                .addGap(47, 47, 47))
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

    private void btnGestionEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEventosActionPerformed
        GestionEventos gestionEventos = new GestionEventos(gestorUsuarios, gestorEventos);
        gestionEventos.setVisible(true);
        gestionEventos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGestionEventosActionPerformed

    private void btnConsultaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaReservasActionPerformed
        ConsultaReservas consultaReservas = new ConsultaReservas();
        consultaReservas.setVisible(true);
        consultaReservas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConsultaReservasActionPerformed

    private void btnConsultaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEventosActionPerformed
        ConsultaEventos consultaEventos = new ConsultaEventos();
        consultaEventos.setVisible(true);
        consultaEventos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConsultaEventosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Principal princ = new Principal(gestorUsuarios);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosActionPerformed
        ConsultaUsuarios consultaUsuarios = new ConsultaUsuarios();
        consultaUsuarios.setVisible(true);
        consultaUsuarios.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConsultaUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaEventos;
    private javax.swing.JButton btnConsultaReservas;
    private javax.swing.JButton btnConsultaUsuarios;
    private javax.swing.JButton btnGestionEventos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
