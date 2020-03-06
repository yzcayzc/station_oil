package com.ruoyi.census.service;

import com.ruoyi.census.domain.CEmployeeFeeReport;
import java.util.List;

/**
 * 员工收费报表Service接口
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
public interface ICEmployeeFeeReportService 
{
    /**
     * 查询员工收费报表
     * 
     * @param feeId 员工收费报表ID
     * @return 员工收费报表
     */
    public CEmployeeFeeReport selectCEmployeeFeeReportById(Long feeId);

    /**
     * 查询员工收费报表列表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 员工收费报表集合
     */
    public List<CEmployeeFeeReport> selectCEmployeeFeeReportList(CEmployeeFeeReport cEmployeeFeeReport);

    /**
     * 新增员工收费报表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 结果
     */
    public int insertCEmployeeFeeReport(CEmployeeFeeReport cEmployeeFeeReport);

    /**
     * 修改员工收费报表
     * 
     * @param cEmployeeFeeReport 员工收费报表
     * @return 结果
     */
    public int updateCEmployeeFeeReport(CEmployeeFeeReport cEmployeeFeeReport);

    /**
     * 批量删除员工收费报表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCEmployeeFeeReportByIds(String ids);

    /**
     * 删除员工收费报表信息
     * 
     * @param feeId 员工收费报表ID
     * @return 结果
     */
    public int deleteCEmployeeFeeReportById(Long feeId);
}
