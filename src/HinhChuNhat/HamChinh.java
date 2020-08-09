package HinhChuNhat;

public class HamChinh {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.nhap();
		hcn.tinhChuVi(hcn.getChieuRong(), hcn.getChieuDai());
		hcn.tinhDienTich(hcn.getChieuRong(), hcn.getChieuDai());
		hcn.xuat(hcn.getChuVi(), hcn.getDienTich());

	}

}
