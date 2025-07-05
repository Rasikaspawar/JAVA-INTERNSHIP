import java.util.*;

public class QuestionBank {

    public static List<Question> getJavaQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is JVM?", Arrays.asList("Java Virtual Machine", "Java Volume Maker", "Just VM", "None"), 0));
        questions.add(new Question("Which keyword is used to inherit a class?", Arrays.asList("this", "super", "extends", "implements"), 2));
        questions.add(new Question("Which method is entry point in Java?", Arrays.asList("start()", "run()", "main()", "launch()"), 2));
        questions.add(new Question("What is encapsulation?", Arrays.asList("Binding code & data", "Inheritance", "Overloading", "None"), 0));
        questions.add(new Question("Which is not an OOP concept?", Arrays.asList("Polymorphism", "Abstraction", "Compilation", "Encapsulation"), 2));
        questions.add(new Question("Which loop is exit controlled?", Arrays.asList("for", "while", "do-while", "foreach"), 2));
        questions.add(new Question("What is method overloading?", Arrays.asList("Same name, diff params", "Same return", "Different name", "None"), 0));
        questions.add(new Question("Which collection is ordered?", Arrays.asList("Set", "Map", "List", "HashSet"), 2));
        questions.add(new Question("Which keyword is used for interface?", Arrays.asList("interface", "abstract", "implements", "None"), 0));
        questions.add(new Question("Which access modifier is most restricted?", Arrays.asList("public", "protected", "private", "default"), 2));
        return questions;
    }

    public static List<Question> getSQLQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What does SQL stand for?", Arrays.asList("Structured Query Language", "Simple Query Language", "Sequence Query Logic", "None"), 0));
        questions.add(new Question("Which command is used to retrieve data?", Arrays.asList("SELECT", "INSERT", "DELETE", "UPDATE"), 0));
        questions.add(new Question("Which clause is used with SELECT to filter?", Arrays.asList("WHERE", "ORDER BY", "GROUP BY", "LIMIT"), 0));
        questions.add(new Question("What is a primary key?", Arrays.asList("Unique Identifier", "Duplicate value", "Foreign Key", "None"), 0));
        questions.add(new Question("What is a foreign key?", Arrays.asList("Reference Key", "Primary Key", "Constraint", "None"), 0));
        questions.add(new Question("Which command creates a table?", Arrays.asList("INSERT", "SELECT", "CREATE", "JOIN"), 2));
        questions.add(new Question("What is normalization?", Arrays.asList("Remove redundancy", "Add redundancy", "Make queries faster", "Join tables"), 0));
        questions.add(new Question("Which JOIN returns all matching rows?", Arrays.asList("INNER JOIN", "OUTER JOIN", "LEFT JOIN", "CROSS JOIN"), 0));
        questions.add(new Question("Which function gives total rows?", Arrays.asList("COUNT()", "SUM()", "AVG()", "MAX()"), 0));
        questions.add(new Question("Which keyword sorts results?", Arrays.asList("ORDER BY", "GROUP BY", "FILTER", "SORT"), 0));
        return questions;
    }

    public static List<Question> getDSQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which is LIFO?", Arrays.asList("Queue", "Array", "Stack", "LinkedList"), 2));
        questions.add(new Question("Which is FIFO?", Arrays.asList("Stack", "Queue", "Tree", "Graph"), 1));
        questions.add(new Question("Which data structure uses nodes?", Arrays.asList("Array", "Linked List", "Stack", "HashMap"), 1));
        questions.add(new Question("What is Binary Tree?", Arrays.asList("Max 2 children", "Only 1 node", "Sorted tree", "Heap"), 0));
        questions.add(new Question("Which is used in DFS?", Arrays.asList("Queue", "Stack", "Array", "Tree"), 1));
        questions.add(new Question("Which is used in BFS?", Arrays.asList("Stack", "Queue", "Graph", "List"), 1));
        questions.add(new Question("What is HashMap?", Arrays.asList("Key-Value Pair", "List of arrays", "Queue", "Set"), 0));
        questions.add(new Question("Which structure is used for recursion?", Arrays.asList("Queue", "Tree", "Stack", "Graph"), 2));
        questions.add(new Question("What is time complexity of binary search?", Arrays.asList("O(n)", "O(log n)", "O(n^2)", "O(1)"), 1));
        questions.add(new Question("Which DS is used in Undo operations?", Arrays.asList("Stack", "Queue", "HashMap", "Graph"), 0));
        return questions;
    }
}
