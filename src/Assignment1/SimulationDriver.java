package Assignment1;

public class SimulationDriver {

	public static void main(String[] args) throws Exception {

		Question test = new Question(1);
		test.printAllQuestions();
		test.printQuestion(2);
		test.setAnswer(2, true);
		test.printQuestion(2);
		
		Student sam = new Student("013804193");
		Student dev = new Student();
		System.out.println(sam.getID());
		System.out.println(dev.getID());

	}

}
