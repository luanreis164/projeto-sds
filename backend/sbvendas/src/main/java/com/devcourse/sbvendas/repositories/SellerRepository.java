package com.devcourse.sbvendas.repositories;

import com.devcourse.sbvendas.entitites.Seller;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SellerRepository extends JpaRepository<Seller,Long> {
}
