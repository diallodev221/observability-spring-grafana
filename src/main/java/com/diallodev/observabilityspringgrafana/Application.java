package com.diallodev.observabilityspringgrafana;

import com.diallodev.observabilityspringgrafana.product.Product;
import com.diallodev.observabilityspringgrafana.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner run(ProductRepository repository) {
        return args -> {
            repository.save(Product.builder().name("Tshirt").price(3000).build());
            repository.save(Product.builder().name("Computer").price(4500).build());
            repository.save(Product.builder().name("Macbook").price(300000).build());

            repository.findAll().forEach(System.out::println);
        };
    }
}
