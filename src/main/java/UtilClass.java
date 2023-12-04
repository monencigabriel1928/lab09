
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
public class UtilClass {
    private Car car;
    public UtilClass() {
    }
    public void adaugaFisier( Car car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("util.json"), car );
    }
    public void citesteFisier(Car car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(Paths.get("util.json").toFile() , Car.class);
    }
}