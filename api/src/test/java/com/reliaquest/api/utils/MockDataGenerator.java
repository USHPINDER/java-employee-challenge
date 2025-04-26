package com.reliaquest.api.utils;

import com.reliaquest.api.DTO.*;

import java.util.ArrayList;
import java.util.List;



public class MockDataGenerator {

	public static EmployeeListResponseDTO getEmployeeListResponseDTO() {
		EmployeeListResponseDTO responseDTO = new EmployeeListResponseDTO();
		List<Employee> data = new ArrayList<>();
		data.add(getEmployee());

		responseDTO.setData(data);
		return responseDTO;
	}

	public static com.example.rqchallenge.dtos.EmployeeByIdResponseDTO getEmployeeByIdResponseDTO() {
		com.example.rqchallenge.dtos.EmployeeByIdResponseDTO responseDTO = new com.example.rqchallenge.dtos.EmployeeByIdResponseDTO();
		responseDTO.setData(getEmployee());
		responseDTO.setStatus("Success");
		return responseDTO;
	}

	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId("1");
		emp.setEmployeeName("testName");
		emp.setEmployeeAge("26");
		emp.setEmployeeSalary("1234");
		emp.setProfileImage("");

		return emp;

	}
}
