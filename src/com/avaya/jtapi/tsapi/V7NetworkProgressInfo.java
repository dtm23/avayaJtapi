/*    */ package com.avaya.jtapi.tsapi;
/*    */ 
/*    */ public final class V7NetworkProgressInfo extends V5NetworkProgressInfo
/*    */ {
/*    */   V7DeviceHistoryEntry[] deviceHistory;
/*    */ 
/*    */   V7NetworkProgressInfo(V7DeviceHistoryEntry[] _deviceHistory, String _trunkGroup, String _trunkMember, TsapiTrunk _trunk, short progressLocation, short progressDescription)
/*    */   {
/* 13 */     super(_trunkGroup, _trunkMember, _trunk, progressLocation, progressDescription);
/* 14 */     this.deviceHistory = _deviceHistory;
/*    */   }
/*    */ 
/*    */   public V7NetworkProgressInfo()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void setDeviceHistory(V7DeviceHistoryEntry[] deviceHistory)
/*    */   {
/* 27 */     this.deviceHistory = deviceHistory;
/*    */   }
/*    */ 
/*    */   V7DeviceHistoryEntry[] getDeviceHistory()
/*    */   {
/* 35 */     return this.deviceHistory;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.V7NetworkProgressInfo
 * JD-Core Version:    0.5.4
 */