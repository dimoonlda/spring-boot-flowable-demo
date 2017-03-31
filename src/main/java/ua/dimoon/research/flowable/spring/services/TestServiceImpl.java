package ua.dimoon.research.flowable.spring.services;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.dimoon.research.flowable.spring.model.dto.ProcessDto;
import ua.dimoon.research.flowable.spring.model.dto.TaskDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService {

    private RuntimeService runtimeService;
    private TaskService taskService;

    @Autowired
    public TestServiceImpl setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
        return this;
    }

    @Autowired
    public TestServiceImpl setTaskService(TaskService taskService) {
        this.taskService = taskService;
        return this;
    }

    @Override
    @Transactional
    public void startTestProcess() {
        runtimeService.startProcessInstanceByKey("testServiceRequest");
    }

    @Override
    @Transactional
    public List<TaskDto> getTasks() {
        return taskService.createTaskQuery().list()
                .stream()
                .map(task -> new TaskDto().setId(task.getId()).setName(task.getName()))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<ProcessDto> getProcesses() {
        return runtimeService.createProcessInstanceQuery().list()
                .stream()
                .map(processInstance -> new ProcessDto().setId(processInstance.getId()).setName(processInstance.getName()))
                .collect(Collectors.toList());
    }
}
