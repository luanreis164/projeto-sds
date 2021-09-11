package com.devcourse.sbvendas.services;

import com.devcourse.sbvendas.dto.SellerDTO;
import com.devcourse.sbvendas.entitites.Seller;
import com.devcourse.sbvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> result  = sellerRepository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());

    }

}
