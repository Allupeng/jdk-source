package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerHeldDown.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu-platform-build@2/zulu-src.git/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, January 19, 2023 8:45:17 AM PST
*/

public final class ServerHeldDown extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerHeldDown ()
  {
    super(ServerHeldDownHelper.id());
  } // ctor

  public ServerHeldDown (String _serverId)
  {
    super(ServerHeldDownHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerHeldDown (String $reason, String _serverId)
  {
    super(ServerHeldDownHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerHeldDown