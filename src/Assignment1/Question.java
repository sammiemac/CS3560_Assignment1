package Assignment1;

import java.util.*;

public class Question{
	LinkedHashMap<String, Integer> question = new LinkedHashMap<>();
	
	// Given an integer, determine what kind of question is being created
	public Question(int type) throws Exception {
		// Question Type 1: Multiple choice
		if(type == 1) {
			question.put("A", 0);
			question.put("B", 0);
			question.put("C", 0);
			question.put("D", 0);
		
		// Question Type 2: Yes or No
		} else if(type == 2) {
			question.put("Yes", 0);
			question.put("No", 0);
		
		// Throws an exception if the integer given is invalid
		} else {
			throw new Exception("Error: Invalid question type.");
			
		}
	}
}
