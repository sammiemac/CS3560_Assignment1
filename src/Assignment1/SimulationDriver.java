package Assignment1;

import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) throws Exception {
		
		String[] qType1 = {"A", "B", "C", "D"};
		String[] qType2 = {"Yes", "No"};

		Question voteType1 = new Question(1);
		Question voteType2 = new Question(2);
		
		System.out.println("=== Question Type 1 Results (Multiple choice, mupltiple answers) ===");
		Student[] studentsType1 = generateStudents();
		System.out.println("Class Size: " + studentsType1.length);
		studentsType1 = generateStudentAnswers(voteType1, qType1, studentsType1);
		VotingService serviceType1 = new VotingService(studentsType1, voteType1);
		serviceType1.checkVotes();
		serviceType1.printResults();
		
		System.out.println("\n=== Question Type 2 Results (Multiple choice, only one answer) ===");
		Student[] studentsType2 = generateStudents();
		System.out.println("Class Size: " + studentsType2.length);
		studentsType2 = generateStudentAnswers(voteType2, qType2, studentsType2);
		VotingService serviceType2 = new VotingService(studentsType2, voteType2);
		serviceType2.checkVotes();
		serviceType2.printResults();

	}
	
	public static Student[] generateStudents() {
		Random rand = new Random();
		int classSize = rand.nextInt(50)+1;
		Student[] studentClass = new Student[classSize];
		
		for(int i = 0; i < studentClass.length; i++) {
			studentClass[i] = new Student();
			
		}
		
		return studentClass;
		
	}
	
	public static Student[] generateStudentAnswers(Question q, String[] qChoices, Student[] studentClass) {
		int currQType = q.qType; // Get the type of question
		
		if (currQType == 1) {
			for(int i = 0; i < studentClass.length; i++) {
				Random votes = new Random();
				int amountOfVotes = votes.nextInt(4)+1; // Generates how many votes are being sent for the question (between 1-4)
				String[] studentChoices = new String[amountOfVotes];
				studentClass[i].studentVotes = studentChoices;
				
				for(int j = 0; j < amountOfVotes; j++) {
					Random choice = new Random();
					int voteChoice = choice.nextInt(4); // Of the choices between "A", "B", "C", and "D", adds it to the studentVotes array
					studentClass[i].studentVotes[j] = qChoices[voteChoice];
				}
			}
		} else if (currQType == 2) {
			for(int i = 0; i < studentClass.length; i++) {
				String[] studentChoices = new String[1];
				studentClass[i].studentVotes = studentChoices;
				for (int j = 0; j < studentClass[i].studentVotes.length; j++) {
					Random choice = new Random();
					int voteChoice = choice.nextInt(2); // Chooses a number between 0 or 1, with 0 being "Yes" and 1 being "No"
					studentClass[i].studentVotes[j] = qChoices[voteChoice];
					
				}
			}
		}
		
		return studentClass;
		
	}
}
