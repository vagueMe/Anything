package com.dllg.pabank.model.request;

/**
 * 查询银行时间段内交易明细
 */
public class BankTransactionDetailsQueryRequest extends PABankRequest {
    /**
     * 功能标志
     * 1:当日
     * 2：历史
     */
    private String FunctionFlag;
    /**
     * 资金汇总账号
     */
    private String FundSummaryAcctNo;
    /**
     * 子账号
     */
    private String SubAcctNo;
    /**
     * 查询标志
     * 1：全部
     * 2：转出 
     * 3：转入
     */
    private String QueryFlag;
    /**
     * 开始日期
     * 若是历史查询，则必输，当日查询时，不起作用
     */
    private String StartDate;
    /**
     * 终止日期
     * 若是历史查询，则必输，当日查询时，不起作用
     */
    private String EndDate;
    /**
     * 页码
     * 起始值为1，每次最多返回20条记录
     * 第二页返回的记录数为第21至40条记录
     * 第三页为41至60条记录
     * 顺序均按照建立时间的先后
     */
    private String PageNum;
    /**
     * 保留域
     */
    private String ReservedMsg;

    public String getFunctionFlag() {
        return FunctionFlag;
    }

    public void setFunctionFlag(String functionFlag) {
        FunctionFlag = functionFlag;
    }

    public String getFundSummaryAcctNo() {
        return FundSummaryAcctNo;
    }

    public void setFundSummaryAcctNo(String fundSummaryAcctNo) {
        FundSummaryAcctNo = fundSummaryAcctNo;
    }

    public String getSubAcctNo() {
        return SubAcctNo;
    }

    public void setSubAcctNo(String subAcctNo) {
        SubAcctNo = subAcctNo;
    }

    public String getQueryFlag() {
        return QueryFlag;
    }

    public void setQueryFlag(String queryFlag) {
        QueryFlag = queryFlag;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getPageNum() {
        return PageNum;
    }

    public void setPageNum(String pageNum) {
        PageNum = pageNum;
    }

    public String getReservedMsg() {
        return ReservedMsg;
    }

    public void setReservedMsg(String reservedMsg) {
        ReservedMsg = reservedMsg;
    }
}