package com.fivium.recruitment.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringParsingServiceTest {

  @Test
  public void reverseString() {
    StringParsingService service = new StringParsingService();
    assertEquals("cba", service.reverseString("abc"));
    assertEquals("My String", service.reverseString("gnirtS yM"));
    assertEquals("", service.reverseString(""));
  }
}