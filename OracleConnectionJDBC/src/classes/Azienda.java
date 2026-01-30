package classes;

public class Azienda {

    private int company_id;
    private String comapnyName;
    private String companyAddress;

    public Azienda(String comapnyName, String companyAddress) {
        this.comapnyName = comapnyName;
        this.companyAddress = companyAddress;
    }
    public Azienda(int company_id, String comapnyName, String companyAddress) {
        this.company_id = company_id;
        this.comapnyName = comapnyName;
        this.companyAddress = companyAddress;
    }

    public int getCompany_id() {
        return company_id;
    }
    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
    public String getComapnyName() {
        return comapnyName;
    }
    public void setComapnyName(String comapnyName) {
        this.comapnyName = comapnyName;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "company_id=" + company_id +
                ", comapnyName='" + comapnyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }
}
