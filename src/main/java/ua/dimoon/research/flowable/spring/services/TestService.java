package ua.dimoon.research.flowable.spring.services;

import ua.dimoon.research.flowable.spring.model.dto.ProcessDto;
import ua.dimoon.research.flowable.spring.model.dto.TaskDto;

import java.util.List;

public interface TestService {
    void startTestProcess();

    /**
     * Returns list of tasks that need to be performed by human users.
     * @return list of tasks
     */
    List<TaskDto> getTasks();

    /**
     * Returns list of processes that perform in runtime with flowable:async="true" parameter.
     * @return list of processes
     */
    List<ProcessDto> getProcesses();
}
