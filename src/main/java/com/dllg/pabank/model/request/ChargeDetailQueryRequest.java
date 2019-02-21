package com.dllg.pabank.model.request;

/**
 * 查询充值明细-见证收单
 */
public class ChargeDetailQueryRequest extends PABankRequest {
    /**
     * 资金汇总账号
     */
    private String FundSummaryAcctNo;
    /**
     * 收单渠道类型
     * 例如：01-橙E收款
     * 02-跨行快收（非T0）
     * 03-跨行快收（T0）
     * 04-聚合支付
     */
    private String AcquiringChannelType;
    /**
     * 订单号
     */
    private String OrderNo;
    /**
     * 保留域
     */
    private String ReservedMsg;

    public String getFundSummaryAcctNo() {
        return FundSummaryAcctNo;
    }

    public void setFundSummaryAcctNo(String fundSummaryAcctNo) {
        FundSummaryAcctNo = fundSummaryAcctNo;
    }

    public String getAcquiringChannelType() {
        return AcquiringChannelType;
    }

    public void setAcquiringChannelType(String acquiringChannelType) {
        AcquiringChannelType = acquiringChannelType;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getReservedMsg() {
        return ReservedMsg;
    }

    public void setReservedMsg(String reservedMsg) {
        ReservedMsg = reservedMsg;
    }
}