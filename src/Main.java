public class Main {

    public static void main(String[] args) {
        Instructor engin = new Instructor();
        engin.setEmailAddress("engin@gmail.com");
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setId(1);
        Course course1 = new Course();
        course1.setCourseID(1);
        course1.setCourseName("Java ile Sektörün Yükseklerine");
        course1.setCourseLanguage("Türkçe");
        course1.setProgrammingLanguage("JAVA");
        Student goktug = new Student();
        goktug.setEmailAddress("goktug@gmail.com");
        goktug.setFirstName("Göktuğ Furkan");
        goktug.setLastName("Arıca");
        goktug.setId(3);
        goktug.setStudentNumber(1);

        DatabaseLogger databaseLogger = new DatabaseLogger();

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        System.out.println(course1.getCourseName());
        courseManager.changeCourseName(course1, "Java Eğitimi :)", databaseLogger);
        System.out.println(course1.getCourseName());
        studentManager.addUser(goktug, databaseLogger);
        instructorManager.addUser(engin, databaseLogger);



    }
}
