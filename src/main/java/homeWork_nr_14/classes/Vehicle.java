package homeWork_nr_14.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Vehicle implements Serializable {
    public String name;
    private Integer powerOfEngine;
}
