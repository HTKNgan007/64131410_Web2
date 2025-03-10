package vn.nganha.SB_TruyenDuLieuSangView;

public class Student {
	private String mssv;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    
    public Student(String mssv, String hoTen, int namSinh, String gioiTinh) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }
    
    public String getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

}
