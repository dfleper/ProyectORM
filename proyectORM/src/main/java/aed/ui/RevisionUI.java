package aed.ui;

import aed.dao.RevisionJpaController;
import aed.map.Coche;
import aed.map.Revision;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DOMINGO
 */
public class RevisionUI extends javax.swing.JFrame {

    DefaultTableModel modelo;
    RevisionJpaController revisionJpa = new RevisionJpaController();
    Revision revision = new Revision();
    Revision revisionAct = new Revision();

    /**
     * Creates new form Cliente
     */
    public RevisionUI() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Revisión");
        modelo.addColumn("Id Coche");
        modelo.addColumn("Filtro");
        modelo.addColumn("Aceite");
        modelo.addColumn("Frenos");
        modelo.addColumn("Fecha");
        this.jTabla.setModel(modelo);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        concesionarioUPEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("concesionarioUP").createEntityManager();
        cocheQuery = java.beans.Beans.isDesignTime() ? null : concesionarioUPEntityManager.createQuery("SELECT c FROM Coche c");
        cocheList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cocheQuery.getResultList();
        jpMercedes = new javax.swing.JPanel();
        lblMercedes = new javax.swing.JLabel();
        jpCoches = new javax.swing.JPanel();
        lblIdRevision = new javax.swing.JLabel();
        lblIdCoche = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        lblAceite = new javax.swing.JLabel();
        lblFrenos = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblRevision = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        txtIdRevision = new javax.swing.JTextField();
        jComboIdCoche = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        txtAceite = new javax.swing.JTextField();
        txtFrenos = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblDatos = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jpTabla = new javax.swing.JPanel();
        jspTabla = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Revisiones Concesionario");
        setResizable(false);

        lblMercedes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMercedes.setIcon(new javax.swing.ImageIcon("C:\\Users\\DOMINGO\\Documents\\NetBeansProjects\\proyectORM\\src\\main\\java\\aed\\ui\\img\\logo_lettersx56.png")); // NOI18N
        lblMercedes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpMercedesLayout = new javax.swing.GroupLayout(jpMercedes);
        jpMercedes.setLayout(jpMercedesLayout);
        jpMercedesLayout.setHorizontalGroup(
            jpMercedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMercedesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMercedes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMercedesLayout.setVerticalGroup(
            jpMercedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMercedesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblMercedes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblIdRevision.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdRevision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdRevision.setText("Id Revisión");
        lblIdRevision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblIdCoche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdCoche.setText("Id Coche");
        lblIdCoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblFiltro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltro.setText("Filtro");
        lblFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAceite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAceite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAceite.setText("Aceite");
        lblAceite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblFrenos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFrenos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrenos.setText("Frenos");
        lblFrenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");
        lblFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblRevision.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revisión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout jpCochesLayout = new javax.swing.GroupLayout(jpCoches);
        jpCoches.setLayout(jpCochesLayout);
        jpCochesLayout.setHorizontalGroup(
            jpCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdRevision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdCoche, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAceite, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFrenos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCochesLayout.setVerticalGroup(
            jpCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblIdRevision)
                .addGap(105, 105, 105)
                .addComponent(lblFrenos)
                .addGap(15, 15, 15)
                .addComponent(lblFecha))
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblFiltro))
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblIdCoche))
            .addGroup(jpCochesLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblAceite))
            .addComponent(lblRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtIdRevision.setEnabled(false);

        jComboIdCoche.setMinimumSize(new java.awt.Dimension(6, 20));
        jComboIdCoche.setPreferredSize(new java.awt.Dimension(6, 20));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cocheList, jComboIdCoche);
        bindingGroup.addBinding(jComboBoxBinding);

        lblDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtIdRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboIdCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jComboIdCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txtFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtIdRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jspTabla.setViewportView(jTabla);

        javax.swing.GroupLayout jpTablaLayout = new javax.swing.GroupLayout(jpTabla);
        jpTabla.setLayout(jpTablaLayout);
        jpTablaLayout.setHorizontalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jspTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );
        jpTablaLayout.setVerticalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTablaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jspTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpMercedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpCoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMercedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpCoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        JOptionPane.showMessageDialog(null, "Limpieza de Campos, Exitosa!!!");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        clickTabla();
    }//GEN-LAST:event_jTablaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarRevision();
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        modelo.setRowCount(0);
        llenarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarRevision();
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        modelo.setRowCount(0);
        llenarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void limpiarCampos() {
        txtIdRevision.setText("");
        txtFiltro.setText("");
        txtAceite.setText("");
        txtFrenos.setText("");
        txtFecha.setText("");
    }

    private void llenarTabla() {
        try {
            Object A[] = null;
            List<Revision> ListaRevisiones;
            ListaRevisiones = revisionJpa.findRevisionEntities();
            for (int i = 0; i < ListaRevisiones.size(); i++) {
                modelo.addRow(A);
                modelo.setValueAt(ListaRevisiones.get(i).getIdRevision(), i, 0);
                modelo.setValueAt(ListaRevisiones.get(i).getIdCoche(), i, 1);
                modelo.setValueAt(ListaRevisiones.get(i).getFiltro(), i, 2);
                modelo.setValueAt(ListaRevisiones.get(i).getAceite(), i, 3);
                modelo.setValueAt(ListaRevisiones.get(i).getFrenos(), i, 4);
                modelo.setValueAt(ListaRevisiones.get(i).getFecha(), i, 5);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void actualizarRevision() {
        revisionAct.setIdRevision(Integer.parseInt(txtIdRevision.getText()));
        revisionAct.setIdCoche((Coche) jComboIdCoche.getSelectedItem());
        revisionAct.setFiltro(txtFiltro.getText());
        revisionAct.setAceite(txtAceite.getText());
        revisionAct.setFrenos(txtFrenos.getText());
        String fecha = txtFecha.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaFormat = null;
        try {
            fechaFormat = format.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(RevisionUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Revisión Registrada con Exito!!!");
        revisionAct.setFecha(fechaFormat);
        limpiarCampos();
        try {
            revisionJpa.edit(revisionAct);
        } catch (Exception ex) {
            Logger.getLogger(RevisionUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarRevision() {
        revision.setIdCoche((Coche) jComboIdCoche.getSelectedItem());
        revision.setFiltro(txtFiltro.getText());
        revision.setAceite(txtAceite.getText());
        revision.setFrenos(txtFrenos.getText());
        String fecha = txtFecha.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaFormat = format.parse(fecha);
            revision.setFecha(fechaFormat);
            limpiarCampos();
            revisionJpa.create(revision);
            JOptionPane.showMessageDialog(null, "Revisión Registrada con Exito!!!");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de Fecha Erroneo, err: " + ex.toString());
        }
    }

    private void clickTabla() {
        Integer id = (Integer) jTabla.getValueAt(jTabla.getSelectedRow(), 0);
        Coche id2 = (Coche) jTabla.getValueAt(jTabla.getSelectedRow(), 1);
        String filtro = (String) jTabla.getValueAt(jTabla.getSelectedRow(), 2);
        String aceite = (String) jTabla.getValueAt(jTabla.getSelectedRow(), 3);
        String frenos = (String) jTabla.getValueAt(jTabla.getSelectedRow(), 4);
        Date fecha = (Date) jTabla.getValueAt(jTabla.getSelectedRow(), 5);
        txtIdRevision.setText(Integer.toString(id));
        jComboIdCoche.setSelectedItem(id2);
        txtFiltro.setText(filtro);
        txtAceite.setText(aceite);
        txtFrenos.setText(frenos);
        String dateToStr = String.format("%1$tY-%1$tm-%1$td", fecha);
        txtFecha.setText(dateToStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private java.util.List<aed.map.Coche> cocheList;
    private javax.persistence.Query cocheQuery;
    private javax.persistence.EntityManager concesionarioUPEntityManager;
    private javax.swing.JComboBox<String> jComboIdCoche;
    private javax.swing.JTable jTabla;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCoches;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpMercedes;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JScrollPane jspTabla;
    private javax.swing.JLabel lblAceite;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblFrenos;
    private javax.swing.JLabel lblIdCoche;
    private javax.swing.JLabel lblIdRevision;
    private javax.swing.JLabel lblMercedes;
    private javax.swing.JLabel lblRevision;
    private javax.swing.JTextField txtAceite;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtFrenos;
    private javax.swing.JTextField txtIdRevision;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
