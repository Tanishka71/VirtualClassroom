package com.bridgelabz.src.classroom;

class Instructor {
    String instructorName;
    String instructorId;

    public Instructor(String instructorName, String instructorId) {
        this.instructorName = instructorName;
        this.instructorId = instructorId;
    }

    public void approveEnrollment(Student student, Course course) {
        if (course.enrolledStudents.contains(student)) {
            System.out.println("Student " + student.studentName + " is already enrolled in " + course.courseName);
        } else {
            course.enrolledStudents.add(student);
            System.out.println("Enrollment approved for " + student.studentName + " in " + course.courseName);
        }
    }

    public void conductLiveSession(Course course, String sessionTopic) {
        LiveSession liveSession = new LiveSession(sessionTopic);
        course.liveSessions.add(liveSession);
        System.out.println("Live Session started: " + sessionTopic);
    }

    public void gradeAssignment(Assignment assignment, int grade, String feedback) {
        assignment.grade(grade, feedback);
    }
}
