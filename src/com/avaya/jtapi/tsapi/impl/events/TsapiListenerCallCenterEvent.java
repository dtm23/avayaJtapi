/*    */ package com.avaya.jtapi.tsapi.impl.events;
/*    */ 
/*    */ import javax.telephony.MetaEvent;
/*    */ import javax.telephony.callcenter.CallCenterEvent;
/*    */ 
/*    */ public abstract class TsapiListenerCallCenterEvent extends TsapiListenerEvent
/*    */   implements CallCenterEvent
/*    */ {
/*    */   public TsapiListenerCallCenterEvent(int eventId, int _cause, MetaEvent metaEvent, Object source, Object privateData)
/*    */   {
/* 17 */     super(eventId, _cause, metaEvent, source, privateData);
/*    */   }
/*    */ 
/*    */   public int getCallCenterCause()
/*    */   {
/* 22 */     if ((this.cause == 101) || (this.cause == 302))
/*    */     {
/* 24 */       return this.cause;
/*    */     }
/* 26 */     return 100;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.TsapiListenerCallCenterEvent
 * JD-Core Version:    0.5.4
 */