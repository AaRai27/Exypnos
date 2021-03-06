package Exypnos;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Afif Raihan
 */
public class Aplikasi {

    private List<Siswa> daftarSiswa = new ArrayList<>();
    private List<Tentor> daftarTentor = new ArrayList<>();
    private List<Orang> daftarOrang = new ArrayList<>();
    private List<MataPelajaran> daftarMapel = new ArrayList<>();
    private List<Kelas> daftarKelas = new ArrayList<>();

// method search    
    public Siswa searchSiswa(String id) {
        int i = 0;
        while (i < daftarSiswa.size()) {
            if (!daftarSiswa.get(i).getIdSiswa().equals(id)) {
                i++;
            } else {
                return daftarSiswa.get(i);
            }
        }
        return null;
    }

    public Tentor searchTentor(String id) {
        int i = 0;
        while (i < daftarTentor.size()) {
            if (!daftarTentor.get(i).getIdTentor().equals(id)) {
                i++;
            } else {
                return daftarTentor.get(i);
            }
        }
        return null;
    }

    public Kelas searchKelas(String kelas) {
        int i = 0;
        while (i < daftarKelas.size()) {
            if (!daftarKelas.get(i).getNamaKelas().equals(kelas)) {
                i++;
            } else {
                return daftarKelas.get(i);
            }
        }
        return null;
    }

    public MataPelajaran searchMapel(String mapel) {
        int i = 0;
        while (i < daftarMapel.size()) {
            if (!daftarMapel.get(i).getNamaMapel().equals(mapel)) {
                i++;
            } else {
                return daftarMapel.get(i);
            }
        }
        return null;
    }

// method view
    public void tampilkanSearchSiswa(String id) {
        if (searchSiswa(id) == null) {
            System.out.println("data Siswa tidak ditemukan");
        } else {
            System.out.println("\t\t\t\tNo.ID\t\t: " + searchSiswa(id).getIdSiswa());
            System.out.println("\t\t\t\tNama\t\t: " + searchSiswa(id).getNamaSiswa());
            System.out.println("\t\t\t\tJurusan\t\t: " + searchSiswa(id).getJurusan());
            System.out.println("\t\t\t\tTahun Masuk\t: " + searchSiswa(id).getTahunMasuk());
            System.out.println("===========================================================");
        }
    }

    public void tampilkanSearchTentor(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            System.out.println("ID TENTOR\t: " + t1.getIdTentor());
            System.out.println("Nama\t\t: " + t1.getNamaTentor());
            System.out.println("====================================");
        }

    }

    public void tampilkanSearchMapel(String mapel) {
        if (searchMapel(mapel) == null) {
            System.out.println("data  Mata Pelajaran tidak ditemukan");
        } else {
            System.out.println("\t\tNama Mata Pelajaran\t: " + searchMapel(mapel).getNamaMapel());
            System.out.println("\t\tJumlah Bab\t\t: " + searchMapel(mapel).getJmlBab());
            System.out.println("\t\tKKM \t\t\t: " + searchMapel(mapel).getKKM());
            System.out.println("========================================");
        }
    }

    public void tampilkanSearchKelas(String kelas) {
        if (searchKelas(kelas) == null) {
            System.out.println("data Kelas tidak ditemukan");
        } else {
            System.out.println("\tKode Kelas\t\t: " + searchKelas(kelas).getNamaKelas());
            System.out.println("\tMata pelajaran\t\t: " + searchKelas(kelas).getMapel().getNamaMapel());
            System.out.println("\tJumlah Siswa\t\t: " + searchKelas(kelas).getListSiswaSize());
            System.out.println("=============================================");
        }
    }

    public void tampilkanSearchTentorFull(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            tampilkanSearchTentor(t1.getIdTentor());
            for (int i = 0; i < t1.getListKelasSize(); i++) {
                tampilkanSearchKelasFull(t1.getKelas(i).getNamaKelas());
            }
        }

    }

    public void tampilkanSearchKelasFull(String kelas) {
        if (searchKelas(kelas) == null) {
            System.out.println("data Kelas tidak ditemukan");
        } else {
            tampilkanSearchKelas(kelas);
            System.out.println("\tMateri : ");
            for (int i = 0; i < searchKelas(kelas).getListMateriSize(); i++) {
                System.out.println("\t\tNama Materi\t:" + searchKelas(kelas).getMateri(i).getNamaMateri());
                System.out.println("\t\tJumlah Bahasan\t:" + searchKelas(kelas).getMateri(i).getJmlBahasan());
            }
            System.out.println();
            System.out.println("\t\t\tNama Siswa Pada Kelas " + kelas + " : ");
            for (int i = 0; i < searchKelas(kelas).getListSiswaSize(); i++) {
                tampilkanSearchSiswa(searchKelas(kelas).getSiswa(i).getIdSiswa());
            }

        }
    }

    public void tampilkanSearchKelasdanTentor(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            for (int i = 0; i < t1.getListKelasSize(); i++) {
                tampilkanSearchKelas(t1.getKelas(i).getNamaKelas());
                tampilkanSearchTentor(t1.getIdTentor());
            }
        }

    }

    public void tampilkanSearchKelasMilikSiswa(String id) {
        Siswa s1 = searchSiswa(id);
        boolean cek = false;
        System.out.println(daftarKelas.size());
        if (s1 != null) {
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(id) != null) {
                    cek = true;
                    tampilkanSearchKelas(daftarKelas.get(i).getNamaKelas());
                    for (int j = 0; j < daftarKelas.get(i).getListMateriSize(); j++) {
                        System.out.println("\tNama materi :" + daftarKelas.get(i).getMateri(j).getNamaMateri());
                        System.out.println("\tJumlah Bahasan :" + daftarKelas.get(i).getMateri(j).getJmlBahasan());
                    }
                }
            }
            if (cek == false) {
                System.out.println("Siswa belum terdaftar dikelas manapun");
            }
        } else {
            System.out.println("Siswa tidak ditemukan");
        }
    }

    public void tampilkanDaftarOrang() {            //// TAMBAHAN ALLE
        for (int i = 0; i < daftarOrang.size(); i++) {
            System.out.println("ID:\t" + daftarOrang.get(i).getId());
            System.out.println("Nama:\t" + daftarOrang.get(i).getNama());
            System.out.println("==========================================");
        }
    }

// method input
    public void inputTentor(String namaTentor) {
        Tentor t1 = new Tentor(namaTentor);
        daftarTentor.add(t1);
        daftarOrang.add(t1);
    }

    public void inputSiswa(String nama, String jurusan, int tahunMasuk) {
        Siswa s1 = new Siswa(nama, jurusan, tahunMasuk);
        daftarSiswa.add(s1);
        daftarOrang.add(s1);
    }

    public void inputMapel(String mapel, int bab, int kkm) {
        MataPelajaran m1 = searchMapel(mapel);
        if (m1 == null) {
            m1 = new MataPelajaran(mapel, bab, kkm);
            daftarMapel.add(m1);
        }
    }

    public void inputKelasToTentor(Tentor tentor, MataPelajaran mapel, String namaKelas) {
        Tentor t1 = searchTentor(tentor.getIdTentor());
        MataPelajaran m1 = searchMapel(mapel.getNamaMapel());
        Kelas k1 = searchKelas(namaKelas);
        if (t1 != null && k1 == null && m1 != null) {
            t1.createKelas(mapel, namaKelas);
            Kelas k2 = new Kelas(mapel, namaKelas);
            daftarKelas.add(k2);
        }

    }

    public void inputSiswaToKelas(Siswa siswa, Kelas kelas) {
        Siswa s1 = kelas.searchSiswa(siswa.getIdSiswa());
        if (s1 == null) {
            kelas.addSiswa(siswa);
        } else {
            System.out.println("Siswa sudah diinput");
        }
    }

    public void inputMateriToKelas(Kelas kelas, String namaMateri, int jumlahBahasan) {
        if (kelas.searchMateri(namaMateri) == null) {
            kelas.createMateri(namaMateri, jumlahBahasan);
        } else {
            System.out.println("Materi sudah dimasukkan ke Kelas");
        }

    }

// method getSize
    public int getDaftarSiswaSize() {
        return daftarSiswa.size();
    }

    public int getDaftarTentorSize() {
        return daftarTentor.size();
    }

    public int getDaftarMapelSize() {
        return daftarMapel.size();
    }

    public int getDaftarKelasSize() {
        return daftarKelas.size();
    }

// method getobject dari list di aplikasi
    public Siswa getSiswa(int i) {
        return daftarSiswa.get(i);
    }

    public Tentor gettentor(int i) {
        return daftarTentor.get(i);
    }

    public MataPelajaran getMapel(int i) {
        return daftarMapel.get(i);
    }

    public Kelas getKelas(int i) {
        return daftarKelas.get(i);
    }

// Method Hapus-Hapusan    
    public void deleteMataPelajaran(String namaMapel) {
        MataPelajaran m1 = searchMapel(namaMapel);
        if (m1 != null) {
            daftarMapel.remove(m1);
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).getMapel() == m1) {
                    MataPelajaran m2 = new MataPelajaran("KOSONG", 0, 0);
                    daftarKelas.get(i).addMapel(m2);
                }
            }
            System.out.println("Delete MataPelajaran Berhasil");
        } else {
            System.out.println("MataPelajaran Tidak Ditemukan");
        }
    }

    public void deleteKelas(String namaKelas) {
        Kelas k1 = searchKelas(namaKelas);
        if (k1 != null) {
            daftarKelas.remove(k1);
            for (int i = 0; i < daftarTentor.size(); i++) {
                for (int j = 0; j < daftarTentor.get(i).getListKelasSize(); j++) {
                    if (daftarTentor.get(i).getKelas(j).getNamaKelas().equals(namaKelas)) {
                        daftarTentor.get(i).removeListKelas(daftarTentor.get(i).getKelas(j));
                    }
                }

            }
        } else {
            System.out.println("Kelas Yang dicari Tidak Ditemukan");
        }
    }

    public void deleteMateri(String idKelas, String namaMateri) {
        Kelas k1 = searchKelas(idKelas);
        if (k1 != null) {
            Materi m1 = k1.searchMateri(namaMateri);
            if (m1 != null) {
                k1.removeMateri(m1.getNamaMateri());
            } else {
                System.out.println("Materi tidak ditemukan");
            }
        } else {
            System.out.println("Kelas tidak ditemukan");
        }
    }

//Method Update-updatean    
    public void updateMataPelajaran(String namaMapelLama, String namaMapelBaru, int kkm, int jmlBab) {
        MataPelajaran m0 = searchMapel(namaMapelLama);
        MataPelajaran m2 = searchMapel(namaMapelBaru);
        if (m0 != null) {
            if (m2 == null) {
                MataPelajaran m1 = new MataPelajaran(namaMapelBaru, jmlBab, kkm);
                for (int i = 0; i < daftarKelas.size(); i++) {
                    if (daftarKelas.get(i).getMapel() == m0) {
                        daftarKelas.get(i).addMapel(m1);
                    }
                }
                daftarMapel.set(daftarMapel.indexOf(m0), m1);
                System.out.println("UPDATE MAPEL BERHASIL");
            } else {
                System.out.println("Mata Pelajaran baru sudah ada");
            }
        } else {
            System.out.println("Mata pelajaran Lama tidak ditemukan");
        }
    }

    public void updateSiswaPribadi(String idSiswa, String namaSiswaBaru, String jurusanBaru, int tahunMasukBaru) {   //INI TAMBAHAN ALLE YANG BIKIN
        Siswa s0 = searchSiswa(idSiswa);
        if (s0 != null) {
            s0.setNama(namaSiswaBaru);
            s0.setJurusan(jurusanBaru);
            s0.setTahunMasuk(tahunMasukBaru);
        } else {
            System.out.println("ID SISWA TIDAK DITEMUKAN");
        }
    }

    public void updateTentorPribadi(String idTentor, String namaTentorBaru) {   //INI TAMBAHAN ALLE YANG BIKIN
        Tentor t0 = searchTentor(idTentor);
        if (t0 != null) {
            t0.setNama(namaTentorBaru);
        } else {
            System.out.println("ID TENTOR TIDAK DITEMUKAN");
        }
    }

    public void updateMateri(String idKelas, String namaMateriLama, String namaMateriBaru, int jumlahBahasan) {
        Kelas k1 = searchKelas(idKelas);
        if (k1 != null) {
            Materi m1 = k1.searchMateri(namaMateriLama);
            Materi m2 = k1.searchMateri(namaMateriBaru);
            if (m1 != null) {
                if (m2 == null) {
                    m1.setNamaMateri(namaMateriBaru);
                    m1.setJmlBahasan(jumlahBahasan);
                } else {
                    System.out.println("Materi baru sudah ada");
                }
            } else {
                System.out.println("Materi lama tidak ditemukan");
            }
        } else {
            System.out.println("Kelas tidak ditemukan");
        }
    }

    public void updateKelas(String namaKelasLama, String namaKelasBaru) {
        Kelas k0 = searchKelas(namaKelasLama);
        Kelas k2 = searchKelas(namaKelasBaru);
        MataPelajaran mapelAsli = k0.getMapel();
        if (k0 != null) {
            if (k2 == null) {
                for (int i = 0; i < daftarTentor.size(); i++) {
                    for (int j = 0; j < daftarTentor.get(i).getListKelasSize(); j++) {
                        if (daftarTentor.get(i).getKelas(j).getNamaKelas().equals(k0.getNamaKelas())) {
                            daftarTentor.get(i).getKelas(j).setNamaKelas(namaKelasBaru);
                        }
                    }
                }
                for (int i = 0; i < daftarKelas.size(); i++) {
                    if (daftarKelas.get(i) == k0) {
                        daftarKelas.get(i).setNamaKelas(namaKelasBaru);
                    }
                }
                System.out.println("UPDATE KELAS BERHASIL");
            } else {
                System.out.println("Kelas baru sudah ada");
            }
        } else {
            System.out.println("Kelas Lama tidak ditemukan");
        }
    }

    public String toStringMapel(String mapel) {
        if (searchMapel(mapel) == null) {
            return "data Mata Pelajaran tidak ditemukan";
        } else {
            return "Nama Mata Pelajaran\t: " + searchMapel(mapel).getNamaMapel() + "\nJumlah Bab\t\t: " + searchMapel(mapel).getJmlBab() + "\nKKM \t\t: " + searchMapel(mapel).getKKM();
        }
    }

    public String toStringSiswa(String id) {
        if (searchSiswa(id) == null) {
            return "data Siswa tidak ditemukan";
        } else {
            return "\nNo.ID\t: " + searchSiswa(id).getIdSiswa() + "\nNama\t: " + searchSiswa(id).getNamaSiswa() + "\nJurusan\t: " + searchSiswa(id).getJurusan() + "\nTahun Masuk\t: " + searchSiswa(id).getTahunMasuk();
        }
    }

    public String toStringkelas(String kelas) {
        if (searchKelas(kelas) == null) {
            return "data Kelas tidak ditemukan";
        } else {
            return "Kode Kelas\t\t: " + searchKelas(kelas).getNamaKelas() + "\nMata pelajaran\t\t: " + searchKelas(kelas).getMapel().getNamaMapel() + "\nJumlah Siswa\t\t: " + searchKelas(kelas).getListSiswaSize();
        }
    }

    public String toStringMateri(String kelas) {
        Kelas k1 = searchKelas(kelas);
        String text;
        if (k1 != null) {
            text = "Mata pelajaran\t\t: " + k1.getMapel().getNamaMapel() + "\nKKM\t\t: " + k1.getMapel().getKKM() + "\n============ MATERI ==============";
            for (int i = 0; i < k1.getListMateriSize(); i++) {
                text = text + "\n" + (i + 1) + ". nama Materi\t\t :" + k1.getMateri(i).getNamaMateri();
                text = text + "\n Jumlah Sub bahasan\t :" + k1.getMateri(i).getJmlBahasan();
            }
        } else {
            text = "KOSONG";
        }
        return text;
    }

    public String[] getKelasListId() {
        String[] listId = new String[daftarKelas.size()];
        for (int i = 0; i < daftarKelas.size(); i++) {
            listId[i] = daftarKelas.get(i).getNamaKelas();
        }
        return listId;
    }

    public String[] getKelasListSiswa(String idSiswa) {
        Siswa s1 = searchSiswa(idSiswa);
        int x = 0;
        if (s1 != null) {
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(idSiswa) != null) {
                    x++;
                }
            }
        }
        String[] listId = new String[x];
        x = 0;
        if (s1 != null) {
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(idSiswa) != null) {
                    listId[x] = (daftarKelas.get(i).getNamaKelas());
                    x++;
                }
            }
        }
        return listId;
    }

    public String[] getMapelListSiswa(String idSiswa) {
        Siswa s1 = searchSiswa(idSiswa);
        int x = 0;
        if (s1 != null) {
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(idSiswa) != null) {
                    x++;
                }
            }
        }
        String[] listId = new String[x];
        x = 0;
        if (s1 != null) {
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(idSiswa) != null) {
                    listId[x] = (daftarKelas.get(i).getMapel().getNamaMapel());
                    x++;
                }
            }
        }
        return listId;
    }

    public String[] getKelasListMapel() {
        String[] listMapel = new String[daftarMapel.size()];
        for (int i = 0; i < daftarMapel.size(); i++) {
            listMapel[i] = daftarMapel.get(i).getNamaMapel();
        }
        return listMapel;
    }

    public void updateSiswa(String id, String namaSiswaBaru, String jurusan, int tahunMasuk) {
        Siswa s0 = searchSiswa(id);
        if (s0 != null) {
            for (int i = 0; i < daftarSiswa.size(); i++) {
                if (daftarSiswa.get(i).equals(s0)) {
                    daftarSiswa.get(i).setJurusan(jurusan);
                    daftarSiswa.get(i).setNama(namaSiswaBaru);
                    daftarSiswa.get(i).setTahunMasuk(tahunMasuk);
                }
            }
            daftarSiswa.set(daftarSiswa.indexOf(s0), s0);
            System.out.println("UPDATE Siswa BERHASIL");
        } else {
            System.out.println("Siswa Lama tidak ditemukan");
        }
    }

    public String[] getSiswaListId() {
        String[] listId = new String[daftarSiswa.size()];
        for (int i = 0; i < daftarSiswa.size(); i++) {
            listId[i] = daftarSiswa.get(i).getId();
        }
        return listId;
    }

    public String[] getTentorListId() {
        String[] listId = new String[daftarTentor.size()];
        for (int i = 0; i < daftarTentor.size(); i++) {
            listId[i] = daftarTentor.get(i).getId();
        }
        return listId;
    }

    public String[] getMapelList() {
        String[] listMapel = new String[daftarMapel.size()];
        for (int i = 0; i < daftarMapel.size(); i++) {
            listMapel[i] = daftarMapel.get(i).getNamaMapel();
        }
        return listMapel;
    }

    public String toStringTentor(String id) {
        if (searchTentor(id) == null) {
            return "data tentor tidak ditemukan";
        } else {
            return "No.ID\t: " + searchTentor(id).getId() + "\nNama\t: " + searchTentor(id).getNamaTentor() + "\nJumlah kelas yang diajar\t: " + searchTentor(id).getListKelasSize();
        }
    }

    public String[] getKelasTentorListId(String idTentor) {

        Tentor t1 = searchTentor(idTentor);
        String[] listId = new String[t1.getListKelasSize()];
        for (int i = 0; i < t1.getListKelasSize(); i++) {
            if (t1 != null) {
                listId[i] = t1.getKelas(i).getNamaKelas();
            }

        }
        return listId;
    }

    public String toStringkelasFull(String kelas) {
        String text;
        if (searchKelas(kelas) == null) {
            text = "data Kelas tidak ditemukan";
        } else {
            text = "Kode Kelas\t\t: " + searchKelas(kelas).getNamaKelas() + "\nMata pelajaran\t\t: " + searchKelas(kelas).getMapel().getNamaMapel() + "\nJumlah Siswa\t\t: " + searchKelas(kelas).getListSiswaSize();
            text = text + "\n================================";
            text = text + "\nMateri\t\t: ";
            for (int i = 0; i < searchKelas(kelas).getListMateriSize(); i++) {
                text = text + "\nNama Materi\t:" + searchKelas(kelas).getMateri(i).getNamaMateri();
                text = text + "\nJumlah Bahasan\t:" + searchKelas(kelas).getMateri(i).getJmlBahasan();
            }
            text = text + "\n================================";
            text = text + "\nNama Siswa Pada Kelas " + kelas + " : ";
            for (int i = 0; i < searchKelas(kelas).getListSiswaSize(); i++) {
                text = text + "\nNo.ID\t: " + searchKelas(kelas).getSiswa(i).getIdSiswa() + "\nNama\t: " + searchKelas(kelas).getSiswa(i).getNamaSiswa() + "\nJurusan\t: " + searchKelas(kelas).getSiswa(i).getJurusan() + "\nTahun Masuk\t: " + searchKelas(kelas).getSiswa(i).getTahunMasuk();
            }
        }
        return text;
    }

    public String[] getMateriKelasTentorListId(String kelas) {
        Kelas k1 = searchKelas(kelas);
        String[] listId = new String[k1.getListMateriSize()];
        if (k1 != null) {
            for (int i = 0; i < k1.getListMateriSize(); i++) {

                listId[i] = k1.getMateri(i).getNamaMateri();
            }
        }
        return listId;
    }
    
    public String toStringTentorKelasSiswa(String namaKelas){
        String text= "";
        for (int i = 0; i < daftarTentor.size(); i++) {
            for (int j = 0; j < daftarTentor.get(i).getListKelasSize(); j++) {
                if(daftarTentor.get(i).getKelas(j).getNamaKelas().equals(namaKelas)){
                    text = "No.ID\t: " +daftarTentor.get(i).getId()  + "\nNama\t: " + daftarTentor.get(i).getNama();
                    text = text +"\n"+ toStringkelasFull(daftarTentor.get(i).getKelas(j).getNamaKelas());
                    
                }    
            }
        }
        return text;
    }

}
