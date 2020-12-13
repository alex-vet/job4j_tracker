package ru.job4j.ex.UserStore;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 4) {
            throw new UserInvalidException("Username must be more then 3 letters.");
        }
        if (user.isValid()) {
            return true;
        } else {
            throw new UserInvalidException("User is not valid.");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Alexey Vetoshkin", true)
        };
        try {
            User user = findUser(users, "Alexey Vetoshkin");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            System.out.println("User is not valid.");
        } catch (UserNotFoundException ex) {
            System.out.println("User not found.");
        }
    }
}
