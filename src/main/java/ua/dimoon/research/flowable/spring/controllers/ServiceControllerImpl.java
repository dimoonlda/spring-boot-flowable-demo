package ua.dimoon.research.flowable.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.dimoon.research.flowable.spring.model.dto.ProcessDto;
import ua.dimoon.research.flowable.spring.model.dto.TaskDto;
import ua.dimoon.research.flowable.spring.services.TestService;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceControllerImpl implements ServiceController {

    private TestService testService;

    @Autowired
    public ServiceControllerImpl setTestService(TestService testService) {
        this.testService = testService;
        return this;
    }

    @Override
    @RequestMapping(value = "/process1", method = RequestMethod.POST)
    public void startTestService() {
        testService.startTestProcess();
    }

    @Override
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public ResponseEntity<List<TaskDto>> getTasks() {
        return new ResponseEntity<>(testService.getTasks(), HttpStatus.OK);
    }

    @Override
    @RequestMapping(value = "/processes", method = RequestMethod.GET)
    public ResponseEntity<List<ProcessDto>> getProcesses() {
        return new ResponseEntity<>(testService.getProcesses(), HttpStatus.OK);
    }
}
