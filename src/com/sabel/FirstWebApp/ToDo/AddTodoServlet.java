package com.sabel.FirstWebApp.ToDo;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = "/addTodo.do")
public class AddTodoServlet extends HttpServlet {

    @Inject
    private ToDoService toDoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/addtodo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todoname = req.getParameter("name");
        ToDo neuesTodo = new ToDo(todoname);
        toDoService.add(neuesTodo);
        System.out.println(neuesTodo);
        resp.sendRedirect("todo.do");
    }
}
