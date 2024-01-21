package com.bridgelabz.src.classroom;

import java.util.ArrayList;
import java.util.List;

class LiveSession {
    List<String> sessions;
    String sessionTopic;
    List<Student> participants; // Track participants in the live session

    public LiveSession(String sessionTopic) {
        this.sessionTopic = sessionTopic;
        this.sessions = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public void add_session() {
        String s1 = "This is session one";
        String s2 = "This is session two";
        String s3 = "This is session three";

        sessions.add(s1);
        sessions.add(s2);
        sessions.add(s3);
    }

    public void session_start() {
        for (int i = 0; i < sessions.size(); i++) {
            System.out.println(sessions.get(i));
        }
    }

    public void addParticipant(Student student) {
        participants.add(student);
        System.out.println(student.studentName + " joined the live session on " + sessionTopic);
    }
}

