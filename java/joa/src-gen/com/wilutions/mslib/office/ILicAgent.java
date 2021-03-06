/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ILicAgent.
 * ILicAgent Interface 
 */
@CoInterface(guid="{00194002-D9C3-11D3-8D59-0050048384E3}")
public interface ILicAgent extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public Integer Initialize(final Integer dwBPC, final Integer dwMode, final String bstrLicSource) throws ComException;
  @DeclDISPID(3)  public String GetFirstName() throws ComException;
  @DeclDISPID(4)  public void SetFirstName(final String bstrNewVal) throws ComException;
  @DeclDISPID(5)  public String GetLastName() throws ComException;
  @DeclDISPID(6)  public void SetLastName(final String bstrNewVal) throws ComException;
  @DeclDISPID(7)  public String GetOrgName() throws ComException;
  @DeclDISPID(8)  public void SetOrgName(final String bstrNewVal) throws ComException;
  @DeclDISPID(9)  public String GetEmail() throws ComException;
  @DeclDISPID(10)  public void SetEmail(final String bstrNewVal) throws ComException;
  @DeclDISPID(11)  public String GetPhone() throws ComException;
  @DeclDISPID(12)  public void SetPhone(final String bstrNewVal) throws ComException;
  @DeclDISPID(13)  public String GetAddress1() throws ComException;
  @DeclDISPID(14)  public void SetAddress1(final String bstrNewVal) throws ComException;
  @DeclDISPID(15)  public String GetCity() throws ComException;
  @DeclDISPID(16)  public void SetCity(final String bstrNewVal) throws ComException;
  @DeclDISPID(17)  public String GetState() throws ComException;
  @DeclDISPID(18)  public void SetState(final String bstrNewVal) throws ComException;
  @DeclDISPID(19)  public String GetCountryCode() throws ComException;
  @DeclDISPID(20)  public void SetCountryCode(final String bstrNewVal) throws ComException;
  @DeclDISPID(21)  public String GetCountryDesc() throws ComException;
  @DeclDISPID(22)  public void SetCountryDesc(final String bstrNewVal) throws ComException;
  @DeclDISPID(23)  public String GetZip() throws ComException;
  @DeclDISPID(24)  public void SetZip(final String bstrNewVal) throws ComException;
  @DeclDISPID(25)  public Integer GetIsoLanguage() throws ComException;
  @DeclDISPID(26)  public void SetIsoLanguage(final Integer dwNewVal) throws ComException;
  @DeclDISPID(32)  public String GetMSUpdate() throws ComException;
  @DeclDISPID(33)  public void SetMSUpdate(final String bstrNewVal) throws ComException;
  @DeclDISPID(34)  public String GetMSOffer() throws ComException;
  @DeclDISPID(35)  public void SetMSOffer(final String bstrNewVal) throws ComException;
  @DeclDISPID(36)  public String GetOtherOffer() throws ComException;
  @DeclDISPID(37)  public void SetOtherOffer(final String bstrNewVal) throws ComException;
  @DeclDISPID(38)  public String GetAddress2() throws ComException;
  @DeclDISPID(39)  public void SetAddress2(final String bstrNewVal) throws ComException;
  @DeclDISPID(40)  public Integer CheckSystemClock() throws ComException;
  @DeclDISPID(41)  public java.util.Date GetExistingExpiryDate() throws ComException;
  @DeclDISPID(42)  public java.util.Date GetNewExpiryDate() throws ComException;
  @DeclDISPID(43)  public String GetBillingFirstName() throws ComException;
  @DeclDISPID(44)  public void SetBillingFirstName(final String bstrNewVal) throws ComException;
  @DeclDISPID(45)  public String GetBillingLastName() throws ComException;
  @DeclDISPID(46)  public void SetBillingLastName(final String bstrNewVal) throws ComException;
  @DeclDISPID(47)  public String GetBillingPhone() throws ComException;
  @DeclDISPID(48)  public void SetBillingPhone(final String bstrNewVal) throws ComException;
  @DeclDISPID(49)  public String GetBillingAddress1() throws ComException;
  @DeclDISPID(50)  public void SetBillingAddress1(final String bstrNewVal) throws ComException;
  @DeclDISPID(51)  public String GetBillingAddress2() throws ComException;
  @DeclDISPID(52)  public void SetBillingAddress2(final String bstrNewVal) throws ComException;
  @DeclDISPID(53)  public String GetBillingCity() throws ComException;
  @DeclDISPID(54)  public void SetBillingCity(final String bstrNewVal) throws ComException;
  @DeclDISPID(55)  public String GetBillingState() throws ComException;
  @DeclDISPID(56)  public void SetBillingState(final String bstrNewVal) throws ComException;
  @DeclDISPID(57)  public String GetBillingCountryCode() throws ComException;
  @DeclDISPID(58)  public void SetBillingCountryCode(final String bstrNewVal) throws ComException;
  @DeclDISPID(59)  public String GetBillingZip() throws ComException;
  @DeclDISPID(60)  public void SetBillingZip(final String bstrNewVal) throws ComException;
  @DeclDISPID(61)  public Integer SaveBillingInfo(final Integer bSave) throws ComException;
  @DeclDISPID(64)  public Integer IsCCRenewalCountry(final String bstrCountryCode) throws ComException;
  @DeclDISPID(65)  public String GetVATLabel(final String bstrCountryCode) throws ComException;
  @DeclDISPID(66)  public java.util.Date GetCCRenewalExpiryDate() throws ComException;
  @DeclDISPID(67)  public void SetVATNumber(final String bstrVATNumber) throws ComException;
  @DeclDISPID(68)  public void SetCreditCardType(final String bstrCCCode) throws ComException;
  @DeclDISPID(69)  public void SetCreditCardNumber(final String bstrCCNumber) throws ComException;
  @DeclDISPID(70)  public void SetCreditCardExpiryYear(final Integer dwCCYear) throws ComException;
  @DeclDISPID(71)  public void SetCreditCardExpiryMonth(final Integer dwCCMonth) throws ComException;
  @DeclDISPID(72)  public Integer GetCreditCardCount() throws ComException;
  @DeclDISPID(73)  public String GetCreditCardCode(final Integer dwIndex) throws ComException;
  @DeclDISPID(74)  public String GetCreditCardName(final Integer dwIndex) throws ComException;
  @DeclDISPID(75)  public String GetVATNumber() throws ComException;
  @DeclDISPID(76)  public String GetCreditCardType() throws ComException;
  @DeclDISPID(77)  public String GetCreditCardNumber() throws ComException;
  @DeclDISPID(78)  public Integer GetCreditCardExpiryYear() throws ComException;
  @DeclDISPID(79)  public Integer GetCreditCardExpiryMonth() throws ComException;
  @DeclDISPID(80)  public Integer GetDisconnectOption() throws ComException;
  @DeclDISPID(81)  public void SetDisconnectOption(final Integer bNewVal) throws ComException;
  @DeclDISPID(82)  public void AsyncProcessHandshakeRequest(final Integer bReviseCustInfo) throws ComException;
  @DeclDISPID(83)  public void AsyncProcessNewLicenseRequest() throws ComException;
  @DeclDISPID(84)  public void AsyncProcessReissueLicenseRequest() throws ComException;
  @DeclDISPID(85)  public void AsyncProcessRetailRenewalLicenseRequest() throws ComException;
  @DeclDISPID(86)  public void AsyncProcessReviseCustInfoRequest() throws ComException;
  @DeclDISPID(87)  public void AsyncProcessCCRenewalPriceRequest() throws ComException;
  @DeclDISPID(88)  public void AsyncProcessCCRenewalLicenseRequest() throws ComException;
  @DeclDISPID(90)  public Integer GetAsyncProcessReturnCode() throws ComException;
  @DeclDISPID(91)  public Integer IsUpgradeAvailable() throws ComException;
  @DeclDISPID(92)  public void WantUpgrade(final Integer bWantUpgrade) throws ComException;
  @DeclDISPID(93)  public void AsyncProcessDroppedLicenseRequest() throws ComException;
  @DeclDISPID(94)  public String GenerateInstallationId() throws ComException;
  @DeclDISPID(95)  public Integer DepositConfirmationId(final String bstrVal) throws ComException;
  @DeclDISPID(96)  public Integer VerifyCheckDigits(final String bstrCIDIID) throws ComException;
  @DeclDISPID(97)  public java.util.Date GetCurrentExpiryDate() throws ComException;
  @DeclDISPID(98)  public void CancelAsyncProcessRequest(final Integer bIsLicenseRequest) throws ComException;
  @DeclDISPID(100)  public String GetCurrencyDescription(final Integer dwCurrencyIndex) throws ComException;
  @DeclDISPID(101)  public Integer GetPriceItemCount() throws ComException;
  @DeclDISPID(102)  public String GetPriceItemLabel(final Integer dwIndex) throws ComException;
  @DeclDISPID(103)  public String GetPriceItemValue(final Integer dwCurrencyIndex, final Integer dwIndex) throws ComException;
  @DeclDISPID(104)  public String GetInvoiceText() throws ComException;
  @DeclDISPID(105)  public String GetBackendErrorMsg() throws ComException;
  @DeclDISPID(106)  public Integer GetCurrencyOption() throws ComException;
  @DeclDISPID(107)  public void SetCurrencyOption(final Integer dwCurrencyOption) throws ComException;
  @DeclDISPID(108)  public String GetEndOfLifeHtmlText() throws ComException;
  @DeclDISPID(109)  public Integer DisplaySSLCert() throws ComException;
}
