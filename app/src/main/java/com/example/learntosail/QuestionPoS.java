package com.example.learntosail;

public class QuestionPoS {
    private int qImage;
    private int answer;
    private int a1, a2, a3, a4;

    public QuestionPoS(int qImage, int answer, int a1, int a2, int a3, int a4){
        this.qImage = qImage; this.answer = answer;
        this.a1 =a1; this.a2 = a2; this.a3 = a3; this.a4 = a4;
    }
    public int getQuestion(){
        return qImage;
    }
    public void setQuestion(int qImage){
        this.qImage = qImage;
    }
    public int rightAnswer(){
        return answer;
    }
    public void setAnswer (int answer){
        this.answer = answer;
    }
    public int option1 (){
        return a1;
    }
    public int option2(){
        return a2;
    }
    public int option3(){
        return a3;
    }
    public int option4(){
        return a4;
    }
}
