package  main;
public class Question {
    public String questionType;

    public void addQuestionsAnswers(String inputQuestions, String inputAnswers)
    {

    }

    public String getQuestionType()
    {
        if(questionType.equals("1"))
        {
            return "Multiple choice";
        }
        else if(questionType.equals("2"))
        {
            return "Checkbox";
        }
        else if(questionType.equals("3"))
        {
            return "Boolean";
        }
        else
        {
            return "";
        }
    }

    public void setQuestionType(String inputQuestionType)
    {
        questionType = inputQuestionType;
    }


}
