package com.sabel.FirstWebApp.ToDo;

import com.sabel.FirstWebApp.ToDo.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();


    static {
        todos.add(new ToDo("Java EE lernen"));
        todos.add(new ToDo("BA Lernen"));
        todos.add(new ToDo("Tanzen lernen"));
    }

    public ToDoService() {

    }

    public List<ToDo> retrieveTodos() {
        return todos;
    }

    public void add(ToDo toDo) {
        todos.add(toDo);
    }

}
