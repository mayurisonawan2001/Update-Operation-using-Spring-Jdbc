package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Create student object with updated info
        Student student = new Student();
        student.setId(102);  // ID of the student to update
        student.setName("Amit Verma");
        student.setCity("Mumbai");

        // Update the student
        int result = studentDao.updateStudent(student);
        System.out.println("Record updated: " + result);
    }
}
