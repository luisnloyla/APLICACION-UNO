import ejecutar.hacer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ingresos extends javax.swing.JInternalFrame {
  int indice=0;
    int cuento=0,id=0;

ResultSet r=null;
hacer mos=new hacer();

    public ingresos() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cfs = new javax.swing.JTextField();
        ccc = new javax.swing.JTextField();
        otro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ot = new javax.swing.JTextField();
        INGRESAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        e = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        COMI = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INGRESOS");

        jLabel1.setText("Contribucion para la obra mundial");

        jLabel2.setText("Contribucion para fondos de salones del reino");

        jLabel3.setText("Contribucion-caja de la congregacion");

        ot.setBackground(new java.awt.Color(255, 255, 102));

        INGRESAR.setText("INGRESAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        jLabel4.setText("FECHA");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "FECHA", "OBRA MUNDIAL", "FONDO DE SALONES ", "CAJA DE CONGREGACION", "OTROS", "CANTIDAD"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otro, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(ccc, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(cfs, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(COMI, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INGRESAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MOSTRAR)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(COMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR)
                    .addComponent(ELIMINAR)
                    .addComponent(MOSTRAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
       r=null;
       
       r=mos.listar("select max(id_in) from ingreso");
        try {
            while(r.next()){
                     indice=r.getInt(1);
                       }
        } catch (SQLException ex) {
            Logger.getLogger(egreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       indice++;
        
        
             r=null;
       String car="insert into ingreso values("+indice+","+
               f.getText()+","+
               e.getText()+","+
               c.getText()+
               ","+((!"".equals(COMI.getText()))?COMI.getText():0)+
               ","+((!"".equals(cfs.getText()))?cfs.getText():0)+","+
               ((!"".equals(ccc.getText()))?ccc.getText():0)+
               ",'"+((!"".equals(ot.getText()))?ot.getText():"")+
               "',"+((!"".equals(otro.getText()))?otro.getText():0)+")";
           mos.intro(car);
            
           if(mos.soplon()==1){
                JOptionPane.showMessageDialog(this,"regiatrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
            this.f.setText("");
            this.e.setText("");
            this.c.setText("");
            this.ot.setText("");
            this.COMI.setText("");
            this.cfs.setText("");
            this.ccc.setText("");
            this.otro.setText("");
            this.f.requestFocus();this.ot.setText("");}
        r=null;
    }//GEN-LAST:event_INGRESARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
       try {
             r=null;
                String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL REGISTRO QUE DESEA ELIMINAR");
                mos.intro("delete ingreso where id_in="+cod);
                if(mos.soplon()==1){JOptionPane.showMessageDialog(this,"eliminado correctamente","atencion",JOptionPane.PLAIN_MESSAGE);}
         } catch ( Exception e) {
            
            System.out.println(""+e);
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        DefaultTableModel modelo =(DefaultTableModel)jTable2.getModel();
        while(cuento!=0){
           modelo.removeRow(cuento-1);
           cuento--;
        }
        int i=0;
        Object[] a=new Object[100];
        
        
        try{
             r=null;
            r=mos.listar("select*from ingreso where id_in>0 order by id_in");
            while(r.next()){
                a[0]=r.getInt("id_in");
               a[1]=r.getInt("f")+"/"+r.getInt("e")+"/"+r.getInt("c");
               a[2]=r.getDouble("com");
               a[3]=r.getDouble("cfsr");
               a[4]=r.getDouble("ccc");
               a[5]=r.getString("nom_ott");
               a[6]=r.getDouble("ott");
                 cuento++;
                  modelo.addRow(a);
                jTable2.setModel(modelo);
            }
            r.close();
            
        } catch(Exception error){
            System.out.println("Clase no encontrada");
        }
        r=null;
    }//GEN-LAST:event_MOSTRARActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COMI;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JTextField c;
    private javax.swing.JTextField ccc;
    private javax.swing.JTextField cfs;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField ot;
    private javax.swing.JTextField otro;
    // End of variables declaration//GEN-END:variables
}
