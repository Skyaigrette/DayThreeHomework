public class CourseManager{
    public void changeCourseName(Course course, String newCourseName, Logger logger){
        course.setCourseName(newCourseName);
        logger.log();
    }
}
