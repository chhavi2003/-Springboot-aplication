package com.example.springbootbackend;

import com.example.springbootbackend.entity.Products;
import com.example.springbootbackend.repository.ProductRepository;
//import com.example.springbootbackend.entity.Review;
//import com.example.springbootbackend.repository.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;
	// private ReviewRepository reviewRepository;

	@Override
	public void run(String... args) throws Exception {

		Products product1 = Products.builder()
				.name("Firewall")
				.description("Checkpoint")
				.build();

		Products product2 = Products.builder()
				.name("Server")
				.description("tenable")
				.build();

		Products product3 = Products.builder()
				.name("Vulnerability Asessment")
				.description("Seceon")
				.build();

		Products product4 = Products.builder()
				.name("Load Balancer")
				.description("Azure")
				.build();

		Products product5 = Products.builder()
				.name("Lambda")
				.description("AWS")
				.build();

		Products product6 = Products.builder()
				.name("Falco")
				.description("Sysdig")
				.build();

		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);
	}
}
