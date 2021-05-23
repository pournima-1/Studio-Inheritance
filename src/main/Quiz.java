package main;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Quiz {

    public ArrayList<String> userAnswers = new ArrayList<>();
    BooleanQuestions booleanQuestions = new BooleanQuestions();
    MultipleChoices multipleChoices = new MultipleChoices();
    Checkbox checkBox = new Checkbox();


    public void addQuestions(String questionType, String question, String answer)
    {
        Question objQuestion = new Question();
        objQuestion.setQuestionType(questionType);

        if(objQuestion.getQuestionType().equals("Boolean"))
        {
            booleanQuestions.addQuestionsAnswers(question, answer);
        }
        if(objQuestion.getQuestionType().equals("Multiple choice"))
        {
            multipleChoices.addQuestionsAnswers(question, answer);
        }
        if(objQuestion.getQuestionType().equals("Checkbox"))
        {
            checkBox.addQuestionsAnswers(question, answer);
        }
    };

    public HashMap<String, String> getQuestionsAnswers()
    {
        HashMap<String, String> overallQues = new HashMap<>();
        HashMap<String, String> boolQues = new HashMap<>();
        HashMap<String, String> multipleChoiceQues = new HashMap<>();

        overallQues = booleanQuestions.getQuestionsAnswers();
        overallQues.putAll(multipleChoices.getQuestionsAnswers());
        overallQues.putAll(checkBox.getQuestionsAnswers());
        return overallQues;
    }

    public void addUserAnswers(String userAnswer)
    {
        userAnswers.add(userAnswer);
    }

    public ArrayList<String> getUserAnswers()
    {
        return  userAnswers;
    };

}
