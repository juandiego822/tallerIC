package com.manning.gia.todo.web;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToDoTest {

	FirefoxDriver driver;
	@Before
	public void begin(){
		driver=new FirefoxDriver();
	}
	
	@Test
	public void openTodo() {
		//driver.get("http://localhost:8080/todo");
	}
	
	@After
	public void after(){
		driver.quit();
	}

}
