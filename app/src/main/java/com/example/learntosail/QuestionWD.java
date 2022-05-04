package com.example.learntosail;

public class QuestionWD {
    private int image1, image2, image3, image4, correctAns;

    public QuestionWD(int image1, int image2, int image3, int image4, int correctAns){
        this.image1 = image1; this.image2 = image2;
        this.image3 = image3; this.image4 = image4;
        this.correctAns = correctAns;
    }
    public int getImage1() {
        return image1;
    }
    public int getImage2() {
        return image2;
    }
    public int getImage3() {
        return image3;
    }
    public int getImage4() {
        return image4;
    }
    public int getCorrectAns() {
        return correctAns;
    }
}
