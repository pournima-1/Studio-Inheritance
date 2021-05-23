package main;
import java.util.HashMap;

public class MultipleChoices extends Question {
    private HashMap<String, String> questionsAnswers = new HashMap<>();

    @Override
    public void addQuestionsAnswers(String inputQuestions, String inputAnswers)
    {
        questionsAnswers.put(inputQuestions, inputAnswers);
    }

    public HashMap<String, String> getQuestionsAnswers()
    {
        return questionsAnswers;
    }
}
