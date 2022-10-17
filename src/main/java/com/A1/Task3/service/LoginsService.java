package com.A1.Task3.service;

import com.A1.Task3.domain.LoginsA1;
import org.springframework.stereotype.Service;

import static com.A1.Task3.controllers.MainController.appAccountNames;

@Service
public class LoginsService {

   public static void addToList(Iterable<LoginsA1> loginsA1s){
       for (LoginsA1 loginA1 : loginsA1s) {
           if (loginA1.isActive()) {
               appAccountNames.add(loginA1.getAppAccountName());
           }
       }
   }

}
