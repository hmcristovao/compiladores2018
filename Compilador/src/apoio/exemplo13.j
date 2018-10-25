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
.limit locals5
ldc2_w 2.0
ldc2_w 3.0
dadd
dstore_1

ldc2_w 2.0
ldc2_w 2.0
dcmpg
dconst_0
dcmpg
ifeq LabelFalse_0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Igual!!"
invokevirtual java/io/PrintStream/println(D)V


:LabelFalse_0

new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner.nextDouble()D
dstore_1

return
.end method
