package com.ruoyi.member.service.impl;

import java.util.List;

import com.ruoyi.member.domain.MMemberList;
import com.ruoyi.station.domain.GasStation;
import com.ruoyi.station.service.IGasStationService;
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

    @Autowired
    private IGasStationService iGasStationService;

    @Autowired
    private  MMemberListServiceImpl mMemberListService;

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
        //获取吉利数
        String s = new String();
        s = "88888";
        //通过加油站名称获取加油站编号
        String stationName = mElectronicWallet.getStationName();
        GasStation gasStation = new GasStation();
        gasStation.setName(stationName);
        List<GasStation> gasStations = iGasStationService.selectGasStationList(gasStation);

        Long stationId = null;
        for (GasStation station : gasStations) {
            if (station.getStationId()!=null){
                stationId = station.getStationId();
            }else{
                return 0;
            }
        }
        //得出加油站编号
        String s1 = stationId.toString();
        int length = s1.length();
        int i = 4-length;
        if (i>0){
            for (int l = 0;l<i;l++){
                s1 = "0"+s1;
            }
        }
        //通过会员联系电话得到会员编号
        String phone = mElectronicWallet.getPhone();
        MMemberList mMemberList = new MMemberList();
        mMemberList.setPhone(phone);
        List<MMemberList> mMemberLists = mMemberListService.selectMMemberListList(mMemberList);
        Long memberNumber = null;
        for (MMemberList memberList : mMemberLists) {
            if (memberList.getMemberId()==null){
                return 0;
            }
             memberNumber = memberList.getMemberNumber();
        }
        //得到会员编号
        String s2 = memberNumber.toString();
        int length1 = s2.length();
        int h = 7-length1;
        if (h>0){
            for (int l = 0;l<h;l++){
                s2 = "0"+s2;
            }
        }
        //通过三组数据得出电子钱包卡号
        Long aDouble = Long.valueOf(s+s1+s2);
            mElectronicWallet.setCard(aDouble);


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
