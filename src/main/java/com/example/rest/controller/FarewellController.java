package com.example.rest.controller;

import com.example.rest.model.Message;
import com.example.rest.model.NumberToDuplicate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FarewellController {


    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    @ResponseBody
    Message sayBye(){
        return new Message("See you later");
    }

    @RequestMapping(value = "/duplicate", method = RequestMethod.POST)
    @ResponseBody
    Message duplicate(@RequestBody NumberToDuplicate value){
        Integer result = value.getValue() +  value.getValue();
        return new Message("The result is: " + result);
    }
}
