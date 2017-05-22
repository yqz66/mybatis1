package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/5/20.
 */
public class Student {
    private int stuid;
    private int gradeid;
    private String stunum;
    private String stuname;
    private String gender;
    private int age;
    private Grade grade;
    public Student() {
    }

    public Student(int stuid, int gradeid, String stunum, String stuname, String gender, int age) {
        this.stuid = stuid;
        this.gradeid = gradeid;
        this.stunum = stunum;
        this.stuname = stuname;
        this.gender = gender;
        this.age = age;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", gradeid=" + gradeid +
                ", stunum='" + stunum + '\'' +
                ", stuname='" + stuname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
