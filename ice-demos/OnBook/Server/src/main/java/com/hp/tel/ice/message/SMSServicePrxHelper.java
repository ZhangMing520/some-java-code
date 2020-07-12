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

public final class SMSServicePrxHelper extends Ice.ObjectPrxHelperBase implements SMSServicePrx
{
    private static final String __sendSMS_name = "sendSMS";

    public void sendSMS(String msg)
    {
        sendSMS(msg, null, false);
    }

    public void sendSMS(String msg, java.util.Map<String, String> __ctx)
    {
        sendSMS(msg, __ctx, true);
    }

    private void sendSMS(String msg, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "sendSMS", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SMSServiceDel __del = (_SMSServiceDel)__delBase;
                    __del.sendSMS(msg, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_sendSMS(String msg)
    {
        return begin_sendSMS(msg, null, false, null);
    }

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx)
    {
        return begin_sendSMS(msg, __ctx, true, null);
    }

    public Ice.AsyncResult begin_sendSMS(String msg, Ice.Callback __cb)
    {
        return begin_sendSMS(msg, null, false, __cb);
    }

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_sendSMS(msg, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_sendSMS(String msg, Callback_SMSService_sendSMS __cb)
    {
        return begin_sendSMS(msg, null, false, __cb);
    }

    public Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx, Callback_SMSService_sendSMS __cb)
    {
        return begin_sendSMS(msg, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_sendSMS(String msg, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __sendSMS_name, __cb);
        try
        {
            __result.__prepare(__sendSMS_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(msg);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_sendSMS(Ice.AsyncResult __result)
    {
        __end(__result, __sendSMS_name);
    }

    public static SMSServicePrx checkedCast(Ice.ObjectPrx __obj)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SMSServicePrx)
            {
                __d = (SMSServicePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    SMSServicePrxHelper __h = new SMSServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SMSServicePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SMSServicePrx)
            {
                __d = (SMSServicePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    SMSServicePrxHelper __h = new SMSServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SMSServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    SMSServicePrxHelper __h = new SMSServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static SMSServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    SMSServicePrxHelper __h = new SMSServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static SMSServicePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SMSServicePrx)
            {
                __d = (SMSServicePrx)__obj;
            }
            else
            {
                SMSServicePrxHelper __h = new SMSServicePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static SMSServicePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SMSServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            SMSServicePrxHelper __h = new SMSServicePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::message::SMSService"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _SMSServiceDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _SMSServiceDelD();
    }

    public static void __write(IceInternal.BasicStream __os, SMSServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static SMSServicePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            SMSServicePrxHelper result = new SMSServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}