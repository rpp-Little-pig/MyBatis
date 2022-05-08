package MyBatis02.pojo;

public class Brand {
    private Integer id ;
    private String brandNanme;
    private String companyName;
    private Integer status ;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandNanme() {
        return brandNanme;
    }

    public void setBrandNanme(String brandNanme) {
        this.brandNanme = brandNanme;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandNanme='" + brandNanme + '\'' +
                ", companyName='" + companyName + '\'' +
                ", status=" + status +
                '}';
    }
}
