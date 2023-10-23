package com.landin.todolist.repo;

import com.landin.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItem, Integer> {
}
