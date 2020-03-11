package com.wms.po;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Classname UnionpayTransInfoPO
 * @Description TODO
 * @Date 2020/3/6 11:02
 * @Created by ZF-JS
 */
@Entity
@Table(name = "unionpay_trans_info", schema = "test", catalog = "")
public class UnionpayTransInfoPO implements Serializable {

    private int id;
    private String acceptanceInstitutionCode;
    private String sendInstitutionCode;
    private String systemTrackNumber;
    private Timestamp transDatetime;
    private String transCard;
    private BigDecimal transAmt;
    private String messgeType;
    private String transMoldCode;
    private String merType;
    private String terminalCode;
    private String merCode;
    private String merShortName;
    private String serviceConditionCode;
    private String authorizedAnswerCode;
    private String acceptInstitutionCode;
    private String orgSystemTrackNumber;
    private String respCode;
    private String transCurr;
    private String transMode;
    private String settleCurr;
    private BigDecimal settleAmt;
    private String settleExchangeRate;
    private Date settleDate;
    private Date exchangeDate;
    private BigDecimal processingFeesReceivable;
    private BigDecimal handlingChargesPayable;
    private String transferServiceFee;
    private String currencyServiceFee;
    private String serviceFeeRate;
    private String transactionFee;
    private String transactionFeeCurr;
    private String transactionFeeRate;
    private String retainedUse;
    private String cardType;
    private Timestamp createTime;
    private String refRefrenceNumber;
    private String transCode;
    private String upopOrderNum;
    private BigDecimal conversionTransAmt;
    private BigDecimal unionCost;
    private String transSource;
    private String orgTransHandleCode;
    private Timestamp orgTransDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "acceptance_institution_code")
    public String getAcceptanceInstitutionCode() {
        return acceptanceInstitutionCode;
    }

    public void setAcceptanceInstitutionCode(String acceptanceInstitutionCode) {
        this.acceptanceInstitutionCode = acceptanceInstitutionCode;
    }

    @Basic
    @Column(name = "send_institution_code")
    public String getSendInstitutionCode() {
        return sendInstitutionCode;
    }

    public void setSendInstitutionCode(String sendInstitutionCode) {
        this.sendInstitutionCode = sendInstitutionCode;
    }

    @Basic
    @Column(name = "system_track_number")
    public String getSystemTrackNumber() {
        return systemTrackNumber;
    }

    public void setSystemTrackNumber(String systemTrackNumber) {
        this.systemTrackNumber = systemTrackNumber;
    }

    @Basic
    @Column(name = "trans_datetime")
    public Timestamp getTransDatetime() {
        return transDatetime;
    }

    public void setTransDatetime(Timestamp transDatetime) {
        this.transDatetime = transDatetime;
    }

    @Basic
    @Column(name = "trans_card")
    public String getTransCard() {
        return transCard;
    }

    public void setTransCard(String transCard) {
        this.transCard = transCard;
    }

    @Basic
    @Column(name = "trans_amt")
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    @Basic
    @Column(name = "messge_type")
    public String getMessgeType() {
        return messgeType;
    }

    public void setMessgeType(String messgeType) {
        this.messgeType = messgeType;
    }

    @Basic
    @Column(name = "trans_mold_code")
    public String getTransMoldCode() {
        return transMoldCode;
    }

    public void setTransMoldCode(String transMoldCode) {
        this.transMoldCode = transMoldCode;
    }

    @Basic
    @Column(name = "mer_type")
    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }

    @Basic
    @Column(name = "terminal_code")
    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    @Basic
    @Column(name = "mer_code")
    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode;
    }

    @Basic
    @Column(name = "mer_short_name")
    public String getMerShortName() {
        return merShortName;
    }

    public void setMerShortName(String merShortName) {
        this.merShortName = merShortName;
    }

    @Basic
    @Column(name = "service_condition_code")
    public String getServiceConditionCode() {
        return serviceConditionCode;
    }

    public void setServiceConditionCode(String serviceConditionCode) {
        this.serviceConditionCode = serviceConditionCode;
    }

    @Basic
    @Column(name = "authorized_answer_code")
    public String getAuthorizedAnswerCode() {
        return authorizedAnswerCode;
    }

    public void setAuthorizedAnswerCode(String authorizedAnswerCode) {
        this.authorizedAnswerCode = authorizedAnswerCode;
    }

    @Basic
    @Column(name = "accept_institution_code")
    public String getAcceptInstitutionCode() {
        return acceptInstitutionCode;
    }

    public void setAcceptInstitutionCode(String acceptInstitutionCode) {
        this.acceptInstitutionCode = acceptInstitutionCode;
    }

    @Basic
    @Column(name = "org_system_track_number")
    public String getOrgSystemTrackNumber() {
        return orgSystemTrackNumber;
    }

    public void setOrgSystemTrackNumber(String orgSystemTrackNumber) {
        this.orgSystemTrackNumber = orgSystemTrackNumber;
    }

    @Basic
    @Column(name = "resp_code")
    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    @Basic
    @Column(name = "trans_curr")
    public String getTransCurr() {
        return transCurr;
    }

    public void setTransCurr(String transCurr) {
        this.transCurr = transCurr;
    }

    @Basic
    @Column(name = "trans_mode")
    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    @Basic
    @Column(name = "settle_curr")
    public String getSettleCurr() {
        return settleCurr;
    }

    public void setSettleCurr(String settleCurr) {
        this.settleCurr = settleCurr;
    }

    @Basic
    @Column(name = "settle_amt")
    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    @Basic
    @Column(name = "settle_exchange_rate")
    public String getSettleExchangeRate() {
        return settleExchangeRate;
    }

    public void setSettleExchangeRate(String settleExchangeRate) {
        this.settleExchangeRate = settleExchangeRate;
    }

    @Basic
    @Column(name = "settle_date")
    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    @Basic
    @Column(name = "exchange_date")
    public Date getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(Date exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    @Basic
    @Column(name = "processing_fees_receivable")
    public BigDecimal getProcessingFeesReceivable() {
        return processingFeesReceivable;
    }

    public void setProcessingFeesReceivable(BigDecimal processingFeesReceivable) {
        this.processingFeesReceivable = processingFeesReceivable;
    }

    @Basic
    @Column(name = "handling_charges_payable")
    public BigDecimal getHandlingChargesPayable() {
        return handlingChargesPayable;
    }

    public void setHandlingChargesPayable(BigDecimal handlingChargesPayable) {
        this.handlingChargesPayable = handlingChargesPayable;
    }

    @Basic
    @Column(name = "transfer_service_fee")
    public String getTransferServiceFee() {
        return transferServiceFee;
    }

    public void setTransferServiceFee(String transferServiceFee) {
        this.transferServiceFee = transferServiceFee;
    }

    @Basic
    @Column(name = "currency_service_fee")
    public String getCurrencyServiceFee() {
        return currencyServiceFee;
    }

    public void setCurrencyServiceFee(String currencyServiceFee) {
        this.currencyServiceFee = currencyServiceFee;
    }

    @Basic
    @Column(name = "service_fee_rate")
    public String getServiceFeeRate() {
        return serviceFeeRate;
    }

    public void setServiceFeeRate(String serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    @Basic
    @Column(name = "transaction_fee")
    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Basic
    @Column(name = "transaction_fee_curr")
    public String getTransactionFeeCurr() {
        return transactionFeeCurr;
    }

    public void setTransactionFeeCurr(String transactionFeeCurr) {
        this.transactionFeeCurr = transactionFeeCurr;
    }

    @Basic
    @Column(name = "transaction_fee_rate")
    public String getTransactionFeeRate() {
        return transactionFeeRate;
    }

    public void setTransactionFeeRate(String transactionFeeRate) {
        this.transactionFeeRate = transactionFeeRate;
    }

    @Basic
    @Column(name = "retained_use")
    public String getRetainedUse() {
        return retainedUse;
    }

    public void setRetainedUse(String retainedUse) {
        this.retainedUse = retainedUse;
    }

    @Basic
    @Column(name = "card_type")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "ref_refrence_number")
    public String getRefRefrenceNumber() {
        return refRefrenceNumber;
    }

    public void setRefRefrenceNumber(String refRefrenceNumber) {
        this.refRefrenceNumber = refRefrenceNumber;
    }

    @Basic
    @Column(name = "trans_code")
    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    @Basic
    @Column(name = "upop_order_num")
    public String getUpopOrderNum() {
        return upopOrderNum;
    }

    public void setUpopOrderNum(String upopOrderNum) {
        this.upopOrderNum = upopOrderNum;
    }

    @Basic
    @Column(name = "conversion_trans_amt")
    public BigDecimal getConversionTransAmt() {
        return conversionTransAmt;
    }

    public void setConversionTransAmt(BigDecimal conversionTransAmt) {
        this.conversionTransAmt = conversionTransAmt;
    }

    @Basic
    @Column(name = "union_cost")
    public BigDecimal getUnionCost() {
        return unionCost;
    }

    public void setUnionCost(BigDecimal unionCost) {
        this.unionCost = unionCost;
    }

    @Basic
    @Column(name = "trans_source")
    public String getTransSource() {
        return transSource;
    }

    public void setTransSource(String transSource) {
        this.transSource = transSource;
    }

    @Basic
    @Column(name = "org_trans_handle_code")
    public String getOrgTransHandleCode() {
        return orgTransHandleCode;
    }

    public void setOrgTransHandleCode(String orgTransHandleCode) {
        this.orgTransHandleCode = orgTransHandleCode;
    }

    @Basic
    @Column(name = "org_trans_date")
    public Timestamp getOrgTransDate() {
        return orgTransDate;
    }

    public void setOrgTransDate(Timestamp orgTransDate) {
        this.orgTransDate = orgTransDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnionpayTransInfoPO that = (UnionpayTransInfoPO) o;

        if (id != that.id) return false;
        if (acceptanceInstitutionCode != null ? !acceptanceInstitutionCode.equals(that.acceptanceInstitutionCode) : that.acceptanceInstitutionCode != null)
            return false;
        if (sendInstitutionCode != null ? !sendInstitutionCode.equals(that.sendInstitutionCode) : that.sendInstitutionCode != null)
            return false;
        if (systemTrackNumber != null ? !systemTrackNumber.equals(that.systemTrackNumber) : that.systemTrackNumber != null)
            return false;
        if (transDatetime != null ? !transDatetime.equals(that.transDatetime) : that.transDatetime != null)
            return false;
        if (transCard != null ? !transCard.equals(that.transCard) : that.transCard != null) return false;
        if (transAmt != null ? !transAmt.equals(that.transAmt) : that.transAmt != null) return false;
        if (messgeType != null ? !messgeType.equals(that.messgeType) : that.messgeType != null) return false;
        if (transMoldCode != null ? !transMoldCode.equals(that.transMoldCode) : that.transMoldCode != null)
            return false;
        if (merType != null ? !merType.equals(that.merType) : that.merType != null) return false;
        if (terminalCode != null ? !terminalCode.equals(that.terminalCode) : that.terminalCode != null) return false;
        if (merCode != null ? !merCode.equals(that.merCode) : that.merCode != null) return false;
        if (merShortName != null ? !merShortName.equals(that.merShortName) : that.merShortName != null) return false;
        if (serviceConditionCode != null ? !serviceConditionCode.equals(that.serviceConditionCode) : that.serviceConditionCode != null)
            return false;
        if (authorizedAnswerCode != null ? !authorizedAnswerCode.equals(that.authorizedAnswerCode) : that.authorizedAnswerCode != null)
            return false;
        if (acceptInstitutionCode != null ? !acceptInstitutionCode.equals(that.acceptInstitutionCode) : that.acceptInstitutionCode != null)
            return false;
        if (orgSystemTrackNumber != null ? !orgSystemTrackNumber.equals(that.orgSystemTrackNumber) : that.orgSystemTrackNumber != null)
            return false;
        if (respCode != null ? !respCode.equals(that.respCode) : that.respCode != null) return false;
        if (transCurr != null ? !transCurr.equals(that.transCurr) : that.transCurr != null) return false;
        if (transMode != null ? !transMode.equals(that.transMode) : that.transMode != null) return false;
        if (settleCurr != null ? !settleCurr.equals(that.settleCurr) : that.settleCurr != null) return false;
        if (settleAmt != null ? !settleAmt.equals(that.settleAmt) : that.settleAmt != null) return false;
        if (settleExchangeRate != null ? !settleExchangeRate.equals(that.settleExchangeRate) : that.settleExchangeRate != null)
            return false;
        if (settleDate != null ? !settleDate.equals(that.settleDate) : that.settleDate != null) return false;
        if (exchangeDate != null ? !exchangeDate.equals(that.exchangeDate) : that.exchangeDate != null) return false;
        if (processingFeesReceivable != null ? !processingFeesReceivable.equals(that.processingFeesReceivable) : that.processingFeesReceivable != null)
            return false;
        if (handlingChargesPayable != null ? !handlingChargesPayable.equals(that.handlingChargesPayable) : that.handlingChargesPayable != null)
            return false;
        if (transferServiceFee != null ? !transferServiceFee.equals(that.transferServiceFee) : that.transferServiceFee != null)
            return false;
        if (currencyServiceFee != null ? !currencyServiceFee.equals(that.currencyServiceFee) : that.currencyServiceFee != null)
            return false;
        if (serviceFeeRate != null ? !serviceFeeRate.equals(that.serviceFeeRate) : that.serviceFeeRate != null)
            return false;
        if (transactionFee != null ? !transactionFee.equals(that.transactionFee) : that.transactionFee != null)
            return false;
        if (transactionFeeCurr != null ? !transactionFeeCurr.equals(that.transactionFeeCurr) : that.transactionFeeCurr != null)
            return false;
        if (transactionFeeRate != null ? !transactionFeeRate.equals(that.transactionFeeRate) : that.transactionFeeRate != null)
            return false;
        if (retainedUse != null ? !retainedUse.equals(that.retainedUse) : that.retainedUse != null) return false;
        if (cardType != null ? !cardType.equals(that.cardType) : that.cardType != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (refRefrenceNumber != null ? !refRefrenceNumber.equals(that.refRefrenceNumber) : that.refRefrenceNumber != null)
            return false;
        if (transCode != null ? !transCode.equals(that.transCode) : that.transCode != null) return false;
        if (upopOrderNum != null ? !upopOrderNum.equals(that.upopOrderNum) : that.upopOrderNum != null) return false;
        if (conversionTransAmt != null ? !conversionTransAmt.equals(that.conversionTransAmt) : that.conversionTransAmt != null)
            return false;
        if (unionCost != null ? !unionCost.equals(that.unionCost) : that.unionCost != null) return false;
        if (transSource != null ? !transSource.equals(that.transSource) : that.transSource != null) return false;
        if (orgTransHandleCode != null ? !orgTransHandleCode.equals(that.orgTransHandleCode) : that.orgTransHandleCode != null)
            return false;
        if (orgTransDate != null ? !orgTransDate.equals(that.orgTransDate) : that.orgTransDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (acceptanceInstitutionCode != null ? acceptanceInstitutionCode.hashCode() : 0);
        result = 31 * result + (sendInstitutionCode != null ? sendInstitutionCode.hashCode() : 0);
        result = 31 * result + (systemTrackNumber != null ? systemTrackNumber.hashCode() : 0);
        result = 31 * result + (transDatetime != null ? transDatetime.hashCode() : 0);
        result = 31 * result + (transCard != null ? transCard.hashCode() : 0);
        result = 31 * result + (transAmt != null ? transAmt.hashCode() : 0);
        result = 31 * result + (messgeType != null ? messgeType.hashCode() : 0);
        result = 31 * result + (transMoldCode != null ? transMoldCode.hashCode() : 0);
        result = 31 * result + (merType != null ? merType.hashCode() : 0);
        result = 31 * result + (terminalCode != null ? terminalCode.hashCode() : 0);
        result = 31 * result + (merCode != null ? merCode.hashCode() : 0);
        result = 31 * result + (merShortName != null ? merShortName.hashCode() : 0);
        result = 31 * result + (serviceConditionCode != null ? serviceConditionCode.hashCode() : 0);
        result = 31 * result + (authorizedAnswerCode != null ? authorizedAnswerCode.hashCode() : 0);
        result = 31 * result + (acceptInstitutionCode != null ? acceptInstitutionCode.hashCode() : 0);
        result = 31 * result + (orgSystemTrackNumber != null ? orgSystemTrackNumber.hashCode() : 0);
        result = 31 * result + (respCode != null ? respCode.hashCode() : 0);
        result = 31 * result + (transCurr != null ? transCurr.hashCode() : 0);
        result = 31 * result + (transMode != null ? transMode.hashCode() : 0);
        result = 31 * result + (settleCurr != null ? settleCurr.hashCode() : 0);
        result = 31 * result + (settleAmt != null ? settleAmt.hashCode() : 0);
        result = 31 * result + (settleExchangeRate != null ? settleExchangeRate.hashCode() : 0);
        result = 31 * result + (settleDate != null ? settleDate.hashCode() : 0);
        result = 31 * result + (exchangeDate != null ? exchangeDate.hashCode() : 0);
        result = 31 * result + (processingFeesReceivable != null ? processingFeesReceivable.hashCode() : 0);
        result = 31 * result + (handlingChargesPayable != null ? handlingChargesPayable.hashCode() : 0);
        result = 31 * result + (transferServiceFee != null ? transferServiceFee.hashCode() : 0);
        result = 31 * result + (currencyServiceFee != null ? currencyServiceFee.hashCode() : 0);
        result = 31 * result + (serviceFeeRate != null ? serviceFeeRate.hashCode() : 0);
        result = 31 * result + (transactionFee != null ? transactionFee.hashCode() : 0);
        result = 31 * result + (transactionFeeCurr != null ? transactionFeeCurr.hashCode() : 0);
        result = 31 * result + (transactionFeeRate != null ? transactionFeeRate.hashCode() : 0);
        result = 31 * result + (retainedUse != null ? retainedUse.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (refRefrenceNumber != null ? refRefrenceNumber.hashCode() : 0);
        result = 31 * result + (transCode != null ? transCode.hashCode() : 0);
        result = 31 * result + (upopOrderNum != null ? upopOrderNum.hashCode() : 0);
        result = 31 * result + (conversionTransAmt != null ? conversionTransAmt.hashCode() : 0);
        result = 31 * result + (unionCost != null ? unionCost.hashCode() : 0);
        result = 31 * result + (transSource != null ? transSource.hashCode() : 0);
        result = 31 * result + (orgTransHandleCode != null ? orgTransHandleCode.hashCode() : 0);
        result = 31 * result + (orgTransDate != null ? orgTransDate.hashCode() : 0);
        return result;
    }
}
