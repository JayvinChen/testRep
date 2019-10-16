package domain;

/*
 * @author Jayvin
 * @date 2019/10/11 20:50
 */
public class User {
    private String username; //用户名
    private Integer age; //年龄
    private String address;///hghhghg
    private String password; //密码
    private String remark; //备注
    private String telephone;

    public User() {
    }

    public User(String username, Integer age, String address, String password, String remark, String telephone) {
        this.username = username;
        this.age = age;
        this.address = address;
        this.password = password;
        this.remark = remark;
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
