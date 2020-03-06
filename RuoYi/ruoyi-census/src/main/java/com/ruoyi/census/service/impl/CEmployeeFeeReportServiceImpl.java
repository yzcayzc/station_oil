package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CEmployeeFeeReportMapper;
import com.ruoyi.census.domain.CEmployeeFeeReport;
import com.ruoyi.census.service.ICEmployeeFeeReportService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工收费报表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
@Service
public class CEmployeeFeeReportServiceImpl implements ICEmployeeFeeReportService 
{
    @Autowired
    private CEmployeeFeeReportMapper cEmployeeFeeReportMapper;

    /**
     * 查询员工收费报表
     * 
     * @param feeId 员工收费报表ID
     * @return 员工收费报表
     */
    @Override
    public CEmployeeFeeReport selectCEmployeeFeeReportById(Long feeId)
    {
        return cEmployeeFeeReportMapper.selectCEmployeeFeeReportById(feeId);
    }

    /**
     * 查询员工收费报表列表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 员工收费报表
     */
    @Override
    public List<CEmployeeFeeReport> selectCEmployeeFeeReportList(CEmployeeFeeReport cEmployeeFeeReport)
    {
        return cEmployeeFeeReportMapper.selectCEmployeeFeeReportList(cEmployeeFeeReport);
    }

    /**
     * 新增员工收费报表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 结果
     */
    @Override
    public int insertCEmployeeFeeReport(CEmployeeFeeReport cEmployeeFeeReport)
    {
        return cEmployeeFeeReportMapper.insertCEmployeeFeeReport(cEmployeeFeeReport);
    }

    /**
     * 修改员工收费报表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 结果
     */
    @Override
    public int updateCEmployeeFeeReport(CEmployeeFeeReport cEmployeeFeeReport)
    {
        return cEmployeeFeeReportMapper.updateCEmployeeFeeReport(cEmployeeFeeReport);
    }

    /**
     * 删除员工收费报表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCEmployeeFeeReportByIds(String ids)
    {
        return cEmployeeFeeReportMapper.deleteCEmployeeFeeReportByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工收费报表信息
     * 
     * @param feeId 员工收费报表ID
     * @return 结果
     */
    @Override
    public int deleteCEmployeeFeeReportById(Long feeId)
    {
        return cEmployeeFeeReportMapper.deleteCEmployeeFeeReportById(feeId);
    }
}
