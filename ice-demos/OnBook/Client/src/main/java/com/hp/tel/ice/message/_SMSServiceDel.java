// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `SMSService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.hp.tel.ice.message;

public interface _SMSServiceDel extends Ice._ObjectDel
{
    void sendSMS(String msg, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}
