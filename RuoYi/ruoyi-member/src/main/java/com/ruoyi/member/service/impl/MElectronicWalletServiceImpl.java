package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MElectronicWalletMapper;
import com.ruoyi.member.domain.MElectronicWallet;
import com.ruoyi.member.service.IMElectronicWalletService;
import com.ruoyi.common.core.text.Convert;

/**
 * 电子钱包Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class MElectronicWalletServiceImpl implements IMElectronicWalletService 
{
    @Autowired
    private MElectronicWalletMapper mElectronicWalletMapper;

    /**
     * 查询电子钱包
     * 
     * @param electronicWalletId 电子钱包ID
     * @return 电子钱包
     */
    @Override
    public MElectronicWallet selectMElectronicWalletById(Long electronicWalletId)
    {
        return mElectronicWalletMapper.selectMElectronicWalletById(electronicWalletId);
    }

    /**
     * 查询电子钱包列表
     * 
     * @param mElectronicWallet 电子钱包
     * @return 电子钱包
     */
    @Override
    public List<MElectronicWallet> selectMElectronicWalletList(MElectronicWallet mElectronicWallet)
    {
        return mElectronicWalletMapper.selectMElectronicWalletList(mElectronicWallet);
    }

    /**
     * 新增电子钱包
     * 
     * @param mElectronicWallet 电子钱包
     * @return 结果
     */
    @Override
    public int insertMElectronicWallet(MElectronicWallet mElectronicWallet)
    {
        return mElectronicWalletMapper.insertMElectronicWallet(mElectronicWallet);
    }

    /**
     * 修改电子钱包
     * 
     * @param mElectronicWallet 电子钱包
     * @return 结果
     */
    @Override
    public int updateMElectronicWallet(MElectronicWallet mElectronicWallet)
    {
        return mElectronicWalletMapper.updateMElectronicWallet(mElectronicWallet);
    }

    /**
     * 删除电子钱包对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMElectronicWalletByIds(String ids)
    {
        return mElectronicWalletMapper.deleteMElectronicWalletByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电子钱包信息
     * 
     * @param electronicWalletId 电子钱包ID
     * @return 结果
     */
    @Override
    public int deleteMElectronicWalletById(Long electronicWalletId)
    {
        return mElectronicWalletMapper.deleteMElectronicWalletById(electronicWalletId);
    }
}
