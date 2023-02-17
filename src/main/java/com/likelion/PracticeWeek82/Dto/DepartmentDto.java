package com.likelion.PracticeWeek82.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    @NotEmpty(message = "Id could not be empty")
    @NotNull(message = "Id could not be null")
    private Float departmentId;
    @NotEmpty(message = "Name could not be emptied")
    @Size(min = 10, max = 50)
    private String depatName;
    @NotEmpty(message = "Description could not be empty")
    private String description;
    @Valid
    List<EmployeeDto>employeeDtos;
}
