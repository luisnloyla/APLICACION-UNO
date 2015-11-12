import conexion.conex;
import java.sql.Connection;
public class menu extends javax.swing.JFrame {
int a=0;
    public menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bb = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        INGRESOS = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        CONSULTAS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));

        bb.setBackground(new java.awt.Color(0, 0, 102));
        bb.setForeground(new java.awt.Color(51, 0, 204));
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        jMenu1.setText("PROGRAMA");

        INGRESOS.setIcon(new javax.swing.ImageIcon("D:\\Carpeta nueva\\JavaApplication4_1\\src\\ICONOS\\LIO2.jpg")); // NOI18N
        INGRESOS.setText("INGRESOS");
        INGRESOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESOSActionPerformed(evt);
            }
        });
        jMenu1.add(INGRESOS);

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\Carpeta nueva\\JavaApplication4_1\\src\\ICONOS\\LIO3.png")); // NOI18N
        jMenuItem1.setText("EGRESOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        CONSULTAS.setIcon(new javax.swing.ImageIcon("D:\\Carpeta nueva\\JavaApplication4_1\\src\\ICONOS\\LIO4.png")); // NOI18N
        CONSULTAS.setText("CONSULTAS");
        CONSULTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTASActionPerformed(evt);
            }
        });
        jMenu1.add(CONSULTAS);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 204, 0));
        jMenu2.setText("OTRO");

        jMenu3.setText("CONSULTITA");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu3);

        jMenuItem2.setText("CREAR_BD");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESOSActionPerformed
         ingresos nuevo=new ingresos();
       bb.add(nuevo);
       nuevo.show();
    }//GEN-LAST:event_INGRESOSActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       egreso nuevo =new egreso();
       bb.add(nuevo);
       nuevo.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CONSULTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTASActionPerformed
        consultas nuevo =new consultas();
      bb.add(nuevo);
       nuevo.show();
    }//GEN-LAST:event_CONSULTASActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        subllamada nuevo =new subllamada();
        
      
         bb.add(nuevo);
         a=1;
       nuevo.show();
        
        
    }//GEN-LAST:event_bbActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
         subllamada nuevo =new subllamada();
         bb.add(nuevo);
       nuevo.show();
//       nuevo.exit(0);
         
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        conex crear=new conex().getInstancia();
        Connection crear2=crear.abrir();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CONSULTAS;
    private javax.swing.JMenuItem INGRESOS;
    private javax.swing.JButton bb;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
