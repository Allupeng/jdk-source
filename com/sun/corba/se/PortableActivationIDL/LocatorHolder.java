package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/LocatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu-platform-build@2/zulu-src.git/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, January 19, 2023 8:45:17 AM PST
*/

public final class LocatorHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.Locator value = null;

  public LocatorHolder ()
  {
  }

  public LocatorHolder (com.sun.corba.se.PortableActivationIDL.Locator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.LocatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.LocatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.LocatorHelper.type ();
  }

}
