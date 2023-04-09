package com.fx.projet_ui.Modeles;

public class ADMINISTRATEUR {
    private String code_user;
    private String password;

    public ADMINISTRATEUR(String code_user, String password)
    {
        this.code_user= code_user;
        this.password = password;
    }

    public String getCode_user() {
        return code_user;
    }

    public void setCode_user(String code_user) {
        this.code_user = code_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ADMINISTRATEUR{" +
                "code_user='" + code_user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
