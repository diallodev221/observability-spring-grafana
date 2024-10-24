package com.diallodev.observabilityspringgrafana.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Collection<Product> getAll() {
        return repository.findAll();
    }
}
