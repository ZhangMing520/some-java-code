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
// Generated from file `service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.hp.tel.ice.book;

public abstract class Callback_OnlineBook_bookTick extends Ice.TwowayCallback
{
    public abstract void response(Message __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        OnlineBookPrx __proxy = (OnlineBookPrx)__result.getProxy();
        Message __ret = null;
        try
        {
            __ret = __proxy.end_bookTick(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
