package org.example;
//
//import org.example.service.TeacherService;
//import org.example.service.impl.TeacherServiceImpl;

import org.example.models.Course;
import org.example.models.Teacher;
import org.example.service.CourseService;
import org.example.service.TeacherService;
import org.example.service.impl.CourseServiceImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.example.utils.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = null;
//        transaction = entityManager.getTransaction();
//        transaction.begin();
        TeacherService personService = new TeacherServiceImpl(entityManager);
        CourseService courseService = new CourseServiceImpl(entityManager);


        Teacher teacher = new Teacher();
        teacher.setName("Test");

        Course course1 = Course.builder().name("Programming").build();
        Course course2 = Course.builder().name("Graphic design").build();
        course2.setTeacher(teacher);
        course1.setTeacher(teacher);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        teacher.setCourse(courses);

        Teacher t = personService.createTeacher(teacher);
        System.out.println(t);

        EntityManagerProvider.close();


//        String url = "jdbc:postgresql://localhost/dev";
//        Properties props = new Properties();
//        props.setProperty("user", "postgres");
//        props.setProperty("password","1234");
//
//        try {
//            Connection connection = DriverManager.getConnection(url, props);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//        String url = "jdbc:postgresql://localhost/dev?currentSchema=dev_freekick&user=postgres&password=1234";
//        Connection connection = DriverManager.getConnection(url);
//
//        PreparedStatement pst = connection.prepareStatement("select * from countries where country_name = ?");
//        pst.setString(1, "Spain");
//
////        Statement st = connection.createStatement();
//       ResultSet rs = pst.executeQuery();
//
//        while (rs.next())
//        {
//            System.out.println("Column 1 returned");
//            System.out.println(rs.getString(2));
//
//        }
//
//        rs.close();
//        st.close();


    }
}