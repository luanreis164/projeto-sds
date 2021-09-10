package com.devcourse.sbvendas.services;

import com.devcourse.sbvendas.dto.SaleDTO;
import com.devcourse.sbvendas.dto.SellerDTO;
import com.devcourse.sbvendas.entitites.Sale;
import com.devcourse.sbvendas.entitites.Seller;
import com.devcourse.sbvendas.repositories.SaleRepository;
import com.devcourse.sbvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result  = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));

    }

}
