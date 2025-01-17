package distribuidos.sistemas.trabalho.clienteSoap.telas;


import distribuidos.sistemas.trabalho.clienteSoap.BuscarContato;
import distribuidos.sistemas.trabalho.clienteSoap.ExcluirContato;
import distribuidos.sistemas.trabalho.servicosoap.Contato;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class TelaExcluirContato extends javax.swing.JFrame {

    private Contato contato;

    /**
     * Creates new form TelaExcluirCliente /** Creates new form
     * TelaExcluirCliente
     */

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public TelaExcluirContato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodigoText = new javax.swing.JTextField();
        TextCod = new javax.swing.JLabel();
        ExcluirButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        Remov = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CodigoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTextActionPerformed(evt);
            }
        });

        TextCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextCod.setText("Código: ");

        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        Remov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Remov.setText("Remover Contato ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelarButton)
                        .addGap(9, 9, 9))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(Remov)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Remov, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExcluirButton)
                    .addComponent(CancelarButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed

        if (CodigoText.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Campo Cógigo é obrigatório!");
            return;
        }

        BuscarContato bc = new BuscarContato();

        contato = bc.buscar(Integer.parseInt(CodigoText.getText()));

        if (contato == null) {
            JOptionPane.showMessageDialog(this, "O contato informado não Existe");
            CodigoText.setText("");
        } else {
            ExcluirContato ex = new ExcluirContato();
                      

            if (ex.excluirContato(Integer.parseInt(CodigoText.getText()))) {

                JOptionPane.showMessageDialog(this, "Contato Excluído com Sucesso");
                CodigoText.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Excluir Contato");
            }
            CodigoText.setText("");
        }


    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void CodigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField CodigoText;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JLabel Remov;
    private javax.swing.JLabel TextCod;
    // End of variables declaration//GEN-END:variables
}
