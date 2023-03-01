package exception.iaccess2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserBO {
    //Your code here

    public static boolean containsNumber(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
                return true;
            }

        }
        return false;
    }

    public static boolean containsDigit(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (Character.isLetter(n.charAt(i))) {
                return true;
            }

        }
        return false;
    }

    public static boolean containsSpecial(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))
                    && !Character.isLetter(n.charAt(i))
                    && !Character.isWhitespace(n.charAt(i))) {
                return true;
            }

        }
        return false;
    }
    public static boolean getLength(String n){
        if (n.length()>=10){
            return true;
        }
        return false;
    }

    public static void validate(User u) throws WeakPasswordException {
        String pass = u.getPassword();
//        System.out.printf("%s %s %s %s",getLength(pass) , containsNumber(pass) , containsDigit(pass)  ,containsSpecial(pass));
        if (!getLength(pass) || !containsNumber(pass) || !containsDigit(pass) || !containsSpecial(pass)) {
            throw new WeakPasswordException("Your password is weak");
        }
    }
}

