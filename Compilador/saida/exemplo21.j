.source prog_destino.java
.class public exemplo21
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
.limit locals 14
ldc2_w 5.0
dstore 5

ldc2_w 2.0
ldc2_w 3.0
ldc2_w 5.0
dadd
dmul
dstore_1

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/println(D)V

dload_1
ldc2_w 2.0
ddiv
dstore_3

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/println(D)V

return
.end method
