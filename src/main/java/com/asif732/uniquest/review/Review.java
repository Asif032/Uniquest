package com.asif732.uniquest.review;

import com.asif732.uniquest.course.Course;
import com.asif732.uniquest.student.Student;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int score;
  private String description;
  private LocalDate postedOn;

  @ManyToOne
  private Student student;
  @ManyToOne
  private Course course;

  public Review() {}

  public Review(long id, int score, String description, LocalDate postedOn) {
    this.id = id;
    this.score = score;
    this.description = description;
    this.postedOn = postedOn;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getPostedOn() {
    return postedOn;
  }

  public void setPostedOn(LocalDate postedOn) {
    this.postedOn = postedOn;
  }
}
