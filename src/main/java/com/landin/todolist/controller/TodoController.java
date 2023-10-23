package com.landin.todolist.controller;

import com.landin.todolist.model.TodoItem;
import com.landin.todolist.repo.TodoRepo;
import jakarta.annotation.Nonnull;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    public TodoRepo todoRepo;

    @Autowired
    public TodoController(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }
    @PostMapping
    public TodoItem save (@Validated @NotNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }
    @PutMapping
    public TodoItem update (@Validated @NotNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }
    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable int id) {
        todoRepo.deleteById(id);
    }
}
