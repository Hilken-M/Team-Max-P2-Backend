package com.revature.maxtermind.modelTest;

import com.revature.maxtermind.model.Application;
import com.revature.maxtermind.model.Employee;
import com.revature.maxtermind.model.Position;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {



    private Employee john = new Employee();

    Employee employee =
            new Employee(0, "password123", "Max", "Hilky", "example@example.com", 1234567890, "espn.com", LocalDate.parse("2020-01-08"),
            new Position(1, "john", BigDecimal.valueOf(39000), true, john, new ArrayList<>()),
            new ArrayList<>(),new ArrayList<>()
            );




    @Test
    void setID_test(){
        employee.setId(0);
    }

//    @Test
//    void setPassword_test(){
//        employee.setId("Max");
//    }
//
//    @Test
//    void setFirstName_test(){
//        employee.setId(0);
//    }
//
//    @Test
//    void setLastName_test(){
//        employee.setId(0);
//    }
//
//    @Test
//    void setEmail_test(){
//        employee.setId(0);
//    }
//
//    @Test
//    void setPhoneNumber_test(){
//        employee.setId(0);
//    }


}
