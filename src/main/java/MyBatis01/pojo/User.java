package MyBatis01.pojo;


public class User {
    private String nam;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "User{" +
                "nam='" + nam + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
