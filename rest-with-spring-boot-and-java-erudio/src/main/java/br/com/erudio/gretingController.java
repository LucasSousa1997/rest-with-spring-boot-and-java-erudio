package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController


public class gretingController {
    private static final String template = "Hello, %s!";
    private  final AtomicLong couter = new AtomicLong();



    @RequestMapping("/greeting")
    public greeting greeting(@RequestParam(value = "name",defaultValue = "World")String name){
        return new greeting(couter.incrementAndGet(),String.format(template, name));
    }

}
