package com.devcourse.sbvendas.repositories;

import com.devcourse.sbvendas.entitites.Sale;
import com.devcourse.sbvendas.entitites.Seller;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SaleRepository extends JpaRepository<Sale,Long> {
}
