package com.Trivia.Quiz.Services;

import org.springframework.stereotype.Service;

@Service
public class SESService implements SaveMessageService{

    @Override
    public boolean saveMessage(String subject, String body) {

        try
        {

            return true;
        }
        catch (Exception e)
        {

        }
        return false;
    }
}
