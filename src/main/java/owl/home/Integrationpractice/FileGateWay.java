package owl.home.Integrationpractice;


import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;


@MessagingGateway(defaultRequestChannel = "textInChannel")
public interface FileGateWay {
    void writeToFile(@Header(FileHeaders.FILENAME) String fileName, String data);
}
