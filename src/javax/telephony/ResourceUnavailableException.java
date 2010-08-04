/*     */ package javax.telephony;
/*     */ 
/*     */ public class ResourceUnavailableException extends Exception
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private int _type;
/*     */   public static final int UNKNOWN = 0;
/*     */   public static final int ORIGINATOR_UNAVAILABLE = 1;
/*     */   public static final int OBSERVER_LIMIT_EXCEEDED = 2;
/*     */   public static final int TRUNK_LIMIT_EXCEEDED = 3;
/*     */   public static final int OUTSTANDING_METHOD_EXCEEDED = 4;
/*     */   public static final int UNSPECIFIED_LIMIT_EXCEEDED = 5;
/*     */   public static final int NO_DIALTONE = 6;
/*     */   public static final int USER_RESPONSE = 7;
/*     */ 
/*     */   public ResourceUnavailableException(int type)
/*     */   {
/*  92 */     this._type = type;
/*     */   }
/*     */ 
/*     */   public ResourceUnavailableException(int type, String s)
/*     */   {
/* 100 */     super(s);
/* 101 */     this._type = type;
/*     */   }
/*     */ 
/*     */   public int getType()
/*     */   {
/* 111 */     return this._type;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     javax.telephony.ResourceUnavailableException
 * JD-Core Version:    0.5.4
 */