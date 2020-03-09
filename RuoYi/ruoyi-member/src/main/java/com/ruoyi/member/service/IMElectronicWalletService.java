package com.ruoyi.member.service;

import com.ruoyi.member.domain.MElectronicWallet;
import java.util.List;

/**
 * 电子钱包Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface IMElectronicWalletService 
{
    /**
     * 查询电子钱包
     * 
     * @param electronicWalletId 电子钱包ID
     * @return 电子钱包
     */
    public MElectronicWallet selectMElectronicWalletById(Long electronicWalletId);

    /**
     * 查询电子钱包列表
     * 
     * @param mElectronicWallet 电子钱包
     * @return 电子钱包集合
     */
    public List<MElectronicWallet> selectMElectronicWalletList(MElectronicWallet mElectronicWallet);

    /**
     * 新增电子钱包
     * 
     * @param mElectronicWallet 电子钱包
     * @return 结果
     */
    public int insertMElectronicWallet(MElectronicWallet mElectronicWallet);

    /**
     * 修改电子钱包
     * 
     * @param mElectronicWallet 电子钱包
     * @return 结果
     */
    public int updateMElectronicWallet(MElectronicWallet mElectronicWallet);

    /**
     * 批量删除电子钱包
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMElectronicWalletByIds(String ids);

    /**
     * 删除电子钱包信息
     * 
     * @param electronicWalletId 电子钱包ID
     * @return 结果
     */
    public int deleteMElectronicWalletById(Long electronicWalletId);
}
