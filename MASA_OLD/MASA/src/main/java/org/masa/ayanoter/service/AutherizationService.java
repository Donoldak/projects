package org.masa.ayanoter.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AutherizationService implements IAutherizationService {
    static int secret;

    @Override
    public boolean isValid(String username, String password){
        return username.equals("admin") && password.equals("admin");
    }
    @Override
    public int getSecret(String username, String password){
        secret = new Random().nextInt();
        return secret;
    }

    @Override
    public boolean checkSecret(int secret){
        return secret == AutherizationService.secret;
    }

}
