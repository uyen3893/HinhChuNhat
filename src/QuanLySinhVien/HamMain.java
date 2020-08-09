package QuanLySinhVien;

import java.util.Scanner;
public class HamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SinhVien sv1 = new SinhVien(12, "Nguyen Van A", 6, 7);
		sv1.tinhDiemTB();
		sv1.hienThi();
		SinhVien sv2 = new SinhVien(15, "Nguyen Van B", 8, 9);
		sv2.tinhDiemTB();
		sv2.hienThi();
		SinhVien sv3 = new SinhVien();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma so Sinh Vien: ");
		sv3.setMaSV(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Nhap ho ten sinh vien: ");
		sv3.setHoTen(scanner.nextLine());
		System.out.print("Nhap diem ly thuyet: ");
		sv3.setLyThuyet(scanner.nextFloat());
		System.out.print("Nhap diem thuc hanh: ");
		sv3.setThucHanh(scanner.nextFloat());
		sv3.tinhDiemTB();
		sv3.hienThi();
	}

}
