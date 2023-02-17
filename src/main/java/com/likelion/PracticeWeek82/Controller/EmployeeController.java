package com.likelion.PracticeWeek82.Controller;

import com.likelion.PracticeWeek82.Dto.EmployeeDto;
import com.likelion.PracticeWeek82.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    EmployeeService employeeService;
    List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto>addEmployee(@RequestBody @Valid EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.getEmployeeDto(employeeDto));
    }
}
