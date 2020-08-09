package QuanLySinhVien;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float lyThuyet, thucHanh, diemTB;
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLyThuyet() {
		return lyThuyet;
	}
	public void setLyThuyet(float lyThuyet) {
		this.lyThuyet = lyThuyet;
	}
	public float getThucHanh() {
		return thucHanh;
	}
	public void setThucHanh(float thucHanh) {
		this.thucHanh = thucHanh;
	}
	Scanner scanner = new Scanner(System.in);
	
	public SinhVien() {
		maSV = 0;
		hoTen = "";
		lyThuyet = 0;
		thucHanh = 0;
	}
	
	public SinhVien(int maSV, String hoTen, float lyThuyet, float thucHanh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.lyThuyet = lyThuyet;
		this.thucHanh = thucHanh;
	}
	
	public float tinhDiemTB() {
		return diemTB = (lyThuyet + thucHanh) / 2;
	}
	
	public void hienThi() {
		System.out.println("Ma so sinh vien: " + maSV);
		System.out.println("Ho ten sinh vien: " + hoTen.toString());
		System.out.println("Diem trung binh: " + diemTB);
	}
}
