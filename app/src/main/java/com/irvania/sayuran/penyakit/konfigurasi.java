package com.irvania.sayuran.penyakit;

public class konfigurasi {
        public static final String URL_ADD="http://192.168.56.16/Android/tambah.php";
        public static final String URL_GET_ALL = "http://192.168.56.16/Android/tampil.php";
        public static final String URL_GET_EMP = "http://192.168.56.16/Android/tamp.php?id=";
        public static final String URL_DELETE_EMP = "http://192.168.56.16/Android/delete.php?id=";

        //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
        public static final String KEY_EMP_kode_sayuran = "kode_sayuran";
        public static final String KEY_EMP_nama_sayuran = "nama_sayuran";
        public static final String KEY_EMP_jenis_sayuran = "jenis_sayuran";

        //JSON Tags
        public static final String TAG_JSON_ARRAY="result";
        public static final String TAG_kode_sayuran = "kode_sayuran";
        public static final String TAG_nama_sayuran = "nama_sayuran";
        public static final String TAG_jenis_sayuran = "jenis_sayuran";

        //ID karyawan
        //emp itu singkatan dari Employee
        public static final String EMP_ID = "emp_id";
    }

