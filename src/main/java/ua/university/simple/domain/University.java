package ua.university.simple.domain;

import jakarta.persistence.*;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_accreditation")
    private TypeOfAccreditation typeOfAccreditation;
    @Column(name = "number_of_institutes")
    private Integer numberOfInstitutes;
    @Column(name = "amount_of_student")
    private Integer amountOfStudents;
    @Column
    private String address;

    public University() {
    }

    public University(String name, TypeOfAccreditation typeOfAccreditation, Integer numberOfInstitutes, Integer amountOfStudents, String address) {
        this.name = name;
        this.typeOfAccreditation = typeOfAccreditation;
        this.numberOfInstitutes = numberOfInstitutes;
        this.amountOfStudents = amountOfStudents;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfAccreditation getTypeOfAccreditation() {
        return typeOfAccreditation;
    }

    public void setTypeOfAccreditation(TypeOfAccreditation typeOfAccreditation) {
        this.typeOfAccreditation = typeOfAccreditation;
    }

    public Integer getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(Integer numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }

    public Integer getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(Integer amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", levelOfAccreditation=" + typeOfAccreditation +
               ", numberOfInstitutes=" + numberOfInstitutes +
               ", amountOfStudents=" + amountOfStudents +
               ", address='" + address + '\'' +
               '}';
    }
}
