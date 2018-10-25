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
.limit stack 4
.limit locals9
ldc2_w 2.0
dstore_1

ldc2_w 3.5
dstore_3

dload_1
dload_3
dadd
dstore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/println(D)V

dload_3
dload 5
dadd
dstore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/println(D)V

return
.end method
