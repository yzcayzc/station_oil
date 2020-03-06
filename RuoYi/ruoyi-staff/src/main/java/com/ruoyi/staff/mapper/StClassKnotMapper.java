package com.ruoyi.staff.mapper;

import com.ruoyi.staff.domain.StClassKnot;
import java.util.List;

/**
 * 班结Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
public interface StClassKnotMapper 
{
    /**
     * 查询班结
     * 
     * @param classKnotId 班结ID
     * @return 班结
     */
    public StClassKnot selectStClassKnotById(Long classKnotId);

    /**
     * 查询班结列表
     * 
     * @param stClassKnot 班结
     * @return 班结集合
     */
    public List<StClassKnot> selectStClassKnotList(StClassKnot stClassKnot);

    /**
     * 新增班结
     * 
     * @param stClassKnot 班结
     * @return 结果
     */
    public int insertStClassKnot(StClassKnot stClassKnot);

    /**
     * 修改班结
     * 
     * @param stClassKnot 班结
     * @return 结果
     */
    public int updateStClassKnot(StClassKnot stClassKnot);

    /**
     * 删除班结
     * 
     * @param classKnotId 班结ID
     * @return 结果
     */
    public int deleteStClassKnotById(Long classKnotId);

    /**
     * 批量删除班结
     * 
     * @param classKnotIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStClassKnotByIds(String[] classKnotIds);
}
