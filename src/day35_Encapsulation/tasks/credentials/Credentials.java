package day35_Encapsulation.tasks.credentials;

public class Credentials {
    private String username, password;

    public boolean isStrongPassword(String password) {
        boolean isStrongPassword = false;
        boolean longAndNotContainSpace = password.length() >= 8 && !password.contains(" ");
        boolean containLetter = false;
        boolean containSpecialCharacter = false;
        boolean containDigit = false;
        char[] arr = password.toCharArray();
        for (char each : arr) {
            if (Character.isLetter(each)) {
                containLetter = true;
            }
            if (!Character.isLetterOrDigit(each)) {
                containSpecialCharacter = true;
            }
            if (Character.isDigit(each)) {
                containDigit = true;
            }
        }
        isStrongPassword = longAndNotContainSpace && containLetter && containSpecialCharacter && containDigit;
        return isStrongPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (isStrongPassword(password) == false) {
            System.err.println("not strong Password");
            System.exit(1);
        }
        this.password = password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }//constructor


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


