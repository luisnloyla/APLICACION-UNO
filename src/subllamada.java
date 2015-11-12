import java.sql.*;
import ejecutar.hacer;
import javax.swing.JOptionPane;
public class subllamada extends javax.swing.JInternalFrame {
hacer mos=new hacer();
  
    public subllamada() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        COMPROBANDO = new javax.swing.JButton();
        añito = new javax.swing.JTextField();
        mesesito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        COMPROBANDO.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        COMPROBANDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BOTON2.gif"))); // NOI18N
        COMPROBANDO.setContentAreaFilled(false);
        COMPROBANDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPROBANDOActionPerformed(evt);
            }
        });

        añito.setFont(new java.awt.Font("Comic Sans MS", 1, 18));

        mesesito.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel1.setText("MES");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel2.setText("AÑO");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel3.setText("AQUI SE BORRA TODO UN MES(E/I)");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMPROBANDO, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesesito, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(añito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(COMPROBANDO, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COMPROBANDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPROBANDOActionPerformed
           
    }//GEN-LAST:event_COMPROBANDOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ResultSet r=null;int s=0;
            mos.intro("delete ingreso where e="+this.mesesito.getText()+"and c="+this.añito.getText());
            s=s+mos.soplon();
            r=null;
            mos.intro("delete egreso where e="+this.mesesito.getText()+"and c="+this.añito.getText());
            s=s+mos.soplon();
            if(s==1)JOptionPane.showMessageDialog(this,"se ha borrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
            else if(s==2)JOptionPane.showMessageDialog(this,"se ha borrado de las dos tablas correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COMPROBANDO;
    private javax.swing.JTextField añito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mesesito;
    // End of variables declaration//GEN-END:variables
}
