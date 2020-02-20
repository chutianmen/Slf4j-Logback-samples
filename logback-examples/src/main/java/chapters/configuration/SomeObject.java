package chapters.configuration;

public class SomeObject {
    private String userName = "jack";
    private int age =22;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
