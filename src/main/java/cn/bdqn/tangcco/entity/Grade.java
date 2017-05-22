package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/5/20.
 */
public class Grade {
    private int gradeid;
    private String gradename;

    public Grade() {
    }

    public Grade(int gradeid, String gradename) {
        this.gradeid = gradeid;
        this.gradename = gradename;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeid=" + gradeid +
                ", gradename='" + gradename + '\'' +
                '}';
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }
}
