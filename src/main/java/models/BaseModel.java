package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public   abstract  class BaseModel {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  int id ;


}
