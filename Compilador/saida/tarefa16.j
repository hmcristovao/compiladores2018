.source prog_destino.java 
.class public tarefa16
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 17 
.limit locals 11
ldc2_w 0.0
dstore_1
ldc2_w 0.0
dstore_3
dload_1
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_1
dconst_0 
goto SAIDA_2
COLOCATRUE_1:
dconst_1 
SAIDA_2:
dconst_0 
dcmpg 
ifeq LABEL_FALSE_SE_REPETE_0

ldc2_w 0.0
dstore 5
LABELINICIOENQUANTO_14:
dload 5
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_15
dconst_0 
goto SAIDA_16
COLOCATRUE_15:
dconst_1 
SAIDA_16:
dconst_0 
dcmpg 
ifeq LABELFALSE_13

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Etapa --- "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " ---\n\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dconst_0 
dcmpg 
ifeq LABEL_FALSE_SE_REPETE_3

ldc2_w 0.0
dstore 7
LABELINICIOENQUANTO_10:
dload 7
ldc2_w 3.0
dcmpg 
iflt COLOCATRUE_11
dconst_0 
goto SAIDA_12
COLOCATRUE_11:
dconst_1 
SAIDA_12:
dconst_0 
dcmpg 
ifeq LABELFALSE_9

dload_3
ldc2_w 2.0
dcmpg 
ifge COLOCATRUE_7
dconst_0 
goto SAIDA_8
COLOCATRUE_7:
dconst_1 
SAIDA_8:
dconst_0 
dcmpg 
ifeq LABELFALSE_6

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Chegando ao fim! :(\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_6:
dload 7
ldc2_w 1.0
dadd 
dstore 7
goto LABELINICIOENQUANTO_10

LABELFALSE_9:
LABEL_FALSE_SE_REPETE_3:
dload_3
ldc2_w 1.0
dadd 
dstore_3
dload 5
ldc2_w 1.0
dadd 
dstore 5
goto LABELINICIOENQUANTO_14

LABELFALSE_13:
LABEL_FALSE_SE_REPETE_0:
return 
.end method 
