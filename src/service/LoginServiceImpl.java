package service;

import javax.inject.Inject;

import dao.LoginDAO;
import model.Login;

public class LoginServiceImpl implements LoginService {

    @Inject private LoginDAO loginDAO;

    public Boolean validaLogin (Integer ra, String senha) {
        Login validaRa = loginDAO.loadByRa(ra);
        Boolean isPodeLogar = false;

        if(validaRa.getSenha().equals(senha)) {
            isPodeLogar = true;
        }

        return isPodeLogar;
    }

}