package com.bridgelabz.src.classroom;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Smiriti Jain", "INS001");
        Course course1 = new Course("C1", "Java Programming", "Mon, Wed 10:00 AM");
        Student student1 = new Student("Tanishka Jai ", "STU001", course1);

        course1.materials.add("Java Basics");
        course1.materials.add("Object-Oriented Programming");
        course1.addInstructor(instructor1);

        instructor1.approveEnrollment(student1, course1);

   
        instructor1.conductLiveSession(course1, "Introduction to Java");


        student1.joinLiveSession(course1.liveSessions.get(0));

       
        Assignment assignment1 = new Assignment("Assignment 1");
        student1.submitAssignment(assignment1, "Code submission");

        instructor1.gradeAssignment(assignment1, 90, "Well done!");


        System.out.println("Assignment Name: " + assignment1.assignmentName);
        System.out.println("Grade: " + assignment1.grade);
        System.out.println("Feedback: " + assignment1.feedback);
    }
}
