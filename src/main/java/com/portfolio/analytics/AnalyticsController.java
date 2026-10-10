package com.portfolio.analytics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
	
	private final SalesRecordRepository repository;
	
	public AnalyticsController(SalesRecordRepository repository) {
		this.repository = repository;
	}
	
	// Endpoint 1: View all raw sales data
	// Accessible at: http://localhost:8080/api/analytics/all-sales
	@GetMapping("/all-sales")
	public List<SalesRecord> getAllSales() {
		return repository.findAll();
	}
	
	// Endpoint 2: View the total calculated revenue
	// Accessible at: http://localhost:8080/api/analytics/total-revenue
	@GetMapping("/total-revenue")
	public Double getTotalRevenue() {
		return repository.calculateTotalRevenue();
	}
	
	// Endpoint 3: View the sales grouped by category
	// Accessible at: http://localhost:8080/api/analytics/category-sales
	@GetMapping("/category-sales")
	public List<Map<String, Object>> getCategorySales() {
		return repository.getSalesByCategory();
	}
}
