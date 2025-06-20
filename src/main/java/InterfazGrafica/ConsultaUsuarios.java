package InterfazGrafica;

import Logica.Administrador;
import Logica.Cliente;
import Logica.GestorEventos;
import Logica.GestorReservas;
import Logica.GestorUsuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ConsultaUsuarios extends javax.swing.JFrame {

    private GestorUsuarios gestorUsuarios;
    private GestorEventos gestorEventos;
    private Cliente clienteActual;
    private GestorReservas gestorReservas;

    public ConsultaUsuarios(GestorUsuarios gestorUsuarios, GestorEventos gestorEventos, Cliente clienteActual) {
        this.gestorUsuarios = gestorUsuarios;
        this.gestorEventos = gestorEventos;
        this.gestorReservas = gestorReservas;
        this.clienteActual = clienteActual;
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrarTodos = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarCorreo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMostrarTodos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnMostrarTodos.setText("Mostrar Todos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscarCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBuscarCorreo.setText("Buscar por Correo");
        btnBuscarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCorreoActionPerformed(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

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
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarTodos)
                    .addComponent(btnBuscarCorreo)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnBuscarCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnMostrarTodos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        List<Cliente> clientes = gestorUsuarios.listarClientes();
        List<Administrador> administradores = gestorUsuarios.listarAdministradores();

        List<Object[]> datos = new ArrayList<>();

        for (Cliente c : clientes) {
            datos.add(new Object[]{c.getNombre(), c.getCorreo(), "Cliente"});
        }
        for (Administrador a : administradores) {
            datos.add(new Object[]{a.getCorreo(), a.getCorreo(), "Administrador"}); // asumimos que nombre = correo para administradores
        }

        cargarTabla(datos);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnBuscarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorreoActionPerformed
        String correo = txtBuscar.getText().trim();
        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un correo.");
            return;
        }

        List<Object[]> resultado = new ArrayList<>();

        Cliente c = gestorUsuarios.buscarClientePorCorreo(correo);
        if (c != null) {
            resultado.add(new Object[]{c.getNombre(), c.getCorreo(), "Cliente"});
        } else {
            Administrador a = gestorUsuarios.buscarAdministradorPorCorreo(correo);
            if (a != null) {
                resultado.add(new Object[]{a.getCorreo(), a.getCorreo(), "Administrador"});
            }
        }

        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese correo.");
        } else {
            cargarTabla(resultado);
        }    }//GEN-LAST:event_btnBuscarCorreoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaMenuAdministrador ventadm = new VentanaMenuAdministrador(gestorUsuarios, gestorEventos, gestorReservas, clienteActual);
        ventadm.setVisible(true);
        ventadm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void cargarTabla(List<Object[]> filas) {
        String[] columnas = {"Nombre", "Correo", "Tipo"};
        Object[][] datos = new Object[filas.size()][3];

        for (int i = 0; i < filas.size(); i++) {
            datos[i] = filas.get(i);
        }

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCorreo;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
