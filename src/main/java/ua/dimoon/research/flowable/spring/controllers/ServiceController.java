package ua.dimoon.research.flowable.spring.controllers;


import org.springframework.http.ResponseEntity;
import ua.dimoon.research.flowable.spring.model.dto.ProcessDto;
import ua.dimoon.research.flowable.spring.model.dto.TaskDto;

import java.util.List;

public interface ServiceController {
    void startTestService();
    ResponseEntity<List<TaskDto>> getTasks();
    ResponseEntity<List<ProcessDto>> getProcesses();
}
