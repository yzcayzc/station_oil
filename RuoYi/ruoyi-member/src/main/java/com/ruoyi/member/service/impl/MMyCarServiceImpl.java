package com.ruoyi.member.service.impl;

import java.util.List;

import com.ruoyi.member.domain.*;
import com.ruoyi.member.service.*;
import org.apache.poi.ss.formula.functions.Sumxmy2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MMyCarMapper;
import com.ruoyi.common.core.text.Convert;

/**
 * 我的爱车Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class MMyCarServiceImpl implements IMMyCarService 
{
    @Autowired
    private MMyCarMapper mMyCarMapper;

    @Autowired
    private IMCarTypeService imCarTypeService;

    @Autowired
    private IMCarBrandService imCarBrandService;

    @Autowired
    private ICarVehicleSystemService iCarVehicleSystemService;

    @Autowired
    private ICarModelService iCarModelService;

    /**
     * 查询我的爱车
     * 
     * @param myCarId 我的爱车ID
     * @return 我的爱车
     */
    @Override
    public MMyCar selectMMyCarById(Long myCarId)
    {
        return mMyCarMapper.selectMMyCarById(myCarId);
    }

    /**
     * 查询我的爱车列表
     * 
     * @param mMyCar 我的爱车
     * @return 我的爱车
     */
    @Override
    public List<MMyCar> selectMMyCarList(MMyCar mMyCar)
    {
        /*//获取车类型
        String carType = mMyCar.getCarType();
        MCarType mCarType = new MCarType();
        mCarType.setCarType(carType);
        List<MCarType> mCarTypes = imCarTypeService.selectMCarTypeList(mCarType);
        Long s = null;
        for (MCarType type : mCarTypes) {
            s = type.getNumber();
        }
        String carBrand = mMyCar.getCarBrand();
        String vehicleSystem = mMyCar.getVehicleSystem();
        String model = mMyCar.getModel();
        //获取车品牌
        MCarBrand mCarBrand = new MCarBrand();
        mCarBrand.setBrandId(carBrand);
        List<MCarBrand> mCarBrands = imCarBrandService.selectMCarBrandList(mCarBrand);
        Long s1 = null;
        for (MCarBrand brand : mCarBrands) {
             s1 = brand.getNumber();
        }
        //获取车系
        CarVehicleSystem carVehicleSystem = new CarVehicleSystem();
        carVehicleSystem.setVehicleSystem(vehicleSystem);
        List<CarVehicleSystem> carVehicleSystems = iCarVehicleSystemService.selectCarVehicleSystemList(carVehicleSystem);
        Long s2 = null;
        for (CarVehicleSystem system : carVehicleSystems) {
            s2 = system.getNumber();
        }
        //获取型号
        CarModel carModel = new CarModel();
        carModel.setModel(model);
        List<CarModel> carModels = iCarModelService.selectCarModelList(carModel);
        Long s3 = null;
        for (CarModel carModel1 : carModels) {
            s3 = carModel.getNumber();
        }
        String s4 = null;
         s4 = s.toString() + s1.toString() + s2.toString() + s3.toString();
        mMyCar.setCarNumber(s4);*/

        return mMyCarMapper.selectMMyCarList(mMyCar);
    }

    /**
     * 新增我的爱车
     * 
     * @param mMyCar 我的爱车
     * @return 结果
     */
    @Override
    public int insertMMyCar(MMyCar mMyCar)
    {
        return mMyCarMapper.insertMMyCar(mMyCar);
    }

    /**
     * 修改我的爱车
     * 
     * @param mMyCar 我的爱车
     * @return 结果
     */
    @Override
    public int updateMMyCar(MMyCar mMyCar)
    {
        return mMyCarMapper.updateMMyCar(mMyCar);
    }

    /**
     * 删除我的爱车对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMMyCarByIds(String ids)
    {
        return mMyCarMapper.deleteMMyCarByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除我的爱车信息
     * 
     * @param myCarId 我的爱车ID
     * @return 结果
     */
    @Override
    public int deleteMMyCarById(Long myCarId)
    {
        return mMyCarMapper.deleteMMyCarById(myCarId);
    }
}
