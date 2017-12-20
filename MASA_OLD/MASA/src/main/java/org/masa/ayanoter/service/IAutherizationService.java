package org.masa.ayanoter.service;

public interface IAutherizationService {
    boolean isValid(String username, String password);

    int getSecret(String username, String password);

    boolean checkSecret(int secret);
}
