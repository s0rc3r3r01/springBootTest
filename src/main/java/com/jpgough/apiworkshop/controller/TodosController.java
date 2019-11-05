package com.jpgough.apiworkshop.controller;


import com.jpgough.apiworkshop.model.Task;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Api
@RestController
public class TodosController {
    ArrayList<Task> tasks;

    @ApiOperation("Hello World, used to bootstrap")
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @ApiOperation("Getting the tasks")
    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList getTodos() {
        return tasks;
    }

    @ApiOperation("Adding a task")
    @PostMapping(value = "/todos")
    @ResponseBody
    public int putTask(@RequestBody String description) {
        tasks.add(new Task(tasks.size() + 1, description));
        return tasks.size();
    }

    @ApiOperation("Getting a specific task")
    @RequestMapping(path = "/todos/{id}")
    public Task getTask(@PathVariable("id") int id) {
        Task res;
        try {
            res = tasks.get(id);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found");
        }

        return res;
    }

    @ApiOperation("Deleting a task")
    @RequestMapping(path = "/todos/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public String deleteTask(@PathVariable("id") int id) {
        try {
            tasks.remove(id);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found");
        }
        return "Task Deleted";
    }
}
