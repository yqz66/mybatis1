package cn.bdqn.tangcco.grade.mapper;

import cn.bdqn.tangcco.entity.Grade;
import cn.bdqn.tangcco.entity.GradeVO;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */
public interface GradeMapper {
    public  void addGrade(Grade grade);
    public void updateGrade(Grade garde);
    public void deleteGrade(Grade grade);
    public List<Grade> queryAllGrade();
    public List<GradeVO> queryStudentByGradeId(Grade grade);
    public Grade queryGradeById(int id);
}
