package com.service.fakestore.exceptionhandler;

import com.service.fakestore.dtos.exceptionhandlerdto;
import com.service.fakestore.exceptions.Productnotfoundexception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class exceptionhandleradvice {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<exceptionhandlerdto> Arithmeticexceptionhandler(){
        exceptionhandlerdto dto = new exceptionhandlerdto();
        dto.setMessage("bad request was sent");
        dto.setSolution("try again");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Productnotfoundexception.class)
    public ResponseEntity<exceptionhandlerdto> Customexception(Productnotfoundexception productnotfoundexception){
        exceptionhandlerdto dto = new exceptionhandlerdto();
        dto.setMessage(productnotfoundexception.getMessage());
        dto.setSolution("try again");
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }



}
