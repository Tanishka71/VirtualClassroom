package com.bridgelabz.src.classroom;
import java.util.HashMap;

class Student {
    String studentName;
    String studentId;
    Course course;
    int score;
    HashMap<Assignment, String> submittedAssignments; 

    public Student(String studentName, String studentId,Course course) {
        this.studentName = studentName;
        this.course = course; 
        this.studentId = studentId;
        this.score = 0;
        this.submittedAssignments = new HashMap<>();
    }

    public void submitAssignment(Assignment assignment, String submission) {
     
        if (course.assignments.contains(assignment)) {
            submittedAssignments.put(assignment, submission);
            System.out.println("Assignment submitted successfully: " + assignment.assignmentName);
        } else {
            System.out.println("Invalid assignment submission. Assignment not found in the current course.");
        }
    }

    public void joinLiveSession(LiveSession liveSession) {
        liveSession.addParticipant(this);
        System.out.println("Joined the live session on " + liveSession.sessionTopic);
    }
}
