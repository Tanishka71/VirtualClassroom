package com.bridgelabz.src.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Course {
    String course_id;
    String courseName;
    String schedule;
    List<Student> enrolledStudents;
    List<Instructor> instructors;
    List<LiveSession> liveSessions;
    List<Assignment> assignments;
    List<String> materials; 
    Scanner scanner = new Scanner(System.in);

    public Course(String course_id, String courseName, String schedule) {
        this.course_id = course_id;
        this.courseName = courseName;
        this.schedule = schedule;
        this.enrolledStudents = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.liveSessions = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.materials = new ArrayList<>();
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addLiveSession() {
        System.out.println("Please enter the live session Topic:- ");
        String session_topic = scanner.nextLine();
        LiveSession livesession = new LiveSession(session_topic);
        livesession.add_session();
        livesession.session_start();
        liveSessions.add(livesession);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        while (true) {
            System.out.println("Do you want to add another assignment?");
            String addAssignment = scanner.nextLine();
            if (addAssignment.equals("yes")) {
                System.out.println("Enter name of assignment:");
                String assignmentName = scanner.nextLine();
                Assignment a1 = new Assignment(assignmentName);
                while (true) {
                    System.out.println("Enter the question(if not press 0):- ");
                    String question = scanner.nextLine();
                    if (question.equals("0")) {
                        break;
                    } else {
                        System.out.println("Enter the answer:- ");
                        String answer = scanner.nextLine();
                        a1.addQuestion(question, answer);
                    }
                }
                assignments.add(a1);
            } else {
                break;
            }
        }
    }

    public void take_assignment(Student student) {
        for (int i = 0; i < assignments.size(); i++) {
            Assignment assignment = assignments.get(i);
            HashMap<String, String> questions = assignment.get_questions();

            System.out.println("Assignment: " + assignment.assignmentName);
            for (HashMap.Entry<String, String> entry : questions.entrySet()) {

                System.out.println("Question: " + entry.getKey());
                System.out.println("Your Answer: ");
                String studentAnswer = scanner.nextLine();

        
                String correctAnswer = entry.getValue();
                if (studentAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    student.score += 1; 
                } else {
                    System.out.println("Incorrect. The correct answer is: " + correctAnswer);
                  
                }
            }
        }
        System.out.println("Assignment completed. Your score: " + student.score);
    }


}
