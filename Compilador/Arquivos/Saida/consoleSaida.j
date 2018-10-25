.source prog_destino.java
.class public prog_destino
.super java/lang/Object
.method public <init>()V
.limit stack 1
.limit locals 1
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 400 
.limit locals 15
ldc2_w 2.0
ldc2_w 3.0
ldc2_w 5.0
dadd
ior
dstore_1

getstatic java/lang/System/out Ljava/io/PrintStream;
aload_1
invokevirtual java/io/PrintStream/println(D)V

return
.end method
