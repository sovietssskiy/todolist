package com.landin.todolist.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;

@Entity
public class TodoItem {

//    @Id
    private int id;
    @NotNull
    private String title;

    private boolean done;


    public TodoItem() {

    }

    public TodoItem(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }


    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
