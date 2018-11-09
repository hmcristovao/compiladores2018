.source prog_destino.java 
.class public teste06
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 11
ldc2_w 0.0
dstore 5
ldc2_w 2.0
dstore_1
ldc2_w 3.0
ldc2_w 1.0
ldc2_w 2.0
dadd 
dmul 
dstore_3
dload_1
ldc2_w 1.0
dsub 
dload_3
ldc2_w 2.0
dsub 
dmul 
dload 5
ldc2_w 3.0
dsub 
dmul 
ldc2_w 1.0
dadd 
dstore 7
return 
.end method 
