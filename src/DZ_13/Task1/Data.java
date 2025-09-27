package DZ_13.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    String login;
    String password;
    String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean valid(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Количество символов в логине должно быть менее 20");
        }
        if (login.matches(".*\\s.*")) {
            throw new WrongLoginException("Логин не должен содержать пробелы");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен иметь менее 20 символов");
        }
        if (password.matches(".*\\s.*")) {
            throw new WrongPasswordException("Пароль не должен содержать пробелы");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
        }
        return true;
    }
}
