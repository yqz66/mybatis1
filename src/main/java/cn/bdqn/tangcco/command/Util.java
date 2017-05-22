package cn.bdqn.tangcco.command;

import cn.bdqn.tangcco.entity.PackageResult;

/**
 * Created by Administrator on 2017/5/20.
 */
public class Util {
    //MySql分页方法

    public static PackageResult getPackageResult(PackageResult page){
        if (page!=null){
            //求出总页数

            page.setTotalpages(page.getTotalPosts()/page.getPageSize()
                    +(page.getTotalPosts()%page.getPageSize()>0?1:0));
            //求出过滤记录数
            page.setPageNumber((page.getPageNumber()-1)*page.getPageSize());
        }
        return page;
    }

}
