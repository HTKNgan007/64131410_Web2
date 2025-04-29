package vn.nganha.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sanpham")
public class SanPham {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "tensp")
    private String tenSP;
	
	@Column(name = "giasp", nullable = false)
    private float giaSP;

    @Column(name = "mota", nullable = false, length = 1000)
    private String moTa;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public SanPham() {
		super();
	}

	public float getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(float giaSP) {
		this.giaSP = giaSP;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
}