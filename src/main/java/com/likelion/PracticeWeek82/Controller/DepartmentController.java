package com.likelion.PracticeWeek82.Controller;

import com.likelion.PracticeWeek82.Dto.DepartmentDto;
import com.likelion.PracticeWeek82.Service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    DepartmentService departmentService;
    @PostMapping("/department")
    public ResponseEntity<DepartmentDto>getDepartment(@RequestBody @Valid DepartmentDto departmentDto){
        return ResponseEntity.ok(departmentService.getDepartmentDto(departmentDto));
    }
}
