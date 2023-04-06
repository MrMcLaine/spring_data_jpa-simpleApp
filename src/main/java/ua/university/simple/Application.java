package ua.university.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.university.simple.domain.TypeOfAccreditation;
import ua.university.simple.domain.University;
import ua.university.simple.service.UniversityService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        UniversityService service = ctx.getBean(UniversityService.class);

        //Create & Initialization

/*        University universityOfLondon = new University("University of London", TypeOfAccreditation.NATIONAL,
                23, 175000,  "Senate House, Malet Street, London");
        University kingsCollege = new University("King's College London", TypeOfAccreditation.REGIONAL,
                12, 7250, "King's College London, Strand London WC2R 2LS");
        University birkbeck = new University("Birkbeck", TypeOfAccreditation.SPECIALIZED,
                27, 14000,"Malet St, London WC1E 7HX");
        University globalUniversity = new University("London's Global University", TypeOfAccreditation.NATIONAL,
                20, 39000, "Some where in London");
        University created = new University("Some name", TypeOfAccreditation.SPECIALIZED,
                11, 11000, "Some address");

        service.create(universityOfLondon);
        service.create(kingsCollege);
        service.create(birkbeck);
        service.create(globalUniversity);
        service.create(created);*/

        //update
/*        University updated = service.findById(5L);
        updated.setName("updatedName");
        service.update(updated);*/

        //delete
        //  service.delete(5L);

        //findById
        System.out.println(service.findById(2L));

        System.out.println("**********************");

        //findAll
        service.findAll().forEach(System.out::println);

        System.out.println("**********************");

        //findByTypeOfAccreditation
        service.findByTypeOfAccreditation(TypeOfAccreditation.NATIONAL).forEach(System.out::println);
    }
}
