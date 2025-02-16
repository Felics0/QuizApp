package com.mycompany.quizapp;

/**
 * Model class for questions
 *
 * @author zotta
 */
public class QuestionClass {

    private String subject;
    private int difficulty;
    private String question;
    private String[] answers;
    private String correctAnswer;

    //constructor method
    public QuestionClass(String subject, int difficulty, String question, String[] answers) {
        this.subject = subject;
        this.difficulty = difficulty;
        this.question = question;
        this.answers = answers;
    }

    //getter methods
    public String getSubject() {
        return subject;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    //setter method
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return " subject" + subject + " difficulty" + difficulty + " question" + question + " answer" + answers + " correctAnswer" + correctAnswer;
    }

}
