package com.example.example3_hometask.services;

import com.example.example3_hometask.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private DataProcessingService dataProcessingService;

    //Поля UserService, NotificationService
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
    //Метод processRegistration
    public void processRegistration(User user) {
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
        notificationService.notifyUser(user);
    }

}
