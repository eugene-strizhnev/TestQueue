package org.apache.activemq.artemis.jms.example;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Yevhen_Strizhnev on 11/15/2017.
 */
public class SecondListener implements MessageListener {

    protected static String lastMessage = null;

    @Override
    public void onMessage(Message message) {
        try {
            lastMessage = ((TextMessage) message).getText();
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MESSAGE RECEIVED BY SECOND ONE: " + lastMessage);
    }
}