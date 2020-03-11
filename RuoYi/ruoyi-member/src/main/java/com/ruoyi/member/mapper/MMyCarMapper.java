package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.MMyCar;
import java.util.List;

/**
 * 我的爱车Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface MMyCarMapper 
{
    /**
     * 查询我的爱车
     * 
     * @param myCarId 我的爱车ID
     * @return 我的爱车
     */
    public MMyCar selectMMyCarById(Long myCarId);

    /**
     * 查询我的爱车列表
     * 
     * @param mMyCar 我的爱车
     * @return 我的爱车集合
     */
    public List<MMyCar> selectMMyCarList(MMyCar mMyCar);

    /**
     * 新增我的爱车
     * 
     * @param mMyCar 我的爱车
     * @return 结果
     */
    public int insertMMyCar(MMyCar mMyCar);

    /**
     * 修改我的爱车
     * 
     * @param mMyCar 我的爱车
     * @return 结果
     */
    public int updateMMyCar(MMyCar mMyCar);

    /**
     * 删除我的爱车
     * 
     * @param myCarId 我的爱车ID
     * @return 结果
     */
    public int deleteMMyCarById(Long myCarId);

    /**
     * 批量删除我的爱车
     * 
     * @param myCarIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMMyCarByIds(String[] myCarIds);
}
