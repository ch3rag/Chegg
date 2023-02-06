public class Question {
	private String text;
	private String answer;

	public Question() {
		text = "";
		answer = "";
	}

	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}

	public void addLine(String line) {
		text = text + line + "\n";
	}

	public void display() {
		System.out.print(text);
	}
}
