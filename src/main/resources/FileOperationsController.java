<200,
Code for file operation
_______________________________________________________________________________________
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class FileController {

    @GetMapping("/data")
    public String readDataFromFile() throws IOException {
        String filePath = "path/to/your/text/file.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
        return fileContent;
    }
},[Content-Type:"text/plain;charset=UTF-8", Content-Length:"643", Date:"Wed, 28 Jun 2023 07:34:24 GMT", Keep-Alive:"timeout=60", Connection:"keep-alive"]>