package com.springboot.crud.AccountsSpring.controllers;

import com.springboot.crud.AccountsSpring.models.AppAccounts;
import com.springboot.crud.AccountsSpring.models.AppAccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    AppAccountsRepo appRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists",appRepo.findAll());
        return mv;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName, @RequestParam("accountnumber") int accountNumber){
        ModelAndView mv = new ModelAndView("redirect:/");
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
        mv.addObject("lists",appRepo.findAll());
        return mv;
    }

    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("account", appRepo.findById(id).get());
        return mv;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        appRepo.deleteById(id);
        return mv;
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("account", appRepo.findById(id).get());
        return mv;
    }
}
