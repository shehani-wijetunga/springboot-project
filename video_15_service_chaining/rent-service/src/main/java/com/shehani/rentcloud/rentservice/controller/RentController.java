package com.shehani.rentcloud.rentservice.controller;

import com.shehani.rentcloud.model.Rent;
import com.shehani.rentcloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class RentController  {

    @Autowired
    RentService rentService;

    @RequestMapping(value = "/rent",method = RequestMethod.POST)
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

}
