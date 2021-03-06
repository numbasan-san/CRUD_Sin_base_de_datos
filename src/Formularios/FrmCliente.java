/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

//El importe de las funciones usadas aquí.
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class FrmCliente extends javax.swing.JInternalFrame {
//Estos son los atributos que aquí se usan, son invocados aquí para poder usarlos sin problemas y que sea más fácil la escritura.
    private DefaultTableModel Mod;
    int Cont = 0;
    /**
     * Creates new form FrmCliente
     */
    //Esos métodos lo que hacen es ejecutar los métodos disponibles, cargar los datos y la interfaz de este formulario.
    public FrmCliente() {
        initComponents();
        CargarInterfaz();
        CargarDatos();
    }
    public void CargarDatos () {
        Cliente a;
        for ( int i = 0; i < MDIInicio.ListCli.size (); i++ ) {
            a = ( Cliente ) MDIInicio.ListCli.get( i );
            Mod.insertRow( Cont, new Object [] {} );
            Mod.setValueAt ( a.getNombre (), Cont, 0 );
            Mod.setValueAt ( a.getApellido (), Cont, 1 );
            Mod.setValueAt ( a.getCedula (), Cont, 2 );
            Mod.setValueAt ( a.getBalance (), Cont, 3 );
        }
    }
    public void CargarInterfaz(){
        String Datos [][] = {};
        String Columa [] = {"Nombre","Apellido", "Codigo", "Balance"};
        Mod = new DefaultTableModel ( Datos, Columa );
        Tablon.setModel ( Mod );
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tablon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BTN_Out = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Tablon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tablon);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Clientes");

        BTN_Out.setText("Salir");
        BTN_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(BTN_Out)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BTN_Out)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OutActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_BTN_OutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Out;
    private javax.swing.JTable Tablon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
