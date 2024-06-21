
package lumina.View;

import javax.swing.*;
import java.io.*;
import luminabe.Model.Empresa.ListaEmpresas;
import luminabe.Model.Empresa.*;

public class TelaAdm extends javax.swing.JFrame {

    /** Creates new form TelaAdm */
    public TelaAdm() {
        initComponents();
    }
    private boolean camposHabilitados = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdm = new javax.swing.JPanel();
        panelBanner = new javax.swing.JPanel();
        txtAdm = new javax.swing.JLabel();
        painelSuporte = new javax.swing.JPanel();
        panelVerdeDecorativo2 = new javax.swing.JPanel();
        txtGerBlog1 = new javax.swing.JLabel();
        txtChamados = new javax.swing.JLabel();
        btnResponderChamado = new javax.swing.JButton();
        btnFinalizarChamado = new javax.swing.JButton();
        txtChamadosFinalizados = new javax.swing.JLabel();
        boxChamadosFinalizados = new javax.swing.JComboBox<>();
        btnReabrirChamado = new javax.swing.JButton();
        btnApagarChamado = new javax.swing.JButton();
        jScrollChamadosAbertos = new javax.swing.JScrollPane();
        jListChamadosAbertos = new javax.swing.JList<>();
        txtBuscaChamados = new javax.swing.JLabel();
        fieldBuscaChamado = new javax.swing.JTextField();
        painelGerBlog = new javax.swing.JPanel();
        panelVerdeDecorativo1 = new javax.swing.JPanel();
        txtGerBlog = new javax.swing.JLabel();
        fieldNoticia = new javax.swing.JTextField();
        txtInserirNoticia = new javax.swing.JLabel();
        txtBlog = new javax.swing.JLabel();
        btnUploadFoto = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        txtNoticiasPostadas = new javax.swing.JLabel();
        boxListaDeNoticias = new javax.swing.JComboBox<>();
        btnEditarNoticia = new javax.swing.JButton();
        btnApagarNotícia = new javax.swing.JButton();
        painelGerEmpresa = new javax.swing.JPanel();
        panelVerdeDecorativo3 = new javax.swing.JPanel();
        txtGerEmpresa = new javax.swing.JLabel();
        txtEmpresasCadastradas = new javax.swing.JLabel();
        btnEditarCadastro = new javax.swing.JButton();
        jScrollEmpresasCadastradas = new javax.swing.JScrollPane();
        jListEmpresasCadastradas = new javax.swing.JList<>();
        txtBusca = new javax.swing.JLabel();
        fieldBusca = new javax.swing.JTextField();
        txtNomeEmp = new javax.swing.JLabel();
        txtEmailEmp = new javax.swing.JLabel();
        txtTelEmp = new javax.swing.JLabel();
        txtSenhaGer = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        boxTipos = new javax.swing.JComboBox<>();
        fieldNomeEmp = new javax.swing.JTextField();
        fieldEmailEmp = new javax.swing.JTextField();
        fieldTelEmp = new javax.swing.JTextField();
        fieldSenhaGer = new javax.swing.JTextField();
        btnSalvarCadastro = new javax.swing.JButton();
        btnApagarCadastro = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        panelVerdeDecorativo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAdm.setBackground(new java.awt.Color(51, 51, 51));

        panelBanner.setBackground(new java.awt.Color(0, 102, 102));

        txtAdm.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtAdm.setForeground(new java.awt.Color(255, 255, 255));
        txtAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdm.setText("Adminstrador Lumina");

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuporte.setBackground(new java.awt.Color(51, 51, 51));
        painelSuporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelSuporte.setForeground(new java.awt.Color(102, 102, 102));

        panelVerdeDecorativo2.setBackground(new java.awt.Color(0, 102, 102));

        txtGerBlog1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtGerBlog1.setForeground(new java.awt.Color(255, 255, 255));
        txtGerBlog1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGerBlog1.setText("Suporte");

        javax.swing.GroupLayout panelVerdeDecorativo2Layout = new javax.swing.GroupLayout(panelVerdeDecorativo2);
        panelVerdeDecorativo2.setLayout(panelVerdeDecorativo2Layout);
        panelVerdeDecorativo2Layout.setHorizontalGroup(
            panelVerdeDecorativo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerBlog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVerdeDecorativo2Layout.setVerticalGroup(
            panelVerdeDecorativo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerBlog1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        txtChamados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtChamados.setForeground(new java.awt.Color(204, 204, 204));
        txtChamados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtChamados.setText("Chamados abertos:");

        btnResponderChamado.setBackground(new java.awt.Color(0, 102, 102));
        btnResponderChamado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnResponderChamado.setForeground(new java.awt.Color(255, 255, 255));
        btnResponderChamado.setText("Responder");
        btnResponderChamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResponderChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderChamadoActionPerformed(evt);
            }
        });

        btnFinalizarChamado.setBackground(new java.awt.Color(0, 102, 51));
        btnFinalizarChamado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFinalizarChamado.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarChamado.setText("Finalizar");
        btnFinalizarChamado.setToolTipText("");
        btnFinalizarChamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalizarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarChamadoActionPerformed(evt);
            }
        });

        txtChamadosFinalizados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtChamadosFinalizados.setForeground(new java.awt.Color(204, 204, 204));
        txtChamadosFinalizados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtChamadosFinalizados.setText("Chamados Finalizados");

        boxChamadosFinalizados.setBackground(new java.awt.Color(102, 102, 102));
        boxChamadosFinalizados.setEditable(true);
        boxChamadosFinalizados.setForeground(new java.awt.Color(255, 255, 255));
        boxChamadosFinalizados.setMaximumRowCount(100000);
        boxChamadosFinalizados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20 - 31.05.2024 - Minato Namikaze", "11 - 02.05.2024 - Jiraiya", "12 - 05.05.2024 - Orochimaru", "13 - 09.05.2024 - Itachi Uchiha", "14 - 13.05.2024 - Temari", "15 - 16.05.2024 - Kiba Inuzuka", "16 - 19.05.2024 - Choji Akimichi", "17 - 22.05.2024 - Sai", "18 - 25.05.2024 - Tenten", "19 - 28.05.2024 - Kankuro" }));
        boxChamadosFinalizados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReabrirChamado.setBackground(new java.awt.Color(0, 102, 102));
        btnReabrirChamado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnReabrirChamado.setForeground(new java.awt.Color(255, 255, 255));
        btnReabrirChamado.setText("Reabrir");
        btnReabrirChamado.setToolTipText("");
        btnReabrirChamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReabrirChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReabrirChamadoActionPerformed(evt);
            }
        });

        btnApagarChamado.setBackground(new java.awt.Color(102, 0, 0));
        btnApagarChamado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnApagarChamado.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarChamado.setText("Apagar");
        btnApagarChamado.setToolTipText("");
        btnApagarChamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApagarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarChamadoActionPerformed(evt);
            }
        });

        jListChamadosAbertos.setBackground(new java.awt.Color(102, 102, 102));
        jListChamadosAbertos.setBorder(new javax.swing.border.MatteBorder(null));
        jListChamadosAbertos.setForeground(new java.awt.Color(255, 255, 255));
        jListChamadosAbertos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01 - 01.05.2024 - Naruto Uzumaki", "02 - 04.05.2024 - Sasuke Uchiha", "03 - 08.05.2024 - Sakura Haruno", "04 - 12.05.2024 - Kakashi Hatake", "05 - 15.05.2024 - Hinata Hyuga", "06 - 18.05.2024 - Shikamaru Nara", "07 - 21.05.2024 - Gaara", "08 - 24.05.2024 - Rock Lee", "09 - 27.05.2024 - Sai", "10 - 30.05.2024 - Tsunade Senju", "11 - 02.05.2024 - Jiraiya", "12 - 05.05.2024 - Orochimaru", "13 - 09.05.2024 - Itachi Uchiha", "14 - 13.05.2024 - Temari", "15 - 16.05.2024 - Kiba Inuzuka", "16 - 19.05.2024 - Choji Akimichi", "17 - 22.05.2024 - Neji Hyuga", "18 - 25.05.2024 - Tenten", "19 - 28.05.2024 - Kankuro", "20 - 31.05.2024 - Minato Namikaze" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListChamadosAbertos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListChamadosAbertos.setToolTipText("");
        jListChamadosAbertos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListChamadosAbertos.setEnabled(false);
        jListChamadosAbertos.setInheritsPopupMenu(true);
        jListChamadosAbertos.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollChamadosAbertos.setViewportView(jListChamadosAbertos);

        txtBuscaChamados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscaChamados.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscaChamados.setText("Busca");

        fieldBuscaChamado.setBackground(new java.awt.Color(60, 60, 60));
        fieldBuscaChamado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        javax.swing.GroupLayout painelSuporteLayout = new javax.swing.GroupLayout(painelSuporte);
        painelSuporte.setLayout(painelSuporteLayout);
        painelSuporteLayout.setHorizontalGroup(
            painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelSuporteLayout.createSequentialGroup()
                .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtChamados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelSuporteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelSuporteLayout.createSequentialGroup()
                                .addComponent(txtBuscaChamados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldBuscaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelSuporteLayout.createSequentialGroup()
                                    .addComponent(btnApagarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReabrirChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(boxChamadosFinalizados, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelSuporteLayout.createSequentialGroup()
                                    .addComponent(btnResponderChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                    .addComponent(btnFinalizarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtChamadosFinalizados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollChamadosAbertos, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        painelSuporteLayout.setVerticalGroup(
            painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteLayout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtChamados)
                .addGap(15, 15, 15)
                .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fieldBuscaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(txtBuscaChamados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollChamadosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResponderChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtChamadosFinalizados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxChamadosFinalizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReabrirChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        painelGerBlog.setBackground(new java.awt.Color(51, 51, 51));
        painelGerBlog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelGerBlog.setForeground(new java.awt.Color(102, 102, 102));

        panelVerdeDecorativo1.setBackground(new java.awt.Color(0, 102, 102));

        txtGerBlog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtGerBlog.setForeground(new java.awt.Color(255, 255, 255));
        txtGerBlog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGerBlog.setText("Gerenciar Blog");

        javax.swing.GroupLayout panelVerdeDecorativo1Layout = new javax.swing.GroupLayout(panelVerdeDecorativo1);
        panelVerdeDecorativo1.setLayout(panelVerdeDecorativo1Layout);
        panelVerdeDecorativo1Layout.setHorizontalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerBlog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVerdeDecorativo1Layout.setVerticalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerBlog)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        fieldNoticia.setBackground(new java.awt.Color(89, 89, 89));
        fieldNoticia.setForeground(new java.awt.Color(204, 204, 204));
        fieldNoticia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldNoticia.setToolTipText("");
        fieldNoticia.setBorder(new javax.swing.border.MatteBorder(null));
        fieldNoticia.setCaretColor(new java.awt.Color(204, 204, 204));
        fieldNoticia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldNoticia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoticiaActionPerformed(evt);
            }
        });

        txtInserirNoticia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtInserirNoticia.setForeground(new java.awt.Color(204, 204, 204));
        txtInserirNoticia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInserirNoticia.setText("Inserir notícia");

        txtBlog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBlog.setForeground(new java.awt.Color(255, 255, 255));
        txtBlog.setText("Escreva a notícia aqui:");

        btnUploadFoto.setBackground(new java.awt.Color(0, 102, 102));
        btnUploadFoto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUploadFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadFoto.setText("Upload de foto");
        btnUploadFoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUploadFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFotoActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(0, 102, 102));
        btnEnviar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtNoticiasPostadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNoticiasPostadas.setForeground(new java.awt.Color(204, 204, 204));
        txtNoticiasPostadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNoticiasPostadas.setText("Notícias já postadas");

        boxListaDeNoticias.setBackground(new java.awt.Color(102, 102, 102));
        boxListaDeNoticias.setEditable(true);
        boxListaDeNoticias.setForeground(new java.awt.Color(255, 255, 255));
        boxListaDeNoticias.setMaximumRowCount(100000);
        boxListaDeNoticias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30/05/2024 - Energia Limpa", "Item 2", "Item 3", "Item 4" }));
        boxListaDeNoticias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEditarNoticia.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarNoticia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditarNoticia.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarNoticia.setText("Editar");
        btnEditarNoticia.setToolTipText("");
        btnEditarNoticia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarNoticia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarNoticiaActionPerformed(evt);
            }
        });

        btnApagarNotícia.setBackground(new java.awt.Color(102, 0, 0));
        btnApagarNotícia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnApagarNotícia.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarNotícia.setText("Apagar");
        btnApagarNotícia.setToolTipText("");
        btnApagarNotícia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApagarNotícia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarNotíciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGerBlogLayout = new javax.swing.GroupLayout(painelGerBlog);
        painelGerBlog.setLayout(painelGerBlogLayout);
        painelGerBlogLayout.setHorizontalGroup(
            painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelGerBlogLayout.createSequentialGroup()
                .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGerBlogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtInserirNoticia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelGerBlogLayout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxListaDeNoticias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBlog, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNoticia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelGerBlogLayout.createSequentialGroup()
                                .addComponent(btnUploadFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNoticiasPostadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelGerBlogLayout.createSequentialGroup()
                                .addComponent(btnApagarNotícia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerBlogLayout.setVerticalGroup(
            painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerBlogLayout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInserirNoticia)
                .addGap(11, 11, 11)
                .addComponent(txtBlog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtNoticiasPostadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxListaDeNoticias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarNotícia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGerEmpresa.setBackground(new java.awt.Color(51, 51, 51));
        painelGerEmpresa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelGerEmpresa.setForeground(new java.awt.Color(102, 102, 102));

        panelVerdeDecorativo3.setBackground(new java.awt.Color(0, 102, 102));

        txtGerEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtGerEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        txtGerEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGerEmpresa.setText("Gerenciar Empresas");

        javax.swing.GroupLayout panelVerdeDecorativo3Layout = new javax.swing.GroupLayout(panelVerdeDecorativo3);
        panelVerdeDecorativo3.setLayout(panelVerdeDecorativo3Layout);
        panelVerdeDecorativo3Layout.setHorizontalGroup(
            panelVerdeDecorativo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVerdeDecorativo3Layout.setVerticalGroup(
            panelVerdeDecorativo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeDecorativo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGerEmpresa)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        txtEmpresasCadastradas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmpresasCadastradas.setForeground(new java.awt.Color(204, 204, 204));
        txtEmpresasCadastradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmpresasCadastradas.setText("Empresas cadastradas");

        btnEditarCadastro.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCadastro.setText("Editar");
        btnEditarCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarCadastroMouseClicked(evt);
            }
        });
        btnEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroActionPerformed(evt);
            }
        });

        jListEmpresasCadastradas.setBackground(new java.awt.Color(102, 102, 102));
        jListEmpresasCadastradas.setBorder(new javax.swing.border.MatteBorder(null));
        jListEmpresasCadastradas.setForeground(new java.awt.Color(255, 255, 255));
        jListEmpresasCadastradas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01 - EcoVita - Energia Renovável", "02 - Verde Horizonte - Paisagismo Sustentável", "03 - BioCycle - Gestão de Resíduos", "04 - SolaraTech - Painéis Solares", "05 - AquaPure - Purificação de Água", "06 - ReFloresta - Reflorestamento Urbano", "07 - EcoMove - Transporte Sustentável", "08 - TerraCycle - Reciclagem Inovadora", "09 - GreenHouse - Agricultura Urbana", "10 - BioEnergize - Biocombustíveis", "11 - EcoWave - Energia das Ondas", "12 - PureAir - Filtros de Ar Naturais", "13 - NatureTech - Tecnologia Verde", "14 - GreenFiber - Têxteis Sustentáveis", "15 - SolarVista - Energia Solar Residencial", "16 - EcoBuild - Construção Sustentável", "17 - EarthCare - Conservação Ambiental", "18 - ReCycleUp - Upcycling de Resíduos", "19 - GreenLeaf - Produtos Orgânicos", "20 - AquaGuard - Proteção dos Oceanos", "21 - BioHarvest - Agricultura Biológica", "22 - EcoClean - Limpeza Ecológica", "23 - GreenWatt - Energia Eólica", "24 - NatureCycle - Ciclo de Vida Sustentável", "25 - PureSoil - Recuperação de Solo", "26 - EcoFootprint - Consultoria Ambiental", "27 - GreenGlow - Iluminação LED", "28 - BioPlast - Plásticos Biodegradáveis", "29 - FreshEco - Produtos Naturais", "30 - SolarWind - Energia Híbrida" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListEmpresasCadastradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListEmpresasCadastradas.setToolTipText("");
        jListEmpresasCadastradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListEmpresasCadastradas.setEnabled(false);
        jListEmpresasCadastradas.setInheritsPopupMenu(true);
        jListEmpresasCadastradas.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollEmpresasCadastradas.setViewportView(jListEmpresasCadastradas);

        txtBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBusca.setForeground(new java.awt.Color(153, 153, 153));
        txtBusca.setText("Busca");

        fieldBusca.setBackground(new java.awt.Color(60, 60, 60));
        fieldBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        txtNomeEmp.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeEmp.setText("Nome");

        txtEmailEmp.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailEmp.setText("E-mail");

        txtTelEmp.setForeground(new java.awt.Color(255, 255, 255));
        txtTelEmp.setText("Telefone");

        txtSenhaGer.setForeground(new java.awt.Color(255, 255, 255));
        txtSenhaGer.setText("Senha de Acesso");

        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo.setText("Tipo");

        boxTipos.setBackground(new java.awt.Color(102, 102, 102));
        boxTipos.setForeground(new java.awt.Color(255, 255, 255));
        boxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prestadora", "Contratante", "Ambos" }));

        fieldNomeEmp.setEditable(false);
        fieldNomeEmp.setBackground(new java.awt.Color(60, 60, 60));
        fieldNomeEmp.setForeground(new java.awt.Color(204, 204, 204));
        fieldNomeEmp.setText("EcoVita - Energia Renovável");
        fieldNomeEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldNomeEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeEmpActionPerformed(evt);
            }
        });

        fieldEmailEmp.setEditable(false);
        fieldEmailEmp.setBackground(new java.awt.Color(60, 60, 60));
        fieldEmailEmp.setForeground(new java.awt.Color(204, 204, 204));
        fieldEmailEmp.setText("contato@ecovita.com.br");
        fieldEmailEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldEmailEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailEmpActionPerformed(evt);
            }
        });

        fieldTelEmp.setEditable(false);
        fieldTelEmp.setBackground(new java.awt.Color(60, 60, 60));
        fieldTelEmp.setForeground(new java.awt.Color(204, 204, 204));
        fieldTelEmp.setText("(11) 98765-4321");
        fieldTelEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldTelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelEmpActionPerformed(evt);
            }
        });

        fieldSenhaGer.setEditable(false);
        fieldSenhaGer.setBackground(new java.awt.Color(60, 60, 60));
        fieldSenhaGer.setForeground(new java.awt.Color(204, 204, 204));
        fieldSenhaGer.setText("Ec0Vit@2024!");
        fieldSenhaGer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldSenhaGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaGerActionPerformed(evt);
            }
        });

        btnSalvarCadastro.setBackground(new java.awt.Color(0, 102, 102));
        btnSalvarCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSalvarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.setToolTipText("");
        btnSalvarCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarCadastroMouseClicked(evt);
            }
        });
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnApagarCadastro.setBackground(new java.awt.Color(102, 0, 0));
        btnApagarCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnApagarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarCadastro.setText("Apagar");
        btnApagarCadastro.setToolTipText("");
        btnApagarCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApagarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCadastroActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(0, 102, 102));
        btnAbrir.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGerEmpresaLayout = new javax.swing.GroupLayout(painelGerEmpresa);
        painelGerEmpresa.setLayout(painelGerEmpresaLayout);
        painelGerEmpresaLayout.setHorizontalGroup(
            painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmpresasCadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelGerEmpresaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                .addComponent(btnApagarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                        .addComponent(txtSenhaGer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldSenhaGer))
                                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                        .addComponent(txtNomeEmp)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldNomeEmp))
                                    .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollEmpresasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                                        .addComponent(txtEmailEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fieldEmailEmp))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGerEmpresaLayout.createSequentialGroup()
                                        .addComponent(txtTelEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fieldTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        painelGerEmpresaLayout.setVerticalGroup(
            painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmpresasCadastradas)
                .addGap(12, 12, 12)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fieldBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                    .addComponent(txtBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollEmpresasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNomeEmp))
                    .addComponent(fieldNomeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailEmp)
                    .addComponent(fieldEmailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelEmp)
                    .addComponent(fieldTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo)
                    .addComponent(boxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenhaGer)
                    .addComponent(fieldSenhaGer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        panelVerdeDecorativo.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout panelVerdeDecorativoLayout = new javax.swing.GroupLayout(panelVerdeDecorativo);
        panelVerdeDecorativo.setLayout(panelVerdeDecorativoLayout);
        panelVerdeDecorativoLayout.setHorizontalGroup(
            panelVerdeDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelVerdeDecorativoLayout.setVerticalGroup(
            panelVerdeDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelAdmLayout = new javax.swing.GroupLayout(panelAdm);
        panelAdm.setLayout(panelAdmLayout);
        panelAdmLayout.setHorizontalGroup(
            panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdmLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(painelGerEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelSuporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelGerBlog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAdmLayout.setVerticalGroup(
            panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdmLayout.createSequentialGroup()
                .addComponent(panelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelGerBlog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGerEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoticiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoticiaActionPerformed

    private void btnUploadFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadFotoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEditarNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNoticiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarNoticiaActionPerformed

    private void btnApagarNotíciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarNotíciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarNotíciaActionPerformed

    private void btnResponderChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResponderChamadoActionPerformed

    private void btnFinalizarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarChamadoActionPerformed

    private void btnReabrirChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReabrirChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReabrirChamadoActionPerformed

    private void btnApagarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarChamadoActionPerformed

    private void btnEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCadastroActionPerformed

    private void fieldNomeEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeEmpActionPerformed

    private void fieldEmailEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailEmpActionPerformed

    private void fieldTelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelEmpActionPerformed

    private void fieldSenhaGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaGerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaGerActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnApagarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarCadastroActionPerformed

    private void btnEditarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCadastroMouseClicked
        if (camposHabilitados) {
            // Desabilita a edição
            fieldNomeEmp.setEditable(false);
            fieldEmailEmp.setEditable(false);
            fieldTelEmp.setEditable(false);
            fieldSenhaGer.setEditable(false);
            camposHabilitados = false;
            btnEditarCadastro.setText("Editar");
        } else {
            // Habilita a edição
            fieldNomeEmp.setEditable(true);
            fieldEmailEmp.setEditable(true);
            fieldTelEmp.setEditable(true);
            fieldSenhaGer.setEditable(true);
            camposHabilitados = true;
            btnEditarCadastro.setText("Salvar");
        }
    }//GEN-LAST:event_btnEditarCadastroMouseClicked

    private void btnSalvarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarCadastroMouseClicked
        JFileChooser fileChooser = new JFileChooser();
                int escolha = fileChooser.showSaveDialog(null);
                if (escolha == JFileChooser.APPROVE_OPTION) {
                    File arquivoSelecionado = fileChooser.getSelectedFile();
                    String caminho = arquivoSelecionado.getAbsolutePath();
                    // Aqui você pode usar o caminho para salvar o arquivo onde desejar
                   ListaEmpresas listaEmpresas = new ListaEmpresas();
                    try {
                        listaEmpresas.gravar(caminho+ ".dat", listaEmpresas);
                        System.out.println("Arquivo salvo com sucesso em: " + caminho);
                        
                    } catch (IOException ex) {
                        ex.getMessage();
                    }
                }
    }//GEN-LAST:event_btnSalvarCadastroMouseClicked

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        JFileChooser fileChooser = new JFileChooser();
                int escolha = fileChooser.showOpenDialog(null);
                if (escolha == JFileChooser.APPROVE_OPTION) {
                    File arquivoSelecionado = fileChooser.getSelectedFile();
                    String caminho = arquivoSelecionado.getAbsolutePath();

                    // Aqui você pode chamar o método ler da ListaEmpresas para ler os dados do arquivo
                    ListaEmpresas listaEmpresas = null;
                    try {
                        listaEmpresas.ler(caminho);
                        System.out.println("Arquivo lido com sucesso: " + caminho);
                        // Exibir os dados lidos, por exemplo:
                        // System.out.println(listaEmpresas);
                        DefaultListModel<String> listModel = new DefaultListModel<>();
                       for (Empresa empresa : listaEmpresas.getEmpresas()) {
                            listModel.addElement(empresa.getNomeEmpresa());
                        }
                        jListEmpresasCadastradas.setModel(listModel);

                    } catch (IOException | ClassNotFoundException ex) {
                        ex.getMessage();
                    }
                }
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxChamadosFinalizados;
    private javax.swing.JComboBox<String> boxListaDeNoticias;
    private javax.swing.JComboBox<String> boxTipos;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnApagarCadastro;
    private javax.swing.JButton btnApagarChamado;
    private javax.swing.JButton btnApagarNotícia;
    private javax.swing.JButton btnEditarCadastro;
    private javax.swing.JButton btnEditarNoticia;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFinalizarChamado;
    private javax.swing.JButton btnReabrirChamado;
    private javax.swing.JButton btnResponderChamado;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnUploadFoto;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JTextField fieldBuscaChamado;
    private javax.swing.JTextField fieldEmailEmp;
    private javax.swing.JTextField fieldNomeEmp;
    private javax.swing.JTextField fieldNoticia;
    private javax.swing.JTextField fieldSenhaGer;
    private javax.swing.JTextField fieldTelEmp;
    private javax.swing.JList<String> jListChamadosAbertos;
    private javax.swing.JList<String> jListEmpresasCadastradas;
    private javax.swing.JScrollPane jScrollChamadosAbertos;
    private javax.swing.JScrollPane jScrollEmpresasCadastradas;
    private javax.swing.JPanel painelGerBlog;
    private javax.swing.JPanel painelGerEmpresa;
    private javax.swing.JPanel painelSuporte;
    private javax.swing.JPanel panelAdm;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelVerdeDecorativo;
    private javax.swing.JPanel panelVerdeDecorativo1;
    private javax.swing.JPanel panelVerdeDecorativo2;
    private javax.swing.JPanel panelVerdeDecorativo3;
    private javax.swing.JLabel txtAdm;
    private javax.swing.JLabel txtBlog;
    private javax.swing.JLabel txtBusca;
    private javax.swing.JLabel txtBuscaChamados;
    private javax.swing.JLabel txtChamados;
    private javax.swing.JLabel txtChamadosFinalizados;
    private javax.swing.JLabel txtEmailEmp;
    private javax.swing.JLabel txtEmpresasCadastradas;
    private javax.swing.JLabel txtGerBlog;
    private javax.swing.JLabel txtGerBlog1;
    private javax.swing.JLabel txtGerEmpresa;
    private javax.swing.JLabel txtInserirNoticia;
    private javax.swing.JLabel txtNomeEmp;
    private javax.swing.JLabel txtNoticiasPostadas;
    private javax.swing.JLabel txtSenhaGer;
    private javax.swing.JLabel txtTelEmp;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables

}
