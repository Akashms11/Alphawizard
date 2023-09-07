import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class FileOperationsController {


    @GetMapping("/data")
    public String readDataFromFile() throws IOException {
        String filePath = "C:\\Development\\alphawizard\\src\\main\\resources\\myFile.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
        return fileContent;
    }

    @PostMapping("/generateJavaFile")
    public ResponseEntity<String> generateJavaFile(@RequestBody String fileContent) {
        try {
            
            generateFile(fileContent);
            return ResponseEntity.ok("Java file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error generating Java file.");
        }
    }

    private void generateFile(String fileContent) throws IOException {
        
        String filePath = "C:\\Development\\alphawizard\\src\\main\\resources\\FileOperationsController.java";

        
        File file = new File(filePath);

        
        FileWriter writer = new FileWriter(file);
        writer.write(fileContent);
        writer.close();
    }
}

