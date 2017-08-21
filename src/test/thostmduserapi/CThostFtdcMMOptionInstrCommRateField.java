/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcMMOptionInstrCommRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMMOptionInstrCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMMOptionInstrCommRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcMMOptionInstrCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setStrikeRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByMoney_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByMoney_get(swigCPtr, this);
  }

  public void setStrikeRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByVolume_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcMMOptionInstrCommRateField() {
    this(thostmdapiJNI.new_CThostFtdcMMOptionInstrCommRateField(), true);
  }

}