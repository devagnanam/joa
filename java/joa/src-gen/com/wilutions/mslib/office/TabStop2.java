/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TabStop2.
 * 
 */
@CoInterface(guid="{000C03BB-0000-0000-C000-000000000046}")
public interface TabStop2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public void Clear() throws ComException;
  @DeclDISPID(3)  public Float getPosition() throws ComException;
  @DeclDISPID(3)  public void setPosition(final Float value) throws ComException;
  @DeclDISPID(4)  public MsoTabStopType getType() throws ComException;
  @DeclDISPID(4)  public void setType(final MsoTabStopType value) throws ComException;
}
