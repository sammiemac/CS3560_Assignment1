package Assignment1;

import java.util.*;

public class Question{
	LinkedHashMap<String, Boolean> question = new LinkedHashMap<>();
	
	// Given an integer, determine what kind of question is being created
	public Question(int type) throws Exception {
		// Question Type 1: Multiple choice
		if(type == 1) {
			question.put("A", false);
			question.put("B", false);
			question.put("C", false);
			question.put("D", false);
		
		// Question Type 2: Yes or No
		} else if(type == 2) {
			question.put("Yes", false);
			question.put("No", false);
		
		// Throws an exception if the integer given is invalid
		} else {
			throw new Exception("Error: Invalid question type.");
			
		}
	}
	
	// Change the value of a key given at the index
	public void setAnswer(int key, boolean value) {
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
	
	// Prints all the keys and values of the question
	public void printAllQuestions() {
		for (Map.Entry<String, Boolean> mapElement : question.entrySet()) {
			String key = mapElement.getKey();
			boolean value = mapElement.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
			
		}
	}
	
	// Prints a single key and value pair at the given index
	public void printQuestion(int index) {
		List keys = new ArrayList(question.keySet());
		System.out.println("Key and Value at index " + index + ": " + keys.get(index)
		+ ", " + question.get(keys.get(index)));
		
	}

}
