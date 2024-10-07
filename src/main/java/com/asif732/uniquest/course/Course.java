package com.asif732.uniquest.course;

import com.asif732.uniquest.enrolment.Enrolment;
import com.asif732.uniquest.review.Review;
import com.asif732.uniquest.teacher.Teacher;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String description;
  private LocalDate creationDate;
  private double price;

  @ManyToOne
  private Teacher teacher;
  @OneToMany(mappedBy = "course")
  private List<Enrolment> enrolments;
  @OneToMany(mappedBy = "course")
  private List<Review> reviews;

  public Course() {}

  public Course(long id, double price, LocalDate creationDate, String description, String title) {
    this.id = id;
    this.price = price;
    this.creationDate = creationDate;
    this.description = description;
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
