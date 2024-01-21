package com.bridgelabz.src.classroom;

import java.util.HashMap;

class Assignment {
    String assignmentName;
    HashMap<String, String> questions;
    int grade;
    String feedback; 

    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
        this.questions = new HashMap<>();
        this.grade = -1; 
        this.feedback = ""; 
    }

    public void addQuestion(String question, String answer) {
        questions.put(question, answer);
    }

    public HashMap<String, String> get_questions() {
        return questions;
    }

    public void grade(int grade, String feedback) {
        this.grade = grade;
        this.feedback = feedback;
        System.out.println("Assignment graded: " + assignmentName);
    }
}
