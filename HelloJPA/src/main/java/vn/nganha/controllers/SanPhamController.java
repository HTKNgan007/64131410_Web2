package vn.nganha.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import vn.nganha.models.SanPham;
import vn.nganha.services.SanPhamService;

@Controller
public class SanPhamController {
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping("sanpham/all")
	public String getAll(ModelMap m) {
		List<SanPham> dsSPs= new ArrayList<SanPham>();
		dsSPs = sanPhamService.allSP();
		m.addAttribute("dssp",dsSPs);
		return "index";
	}
	
}
