package com.ruoyi.member.service.impl;

import java.util.List;

import com.ruoyi.member.domain.MMyCar;
import com.ruoyi.member.service.IMMyCarService;
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

    @Autowired
    private IMMyCarService imMyCarService;

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
        String phone = mPersonalData.getPhone();
        MMyCar mMyCar = new MMyCar();
        mMyCar.setPhone(phone);
        List<MMyCar> mMyCars = imMyCarService.selectMMyCarList(mMyCar);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        for (MMyCar myCar : mMyCars) {
           s = myCar.getCarNumber();
           s1 = mMyCar.getCarBrand();
           s2 = mMyCar.getCarType();
           s3 = mMyCar.getOils();
        }
        mPersonalData.setLicensePlate(s);
        mPersonalData.setCarBrand(s1);
        mPersonalData.setCarType(s2);
        mPersonalData.setOils(s3);

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
