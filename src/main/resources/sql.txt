-- Insert 10 Teachers
INSERT INTO Teacher (first_name, last_name, email, password, designation, birth_date) VALUES
('John', 'Doe', 'john.doe@example.com', 'password1', 'Professor', '1980-01-15'),
('Jane', 'Smith', 'jane.smith@example.com', 'password2', 'Lecturer', '1985-05-25'),
('Michael', 'Brown', 'michael.brown@example.com', 'password3', 'Assistant Professor', '1990-08-10'),
('Emily', 'Davis', 'emily.davis@example.com', 'password4', 'Senior Lecturer', '1975-12-05'),
('William', 'Garcia', 'william.garcia@example.com', 'password5', 'Professor', '1982-02-20'),
('Sarah', 'Martinez', 'sarah.martinez@example.com', 'password6', 'Lecturer', '1988-04-12'),
('David', 'Hernandez', 'david.hernandez@example.com', 'password7', 'Assistant Professor', '1992-07-30'),
('Linda', 'Lopez', 'linda.lopez@example.com', 'password8', 'Senior Lecturer', '1986-09-15'),
('James', 'Wilson', 'james.wilson@example.com', 'password9', 'Professor', '1984-03-22'),
('Patricia', 'Anderson', 'patricia.anderson@example.com', 'password10', 'Lecturer', '1991-06-18');

-- Insert 10 Students
INSERT INTO Student (first_name, last_name, email, password, birth_date) VALUES
('Alice', 'Johnson', 'alice.johnson@example.com', 'studentpass1', '2000-01-01'),
('Bob', 'Lee', 'bob.lee@example.com', 'studentpass2', '2001-02-15'),
('Charlie', 'Wilson', 'charlie.wilson@example.com', 'studentpass3', '1999-03-10'),
('Diana', 'Clark', 'diana.clark@example.com', 'studentpass4', '2002-04-20'),
('Edward', 'Robinson', 'edward.robinson@example.com', 'studentpass5', '1998-05-30'),
('Fiona', 'Lewis', 'fiona.lewis@example.com', 'studentpass6', '2003-06-25'),
('George', 'Walker', 'george.walker@example.com', 'studentpass7', '2000-07-15'),
('Hannah', 'Hall', 'hannah.hall@example.com', 'studentpass8', '2001-08-20'),
('Isaac', 'Young', 'isaac.young@example.com', 'studentpass9', '1999-09-30'),
('Julia', 'King', 'julia.king@example.com', 'studentpass10', '2002-10-10');

INSERT INTO Course (title, description, creation_date, price, teacher_id) VALUES
('Java Programming Basics', 'Learn the fundamentals of Java programming.', '2023-01-10', 199.99, 1),
('Web Development with Spring Boot', 'Create web applications using Spring Boot framework.', '2023-02-15', 299.99, 2),
('Data Science with Python', 'Explore data science concepts and practical applications using Python.', '2023-03-20', 249.99, 3),
('Machine Learning A-Z', 'Become a Machine Learning expert by learning various algorithms.', '2023-04-05', 349.99, 4),
('Introduction to Artificial Intelligence', 'Understand the basics of AI and its applications.', '2023-05-12', 399.99, 5),
('Project Management Fundamentals', 'Learn the basics of project management methodologies.', '2023-06-18', 149.99, 6),
('Digital Marketing Strategies', 'Understand digital marketing and its effective strategies.', '2023-07-25', 199.99, 7),
('Mobile App Development', 'Build mobile applications for iOS and Android.', '2023-08-30', 299.99, 8),
('Cloud Computing Essentials', 'Learn about cloud computing and its benefits.', '2023-09-10', 249.99, 9),
('Cybersecurity Fundamentals', 'Understand the basics of cybersecurity and how to protect systems.', '2023-10-15', 299.99, 10);


-- Insert 10 Enrolments (This assumes the Course IDs and Student IDs are known and valid)
INSERT INTO Enrolment (enrolment_date, course_id, student_id) VALUES
('2024-09-01', 1, 1),
('2024-09-02', 2, 2),
('2024-09-03', 3, 3),
('2024-09-04', 4, 4),
('2024-09-05', 5, 5),
('2024-09-06', 6, 6),
('2024-09-07', 7, 7),
('2024-09-08', 8, 8),
('2024-09-09', 9, 9),
('2024-09-10', 10, 10);

-- Insert 10 Reviews (This assumes the Course IDs and Student IDs are known and valid)
INSERT INTO Review (score, description, posted_on, student_id, course_id) VALUES
(5, 'Great course!', '2024-09-10', 1, 1),
(4, 'Very informative.', '2024-09-11', 2, 2),
(3, 'Good, but could be better.', '2024-09-12', 3, 3),
(5, 'Highly recommend!', '2024-09-13', 4, 4),
(4, 'Learned a lot.', '2024-09-14', 5, 5),
(3, 'Average course.', '2024-09-15', 6, 6),
(5, 'Loved it!', '2024-09-16', 7, 7),
(4, 'Well structured.', '2024-09-17', 8, 8),
(5, 'Excellent teaching.', '2024-09-18', 9, 9),
(4, 'Would take again.', '2024-09-19', 10, 10);
