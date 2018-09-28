package com.classmanagement.utils.corba.holder;

import com.classmanagement.exceptions.RecordBeingTransferred;
import com.classmanagement.utils.corba.helper.RecordBeingTransferredHelper;

/**
* CenterServerIdl/CenterServerPackage/RecordBeingTransferredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CenterServerIdl.idl
* Tuesday, July 11, 2017 1:08:26 PM EDT
*/

public final class RecordBeingTransferredHolder implements org.omg.CORBA.portable.Streamable
{
  public RecordBeingTransferred value = null;

  public RecordBeingTransferredHolder ()
  {
  }

  public RecordBeingTransferredHolder (RecordBeingTransferred initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RecordBeingTransferredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RecordBeingTransferredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RecordBeingTransferredHelper.type ();
  }

}