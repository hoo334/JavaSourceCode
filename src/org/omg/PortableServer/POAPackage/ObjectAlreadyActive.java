package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ObjectAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 11, 2019 10:23:07 AM UTC
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
