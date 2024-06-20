package com.flywire.exercise.service.impl;

import com.flywire.exercise.model.Employee;
import com.flywire.exercise.service.IEmployeeService;
import com.flywire.exercise.utils.DataBaseUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    public List<Employee> getActiveList() throws IOException {
        return DataBaseUtil.fetchEmployees().stream()
                .filter(Employee::isActive)
                .sorted(Comparator.comparing(e -> e.getName().split(" ")[1]))
                .collect(Collectors.toList());
    }

    public Map<String, Object> getListByIdWithDirectReports(String id) throws IOException {
        return null;
    }

    public List<Employee> getListHiredWithinRange(Date startDate, Date endDate) throws IOException {
        return null;
    }

    public Employee create(Employee employeeItem) throws IOException {
        return null;
    }

    public Employee deactivate(String id) throws IOException {
        return null;
    }
}
