package com.bridgelabz.employeeapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eId;
    private String eName;

    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {
    }

    @Autowired
    public EmployeeBean(DepartmentBean deptName) {
        logger.trace("***Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptName;
    }

    public int getEmpId() {
        return eId;
    }

    public String getEmpName() {
        return eName;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    public void setEid(int i) {
        this.eId = i;
    }

    public void setName(String name) {
        this.eName = name;
    }

    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", eId);
        logger.debug("Employee Name : {}", eName);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}", deptBean.getDeptName());
    }
}
