package com.example.TrabajointegradorbackendI.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> recursoNoEncontrado(ResourceNotFoundException e) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
    @ExceptionHandler (BadRequestException.class)
    public ResponseEntity<String> malRequest (BadRequestException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST) .body(e.getMessage());
    }

}
