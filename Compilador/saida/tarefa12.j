.source prog_destino.java 
.class public tarefa12
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 31 
.limit locals 8
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore_1
dload_1
ldc2_w 2.0
dadd 
ldc2_w 10.0
dcmpg 
ifeq COLOCATRUE_1
dconst_0 
goto SAIDA_2
COLOCATRUE_1:
dconst_1 
SAIDA_2:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 10\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_0:
dload_1
ldc2_w 2.0
dadd 
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_3

ldc "Acertou - caso 4!!\n"
astore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload 3
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_3:
dload_1
ldc2_w 2.0
dadd 
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_7
dconst_0 
goto SAIDA_8
COLOCATRUE_7:
dconst_1 
SAIDA_8:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_6

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nErrado - caso 2\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_6:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste B\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w -1.0
dstore 4
dload_1
dload 4
dsub 
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_10
dconst_0 
goto SAIDA_11
COLOCATRUE_10:
dconst_1 
SAIDA_11:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_9

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 10\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_9:
dload_1
dload 4
dsub 
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_13
dconst_0 
goto SAIDA_14
COLOCATRUE_13:
dconst_1 
SAIDA_14:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_12

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 4\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_12:
dload_1
dload 4
dsub 
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_16
dconst_0 
goto SAIDA_17
COLOCATRUE_16:
dconst_1 
SAIDA_17:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_15

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 2\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_15:
dload_1
dload 4
dsub 
ldc2_w 3.0
dcmpg 
ifeq COLOCATRUE_19
dconst_0 
goto SAIDA_20
COLOCATRUE_19:
dconst_1 
SAIDA_20:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_18

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Acertou - caso 3!!\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_1
ldc2_w 10.0
dmul 
dload 4
dadd 
dstore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
LABELFALSECASO_18:
return 
.end method 
