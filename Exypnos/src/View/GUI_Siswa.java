/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author ASUS
 */
import com.sun.webkit.perf.PerfLogger;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JList;
public class GUI_Siswa extends javax.swing.JFrame {

    /**
     * Creates new form GUI_MenuSiswa
     */
    public GUI_Siswa() {
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

        jPanel1 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnRegisKelas = new javax.swing.JButton();
        btnUpdateDataSiswa = new javax.swing.JButton();
        btnViewKelasSiswa = new javax.swing.JButton();
        btnViewMateri = new javax.swing.JButton();
        panelRegis = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSetKelas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDeskripsiKelas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelUpdate = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDataPribadi = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfEditNama = new javax.swing.JTextField();
        tfEditJurusan = new javax.swing.JTextField();
        tfEditTahunMasuk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        panelMateri = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listMateri = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taDeskripsiMateri = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelKelas = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listViewKelas = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        taDeskripsiKelas2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        KOP = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        Back = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 185, 143));

        main.setLayout(new java.awt.CardLayout());

        panelMenu.setBackground(new java.awt.Color(44, 120, 115));

        btnRegisKelas.setText("Registrasi Kelas");
        btnRegisKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisKelasActionPerformed(evt);
            }
        });

        btnUpdateDataSiswa.setText("Ubah Data Pribadi");
        btnUpdateDataSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataSiswaActionPerformed(evt);
            }
        });

        btnViewKelasSiswa.setText("View Kelas yang dipilih");
        btnViewKelasSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewKelasSiswaActionPerformed(evt);
            }
        });

        btnViewMateri.setText("View Materi yang dipelajari");
        btnViewMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMateriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegisKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateDataSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewKelasSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewMateri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegisKelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateDataSiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewKelasSiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewMateri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(panelMenu, "card3");

        panelRegis.setBackground(new java.awt.Color(44, 120, 115));

        jScrollPane1.setViewportView(listSetKelas);

        jLabel2.setText("Kelas yang tersedia :");

        taDeskripsiKelas.setEditable(false);
        taDeskripsiKelas.setColumns(20);
        taDeskripsiKelas.setRows(5);
        jScrollPane2.setViewportView(taDeskripsiKelas);

        jLabel3.setText("Deskripsi Kelas :");

        btnRegis.setText("Registrasi");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Registrasi Kelas");

        jLabel12.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout panelRegisLayout = new javax.swing.GroupLayout(panelRegis);
        panelRegis.setLayout(panelRegisLayout);
        panelRegisLayout.setHorizontalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(339, 339, 339))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRegisLayout.createSequentialGroup()
                        .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisLayout.createSequentialGroup()
                                .addGap(0, 327, Short.MAX_VALUE)
                                .addComponent(btnRegis))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        panelRegisLayout.setVerticalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        main.add(panelRegis, "card3");

        taDataPribadi.setColumns(20);
        taDataPribadi.setRows(5);
        jScrollPane3.setViewportView(taDataPribadi);

        jLabel4.setText("Data Pribadi :");

        jLabel5.setText("Update Data Siswa :");

        jPanel5.setBackground(new java.awt.Color(44, 120, 115));

        tfEditTahunMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditTahunMasukActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama");

        jLabel7.setText("Jurusan");

        jLabel8.setText("Tahun Masuk");

        btnUpdate.setText("Update");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEditJurusan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEditTahunMasuk)
                            .addComponent(tfEditNama, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEditJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEditTahunMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout panelUpdateLayout = new javax.swing.GroupLayout(panelUpdate);
        panelUpdate.setLayout(panelUpdateLayout);
        panelUpdateLayout.setHorizontalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelUpdateLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)))
                .addGap(479, 479, 479))
            .addGroup(panelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        panelUpdateLayout.setVerticalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(panelUpdate, "card4");

        panelMateri.setBackground(new java.awt.Color(44, 120, 115));

        jScrollPane4.setViewportView(listMateri);

        jLabel9.setText("Kelas yang diikuti :");

        taDeskripsiMateri.setEditable(false);
        taDeskripsiMateri.setColumns(20);
        taDeskripsiMateri.setRows(5);
        jScrollPane5.setViewportView(taDeskripsiMateri);

        jLabel10.setText("Deskripsi Mata Pelajaran dan Materinya :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel11.setText("View Materi ");

        javax.swing.GroupLayout panelMateriLayout = new javax.swing.GroupLayout(panelMateri);
        panelMateri.setLayout(panelMateriLayout);
        panelMateriLayout.setHorizontalGroup(
            panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMateriLayout.createSequentialGroup()
                        .addGroup(panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMateriLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 161, Short.MAX_VALUE))
                            .addComponent(jScrollPane5))))
                .addContainerGap())
        );
        panelMateriLayout.setVerticalGroup(
            panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        main.add(panelMateri, "card5");

        panelKelas.setBackground(new java.awt.Color(44, 120, 115));

        jScrollPane8.setViewportView(listViewKelas);

        jLabel15.setText("Kelas yang diikuti :");

        taDeskripsiKelas2.setEditable(false);
        taDeskripsiKelas2.setColumns(20);
        taDeskripsiKelas2.setRows(5);
        jScrollPane9.setViewportView(taDeskripsiKelas2);

        jLabel16.setText("Deskripsi Kelas :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel17.setText("View Kelas ");

        javax.swing.GroupLayout panelKelasLayout = new javax.swing.GroupLayout(panelKelas);
        panelKelas.setLayout(panelKelasLayout);
        panelKelasLayout.setHorizontalGroup(
            panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelKelasLayout.createSequentialGroup()
                        .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKelasLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane9))))
                .addContainerGap())
        );
        panelKelasLayout.setVerticalGroup(
            panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );

        main.add(panelKelas, "card6");

        KOP.setBackground(new java.awt.Color(111, 185, 143));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/exypnos2.png"))); // NOI18N

        labDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labDate.setText("heheh");
        labDate.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(44, 120, 115));

        labWelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labWelcome.setForeground(new java.awt.Color(240, 240, 240));
        labWelcome.setText("hehehhe");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labWelcome)
                .addGap(1, 1, 1)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout KOPLayout = new javax.swing.GroupLayout(KOP);
        KOP.setLayout(KOPLayout);
        KOPLayout.setHorizontalGroup(
            KOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KOPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(KOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KOPLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KOPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        KOPLayout.setVerticalGroup(
            KOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KOPLayout.createSequentialGroup()
                .addGroup(KOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KOPLayout.createSequentialGroup()
                        .addComponent(labDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(KOPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Back.setBackground(new java.awt.Color(111, 185, 143));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnBackActionPerformed(evt);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewKelasSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewKelasSiswaActionPerformed
        main.removeAll();
        main.add(panelKelas);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btnViewKelasSiswaActionPerformed

    private void btnUpdateDataSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataSiswaActionPerformed
        main.removeAll();
        main.add(panelUpdate);
        main.repaint();
        main.revalidate();
        resetViewUpdate();
    }//GEN-LAST:event_btnUpdateDataSiswaActionPerformed

    private void btnRegisKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisKelasActionPerformed
        main.removeAll();
        main.add(panelRegis);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btnRegisKelasActionPerformed

    private void btnViewMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMateriActionPerformed
        main.removeAll();
        main.add(panelMateri);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btnViewMateriActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisActionPerformed

    private void tfEditTahunMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditTahunMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditTahunMasukActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        main.removeAll();
        resetViewAll();
        main.add(panelMenu);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setWelcome(String nama){
        labWelcome.setText("Welcome, "+nama);
    }
    public void setDate(){
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        labDate.setText(s.format(ys));
    }
    
    public void addActionListener(ActionListener a1){
        btnLogout.addActionListener(a1);
        btnBack.addActionListener(a1);
        btnRegisKelas.addActionListener(a1);
        btnUpdateDataSiswa.addActionListener(a1);
        btnViewKelasSiswa.addActionListener(a1);
        btnViewMateri.addActionListener(a1);
        btnRegis.addActionListener(a1);
        btnUpdate.addActionListener(a1);
        
    }
    public void addMouseAdapter(MouseAdapter ma){
        listSetKelas.addMouseListener(ma);
        listViewKelas.addMouseListener(ma);
        listMateri.addMouseListener(ma);
    }
////////MAIN      
    public JButton getBtnBack() {
        return btnBack;
    }
    public JButton getBtnLogout() {
        return btnLogout;
    }
    public void resetViewAll(){
        setDate();
        setKelasString("");
        setKelasStringView("");
        setMateriString("");
    }
////////MENU   
    public JButton getBtnRegisKelas(){
        return btnRegisKelas;
    }
    public JButton getBtnUpdateDataSiswa(){
        return btnUpdateDataSiswa;
    }
    public JButton getBtnViewKelasSiswa(){
        return btnViewKelasSiswa;
    }
    public JButton getBtnViewMateri(){
        return btnViewMateri;
    }
 ////////REGIS   
    public JButton getBtnRegis(){
        return btnRegis;
    }
    public void setListKelas(String[] listKelasid){
        listSetKelas.setListData(listKelasid);
    }
    public JList getListKelas(){
        return listSetKelas;
    }  
    public String getSelectedKelas (){
        return listSetKelas.getSelectedValue();
    }

    public void setKelasString(String s){
        taDeskripsiKelas.setText(s);
    }    
////////UPDATE
    public JButton getBtnUpdate() {
        return btnUpdate;
    }
    public String getNama(){
        return tfEditNama.getText();
    }    
    public String getJurusan(){
        return tfEditJurusan.getText();
    }    
    public int getTahunMasuk(){
        return Integer.parseInt(tfEditTahunMasuk.getText());
    } 
    public void setDataPribadi(String s){
        taDataPribadi.setText(s);
    }
    public void resetViewUpdate(){
        tfEditNama.setText("");
        tfEditJurusan.setText("");
        tfEditTahunMasuk.setText("");
    }    
////////VIEW_KELAS 
    public void setListKelasView (String[] listKelasId){
        listViewKelas.setListData(listKelasId);
    }
    public JList getListKelasView(){
        return listViewKelas;
    }  
    public String getSelectedKelasView (){
        return listViewKelas.getSelectedValue();
    }
    public void setKelasStringView(String s){
        taDeskripsiKelas2.setText(s);
    }    
 ////////VIEW_MAPEL      
    public void setListMateri (String[] listKelasid){
        listMateri.setListData(listKelasid);
    }
    public JList getListMateri(){
        return listMateri;
    }  
    public String getSelectedMateri (){
        return listMateri.getSelectedValue();
    }
    public void setMateriString(String s){
        taDeskripsiMateri.setText(s);
    }    
    
    public void setStatusRegis(String s){
        jLabel12.setText(s);
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JPanel KOP;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRegisKelas;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateDataSiswa;
    private javax.swing.JButton btnViewKelasSiswa;
    private javax.swing.JButton btnViewMateri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labWelcome;
    private javax.swing.JList<String> listMateri;
    private javax.swing.JList<String> listSetKelas;
    private javax.swing.JList<String> listViewKelas;
    private javax.swing.JPanel main;
    private javax.swing.JPanel panelKelas;
    private javax.swing.JPanel panelMateri;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelRegis;
    private javax.swing.JPanel panelUpdate;
    private javax.swing.JTextArea taDataPribadi;
    private javax.swing.JTextArea taDeskripsiKelas;
    private javax.swing.JTextArea taDeskripsiKelas2;
    private javax.swing.JTextArea taDeskripsiMateri;
    private javax.swing.JTextField tfEditJurusan;
    private javax.swing.JTextField tfEditNama;
    private javax.swing.JTextField tfEditTahunMasuk;
    // End of variables declaration//GEN-END:variables
}
