public class UserManager{
    public void changeUserName(User user, String newUserName, Logger logger){
        user.setUserName(newUserName);
        logger.log();
    }

}
