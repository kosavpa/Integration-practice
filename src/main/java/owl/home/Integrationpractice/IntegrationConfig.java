package owl.home.Integrationpractice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.integration.file.dsl.Files;
import org.springframework.integration.file.support.FileExistsMode;

import java.io.File;


@Configuration
public class IntegrationConfig {
    @Bean
    public IntegrationFlow fileWriterFlow(){

        return IntegrationFlows
                .from(MessageChannels.direct("textInChannel"))
                .<String,String>transform(String::toUpperCase)
                .handle(Files.outboundAdapter(new File("C:/Users/kosav/Desktop/Gurren_Lagan"))
                        .appendNewLine(true)
                        .fileExistsMode(FileExistsMode.APPEND))
                .get();
    }
}
