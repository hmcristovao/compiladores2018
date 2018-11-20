.source prog_destino.java 
.class public tarefa11
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 22 
.limit locals 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 5.0
dstore_1
LABELINICIOENQUANTO_1:
dload_1
ldc2_w 0.0
dcmpg 
ifge COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " x="
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
dload_1
ldc2_w 1.0
dsub 
dstore_1
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste B\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore_3
LABELINICIOENQUANTO_12:
dload_3
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_13
dconst_0 
goto SAIDA_14
COLOCATRUE_13:
dconst_1 
SAIDA_14:
dconst_0 
dcmpg 
ifeq LABELFALSE_11

ldc2_w 0.0
dstore 5
LABELINICIOENQUANTO_8:
dload 5
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_9
dconst_0 
goto SAIDA_10
COLOCATRUE_9:
dconst_1 
SAIDA_10:
dconst_0 
dcmpg 
ifeq LABELFALSE_7

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_3
dload 5
dcmpg 
ifeq COLOCATRUE_5
dconst_0 
goto SAIDA_6
COLOCATRUE_5:
dconst_1 
SAIDA_6:
dconst_0 
dcmpg 
ifeq LABELFALSE_4

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "os dois sao iguais\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_4:
dload 5
ldc2_w 1.0
dadd 
dstore 5
goto LABELINICIOENQUANTO_8

LABELFALSE_7:
dload_3
ldc2_w 1.0
dadd 
dstore_3
goto LABELINICIOENQUANTO_12

LABELFALSE_11:
return 
.end method 
