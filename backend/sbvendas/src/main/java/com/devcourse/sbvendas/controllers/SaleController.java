package com.devcourse.sbvendas.controllers;

import com.devcourse.sbvendas.dto.SaleDTO;
import com.devcourse.sbvendas.dto.SaleSucessDTO;
import com.devcourse.sbvendas.dto.SaleSumDTO;
import com.devcourse.sbvendas.dto.SellerDTO;
import com.devcourse.sbvendas.services.SaleService;
import com.devcourse.sbvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amoutGroupedBySeller(){
        List<SaleSumDTO> list = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sucess-by-seller")
    public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
        List<SaleSucessDTO> list = saleService.sucessGroupedBySeller();
        return ResponseEntity.ok(list);
    }




}
