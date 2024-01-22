//package com.example.pservices.controllers;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////This class will ahve multiple methods
//// that will be serving HTTP Requests at /hello
////This class will be service Rest (HTTPS) APIS
////localhost:8080/hello
//
//@RestController
//@RequestMapping("/hello")
//public class HelloController {
//
//    //GET /hello/ my_name
//
//    @GetMapping("/{name}/{times}")
//    public String sayHello(@PathVariable("name") String name, @PathVariable("times") int times ){
//
//        String answer ="";
//        for (int i=0; i < times; ++i) {
//            answer += "Hello" +" "+ name ;
//            answer += "<br>";
//
//
//        }
//        return answer;
//        //return "Hello There" + name;
//    }
//
//
//}
//
