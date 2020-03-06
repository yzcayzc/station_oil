package com.ruoyi.member.service;

import com.ruoyi.member.domain.MPersonalData;
import java.util.List;

/**
 * 会员基本信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IMPersonalDataService 
{
    /**
     * 查询会员基本信息
     * 
     * @param dataId 会员基本信息ID
     * @return 会员基本信息
     */
    public MPersonalData selectMPersonalDataById(Long dataId);

    /**
     * 查询会员基本信息列表
     * 
     * @param mPersonalData 会员基本信息
     * @return 会员基本信息集合
     */
    public List<MPersonalData> selectMPersonalDataList(MPersonalData mPersonalData);

    /**
     * 新增会员基本信息
     * 
     * @param mPersonalData 会员基本信息
     * @return 结果
     */
    public int insertMPersonalData(MPersonalData mPersonalData);

    /**
     * 修改会员基本信息
     * 
     * @param mPersonalData 会员基本信息
     * @return 结果
     */
    public int updateMPersonalData(MPersonalData mPersonalData);

    /**
     * 批量删除会员基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMPersonalDataByIds(String ids);

    /**
     * 删除会员基本信息信息
     * 
     * @param dataId 会员基本信息ID
     * @return 结果
     */
    public int deleteMPersonalDataById(Long dataId);
}
