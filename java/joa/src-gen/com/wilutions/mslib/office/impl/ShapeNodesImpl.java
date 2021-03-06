/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A72-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShapeNodesImpl extends Dispatch implements com.wilutions.mslib.office.ShapeNodes {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.ShapeNode Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeNodeImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(11)  public void Delete(final Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(11,"Delete", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(12)  public void Insert(final Integer Index, final com.wilutions.mslib.office.MsoSegmentType SegmentType, final com.wilutions.mslib.office.MsoEditingType EditingType, final Float X1, final Float Y1, final Float X2, final Float Y2, final Float X3, final Float Y3) throws ComException {
    assert(Index != null);
    assert(SegmentType != null);
    assert(EditingType != null);
    assert(X1 != null);
    assert(Y1 != null);
    assert(X2 != null);
    assert(Y2 != null);
    assert(X3 != null);
    assert(Y3 != null);
    this._dispatchCall(12,"Insert", DISPATCH_METHOD,null,Index,SegmentType.value,EditingType.value,X1,Y1,X2,Y2,X3,Y3);
  }
  @DeclDISPID(13)  public void SetEditingType(final Integer Index, final com.wilutions.mslib.office.MsoEditingType EditingType) throws ComException {
    assert(Index != null);
    assert(EditingType != null);
    this._dispatchCall(13,"SetEditingType", DISPATCH_METHOD,null,Index,EditingType.value);
  }
  @DeclDISPID(14)  public void SetPosition(final Integer Index, final Float X1, final Float Y1) throws ComException {
    assert(Index != null);
    assert(X1 != null);
    assert(Y1 != null);
    this._dispatchCall(14,"SetPosition", DISPATCH_METHOD,null,Index,X1,Y1);
  }
  @DeclDISPID(15)  public void SetSegmentType(final Integer Index, final com.wilutions.mslib.office.MsoSegmentType SegmentType) throws ComException {
    assert(Index != null);
    assert(SegmentType != null);
    this._dispatchCall(15,"SetSegmentType", DISPATCH_METHOD,null,Index,SegmentType.value);
  }
  public ShapeNodesImpl(String progId) throws ComException {
    super(progId, "{000C0319-0000-0000-C000-000000000046}");
  }
  protected ShapeNodesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShapeNodesImpl" + super.toString() + "]";
  }
}
