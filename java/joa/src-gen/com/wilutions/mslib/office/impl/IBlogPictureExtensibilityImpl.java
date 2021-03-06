/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AAE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IBlogPictureExtensibilityImpl extends Dispatch implements com.wilutions.mslib.office.IBlogPictureExtensibility {
  @DeclDISPID(1)  public void BlogPictureProviderProperties(final ByRef<String> BlogPictureProvider, final ByRef<String> FriendlyName) throws ComException {
    assert(BlogPictureProvider != null);
    assert(FriendlyName != null);
    this._dispatchCall(1,"BlogPictureProviderProperties", DISPATCH_METHOD,null,BlogPictureProvider,FriendlyName);
  }
  @DeclDISPID(2)  public void CreatePictureAccount(final String Account, final String BlogProvider, final Integer ParentWindow, final IDispatch Document) throws ComException {
    assert(Account != null);
    assert(BlogProvider != null);
    assert(ParentWindow != null);
    this._dispatchCall(2,"CreatePictureAccount", DISPATCH_METHOD,null,Account,BlogProvider,ParentWindow,Dispatch.param(Document));
  }
  @DeclDISPID(3)  public void PublishPicture(final String Account, final Integer ParentWindow, final IDispatch Document, final Object Image, final ByRef<String> PictureURI, final Integer ImageType) throws ComException {
    assert(Account != null);
    assert(ParentWindow != null);
    assert(Image != null);
    assert(PictureURI != null);
    assert(ImageType != null);
    this._dispatchCall(3,"PublishPicture", DISPATCH_METHOD,null,Account,ParentWindow,Dispatch.param(Document),Image,PictureURI,ImageType);
  }
  public IBlogPictureExtensibilityImpl(String progId) throws ComException {
    super(progId, "{000C03C5-0000-0000-C000-000000000046}");
  }
  protected IBlogPictureExtensibilityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IBlogPictureExtensibilityImpl" + super.toString() + "]";
  }
}
