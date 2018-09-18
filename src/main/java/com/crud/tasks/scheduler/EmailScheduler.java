package com.crud.tasks.scheduler;

import com.crud.tasks.config.AdminConfig;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.service.SimpleEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class EmailScheduler {
    private static final String SUBJECT = "Tasks: Once a day mail";

    @Autowired
    private SimpleEmailService simpleEmailService;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private AdminConfig adminConfig;

    @Scheduled(cron = "0 0 10 * * *")
    public void sendInformationEmail() {
        long size = taskRepository.count();
        String message;
        if (size == 1) {
            message = "Currently in database you got: 1 task";
        } else {
            message = "Currently in database you got: " + size + "tasks";

                    simpleEmailService.send(new Mail(
                    adminConfig.getAdminMail(),
                    SUBJECT,
                    message, null)
            );
        }
    }
}
