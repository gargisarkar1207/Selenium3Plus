package com.tests;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=3)
  public void f() {
	  System.out.println("in f()");
  }
  @Test(priority=1)
  public void xyz()
  {
	  System.out.println("in xyz");
  }
  @Test(priority=2)
  public void testabc()
  {
	  System.out.println("in abc");
  }
  
 }
