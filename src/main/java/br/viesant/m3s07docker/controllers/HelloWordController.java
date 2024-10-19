package br.viesant.m3s07docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWordController {

  @GetMapping
  public String helloWorld() {
    return "Hello World";
  }
}
