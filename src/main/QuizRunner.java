package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizRunner {
    static Scanner in = new Scanner(System.in);
    public static String addQuestion;
    public static void main(String[] args) {
        Quiz objQuiz = new Quiz();
        String shortAnswer, paragraph;
        boolean bValidShortAnswer;
        boolean bValidParagraph;
        do{
            System.out.println("\nDescribe Launchcode.(in 80 characters)");
            shortAnswer = in.nextLine();
            bValidShortAnswer = validShortAnswer(shortAnswer);
            if(!bValidShortAnswer) {
                System.out.println("Enter less than 80 chars");
            }
        }while(!bValidShortAnswer);

        do{
            System.out.println("\nDescribe Launchcode.(in 500 characters)");
            paragraph = in.nextLine();
            bValidParagraph = validParagraph(paragraph);
            if(!bValidParagraph) {
                System.out.println("Enter less than 500 chars");
            }
        }while(!bValidParagraph);


        do{
            System.out.println("\nSet Question Type: \n1- Multiple choice\n2- Checkbox\n3-True/False");
            String questionType = in.nextLine();

            if(questionType.equals("1"))
            {
                System.out.println("\nSet Question with 4 choices:");
                String question = in.nextLine();
                System.out.println("\nSet Answer:");
                String answer = in.nextLine();
                objQuiz.addQuestions(questionType, question, answer);
            }
            else if (questionType.equals("2"))
            {
                System.out.println("\nSet Question with 4 choices:");
                String question = in.nextLine();
                System.out.println("\nSet Answer:");
                String answer = in.nextLine();
                objQuiz.addQuestions(questionType, question, answer);
            }
            else if (questionType.equals("3"))
            {
                System.out.println("\nSet Question:");
                String question = in.nextLine();
                System.out.println("\nSet Answer:");
                String answer = in.nextLine();
                objQuiz.addQuestions(questionType, question, answer);
            }


            System.out.println("\nDo you want to set another question:(y/n)");
            addQuestion = in.nextLine();
        }while(addQuestion.equals("y"));

        System.out.println("\nQuiz begins!!!!");

        HashMap<String, String> objQuesAns ;
        objQuesAns = objQuiz.getQuestionsAnswers();

        Integer i = 0;
        for (Map.Entry<String, String> quizList : objQuesAns.entrySet()) {
            //System.out.println(quizList.getKey() + " (" + quizList.getValue() + ")");
            i++;
            System.out.println("\nQ"+i + ":" + quizList.getKey());
            System.out.println("Enter Answer:");
            String userAnswer = in.nextLine();
            objQuiz.addUserAnswers(userAnswer);
        }


        System.out.println("\nQuiz completed!!!! Below is your grade !!!");
        ArrayList userAnswers = objQuiz.getUserAnswers();

        Integer j = 0;
        Integer k = 0;
        for (Map.Entry<String, String> quizList : objQuesAns.entrySet()) {
            System.out.println("\nQuestion:" + quizList.getKey());
            System.out.println("Your Answer:" + userAnswers.get(j));
            System.out.println("Correct Answer:" + quizList.getValue());
            if(userAnswers.get(j).equals(quizList.getValue()))
            {
                k++;
            }
            j++;
        }

        System.out.println("\nOverall Grade: " + k + " of " + objQuesAns.size() + " correct ");

    }

    public static boolean validShortAnswer(String userShortAnswer)
    {
        if(userShortAnswer.length()>=80)

        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean validParagraph(String userParagraph)
    {
        if(userParagraph.length()>=500)

        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
