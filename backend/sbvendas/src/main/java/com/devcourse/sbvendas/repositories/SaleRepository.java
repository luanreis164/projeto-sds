package com.devcourse.sbvendas.repositories;

import com.devcourse.sbvendas.dto.SaleSucessDTO;
import com.devcourse.sbvendas.dto.SaleSumDTO;
import com.devcourse.sbvendas.entitites.Sale;
import com.devcourse.sbvendas.entitites.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SaleRepository extends JpaRepository<Sale,Long> {


    @Query("SELECT new com.devcourse.sbvendas.dto.SaleSumDTO(obj.seller,SUM (obj.amount)) "
             + "FROM Sale AS obj GROUP BY obj.seller "         )
    List<SaleSumDTO> amountGroupedBySeller();


    @Query("SELECT new com.devcourse.sbvendas.dto.SaleSucessDTO(obj.seller,SUM (obj.visited),SUM (obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller "     )
    List<SaleSucessDTO> sucessGroupedBySeller();


}