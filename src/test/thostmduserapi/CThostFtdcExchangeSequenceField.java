/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcExchangeSequenceField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeSequenceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeSequenceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcExchangeSequenceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcExchangeSequenceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcExchangeSequenceField_ExchangeID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmdapiJNI.CThostFtdcExchangeSequenceField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmdapiJNI.CThostFtdcExchangeSequenceField_SequenceNo_get(swigCPtr, this);
  }

  public void setMarketStatus(char value) {
    thostmdapiJNI.CThostFtdcExchangeSequenceField_MarketStatus_set(swigCPtr, this, value);
  }

  public char getMarketStatus() {
    return thostmdapiJNI.CThostFtdcExchangeSequenceField_MarketStatus_get(swigCPtr, this);
  }

  public CThostFtdcExchangeSequenceField() {
    this(thostmdapiJNI.new_CThostFtdcExchangeSequenceField(), true);
  }

}
