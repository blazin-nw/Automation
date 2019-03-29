package com.automation.app;

import org.testng.annotations.Test;

public class PrintOneTest {
	
	@Test
	
	public void firstPrint() {
		System.out.print("Esta es la primera impresión");
	}
	
	@Test
	
	public void secondPrint() {
		System.out.println("Esta es la segunda impresión");
	}

}
