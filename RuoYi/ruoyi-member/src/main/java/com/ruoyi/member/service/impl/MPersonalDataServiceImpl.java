package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MPersonalDataMapper;
import com.ruoyi.member.domain.MPersonalData;
import com.ruoyi.member.service.IMPersonalDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 会员基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MPersonalDataServiceImpl implements IMPersonalDataService 
{
    @Autowired
    private MPersonalDataMapper mPersonalDataMapper;

    /**
     * 查询会员基本信息
     * 
     * @param dataId 会员基本信息ID
     * @return 会员基本信息
     */
    @Override
    public MPersonalData selectMPersonalDataById(Long dataId)
    {
        return mPersonalDataMapper.selectMPersonalDataById(dataId);
    }

    /**
     * 查询会员基本信息列表
     * 
     * @param mPersonalData 会员基本信息
     * @return 会员基本信息
     */
    @Override
    public List<MPersonalData> selectMPersonalDataList(MPersonalData mPersonalData)
    {
        return mPersonalDataMapper.selectMPersonalDataList(mPersonalData);
    }

    /**
     * 新增会员基本信息
     * 
     * @param mPersonalData 会员基本信息
     * @return 结果
     */
    @Override
    public int insertMPersonalData(MPersonalData mPersonalData)
    {
        return mPersonalDataMapper.insertMPersonalData(mPersonalData);
    }

    /**
     * 修改会员基本信息
     * 
     * @param mPersonalData 会员基本信息
     * @return 结果
     */
    @Override
    public int updateMPersonalData(MPersonalData mPersonalData)
    {
        return mPersonalDataMapper.updateMPersonalData(mPersonalData);
    }

    /**
     * 删除会员基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMPersonalDataByIds(String ids)
    {
        return mPersonalDataMapper.deleteMPersonalDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员基本信息信息
     * 
     * @param dataId 会员基本信息ID
     * @return 结果
     */
    @Override
    public int deleteMPersonalDataById(Long dataId)
    {
        return mPersonalDataMapper.deleteMPersonalDataById(dataId);
    }
}
