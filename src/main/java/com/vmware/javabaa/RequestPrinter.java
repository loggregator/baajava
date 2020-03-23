package com.vmware.javabaa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RequestPrinter {

    @RequestMapping(path = "/")
    public ResponseEntity<String> respond(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });

        return new ResponseEntity<>("boop", HttpStatus.OK);
    }
}
