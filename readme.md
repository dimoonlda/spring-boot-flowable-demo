Demo project shows integration Spring Boot and Flowable(fork from Activiti) business process management (BPM) engine.
We have bpm process described in \src\main\resources\processes\test-service.bpmn20.xml.
I simulate network's latency while fetching data from outer services.
To start process send POST request: http://localhost:8088/services/process1
Show running processes send GET request: http://localhost:8088/runtime/process-instances

 About REST API read more here: http://www.flowable.org/docs/userguide/index.html#restApiChapter