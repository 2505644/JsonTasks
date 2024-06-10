package task1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class InsuranceCompanies {
    private ArrayList<InsuranceCompany> insuranceCompany;

    public InsuranceCompanies(ArrayList<InsuranceCompany> insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public InsuranceCompanies() {
    }

    public ArrayList<InsuranceCompany> getInsuranceCompany() {
        return insuranceCompany;
    }

    @JsonProperty("InsuranceCompany")
    public void setInsuranceCompany(ArrayList<InsuranceCompany> insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    @Override
    public String toString() {
        return "InsuranceCompanies{" +
                "insuranceCompany=" + insuranceCompany +
                '}';
    }
}
