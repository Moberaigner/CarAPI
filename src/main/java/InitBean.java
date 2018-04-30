import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

@Singleton
@Startup
public class InitBean {
    @Inject
    CarFacade carFacade;

    @PostConstruct
    public void init() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/cars.csv")));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                Car c = new Car(line.split(";")[0],line.split(";")[1],line.split(";")[2],line.split(";")[3],line.split(";")[4],line.split(";")[5],line.split(";")[6],line.split(";")[7]);
                carFacade.save(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
