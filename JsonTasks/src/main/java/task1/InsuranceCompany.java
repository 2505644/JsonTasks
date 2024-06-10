package task1;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class InsuranceCompany {
    @JsonSetter("No")
    private String number;

    @JsonSetter("Name")
    private String name;

    @JsonSetter(value = "Market Capitalization", contentNulls = Nulls.SKIP)
    private String marketCapitalization = "no data";

    public InsuranceCompany(String number, String name, String marketCapitalization) {
        this.number = number;
        this.name = name;
        this.marketCapitalization = marketCapitalization;
    }

    public InsuranceCompany() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    @Override
    public String toString() {
        return "InsuranceCompany{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", marketCapitalization='" + marketCapitalization + '\'' +
                '}';
    }
}
