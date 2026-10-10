package com.portfolio.analytics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SalesRecordRepository extends JpaRepository<SalesRecord, Long> {
	
	// Calculate total revenue across the entire database
	@Query("SELECT SUM(s.price * s.quantity) FROM SalesRecord s")
	Double calculateTotalRevenue();
	
	// Group sales by category and count how many items were sold
	@Query("SELECT s.category as category, SUM(s.quantity) as totalSold FROM SalesRecord s GROUP BY s.category")
	List<Map<String, Object>> getSalesByCategory();
}
