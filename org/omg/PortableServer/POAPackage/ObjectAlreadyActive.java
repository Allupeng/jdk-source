package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ObjectAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu-platform-build@2/zulu-src.git/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, January 19, 2023 8:45:17 AM PST
*/

public final class ObjectAlreadyActive extends org.omg.CORBA.UserException
{

  public ObjectAlreadyActive ()
  {
    super(ObjectAlreadyActiveHelper.id());
  } // ctor


  public ObjectAlreadyActive (String $reason)
  {
    super(ObjectAlreadyActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ObjectAlreadyActive
