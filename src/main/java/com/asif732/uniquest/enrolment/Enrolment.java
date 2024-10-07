package com.asif732.uniquest.enrolment;

import com.asif732.uniquest.course.Course;
import com.asif732.uniquest.student.Student;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Enrolment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long enrolmentID;
  private LocalDate enrolmentDate;

  @ManyToOne
  private Course course;
  @ManyToOne
  private Student student;

  public Enrolment() {}

  public Enrolment(long enrolmentID, LocalDate enrolmentDate) {
    this.enrolmentID = enrolmentID;
    this.enrolmentDate = enrolmentDate;
  }

  public long getEnrolmentID() {
    return enrolmentID;
  }

  public void setEnrolmentID(long enrolmentID) {
    this.enrolmentID = enrolmentID;
  }

  public LocalDate getEnrolmentDate() {
    return enrolmentDate;
  }

  public void setEnrolmentDate(LocalDate enrolmentDate) {
    this.enrolmentDate = enrolmentDate;
  }
}
