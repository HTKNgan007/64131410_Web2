package vn.nganha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.nganha.models.SanPham;
import vn.nganha.repositories.SanPhamRepository;

@Service
public class SanPhamService {

		@Autowired
		SanPhamRepository mySanPhamRepository;
		public List<SanPham> allKH()
			{
				return mySanPhamRepository.findAll();
			}
}
