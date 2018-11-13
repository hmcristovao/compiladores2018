.source prog_destino.java 
.class public teste07
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 6 
.limit locals 7
ldc2_w 0.0
dstore_1
ldc2_w 5.0
dstore_3
LABELINICIOENQUANTO_1:
dload_3
ldc2_w 5.0
dcmpg 
ifge COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dload_1
ldc2_w 0.0
dcmpg 
ifge COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dconst_0 
dcmpg 
ifeq SAIDA_6
pop2 
dconst_1 
SAIDA_6:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

dload_1
ldc2_w 1.0
dadd 
dstore_1
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
return 
.end method 
