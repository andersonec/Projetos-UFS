package FrontEnd;
public class MenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form MenuCliente
     */
    public MenuGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        listarClientes = new javax.swing.JMenuItem();
        removerCliente = new javax.swing.JMenuItem();
        listarRemovidos = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        informacao = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1024, 900));
        setResizable(false);

        jInternalFrame1.setBackground(new java.awt.Color(1, 1, 1));
        jInternalFrame1.setForeground(new java.awt.Color(1, 1, 1));
        jInternalFrame1.setVisible(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/oie_transparent.png"))); // NOI18N

        jMenuBar1.setForeground(new java.awt.Color(255, 132, 0));

        menuCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuCliente.setForeground(new java.awt.Color(95, 94, 94));
        menuCliente.setText("CLIENTES");
        menuCliente.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N

        cadastrarCliente.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        cadastrarCliente.setForeground(new java.awt.Color(95, 94, 94));
        cadastrarCliente.setText("CADASTRAR");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(cadastrarCliente);

        listarClientes.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        listarClientes.setForeground(new java.awt.Color(95, 94, 94));
        listarClientes.setText("LISTAR CADASTRADOS");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
            }
        });
        menuCliente.add(listarClientes);

        removerCliente.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        removerCliente.setForeground(new java.awt.Color(95, 94, 94));
        removerCliente.setText("REMOVER");
        menuCliente.add(removerCliente);

        listarRemovidos.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        listarRemovidos.setForeground(new java.awt.Color(95, 94, 94));
        listarRemovidos.setText("LISTAR REMOVIDOS");
        menuCliente.add(listarRemovidos);

        jMenuBar1.add(menuCliente);

        menuProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProduto.setForeground(new java.awt.Color(95, 94, 94));
        menuProduto.setText("PRODUTOS");
        menuProduto.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem1.setText("ADICIONAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuProduto.add(jMenuItem1);

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(95, 94, 94));
        jMenu1.setText("CONSULTAR ESTOQUE");
        jMenu1.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem9.setText("CAMISETAS");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem10.setText("JAQUETAS");
        jMenu1.add(jMenuItem10);

        menuProduto.add(jMenu1);

        jMenuItem6.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem6.setText("ALTERAR QUANTIDADE");
        menuProduto.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem7.setText("CONSULTAR ESGOTADOS");
        menuProduto.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem8.setText("PROMOÇÕES");
        menuProduto.add(jMenuItem8);

        jMenuBar1.add(menuProduto);

        menuVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuVenda.setForeground(new java.awt.Color(95, 94, 94));
        menuVenda.setText("VENDAS");
        menuVenda.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem11.setText("NOVA VENDA");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuVenda.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem12.setText("LISTAR VENDAS");
        menuVenda.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem13.setText("BUSCAR CLIENTE");
        menuVenda.add(jMenuItem13);

        jMenuBar1.add(menuVenda);

        informacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informacao.setForeground(new java.awt.Color(95, 94, 94));
        informacao.setText("INFO");
        informacao.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N

        jMenuItem14.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(95, 94, 94));
        jMenuItem14.setText("INFORMAÇÕES");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        informacao.add(jMenuItem14);

        jMenuBar1.add(informacao);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Informacoes info = new Informacoes();
        info.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        CadastrarCliente cadastrarC = new CadastrarCliente();
        cadastrarC.setVisible(true);
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesActionPerformed
        // TODO add your handling code here:
        ListarClientes listarC = new ListarClientes();
        listarC.setVisible(true);
    }//GEN-LAST:event_listarClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenu informacao;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem listarClientes;
    private javax.swing.JMenuItem listarRemovidos;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem removerCliente;
    // End of variables declaration//GEN-END:variables
}
