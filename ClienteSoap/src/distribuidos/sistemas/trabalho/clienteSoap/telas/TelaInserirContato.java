package distribuidos.sistemas.trabalho.clienteSoap.telas;

import distribuidos.sistemas.trabalho.clienteSoap.BuscarCep;
import distribuidos.sistemas.trabalho.clienteSoap.BuscarCidade;
import distribuidos.sistemas.trabalho.clienteSoap.InserirCep;
import distribuidos.sistemas.trabalho.clienteSoap.InserirCidade;
import distribuidos.sistemas.trabalho.clienteSoap.InserirContato;
import distribuidos.sistemas.trabalho.servicosoap.Cep;
import distribuidos.sistemas.trabalho.servicosoap.Cidade;
import distribuidos.sistemas.trabalho.servicosoap.Contato;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class TelaInserirContato  extends javax.swing.JFrame{
    private Contato contato;
    private Cep cep;
         
    private Cidade cidade;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    /**
     * Creates new form TelaInserir
     */
    public TelaInserirContato() {
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textEmailAlt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        textComplemento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        textEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("Cidade");

        jLabel10.setText("Estado");

        jLabel5.setText("E-mail alternativo:");

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Complemento");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Inserir Contato");

        jLabel3.setText("Nome:");

        textCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCidadeKeyReleased(evt);
            }
        });

        jLabel4.setText("E-mail:");

        jLabel8.setText("CEP:");

        textCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCepKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(textNome)
                        .addComponent(textEmail)
                        .addComponent(jLabel5)
                        .addComponent(textEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cancelar)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(textCep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Cancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            contato = new Contato();
            //.trim() retira os digitos em brancos para testar se o user não digitou somente espaços
            contato.setNome(textNome.getText());
            if(contato.getNome().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Campo nome é obrigatório!");
                return;
            }
            contato.setEmail(textEmail.getText());
            if(contato.getEmail().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Campo email é obrigatório!");
                return;
            }

            String c = textCep.getText().trim();
            if(c.isEmpty()){
                JOptionPane.showMessageDialog(this, "Campo cep é obrigatório!");
                return;
            }
            //seta as propriedades
            contato.setEmailAlternativo(textEmailAlt.getText());
            contato.setEndereco(textEndereco.getText());
            contato.setComplemento(textComplemento.getText());
            
            //busca cep
            BuscarCep bc = new BuscarCep();
            cep = bc.buscar(Integer.parseInt(textCep.getText().trim()));
            if(cep== null){
                //se nao encontrou o cep busca a cidade
                if(textCidade.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Campo cidae é obrigatório!");
                    return;
                }
                if(textEstado.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Campo estado é obrigatório!");
                    return;
                }
                //busca a cidade pelo nome estado
                BuscarCidade buscarCidde = new BuscarCidade();
                cidade = buscarCidde.buscar(textCidade.getText(),textEstado.getText());
                if(cidade == null){
                    //se nao encontrou cria uma nova
                    cidade = new Cidade();
                    cidade.setNome(textCidade.getText());
                    cidade.setEstado(textEstado.getText());
                    InserirCidade ic = new InserirCidade();
                    if(!ic.inserir(cidade)){
                        JOptionPane.showMessageDialog(this, "Erro ao cadastrar cidade!");
                        return;
                    }
                }
                //cria novo cep e adiciona a cidade
                cep = new Cep();
                cep.setCep(Integer.parseInt(textCep.getText().trim()));
                cep.setCidade(cidade);
                InserirCep inserirCep = new InserirCep();
                if(!inserirCep.inserir(cep)){
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar cep!");
                    return;
                }
            }
            //adiciona o cep do contato
            contato.setCep(cep);
            //insere o contato
            InserirContato ic = new InserirContato();
            if(ic.inserir(contato)){
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
                limparCampos();
                cep = null;
                cidade = null;
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar");
            }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void textCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCidadeKeyReleased

    }//GEN-LAST:event_textCidadeKeyReleased

    private void textCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCepKeyReleased
        String campoCep = textCep.getText().trim();
        if(campoCep.isEmpty()){
            return;
        }
        Integer c = verificarDigitos(campoCep); 
        if(c == null){
            textCep.setText("");
            return;
        }
        if(campoCep.length()<7){
            return;
        }
        BuscarCep lc = new BuscarCep();
        
        cep = lc.buscar(c);

        if(cep!=null){
            textCidade.setEditable(false);
            textEstado.setEditable(false);
            textCidade.setText(cep.getCidade().getNome());
            textEstado.setText(cep.getCidade().getEstado());
            cidade = cep.getCidade();
        }else{
            textCidade.setEditable(true);
            textEstado.setEditable(true);
            cidade = null;
        }
    }//GEN-LAST:event_textCepKeyReleased


    private void limparCampos(){
        textCep.setText("");
        textCidade.setText("");
        textComplemento.setText("");
        textEmail.setText("");
        textEmailAlt.setText("");
        textEndereco.setText("");
        textEstado.setText("");
        textNome.setText("");
        textCep.setEditable(true);
        textCidade.setEditable(true);
        textEstado.setEditable(true);
    }
     private Integer verificarDigitos(String texto){
        Integer c = null ;
        try {
            c = Integer.parseInt(texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            return null;
        }
        return c;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textCep;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEmailAlt;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
