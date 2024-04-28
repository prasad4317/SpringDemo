package com.backend.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contr {
	
   @GetMapping("/hello")
   public static String hey() {
	   return "hello all";
   }
   

}
