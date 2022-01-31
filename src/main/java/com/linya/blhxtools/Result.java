package com.linya.blhxtools;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
@AllArgsConstructor
public class Result <T> {

    private int code;
    private String message;
    private T data;

    public static <R> ResponseEntity<Result<R>> ok(R data){
        return ResponseEntity.ok(new Result<>(200,null,data));
    }

}
