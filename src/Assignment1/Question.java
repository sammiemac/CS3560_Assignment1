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
	
	// Change the value of a key given at the index
		public void setAnswer(int key, int value) {
			try {
				// Sets the question hashmap to a list for indexing
				List keys = new ArrayList(question.keySet());
				// Given the index, find the corresponding key (converted to a string type) then change the value
				question.put(keys.get(key).toString(), value);
				
			// Throws an exception if the answer couldn't be set, such as by invalid index
			} catch (Exception e){
				System.out.println("Error: Couldn't set answer.");
				
			}
		}
}
