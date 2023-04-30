package com.fx.projet_ui;

import com.fx.projet_ui.Modeles.EMPLOYE;

public interface IUser {
    public EMPLOYE seConnecter(String code_user, String password);
}
