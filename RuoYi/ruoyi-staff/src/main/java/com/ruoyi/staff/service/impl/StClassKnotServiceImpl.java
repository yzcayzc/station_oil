package com.ruoyi.staff.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.StClassKnotMapper;
import com.ruoyi.staff.domain.StClassKnot;
import com.ruoyi.staff.service.IStClassKnotService;
import com.ruoyi.common.core.text.Convert;

/**
 * 班结Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
@Service
public class StClassKnotServiceImpl implements IStClassKnotService 
{
    @Autowired
    private StClassKnotMapper stClassKnotMapper;

    /**
     * 查询班结
     * 
     * @param classKnotId 班结ID
     * @return 班结
     */
    @Override
    public StClassKnot selectStClassKnotById(Long classKnotId)
    {
        return stClassKnotMapper.selectStClassKnotById(classKnotId);
    }

    /**
     * 查询班结列表
     * 
     * @param stClassKnot 班结
     * @return 班结
     */
    @Override
    public List<StClassKnot> selectStClassKnotList(StClassKnot stClassKnot)
    {
        return stClassKnotMapper.selectStClassKnotList(stClassKnot);
    }

    /**
     * 新增班结
     * 
     * @param stClassKnot 班结
     * @return 结果
     */
    @Override
    public int insertStClassKnot(StClassKnot stClassKnot)
    {
        return stClassKnotMapper.insertStClassKnot(stClassKnot);
    }

    /**
     * 修改班结
     * 
     * @param stClassKnot 班结
     * @return 结果
     */
    @Override
    public int updateStClassKnot(StClassKnot stClassKnot)
    {
        return stClassKnotMapper.updateStClassKnot(stClassKnot);
    }

    /**
     * 删除班结对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStClassKnotByIds(String ids)
    {
        return stClassKnotMapper.deleteStClassKnotByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除班结信息
     * 
     * @param classKnotId 班结ID
     * @return 结果
     */
    @Override
    public int deleteStClassKnotById(Long classKnotId)
    {
        return stClassKnotMapper.deleteStClassKnotById(classKnotId);
    }
}
