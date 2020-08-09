package HinhChuNhat;

import java.util.Scanner;
public class HinhChuNhat {
	private double chieuDai, chieuRong, dienTich, chuVi;

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public double getChuVi() {
		return chuVi;
	}

	public void setChuVi(double chuVi) {
		this.chuVi = chuVi;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	
	public void nhap() {
		System.out.print("Nhap chieu rong: ");
		Scanner sc = new Scanner(System.in);
		chieuRong = sc.nextDouble();
		System.out.print("Nhap chieu dai: ");
		chieuDai = sc.nextDouble();
	}
	
	public double tinhChuVi(double chieuRong, double chieuDai) {
		return chuVi = (chieuRong + chieuDai) * 2;
	}
	
	public double tinhDienTich(double chieuRong, double chieuDai) {
		return dienTich = chieuDai * chieuRong;
	}
	
	public void xuat(double chuVi, double dienTich) {
		System.out.println("Chu vi: " + chuVi);
		System.out.println("Dien tich: " + dienTich);
	}
}
