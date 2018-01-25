package com.gmail.maryanto.dimas.model;

public class Department {

	private Integer departmentId;
	private String departmentName;
	private Integer managerId;
	private Integer locationId;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return String.format("{ departmentId: %s, departmentName: %s, managerId : %s, locationId: %s }",
				this.departmentId, this.departmentName, this.managerId, this.locationId);
	}

}
