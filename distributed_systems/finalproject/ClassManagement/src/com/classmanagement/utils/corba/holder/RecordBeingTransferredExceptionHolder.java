package com.classmanagement.utils.corba.holder;

import com.classmanagement.exceptions.RecordBeingTransferredException;
import com.classmanagement.utils.corba.helper.RecordBeingTransferredExceptionHelper;

/**
* CenterServerIdl/CenterServerPackage/RecordBeingTransferredExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CenterServerIdl.idl
* Tuesday, July 11, 2017 1:08:26 PM EDT
*/

public final class RecordBeingTransferredExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public RecordBeingTransferredException value = null;

  public RecordBeingTransferredExceptionHolder ()
  {
  }

  public RecordBeingTransferredExceptionHolder (RecordBeingTransferredException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RecordBeingTransferredExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RecordBeingTransferredExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RecordBeingTransferredExceptionHelper.type ();
  }

}
