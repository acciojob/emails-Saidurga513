package com.driver;
import  java.lang.*;
import java.util.Date;

public class Email {
private  Date date;
    private String emailId;
    private String password;
    private String message;
    private String senderId;

    public Email(Date date, String senderId, String message) {
        this.date = date;
        this.senderId = senderId;
        this.message = message;
    }
    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }
    public Date getDate() {
        return date;
    }

    public String getSenderId() {
        return senderId;
    }
    public String getMessage() {
        return message;
    }
    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
      boolean cp=false,np=true;
        if(password==oldPassword)
        {
           cp=true;
        }
        if(cp)
        {
            if (newPassword.length()< 8 ||
                    !newPassword.chars().anyMatch(Character::isUpperCase) ||
                    !newPassword.chars().anyMatch(Character::isLowerCase) ||
                    !newPassword.chars().anyMatch(Character::isDigit) ||
                    newPassword.matches("[a-zA-Z0-9]+")) {
            np=false;
            }
            if (np)
            {
                password=newPassword;
            }
        }
    }
}
