package Assignment1;

import java.util.*;

public class Student {
	
	String ID;
	Question studentVotes;
	
	// Given a string, create student using the ID
	public Student(String s, int qType) throws Exception {
		ID = s;
		Question q = new Question(qType);
		studentVotes = q;
	}
	
	// When no string value given, construct random student ID
	// Ref: https://www.baeldung.com/java-random-string
	public Student() {
		int leftLimit = 48; // ASCII char '0'
		int rightLimit = 57; // ASCII char '9'
		int targetLength = 9; // Length of student ID, same length as a CPP BroncoID
		Random rand = new Random();
		
		ID = rand.ints(leftLimit, rightLimit + 1)
				.limit(targetLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
	
	public String getID() {
		return ID;
		
	}
	
	public void setStudentAnswer(int index, int choice) {
		studentVotes.setAnswer(index, choice);
	}

}
