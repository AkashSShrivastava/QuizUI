package com.Trivia.Quiz.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserContact {

    @NotEmpty
    private String name;
    @NotEmpty
    private String message;
    @NotEmpty
    @Email
    private String email;
    private boolean error;
    private String display;
    private int rate;

    public UserContact() {
    }

    public UserContact(String name, String email, String message, Boolean error, String display) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.error = error;
        this.display=display;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "UserContact{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", email='" + email + '\'' +
                ", error=" + error +
                ", display='" + display + '\'' +
                ", rate=" + rate +
                '}';
    }
}
