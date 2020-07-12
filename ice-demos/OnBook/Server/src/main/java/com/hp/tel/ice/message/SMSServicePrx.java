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

public interface SMSServicePrx extends Ice.ObjectPrx
{
    public void sendSMS(String msg);

    public void sendSMS(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sendSMS(String msg);

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sendSMS(String msg, Ice.Callback __cb);

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_sendSMS(String msg, Callback_SMSService_sendSMS __cb);

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx, Callback_SMSService_sendSMS __cb);

    public void end_sendSMS(Ice.AsyncResult __result);
}