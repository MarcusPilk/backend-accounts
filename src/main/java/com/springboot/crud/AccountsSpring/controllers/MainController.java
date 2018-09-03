package com.springboot.crud.AccountsSpring.controllers;

import com.springboot.crud.AccountsSpring.models.AppAccounts;
import com.springboot.crud.AccountsSpring.models.AppAccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/")
public class MainController {

    @Autowired
    AppAccountsRepo appRepo;

    @RequestMapping("/all")
    public List<AppAccounts> findAll(){
        return (List<AppAccounts>) appRepo.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String doSave(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName, @RequestParam("accountnumber") int accountNumber){
        AppAccounts account;
        if(!id.isEmpty()){
            account = appRepo.findById(Integer.parseInt(id)).get();
        }else{
            account = new AppAccounts();
        }
        account.setFirst_name(firstName);
        account.setLast_name(lastName);
        account.setAccount_number(accountNumber);
        appRepo.save(account);

        return "{\"message\":\"Account created successfully!!\"}";
    }

    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public AppAccounts findOne(@PathVariable("id") int id){
        return appRepo.findById(id).get();
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public List<AppAccounts> doDelete(@PathVariable("id") int id){
        appRepo.deleteById(id);
        return findAll();
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public AppAccounts doEdit(@PathVariable("id") int id){
        return findOne(id);
    }
}
