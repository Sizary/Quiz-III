package com.example.android.quizz;

/**
 * Created by Cezary on 12.03.2017.
 */

public class QuestionLibrary {

    private String Questions[] = {
            "What color is cobalt ? ",
            "Who was the inventor of the steam engine?",
            "Which planet is nearest the sun",
            "What is the main component in glass?",
            "Which country is the smallest?",
            "It was last question",
            "Click button Start Game"

    };

    private String Choices[][] = {

            {"Blue", "Black", "Silver", "Grey"},
            {"Torricelli", "James Watt", "Robert Oppenheimer", "Eddison"},
            {"Mercury", "Venus", "Earth", "Moon"},
            {"Salt", "NaCL", "Sand", "Coal"},
            {"Germany", "Poland", "France", "Belgium"},
            {"-", "-", "-", "->"},
            {"-", "-", "-", "->"}

    };

    private String CorrectAnswers[] = {"Blue", "James Watt", "Mercury", "Sand", "Belgium", "+", "+"};


    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = Choices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = Choices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = Choices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = Choices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }
}
