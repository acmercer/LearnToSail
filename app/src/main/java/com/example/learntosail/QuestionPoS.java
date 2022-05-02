package com.example.learntosail;

public class QuestionPoS {
    private int qImage;
    private int answer, selected;
    private int a1, a2, a3, a4;
    private boolean correct;

    public QuestionPoS(int qImage, int answer, int a1, int a2, int a3, int a4, boolean correct, int selected){
        this.qImage = qImage; this.answer = answer;
        this.a1 =a1; this.a2 = a2; this.a3 = a3; this.a4 = a4;
        this.correct = correct; this.selected = selected;
    }
    public int getImage(){
        return qImage;
    }
    public void setImage(int qImage){
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
    public boolean isCorrect() {
        return correct;
    }
    public void setUserAns(boolean correct){
        this.correct = correct;
    }
    public int getSelected(){return selected;}
    public void setSelected(int selected){ this.selected = selected;}
}
