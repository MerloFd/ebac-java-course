package abstractfactory;

public class Customer {

    private String gradeRequest; //a grade
    private boolean hasCompanyContract;// se o cliente é da company ou n

    public Customer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest= gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean hasCompanyContract() { //metodos getters
        return hasCompanyContract;
    }
    public String getGradeRequest() {
        return gradeRequest;
    }
}
