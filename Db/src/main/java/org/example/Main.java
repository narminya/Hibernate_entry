package org.example;

import org.example.models.Teacher;
import org.example.service.TeacherService;
import org.example.service.impl.TeacherServiceImpl;
import org.example.utils.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        EntityManager entityManager =  EntityManagerProvider.getEntityManager();

        TeacherService personService = new TeacherServiceImpl(entityManager);


        Teacher teacherDto = new Teacher();
        teacherDto.setFirstName("Test");
        teacherDto.setLastName("Test");
        personService.createTeacher(teacherDto);



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