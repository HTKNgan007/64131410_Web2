package vn.nganha.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SanPham")
public class SanPham {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "TenSP", nullable = false, length = 255)
    private String tenSP;
	
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
	
}