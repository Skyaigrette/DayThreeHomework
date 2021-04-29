public class InstructorManager extends UserManager {
    public void addUser(Instructor instructor, Logger logger) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " İsimli Eğitmen Veritabanına Eklendi.");
        logger.log();
    }

    public void removeUser(Instructor instructor, Logger logger) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " İsimli Eğitmen Veritabanından Çıkartıldı.");
        logger.log();
    }
}
