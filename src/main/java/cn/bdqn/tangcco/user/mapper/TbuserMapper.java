package cn.bdqn.tangcco.user.mapper;

import cn.bdqn.tangcco.entity.Tbuser;

import java.util.List;

/**
 * Created by Administrator on 2017/5/18.
 */
public interface TbuserMapper {
    public void addTbuser(Tbuser tbuser);
    public Tbuser login(Tbuser tbuser);
    public List<Tbuser> queryAllTbuser();
    public void queryTbuserById(int id);
}
