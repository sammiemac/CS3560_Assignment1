package Assignment1;

import java.util.*;

public class VotingService {
	
	Student[] currStudents;
	Question currQuestion;
	
	public VotingService(Student[] s, Question q) {
		Student[] tempStudent = s;
		currStudents = tempStudent;
		Question tempQuestion = q;
		currQuestion = tempQuestion;
		
	}
	
	public VotingService(Student[] s) {
		Student[] tempStudent = s;
		currStudents = tempStudent;
	}
	
	public void checkVotes() {
		for (int i = 0; i < currStudents.length; i++) {
			for (int j = 0; j < currStudents[i].studentVotes.length; j++) {
				int value = currQuestion.question.get(currStudents[i].studentVotes[j]);
				value++;
				currQuestion.question.put(currStudents[i].studentVotes[j], value);
			}
		}
	}
	
	public void printResults() {
		System.out.println("Choice : Votes");
		for (Map.Entry<String, Integer> mapElement : currQuestion.question.entrySet()) {
			String choice = mapElement.getKey();
			int votes = mapElement.getValue();
			System.out.println(choice + " : " + votes);
			
		}
	}
}
