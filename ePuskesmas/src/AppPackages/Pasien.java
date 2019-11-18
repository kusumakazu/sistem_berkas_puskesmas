/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackages;

import java.io.*;
/**
 *
 * @author Administrator
 */
public class Pasien implements Serializable
{     
    public String namaPasien;
    public String alamatPasien;
    public String tempatLahir;
    public String nomorTeleponPasien;
    public char umurPasien;
    public int jkPasien;
    public int tanggalHariLahir;
    public int tanggalBulanLahir;
    public int tanggalTahunLahir;

    public Pasien(String namaPasien, String alamatPasien, String tempatLahir, String nomorTeleponPasien, char umurPasien, int jkPasien, int tanggalHariLahir, int tanggalBulanLahir, int tanggalTahunLahir) {
        this.namaPasien = namaPasien;
        this.alamatPasien = alamatPasien;
        this.tempatLahir = tempatLahir;
        this.nomorTeleponPasien = nomorTeleponPasien;
        this.umurPasien = umurPasien;
        this.jkPasien = jkPasien;
        this.tanggalHariLahir = tanggalHariLahir;
        this.tanggalBulanLahir = tanggalBulanLahir;
        this.tanggalTahunLahir = tanggalTahunLahir;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getNomorTeleponPasien() {
        return nomorTeleponPasien;
    }

    public void setNomorTeleponPasien(String nomorTeleponPasien) {
        this.nomorTeleponPasien = nomorTeleponPasien;
    }

    public char getUmurPasien() {
        return umurPasien;
    }

    public void setUmurPasien(char umurPasien) {
        this.umurPasien = umurPasien;
    }

    public int getJkPasien() {
        return jkPasien;
    }

    public void setJkPasien(int jkPasien) {
        this.jkPasien = jkPasien;
    }

    public int getTanggalHariLahir() {
        return tanggalHariLahir;
    }

    public void setTanggalHariLahir(int tanggalHariLahir) {
        this.tanggalHariLahir = tanggalHariLahir;
    }

    public int getTanggalBulanLahir() {
        return tanggalBulanLahir;
    }

    public void setTanggalBulanLahir(int tanggalBulanLahir) {
        this.tanggalBulanLahir = tanggalBulanLahir;
    }

    public int getTanggalTahunLahir() {
        return tanggalTahunLahir;
    }

    public void setTanggalTahunLahir(int tanggalTahunLahir) {
        this.tanggalTahunLahir = tanggalTahunLahir;
    }

}
