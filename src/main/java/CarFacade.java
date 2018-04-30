import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CarFacade {
    @PersistenceContext
    EntityManager em;

    public List<Car> findAll(){
        return em
                .createNamedQuery("Car.findAll",Car.class)
                .getResultList();
    }
    public Car findById(Long model){
        return em.find(Car.class,model);
    }
    public void save(Car c){
        em.merge(c);
    }

    public String testMethod(){
        return "abc";
    }
}