package FactoryDesignPattern;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class NotificationFactory {
   public static Notification createNotification(String type)
   {
       if (type == null || type.isEmpty()) {
           return null;
       }
       return switch (type.toLowerCase()) {
           case "message" -> new MessageNotification();
           case "email" -> new EmailNotification();
           case "call" -> new PhoneCallNotification();
           default -> throw new IllegalArgumentException("Unknown notification type: " + type);
       };
   }

}
