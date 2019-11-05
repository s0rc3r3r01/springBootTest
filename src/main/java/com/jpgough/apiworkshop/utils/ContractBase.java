package com.jpgough.apiworkshop.utils;

import com.jpgough.apiworkshop.controller.TodosController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class ContractBase {
    TodosController todoController = new TodosController();

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(this.todoController);
    }
}
