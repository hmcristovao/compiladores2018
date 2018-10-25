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
.limit locals7
ldc2_w 0.0
dstore_1

ldc2_w 5.0
dstore_3

:LabelEnquanto_2

dload_3
ldc2_w 5.0
dcmpg
dconst_0
dcmpg
ifeq LabelFalse_1
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/println(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(D)V

dload_1
ldc2_w 1.0
dadd
dstore_1

dload_1
ldc2_w 10.0
dcmpg
dconst_0
dcmpg
ifeq LabelFalse_0
ldc2_w 0.0
dstore_3


:LabelFalse_0


goto LabelEnquanto_2

:LabelFalse_1

return
.end method
