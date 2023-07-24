package com.paulo.rest.webservices.restfulwebservices;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    private MessageSource messageSource;

    public HelloController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @GetMapping(path = "hello")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping(path = "helloBean")
    public HelloBean helloWorldBean(){
        return new HelloBean("Hello World Bean");
    }

    @GetMapping(path = "helloBean/path-variable/{name}")
    public String helloWorldBeanPathVariable(@PathVariable String name ){
        return String.format("Hello World , %s",  name =  name);
    }

    @GetMapping(path = "hello-world-internationalized")
    public String internationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default message", locale);
    }
}
