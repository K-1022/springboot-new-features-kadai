package com.example.samuraitravel.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;
import com.example.samuraitravel.entity.User;
import com.example.samuraitravel.form.ReviewEditForm;
import com.example.samuraitravel.form.ReviewForm;
import com.example.samuraitravel.repository.ReviewRepository;

@Service
public class ReviewService {
	private final ReviewRepository reviewRepository; 
	
	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
		 
	}
	
	@Transactional
	public void create(ReviewForm reviewForm, User user, House houseId) {
		Review review = new Review();
		
		review.setStar(reviewForm.getStar());
		review.setComments(reviewForm.getComments());
		review.setUser(user);
		review.setHouse(houseId);
		review.setName(user.getName());
		
		reviewRepository.save(review);
	}
	
	@Transactional
	public void update(ReviewEditForm reviewEditForm, User user, House houseId) {
		Review review = reviewRepository.getReferenceById(reviewEditForm.getId());
		
		review.setStar(reviewEditForm.getStar());
		review.setComments(reviewEditForm.getComments());
		review.setUser(user);
		review.setHouse(houseId);
		review.setName(user.getName());
		
		reviewRepository.save(review);
	}
	




}