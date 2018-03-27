package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class MyErrorController extends AbstractErrorController {
    private static final String path ="error";
    @Autowired
    private ErrorAttributes errorAttributes;
    public MyErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
        //this.errorAttributes = errorAttributes;
    }

    @RequestMapping(value = path)
    public Map error(HttpServletRequest request){
        WebRequest requestAttributes = new ServletWebRequest(request);
        Map<String, Object> errorAttributes = this.errorAttributes.getErrorAttributes(requestAttributes, false);
        System.out.println(1111);
        return errorAttributes;
    }

    @Override
    public String getErrorPath() {
        return path;
    }
}
