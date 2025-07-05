import java.util.*;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧠 Welcome to the Online Quiz App");
        System.out.println("Choose a topic:");
        System.out.println("1. Java");
        System.out.println("2. SQL");
        System.out.println("3. Data Structures");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        List<Question> selectedQuestions = new ArrayList<>();

        switch (choice) {
            case 1:
                selectedQuestions = QuestionBank.getJavaQuestions();
                break;
            case 2:
                selectedQuestions = QuestionBank.getSQLQuestions();
                break;
            case 3:
                selectedQuestions = QuestionBank.getDSQuestions();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        // Shuffle questions
        Collections.shuffle(selectedQuestions);

        int score = 0;
        int qno = 1;

        for (Question q : selectedQuestions) {
            System.out.println("\nQ" + qno++ + ": " + q.getQuestion());
            List<String> options = q.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Your answer (1-4): ");
            int ans = scanner.nextInt() - 1;

            if (q.isCorrect(ans)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println(" Incorrect! Correct answer: " +
                        (q.getCorrectOptionIndex() + 1) + ". " + q.getOptions().get(q.getCorrectOptionIndex()));
            }
        }

        System.out.println("\n🎯 Quiz Over! Your Score: " + score + "/" + selectedQuestions.size());
    }
}
