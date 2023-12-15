package Main;

import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MenuUtama extends JFrame {

    private final Connection conn;
    public MenuUtama() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbStatusSekolah = new javax.swing.ButtonGroup();
        Body = new javax.swing.JPanel();
        menu2 = new Component.Menu();
        jLabel3 = new javax.swing.JLabel();
        Main_panel1 = new javax.swing.JPanel();
        background_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        cbSortJml = new javax.swing.JComboBox<>();
        cbSortTahun = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.JTable_Costum1();
        Tambah_panel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtKota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJml = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbNegeri = new javax.swing.JRadioButton();
        rbSwasta = new javax.swing.JRadioButton();
        cbTahun = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KELOMPOK 3");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(748, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Body.add(menu2, java.awt.BorderLayout.PAGE_START);

        Main_panel1.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/school2.png"))); // NOI18N
        jLabel1.setText("Data Jumlah Siswa Sekolah Dasar, Prov. Jawa Barat");

        btnAdd.setBackground(new java.awt.Color(105, 217, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-plus-16.png"))); // NOI18N
        btnAdd.setText("TAMBAH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 30, 75));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cross-16.png"))); // NOI18N
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-rollback-16.png"))); // NOI18N
        btnCancel.setText("BATAL");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        cbSortJml.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jml Siswa", "<=1000", ">=1000", ">=10000" }));
        cbSortJml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortJmlActionPerformed(evt);
            }
        });

        cbSortTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun Ajaran", "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023" }));
        cbSortTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortTahunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(cbSortJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSortTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setForeground(new java.awt.Color(255, 255, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblData.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tblDataMouseWheelMoved(evt);
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Main_panel1.add(background_panel, "card3");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Data Jumlah Siswa Sekolah Dasar, Prov. Jawa Barat");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Tambah Jumlah Data Siswa Sekolah Dasar, Prov. Jawa Barat");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/school2.png"))); // NOI18N
        jLabel6.setName(""); // NOI18N

        btnSave.setBackground(new java.awt.Color(105, 217, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-16.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-rollback-16.png"))); // NOI18N
        jButton6.setText("BATAL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        txtID.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("Search");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        txtProv.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtProv.setForeground(new java.awt.Color(102, 102, 102));
        txtProv.setText("Search");
        txtProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama Provinsi");

        txtKota.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtKota.setForeground(new java.awt.Color(102, 102, 102));
        txtKota.setText("Search");
        txtKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKotaActionPerformed(evt);
            }
        });

        jLabel9.setText("Nama Kota/Kabupeten");

        jLabel10.setText("Status Sekolah");

        txtJml.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtJml.setForeground(new java.awt.Color(102, 102, 102));
        txtJml.setText("Search");
        txtJml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlActionPerformed(evt);
            }
        });

        jLabel11.setText("Jumlah Siswa");

        txtSatuan.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSatuan.setForeground(new java.awt.Color(102, 102, 102));
        txtSatuan.setText("Search");
        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuanActionPerformed(evt);
            }
        });

        jLabel12.setText("Satuan");

        jLabel13.setText("Tahun Ajaran");

        rbStatusSekolah.add(rbNegeri);
        rbNegeri.setText("Negeri");
        rbNegeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNegeriActionPerformed(evt);
            }
        });

        rbStatusSekolah.add(rbSwasta);
        rbSwasta.setText("Swasta");

        cbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023" }));
        cbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTahunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbNegeri)
                        .addGap(18, 18, 18)
                        .addComponent(rbSwasta))
                    .addComponent(jLabel13)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtJml, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSwasta)
                    .addComponent(rbNegeri))
                .addGap(7, 7, 7)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout Tambah_panel1Layout = new javax.swing.GroupLayout(Tambah_panel1);
        Tambah_panel1.setLayout(Tambah_panel1Layout);
        Tambah_panel1Layout.setHorizontalGroup(
            Tambah_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tambah_panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        Tambah_panel1Layout.setVerticalGroup(
            Tambah_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tambah_panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Main_panel1.add(Tambah_panel1, "card2");

        Body.add(Main_panel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Body, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tblDataMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseWheelMoved

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Main_panel1.removeAll();
        Main_panel1.add(Tambah_panel1);
        Main_panel1.repaint();
        Main_panel1.revalidate();
        
        txtID.setText(setIDSekolah());
        txtProv.setText(setNamaProv());
        txtSatuan.setText(setSatuanSekolah());
        if(btnAdd.getText().equals("UBAH")){
            dataTabel();
            btnSave.setText("PERBAHARUI");
        
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deletData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (btnAdd.getText().equals("UBAH")){
        btnAdd.setText("TAMBAH");
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);}
        /*Main_panel1.removeAll();
        Main_panel1.add(background_panel);
        Main_panel1.repaint();
        Main_panel1.revalidate();*/
        showPanel();
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
            {
                btnSave.setText("SIMPAN");
            }
        else if (btnSave.getText().equals("SIMPAN"))
        {
            insertData();
        }
        else if (btnSave.getText().equals("PERBAHARUI"))
        {
            updateData();
        }
        insertData();
// TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (btnAdd.getText().equals("UBAH")){
        btnAdd.setText("TAMBAH");
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);}
        /*Main_panel1.removeAll();
        Main_panel1.add(background_panel);
        Main_panel1.repaint();
        Main_panel1.revalidate();*/
        showPanel();
        loadData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
    
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvActionPerformed

    private void txtKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKotaActionPerformed

    private void txtJmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmlActionPerformed

    private void txtSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuanActionPerformed

    private void rbNegeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNegeriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNegeriActionPerformed

    private void cbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTahunActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
    if(btnAdd.getText().equals("TAMBAH")){
        btnAdd.setText("UBAH");
        btnDelete.setVisible(true);
        btnCancel.setVisible(true);
    }
// TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void cbSortJmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortJmlActionPerformed
        searchData();
    }//GEN-LAST:event_cbSortJmlActionPerformed

    private void cbSortTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortTahunActionPerformed
        searchData();
    }//GEN-LAST:event_cbSortTahunActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Main_panel1;
    private javax.swing.JPanel Tambah_panel1;
    private javax.swing.JPanel background_panel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbSortJml;
    private javax.swing.JComboBox<String> cbSortTahun;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private Component.Menu menu2;
    private javax.swing.JRadioButton rbNegeri;
    private javax.swing.ButtonGroup rbStatusSekolah;
    private javax.swing.JRadioButton rbSwasta;
    private Palette.JTable_Costum1 tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJml;
    private javax.swing.JTextField txtKota;
    private javax.swing.JTextField txtProv;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private String setNamaProv() {
        return "JAWA BARAT";
    }

    private String setSatuanSekolah() {
       return "SISWA";
    }
    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }

    private void showPanel(){
        Main_panel1.removeAll();
        Main_panel1.add(background_panel);
        Main_panel1.repaint();
        Main_panel1.revalidate();
    }
    private void resetForm() {
        txtID.setText("");
        txtProv.setText("");
        txtKota.setText("");
        rbStatusSekolah.clearSelection();
        txtJml.setText("");
        txtSatuan.setText("");
        cbTahun.setSelectedIndex(0);
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID");
        model.addColumn("Provinsi");
        model.addColumn("Kota/Kabupaten");
        model.addColumn("Status Sekolah");
        model.addColumn("Jumlah Siswa");
        model.addColumn("Satuan");
        model.addColumn("Tahun Ajaran");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM jml_siswa_sd ORDER BY id ASC";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while(rs.next()){
                    String idSekolah        = rs.getString("id");
                    String provinsiSekolah  = rs.getString("nama_provinsi");
                    String kotaSekolah      = rs.getString("nama_kabupaten_kota");
                    String statusSekolah    = rs.getString("status_sekolah");
                    String jmlSiswaSekolah  = rs.getString("jumlah_siswa");
                    String satuanSekolah    = rs.getString("satuan");
                    String tahunSekolah     = rs.getString("tahun_ajaran");
                    
                    Object[] rowData = {idSekolah,provinsiSekolah,kotaSekolah,statusSekolah,jmlSiswaSekolah,satuanSekolah,tahunSekolah};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e){
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private String setIDSekolah() {
    String urutan = null;

    String sql = "SELECT COALESCE(MAX(id::INTEGER), 215) + 1 AS next_id " +
                 "FROM jml_siswa_sd";

    try (PreparedStatement st = conn.prepareStatement(sql)) {
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            int nextId = rs.getInt("next_id");
            urutan = String.format("%03d", nextId);
        }
    } catch (SQLException e) {
        java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
    }
    return urutan;
}


    private void insertData() {
        String idSekolahText = txtID.getText();
        int idSekolah = Integer.parseInt(idSekolahText);
        try{            
            
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        
        String provinsiSekolah = txtProv.getText();
        String kotaSekolah = txtKota.getText();
        String statusSekolah ;
            if(rbNegeri.isSelected()){
                statusSekolah = rbNegeri.getText();
            }else if (rbSwasta.isSelected()){
                statusSekolah = rbSwasta.getText();
            }else{
                statusSekolah="";
            }
        String jmlSiswaSekolahText = txtJml.getText();
        double jmlSiswaSekolah = Double.parseDouble(jmlSiswaSekolahText);
        try{
            
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        String satuanSekolah = txtSatuan.getText();        
        String tahunSekolah = cbTahun.getItemAt(cbTahun.getSelectedIndex());
        
        if(String.valueOf(idSekolah).isEmpty() || provinsiSekolah.isEmpty() || kotaSekolah.isEmpty() || statusSekolah.isEmpty() || String.valueOf(jmlSiswaSekolah).isEmpty() || satuanSekolah.isEmpty() || tahunSekolah.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi","Validasi",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        try{
            String sql = "INSERT INTO jml_siswa_sd(id, nama_provinsi, nama_kabupaten_kota, status_sekolah, jumlah_siswa, satuan, tahun_ajaran) VALUES(?,?,?,?,?,?,?)";
            try(PreparedStatement st= conn.prepareStatement(sql)){
            st.setInt(1, idSekolah);
            st.setString(2, provinsiSekolah);
            st.setString(3, kotaSekolah);
            st.setString(4, statusSekolah);
            st.setDouble(5, jmlSiswaSekolah);
            st.setString(6, satuanSekolah);
            st.setString(7, tahunSekolah);
            
            
            int rowInserted = st.executeUpdate();
            if (rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                //insertData();
                resetForm();
                loadData();
                showPanel();
            }
        }
    } catch (SQLException e){
    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
    }
    }
      
    private void dataTabel() {
        background_panel.setVisible(false);
        Tambah_panel1.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel5.setText("Perbaharui Data");
        
        txtID.setEnabled(false);
        
        txtID.setText(tblData.getValueAt(row,0).toString());
        txtProv.setText(tblData.getValueAt(row,1).toString());
        txtKota.setText(tblData.getValueAt(row,2).toString());
        String StatusSekolah = tblData.getValueAt(row,3).toString();
            if(StatusSekolah.equals("Negeri")){
                rbNegeri.setSelected(true);
            }else if(StatusSekolah.equals("Swasta")){
                rbSwasta.setSelected(true);
            }        
        txtJml.setText(tblData.getValueAt(row,4).toString());
        txtSatuan.setText(tblData.getValueAt(row,5).toString());        
        String tahunSekolah = tblData.getValueAt(row,6).toString();
            if(tahunSekolah.equals("2018/2019")|| tahunSekolah.equals("2019/2020")|| tahunSekolah.equals("2020/2021")|| tahunSekolah.equals("2021/2023")){
                cbTahun.setVisible(true);
            }else{
                return;
            }
    }
    private void updateData() {
        String idSekolahText = txtID.getText();
        int idSekolah = Integer.parseInt(idSekolahText);
        try{            
            
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        
        String provinsiSekolah = txtProv.getText();
        String kotaSekolah = txtKota.getText();
        String statusSekolah ;
            if(rbNegeri.isSelected()){
                statusSekolah = rbNegeri.getText();
            }else if (rbSwasta.isSelected()){
                statusSekolah = rbSwasta.getText();
            }else{
                statusSekolah="";
            }
        String jmlSiswaSekolahText = txtJml.getText();
        double jmlSiswaSekolah = Double.parseDouble(jmlSiswaSekolahText);
        try{
            
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        String satuanSekolah = txtSatuan.getText();        
        String tahunSekolah = cbTahun.getItemAt(cbTahun.getSelectedIndex());
        
        if(String.valueOf(idSekolah).isEmpty() || provinsiSekolah.isEmpty() || kotaSekolah.isEmpty() || statusSekolah.isEmpty() || String.valueOf(jmlSiswaSekolah).isEmpty() || satuanSekolah.isEmpty() || tahunSekolah.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi","Validasi",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        try{
            String sql = "UPDATE jml_siswa_sd SET nama_provinsi=?, nama_kabupaten_kota=?, status_sekolah=?, jumlah_siswa=?, satuan=?, tahun_ajaran=? WHERE id=?";
            try(PreparedStatement st= conn.prepareStatement(sql)){
            
            st.setString(1, provinsiSekolah);
            st.setString(2, kotaSekolah);
            st.setString(3, statusSekolah);
            st.setDouble(4, jmlSiswaSekolah);
            st.setString(5, satuanSekolah);
            st.setString(6, tahunSekolah);
            st.setInt(7, idSekolah);
            
            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbaharui");
                //insertData();
                resetForm();
                loadData();
                showPanel();
                if (btnAdd.getText().equals("UBAH")){
                btnAdd.setText("TAMBAH");
                 btnDelete.setVisible(false);
                btnCancel.setVisible(false);}
            }
        }
    } catch (SQLException e){
    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
     e.printStackTrace();
    }
    }

    private void deletData() {
        int selectedRow= tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try{                
                String sql = "DELETE FROM jml_siswa_sd WHERE id=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setInt(1,Integer.parseInt(id));   
                   
            

                    
                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        resetForm();
                        loadData();
                        showPanel();
                        if (btnAdd.getText().equals("UBAH")){
                        btnAdd.setText("TAMBAH");
                        btnDelete.setVisible(false);
                        btnCancel.setVisible(false);}
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            }catch (SQLException e){
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
                 e.printStackTrace();
            }
        }
    }

    private void searchData() {
    String kataKunci = txtSearch.getText();
    String selectedJml = cbSortJml.getItemAt(cbSortJml.getSelectedIndex());
    String selectedTahun = cbSortTahun.getItemAt(cbSortTahun.getSelectedIndex());

    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    model.setRowCount(0);

    try {
        
        String sql = "SELECT * FROM jml_siswa_sd WHERE";

        
        if (!kataKunci.isEmpty()) {
            sql += " (nama_provinsi LIKE ? OR nama_kabupaten_kota LIKE ? OR status_sekolah LIKE ?)";
        }else if (kataKunci.isEmpty()){
           
        }

        // Menambahkan kondisi sesuai dengan pilihan combo box jumlah siswa
        if (selectedJml != null && !selectedJml.isEmpty()) {
            if ("<=1000".equals(selectedJml)) {
                sql += " AND jumlah_siswa <= 1000";
            } else if (">=1000".equals(selectedJml)) {
                sql += " AND jumlah_siswa >= 1000";
            } else if (">=10000".equals(selectedJml)) {
                sql += " AND jumlah_siswa >= 10000";
            } else if ("Jml Siswa".equals(selectedJml)){
                sql += " AND jumlah_siswa >= 0";
            }
        }

        // Menambahkan kondisi sesuai dengan pilihan combo box tahun ajaran
        if (selectedTahun != null && !selectedTahun.equals("Semua Tahun")) {
            sql += " AND tahun_ajaran = ?";
        }

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Menambahkan parameter jika diperlukan
            int parameterIndex = 1;
            if (!kataKunci.isEmpty()) {
                st.setString(parameterIndex++, "%" + kataKunci + "%");
                st.setString(parameterIndex++, "%" + kataKunci + "%");
                st.setString(parameterIndex++, "%" + kataKunci + "%");
            }
            if (selectedTahun != null && !selectedTahun.equals("Semua Tahun")) {
                st.setString(parameterIndex, selectedTahun);
            }

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                // Ambil data dari hasil query
                String idSekolah = rs.getString("id");
                String provinsiSekolah = rs.getString("nama_provinsi");
                String kotaSekolah = rs.getString("nama_kabupaten_kota");
                String statusSekolah = rs.getString("status_sekolah");
                String jmlSiswaSekolah = rs.getString("jumlah_siswa");
                String satuanSekolah = rs.getString("satuan");
                String tahunSekolah = rs.getString("tahun_ajaran");

                // Tambahkan data sebagai baris baru ke dalam model tabel
                Object[] rowData = {idSekolah, provinsiSekolah, kotaSekolah, statusSekolah, jmlSiswaSekolah, satuanSekolah, tahunSekolah};
                model.addRow(rowData);
            }
        }
    } catch (SQLException e) {
        Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
    }
}

    
}
