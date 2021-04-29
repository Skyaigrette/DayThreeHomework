public class StudentManager extends UserManager{
    public void addUser(Student student,Logger logger) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " İsimli Öğrenci Veritabanına Eklendi.");
        logger.log();
    }

    public void removeUser(Student student, Logger logger) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " İsimli Öğrenci Veritabanından Çıkartıldı.");
        logger.log();
    }
}
