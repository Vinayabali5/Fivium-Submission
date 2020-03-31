package com.fivium.recruitment.service;

import org.springframework.stereotype.Service;
import java.io.*; 
import java.util.*;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

@Service
public class StringParsingService {

  public String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
  }
 
  public Map<String, Integer> singleString(String input){
	  Map<String, Integer> mapOfSingleString = new LinkedHashMap<String, Integer>();
      String[] words = input.split(" ");
      for(String word : words) {
          String tempUCword = word.toLowerCase();
          if(mapOfSingleString.containsKey(tempUCword)){
        	  mapOfSingleString.put(tempUCword, mapOfSingleString.get(tempUCword) + 1);
          } else {
        	  mapOfSingleString.put(tempUCword, 1);
          }
      }
      return mapOfSingleString;
  }
	 
  }    