package com.calculadora.demo.controllers;
import org.springframework.web.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.demo.model.Operaciones;



@RestController
public class Calculadora {

		
		 @RequestMapping("/")
		 public   String hellow() 
		    {
		        return "Calculadora!!";
		    }
		 
		@PostMapping("/sumar")
		 public int sumar( int numero1, int numero2)
		 	{
			
				Operaciones opsuma = new Operaciones();
		  		return opsuma.sumar(numero1, numero2);
			 
		 	}
		
		@PostMapping("/restar")
		 public int restar( int numero1, int numero2)
		 	{
			
				Operaciones opsuma = new Operaciones();
		  		return opsuma.restar(numero1, numero2);
			 
		 	}
		
		@PostMapping("/multiplicar")
		 public int multiplicar( int numero1, int numero2)
		 	{
			
				Operaciones opsuma = new Operaciones();
		   		return opsuma.multiplicar(numero1, numero2);
			 
		 	}
		
		@PostMapping("/dividir")
		 public double dividir( int numero1, int numero2)
		 	{
			
				Operaciones opsuma = new Operaciones();
		  		return opsuma.dividir(numero1, numero2);
			 
		 	}
	 }
	 
	 

