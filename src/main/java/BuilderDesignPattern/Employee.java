package BuilderDesignPattern;

import javax.naming.directory.InvalidAttributesException;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastname;
    private int age;
    private String gender;
    private String businessUnit;
    private int costToCompany;
    private String reportingManagerId;

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.businessUnit = builder.businessUnit;
        this.costToCompany = builder.costToCompany;
        this.reportingManagerId = builder.reportingManagerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    // Getters of employee.

    static class Builder {
        private String employeeId;
        private String firstName;
        private String lastname;
        private int age;
        private String gender;
        private String businessUnit;
        private int costToCompany;
        private String reportingManagerId;

        private boolean validate() {
            // validation logic
            return true;
        }

        public Employee build() {
//            if(!validate()) {
//                throw new InvalidAttributesException();
//            }
            return new Employee(this);
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBusinessUnit(String businessUnit) {
            this.businessUnit = businessUnit;
            return this;
        }

        public Builder setCostToCompany(int costToCompany) {
            this.costToCompany = costToCompany;
            return this;
        }

        public Builder setReportingManagerId(String reportingManagerId) {
            this.reportingManagerId = reportingManagerId;
            return this;
        }
    }
}
