package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController

public class DemoApplication {

    NotebookMockedData notebook = NotebookMockedData.getInstance();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @RequestMapping("/")
    String home() {
        return "Welcome to Notebook Shop";
    }

    @RequestMapping("/notebook")
    public List<NotebookDetail> index(){
        return notebook.allNotebook();
    }

    @RequestMapping("/notebook/{id}")
    public NotebookDetail show(@PathVariable String id){
        int notebookId = Integer.parseInt(id);
        return notebook.getNotebookById(notebookId);
    }
}