package InterfazGrafica;

import Logica.Cliente;
import Logica.Evento;
import Logica.GestorEventos;
import Logica.GestorReservas;
import Logica.GestorUsuarios;
import Logica.Reserva;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ConsultaReservas extends javax.swing.JFrame {

    private GestorReservas gestorReservas;
    private GestorEventos gestorEventos;
    private Cliente clienteActual;
    private GestorUsuarios gestorUsuarios;
    
    public ConsultaReservas(GestorUsuarios gestorUsuarios, GestorReservas gestorReservas, GestorEventos gestorEventos, Cliente clienteActual) {
        this.gestorUsuarios = gestorUsuarios;
        this.gestorReservas = gestorReservas;  
        this.gestorEventos = gestorEventos;
        this.clienteActual = clienteActual;
        initComponents();
        cargarReservas();
    }
    private void cargarReservas() {
        DefaultTableModel model = (DefaultTableModel) tablaReservas.getModel();
        model.setRowCount(0);  // Limpiar tabla

        List<Reserva> reservas = gestorReservas.getReservas();

        for (Reserva r : reservas) {
            Cliente c = r.getCliente();
            Evento e = r.getEvento();

            Object[] fila = new Object[] {
                c.getNombre(),
                c.getCorreo(),
                c.isEsVIP() ? "Sí" : "No",
                e.getTitulo(),
                r.getCantidadEntradas(),
                r.getImporteTotal()
        };
        model.addRow(fila);
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Correo", "Vip", "Evento", "Cantidad", "Total(€)"
            }
        ));
        jScrollPane1.setViewportView(tablaReservas);

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
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(22, 22, 22))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaMenuAdministrador ventadm = new VentanaMenuAdministrador(gestorUsuarios, gestorEventos, gestorReservas, clienteActual);
        ventadm.setVisible(true);
        ventadm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables
}
