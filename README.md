✅ Goal
Update a student's name or city based on their ID using Spring JDBC.

🔁 Table Assumed
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);

✅ Step-by-Step
1️⃣ Update Method in DAO (StudentDao)
Open your StudentDao class and add the updateStudent() method:
2️⃣ App.java – Call Update Operation

StudentDao.java -	Add updateStudent(Student student)
App.java -	Call the update method using DAO
config.xml -	No changes needed if already configured
