package cn.bdqn.tangcco.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */
public class GradeVO {
    private Grade grade;
    private List<Student> slist;

    public GradeVO() {
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<Student> getSlist() {
        return slist;
    }

    public void setSlist(List<Student> slist) {
        this.slist = slist;
    }

    @Override
    public String toString() {
        return "GradeVO{" +
                "grade=" + grade +
                ", slist=" + slist +
                '}';
    }
}
