package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    public Page<Review> findByHouseId(Integer houseId, Pageable pageable);
    public Page<Review> findTop10ByOrderByCreatedAtDesc(House houseId, Pageable pageable);
	public List<Review> findTop6ByHouseIdOrderByCreatedAtDesc(Integer houseId);
   



}
