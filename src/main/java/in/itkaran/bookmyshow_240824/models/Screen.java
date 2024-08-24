package in.itkaran.bookmyshow_240824.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;
    @OneToMany
    private List<Seat> seats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // to store a collection of basic data types
    private List<Feature> features;
}

/*

Student :
- id
- name
- List<Marks>

student_marks
- id
- marks

 */
