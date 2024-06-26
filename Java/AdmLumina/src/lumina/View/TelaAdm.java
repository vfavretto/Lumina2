package lumina.View;

import javax.swing.*;
import java.io.*;
import lumina.Controller.*;
import luminabe.Model.Empresa.*;
import luminabe.Model.Admnistrador.Blog;


public class TelaAdm extends javax.swing.JFrame {

    private boolean camposHabilitados = false;
    private ListaInformacoes listaInformacoes;
    private DefaultListModel<String> empresasModel;
    private DefaultListModel<String> chamadosModel;
    private Controller controle;
    private Empresa empresaSelecionada;
    private Chamado chamadoSelecionado;
    private DefaultComboBoxModel<String> chamadosFinalizadosModel;
    private String urlPostagem;

    /**
     * Creates new form TelaAdm
     */
    public TelaAdm() {
        initComponents();
        listaInformacoes = new ListaInformacoes();
        empresasModel = new DefaultListModel<>();
        chamadosModel = new DefaultListModel<>();
        chamadosFinalizadosModel = new DefaultComboBoxModel<>();
        controle = new Controller(listaInformacoes, empresasModel, chamadosModel, jListEmpresasCadastradas, jListChamadosAbertos, boxChamadosFinalizados, boxListaDeNoticias);
        controle.atualizarLista(listaInformacoes);
        controle.limparCampos(fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos);
    }

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
        jScrollChamadosAbertos = new javax.swing.JScrollPane();
        jListChamadosAbertos = new javax.swing.JList<>();
        txtBuscaChamados = new javax.swing.JLabel();
        fieldBuscaChamado = new javax.swing.JTextField();
        painelGerBlog = new javax.swing.JPanel();
        panelVerdeDecorativo1 = new javax.swing.JPanel();
        txtGerBlog = new javax.swing.JLabel();
        fieldTituloNoticia = new javax.swing.JTextField();
        txtInserirNoticia = new javax.swing.JLabel();
        txtTituloBlog = new javax.swing.JLabel();
        btnUploadFoto = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        txtNoticiasPostadas = new javax.swing.JLabel();
        boxListaDeNoticias = new javax.swing.JComboBox<>();
        btnEditarNoticia = new javax.swing.JButton();
        btnApagarNotícia = new javax.swing.JButton();
        txtBlog1 = new javax.swing.JLabel();
        fieldNoticia = new javax.swing.JTextField();
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
        txtAdm.setText("Administrador Lumina");

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
        btnResponderChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResponderChamadoMouseClicked(evt);
            }
        });
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
        btnFinalizarChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarChamadoMouseClicked(evt);
            }
        });
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
        btnReabrirChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReabrirChamadoMouseClicked(evt);
            }
        });
        btnReabrirChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReabrirChamadoActionPerformed(evt);
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
        jListChamadosAbertos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListChamadosAbertosMouseClicked(evt);
            }
        });
        jScrollChamadosAbertos.setViewportView(jListChamadosAbertos);

        txtBuscaChamados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscaChamados.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscaChamados.setText("Busca");

        fieldBuscaChamado.setBackground(new java.awt.Color(60, 60, 60));
        fieldBuscaChamado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldBuscaChamado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldBuscaChamadoKeyReleased(evt);
            }
        });

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
                                .addComponent(btnReabrirChamado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtBuscaChamados)
                    .addGroup(painelSuporteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fieldBuscaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnReabrirChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        fieldTituloNoticia.setBackground(new java.awt.Color(89, 89, 89));
        fieldTituloNoticia.setForeground(new java.awt.Color(255, 255, 255));
        fieldTituloNoticia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldTituloNoticia.setToolTipText("");
        fieldTituloNoticia.setBorder(new javax.swing.border.MatteBorder(null));
        fieldTituloNoticia.setCaretColor(new java.awt.Color(204, 204, 204));
        fieldTituloNoticia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldTituloNoticia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTituloNoticiaActionPerformed(evt);
            }
        });

        txtInserirNoticia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtInserirNoticia.setForeground(new java.awt.Color(204, 204, 204));
        txtInserirNoticia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInserirNoticia.setText("Inserir notícia");

        txtTituloBlog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTituloBlog.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloBlog.setText("Título da notícia");

        btnUploadFoto.setBackground(new java.awt.Color(0, 102, 102));
        btnUploadFoto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUploadFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadFoto.setText("Upload de foto");
        btnUploadFoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUploadFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUploadFotoMouseClicked(evt);
            }
        });
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
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
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
        btnEditarNoticia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarNoticiaMouseClicked(evt);
            }
        });
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
        btnApagarNotícia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarNotíciaMouseClicked(evt);
            }
        });
        btnApagarNotícia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarNotíciaActionPerformed(evt);
            }
        });

        txtBlog1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBlog1.setForeground(new java.awt.Color(255, 255, 255));
        txtBlog1.setText("Escreva a notícia aqui:");

        fieldNoticia.setBackground(new java.awt.Color(89, 89, 89));
        fieldNoticia.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBlog1)
                            .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxListaDeNoticias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTituloBlog, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldTituloNoticia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelGerBlogLayout.createSequentialGroup()
                                    .addComponent(btnUploadFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNoticiasPostadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelGerBlogLayout.createSequentialGroup()
                                    .addComponent(btnApagarNotícia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditarNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(fieldNoticia, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerBlogLayout.setVerticalGroup(
            painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerBlogLayout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInserirNoticia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloBlog)
                .addGap(3, 3, 3)
                .addComponent(fieldTituloNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBlog1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGerBlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
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
        jListEmpresasCadastradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListEmpresasCadastradasMouseClicked(evt);
            }
        });
        jScrollEmpresasCadastradas.setViewportView(jListEmpresasCadastradas);

        txtBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBusca.setForeground(new java.awt.Color(153, 153, 153));
        txtBusca.setText("Busca");

        fieldBusca.setBackground(new java.awt.Color(60, 60, 60));
        fieldBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        fieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaActionPerformed(evt);
            }
        });
        fieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldBuscaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldBuscaKeyTyped(evt);
            }
        });

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
        boxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FORNECEDOR", "CONTRATANTE", "AMBAS" }));
        boxTipos.setEnabled(false);
        boxTipos.setOpaque(true);
        boxTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTiposActionPerformed(evt);
            }
        });

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
        btnApagarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarCadastroMouseClicked(evt);
            }
        });
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
                .addGroup(painelGerEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEmpresasCadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGerEmpresaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelGerEmpresaLayout.createSequentialGroup()
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGerEmpresaLayout.createSequentialGroup()
                                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(boxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollEmpresasCadastradas, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 7, Short.MAX_VALUE)))))
                .addContainerGap())
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
                        .addComponent(txtBusca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fieldBusca))
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

    private void fieldTituloNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTituloNoticiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTituloNoticiaActionPerformed

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
            // Desabilita a edição e salva as alterações
            controle.desabilitaEdicaoEmpresa(fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos, btnEditarCadastro);
            controle.salvaAlteracaoEmpresa(jListEmpresasCadastradas, listaInformacoes, fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos, empresasModel);
            camposHabilitados = false;
        } else {
            // Habilita a edição
            controle.habilitaEdicaoEmpresa(fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos, btnEditarCadastro);
            camposHabilitados = true;
        }
    }//GEN-LAST:event_btnEditarCadastroMouseClicked

    private void btnSalvarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarCadastroMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int escolha = fileChooser.showSaveDialog(null);
        if (escolha == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();
            String caminho = arquivoSelecionado.getAbsolutePath();
            if (!caminho.endsWith(".dat")) {
                caminho += ".dat";
            }
            try {
                listaInformacoes.gravar(caminho, listaInformacoes);
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
            try {
                listaInformacoes = (ListaInformacoes) ListaInformacoes.ler(caminho);
                System.out.println("Arquivo lido com sucesso: " + caminho);
                controle.atualizarLista(listaInformacoes);
                controle.limparCampos(fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos);
            } catch (IOException | ClassNotFoundException ex) {
                ex.getMessage();
            }
        }

    }//GEN-LAST:event_btnAbrirMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jListEmpresasCadastradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListEmpresasCadastradasMouseClicked
        if (camposHabilitados) {
            return; // Impede mudar de Empresa enquanto editando
        }
        JList<String> listaEmpresas = (JList<String>) evt.getSource();
        int indice = listaEmpresas.locationToIndex(evt.getPoint());
        empresaSelecionada = controle.selecionaEmpresa(indice, listaInformacoes, jListEmpresasCadastradas);
        controle.carregaEmpresa(empresaSelecionada, fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos, jListEmpresasCadastradas);
    }//GEN-LAST:event_jListEmpresasCadastradasMouseClicked

    private void boxTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTiposActionPerformed

    private void fieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBuscaActionPerformed

    private void fieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBuscaKeyTyped
        // TODO add your handling code here
    }//GEN-LAST:event_fieldBuscaKeyTyped

    private void btnApagarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarCadastroMouseClicked
        if (empresaSelecionada != null) {
            int resposta = JOptionPane.showOptionDialog(this, "Você deseja apagar a empresa: " + empresaSelecionada.getNomeEmpresa() + "?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sim", "Não"}, "Sim");
            if (resposta == JOptionPane.YES_OPTION) {
                controle.apagarEmpresa(empresaSelecionada, fieldBusca.getText());
                controle.limparCampos(fieldNomeEmp, fieldEmailEmp, fieldTelEmp, fieldSenhaGer, boxTipos);
                empresaSelecionada = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma empresa para apagar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApagarCadastroMouseClicked

    private void fieldBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBuscaKeyReleased
        controle.buscarEmpresa(fieldBusca.getText().trim());
    }//GEN-LAST:event_fieldBuscaKeyReleased

    private void btnFinalizarChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarChamadoMouseClicked
        if (chamadoSelecionado != null) {
            chamadoSelecionado.setStatusChamado(statusChamado.FINALIZADO);
            controle.atualizarLista(listaInformacoes);
            System.out.println("Chamado finalizado: " + chamadoSelecionado.getNomeResponsavel());
        } else {
            System.out.println("Nenhum chamado selecionado.");
        }
    }//GEN-LAST:event_btnFinalizarChamadoMouseClicked

    private void jListChamadosAbertosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListChamadosAbertosMouseClicked
        JList<String> listaChamados = (JList<String>) evt.getSource();
        int indice = listaChamados.locationToIndex(evt.getPoint());
        chamadoSelecionado = controle.selecionaChamado(indice, listaInformacoes, jListChamadosAbertos);
    }//GEN-LAST:event_jListChamadosAbertosMouseClicked

    private void btnReabrirChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReabrirChamadoMouseClicked
        String nomeResponsavelSelecionado = (String) boxChamadosFinalizados.getSelectedItem();
        System.out.println(nomeResponsavelSelecionado);
        controle.reabrirChamado(nomeResponsavelSelecionado);
    }//GEN-LAST:event_btnReabrirChamadoMouseClicked

    private void btnResponderChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResponderChamadoMouseClicked
        if (chamadoSelecionado != null) {
            String resposta = JOptionPane.showInputDialog(this, "Digite a resposta:", "Responder Chamado", JOptionPane.PLAIN_MESSAGE);
            if (resposta != null && !resposta.trim().isEmpty()) {
                chamadoSelecionado.setMsgSuporte(resposta.trim());
                System.out.println("Resposta salva: " + chamadoSelecionado.getMsgSuporte());
            } else {
                System.out.println("Nenhuma resposta fornecida.");
            }
        } else {
            System.out.println("Nenhum chamado selecionado.");
        }
    }//GEN-LAST:event_btnResponderChamadoMouseClicked

    private void fieldBuscaChamadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBuscaChamadoKeyReleased
        controle.buscarChamado(fieldBuscaChamado.getText().trim());
    }//GEN-LAST:event_fieldBuscaChamadoKeyReleased

    private void btnUploadFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUploadFotoMouseClicked
        urlPostagem = JOptionPane.showInputDialog(this, "Digite a URL da Postagem:", "Upload de Foto", JOptionPane.PLAIN_MESSAGE);
        if (urlPostagem != null && !urlPostagem.trim().isEmpty()) {
            System.out.println("URL da Postagem: " + urlPostagem);
        } else {
            System.out.println("Nenhuma URL fornecida.");
        }
    }//GEN-LAST:event_btnUploadFotoMouseClicked

    private void fieldNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoticiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoticiaActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked

        if (!fieldTituloNoticia.getText().isEmpty() && !fieldNoticia.getText().isEmpty() && btnEnviar.isEnabled()) {
            controle.postarNoticia(fieldTituloNoticia.getText(), fieldNoticia.getText(), urlPostagem);
            urlPostagem = "";
            fieldTituloNoticia.setText("");
            fieldNoticia.setText("");
        } else {
            if (!btnEnviar.isEnabled()) {
                JOptionPane.showMessageDialog(this, "Termine de Editar a notícia antes de fazer uma nova", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnApagarNotíciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarNotíciaMouseClicked
        if (boxListaDeNoticias.getSelectedIndex() != -1) {
            String tituloPostagemSelecionada = (String) boxListaDeNoticias.getSelectedItem();
            Blog noticiaSelecionada = controle.encontraNoticia(tituloPostagemSelecionada);
            if (noticiaSelecionada != null) {
                int opcao = JOptionPane.showOptionDialog(this, "Deseja realmente apagar a notícia: " + noticiaSelecionada.getTitulo() + "?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sim", "Não"}, "Sim");
                if (opcao == JOptionPane.YES_OPTION) {
                    listaInformacoes.removerPostagem(noticiaSelecionada);
                    System.out.println("Postagem removida:\nTítulo: " + noticiaSelecionada.getTitulo() + "\nConteúdo: " + noticiaSelecionada.getTexto());
                    controle.atualizarLista(listaInformacoes);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Postagem não encontrada na lista.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma postagem para apagar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApagarNotíciaMouseClicked

    private void btnEditarNoticiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarNoticiaMouseClicked
        if (btnEditarNoticia.getText().equals("Editar")) {
            if (boxListaDeNoticias.getSelectedIndex() != -1) {
                String tituloNoticiaSelecionada = (String) boxListaDeNoticias.getSelectedItem();
                Blog noticiaSelecionada = controle.encontraNoticia(tituloNoticiaSelecionada);
                if (noticiaSelecionada != null) {
                    fieldTituloNoticia.setText(noticiaSelecionada.getTitulo());
                    fieldNoticia.setText(noticiaSelecionada.getTexto());
                    btnEditarNoticia.setText("Salvar");
                    btnEnviar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Notícia não encontrada na lista.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecione uma notícia para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (btnEditarNoticia.getText().equals("Salvar")) {
            String tituloNoticiaEditar = fieldTituloNoticia.getText();
            Blog noticiaEncontrada = controle.encontraNoticia(tituloNoticiaEditar);
            if (noticiaEncontrada != null) {
                noticiaEncontrada.setTexto(fieldNoticia.getText());
                btnEditarNoticia.setText("Editar");
                fieldTituloNoticia.setText("");
                fieldNoticia.setText("");
                urlPostagem = "";
                JOptionPane.showMessageDialog(this, "Notícia salva com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                controle.atualizarLista(listaInformacoes);
                btnEnviar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar: notícia não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarNoticiaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField fieldTituloNoticia;
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
    private javax.swing.JLabel txtBlog1;
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
    private javax.swing.JLabel txtTituloBlog;
    // End of variables declaration//GEN-END:variables

}
