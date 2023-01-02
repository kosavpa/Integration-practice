package owl.home.Integrationpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntegrationPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IntegrationPracticeApplication.class, args);
		FileGateWay fileGateWay = context.getBean("fileGateWay", FileGateWay.class);
		fileGateWay.writeToFile("Quotes.txt","Kamina: God gave us eyes at the front of our heads so we can look forward to the future.");
		fileGateWay.writeToFile("Quotes.txt","Kamina: Don't believe in yourself. Believe in me! Believe in the Kamina who believes in you!");
		fileGateWay.writeToFile("Quotes.txt","Kamina: With a man's soul and a strong back, go beyond the impossible and kick reason to the curb!");
		fileGateWay.writeToFile("Quotes.txt","Nia: The Human spirit is infinite!");
		fileGateWay.writeToFile("Quotes.txt","Nia: Even when trapped by karma's cycle...; Yoko: The dreams we left behind will open the door!; Leeron: Even if the universe stands in our way!; Viral: Our seething blood will determine what will be!; Simon: We'll break through time and space!; Team Dai-Gurren: And defy all who would stop us, to grab hold of our path!; Simon: Tengen Toppa Gurren Lagann!; Team Dai-Gurren: JUST WHO THE HELL DO YOU THINK WE ARE?!");
		fileGateWay.writeToFile("Quotes.txt","Simon: Never afraid of what the future holds, never regretful of the present. That's who we are! The Dai-Gurren Brigade!");
		fileGateWay.writeToFile("Quotes.txt","Simon: If there's a wall in our way, then we smash it down! If there isn't a path then we create one ourselves!");
		fileGateWay.writeToFile("Quotes.txt","Kittan: When you're scared, it's all the more reason to move forward!");
	}
}
