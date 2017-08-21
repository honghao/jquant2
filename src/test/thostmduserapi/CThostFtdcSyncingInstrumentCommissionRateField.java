/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncingInstrumentCommissionRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentCommissionRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSyncingInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return thostmdapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentCommissionRateField() {
    this(thostmdapiJNI.new_CThostFtdcSyncingInstrumentCommissionRateField(), true);
  }

}