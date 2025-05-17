package app.nexus.taskmanager;

import org.springframework.boot.SpringApplication;

public class TestNexusTaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(NexusTaskManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
