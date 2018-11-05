.source prog_destino.java
.class public teste02
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
.limit locals 7
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de expressao com operador igual"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

ldc2_w 55.0
dstore_1

dload_1
ldc2_w 55.0
dcmpg 
ifeq COLOCATRUE_0
dconst_0 
goto SAIDA_1
COLOCATRUE_0:
dconst_1 
SAIDA_1:
dstore_3

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/println(D)V 

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
dload_3
dcmpg 
ifeq COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
invokevirtual java/io/PrintStream/println(D)V 

return
.end method
