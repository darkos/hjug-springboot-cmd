package demo.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import demo.model.Question;
import demo.service.QuestAndAnswService;

@Controller
public class QAndAController implements CommandLineRunner {
	
	@Autowired
	private QuestAndAnswService qandaService;

	private Logger log = Logger.getLogger(QAndAController.class);
	
	@Override
	public void run(String... args) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			log.info("Enter new command or type exit to exit");
			log.info("you can type:");
			log.info("cquest - to insert one Question");
			log.info("dquest - to delete one Question created with cquest");
			log.info("cquestanda - to insert one Question and Answer to that question");
			log.info("loadtestdata - to insert one Question and one Answer with one Comment on each");
			log.info("exit - will exit the application");
			String text = scanner.nextLine();
			while (!text.equalsIgnoreCase("exit")) {
				if (text.equalsIgnoreCase("cquest")) {
					Question q = qandaService.createSampleQuestion();
					log.info("Question created:" + q.toString());
				} else if (text.equalsIgnoreCase("dquest")) {
					String deleted = qandaService.deleteSampleQuestion();
					log.info("Question deleted:" + deleted);
				} else if (text.equalsIgnoreCase("cquestanda")) {
					Question q = qandaService.createSampleQuestionAndSampleAnswer();
					log.info("Question and Answer created:" + q.toString());
				} else if (text.equalsIgnoreCase("loadtestdata")) {
					qandaService.loadTestData();
				} else {
					log.info("Enter new command or type exit to exit");
				}
				text = scanner.nextLine();
			}
		}
	}
	
	
}
