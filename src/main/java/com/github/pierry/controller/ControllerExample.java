package com.github.pierry.controller;

import com.github.pierry.repository.TipoContaContabilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController public class ControllerExample {

  @Autowired private TipoContaContabilRepo tipoContaContabilRepo;

  @RequestMapping(value = "/hello", method = RequestMethod.POST) @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<String> hello() {
    try {
      Object list = (Object) tipoContaContabilRepo.findAll();
      System.out.println(list);
      return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }
}