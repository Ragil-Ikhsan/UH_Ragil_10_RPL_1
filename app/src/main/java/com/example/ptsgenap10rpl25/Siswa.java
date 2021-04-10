package com.example.ptsgenap10rpl25;

public class Siswa {private String Name;
    private String nohp;
    private String nik;
    private String alamat;

    public String getName() {
        return Name;
    }

    public Siswa(String name, String nohp, String nik, String alamat) {
        Name = name;
        this.nohp = nohp;
        this.nik = nik;
        this.alamat = alamat;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
