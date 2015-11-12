
import ejecutar.hacer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class egreso extends javax.swing.JInternalFrame {
    hacer mos=new hacer();
    int indice=0;
    int cuento=0,id=0;

ResultSet r=null;

    public egreso() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INGRESAR = new javax.swing.JButton();
        ot = new javax.swing.JTextField();
        otn = new javax.swing.JTextField();
        deposito = new javax.swing.JTextField();
        retiro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ELIMINAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EGRESOS");

        INGRESAR.setText("AGREGAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        ot.setBackground(new java.awt.Color(204, 255, 0));

        jLabel1.setText("DEPOSITO");

        jLabel2.setText("RETIRO");

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

        jLabel3.setText("FECHA");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "FECHA", "DESCRIPCION", "IMPORTE", "DEPOSITO", "RETIRO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("DESCRIPCION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(ot, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INGRESAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ELIMINAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MOSTRAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(otn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deposito, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(INGRESAR)
                            .addComponent(ELIMINAR)
                            .addComponent(MOSTRAR))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            r=mos.listar("select*from egreso where id_e>0 order by id_e");
            
            while(r.next()){
               a[0]=r.getInt("id_e");
               a[1]=r.getInt("f")+"/"+r.getInt("e")+"/"+r.getInt("c");
               a[2]=r.getString("nombre");
               a[3]=r.getDouble("ot");
               a[4]=r.getDouble("de");
               a[5]=r.getDouble("re");
                 cuento++;
                  modelo.addRow(a);
                jTable2.setModel(modelo);
            }
                      
        } catch(Exception error){
            System.out.println("Clase no encontrada");
        }
        r=null;
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
         try {
             r=null;
                String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL REGISTRO QUE DESEA ELIMINAR");
                mos.intro("delete egreso where id_e="+cod);
                if(mos.soplon()==1){JOptionPane.showMessageDialog(this,"eliminado correctamente","atencion",JOptionPane.PLAIN_MESSAGE);}
         } catch ( Exception e) {
            
            System.out.println(""+e);
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
       r=null;
       indice=0;
       r=mos.listar("select max(id_e) from egreso");
        try {
            while(r.next()){
                     indice=r.getInt(1);
                       }
        } catch (SQLException ex) {
            Logger.getLogger(egreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       indice++;
       r=null;
               String car="insert into egreso values("+indice+","+f.getText()+","+
               e.getText()+","+c.getText()+",'"+((!"".equals(ot.getText()))?ot.getText():"")+
               "',"+((!"".equals(otn.getText()))? otn.getText():0)+","+
               ((!"".equals(deposito.getText()))?deposito.getText():0)+
               ","+((!"".equals(retiro.getText()))?retiro.getText():0)+")";
       
       mos.intro(car);
              if(mos.soplon()==1){
                JOptionPane.showMessageDialog(this,"regiatrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
            this.f.setText("");
            this.e.setText("");
            this.c.setText("");
            this.ot.setText("");
            this.otn.setText("");
            this.deposito.setText("");
            this.retiro.setText("");
            this.f.requestFocus();}
        
    }//GEN-LAST:event_INGRESARActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JTextField c;
    private javax.swing.JTextField deposito;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField ot;
    private javax.swing.JTextField otn;
    private javax.swing.JTextField retiro;
    // End of variables declaration//GEN-END:variables
}
