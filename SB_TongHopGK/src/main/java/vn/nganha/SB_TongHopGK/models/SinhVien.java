package vn.nganha.SB_TongHopGK.models;

public class SinhVien {

	private String mssv;
    private String hoTen;
    private double diemTB;
    
    public SinhVien(String mssv, String hoTen, double diemTB) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    public String getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

}
