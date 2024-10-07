package com.asif732.uniquest.student;

import com.asif732.uniquest.enrolment.Enrolment;
import com.asif732.uniquest.review.Review;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private LocalDate birthDate;

  @OneToMany(mappedBy = "student")
  private List<Enrolment> enrolments;
  @OneToMany(mappedBy = "student")
  private List<Review> reviews;

  public Student() {}

  public Student(long id, String firstName, String lastName, String email, String password, LocalDate birthDate) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.birthDate = birthDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}
