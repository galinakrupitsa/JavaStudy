package org.example.dietservice.Service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(DietOperationException.class)
        public ResponseEntity<?> handleDietError(DietOperationException ex) {

            Map<String, Object> body = new HashMap<>();
            body.put("error", "DIET_SAVE_FAILED");
            body.put("message", ex.getMessage());
            body.put("timestamp", LocalDateTime.now());

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
        }
    }


