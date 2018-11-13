.source prog_destino.java 
.class public tarefa04
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 18 
.limit locals 27
ldc2_w 2.0
dstore_1
ldc2_w 3.0
dstore_3
ldc2_w 4.0
dstore 5
ldc2_w 0.0
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_0
dconst_0 
goto SAIDA_1
COLOCATRUE_0:
dconst_1 
SAIDA_1:
dstore 7
dload_3
dload_1
dcmpg 
ifge COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dstore 9
dload_1
ldc2_w 2.0
dadd 
dload_3
ldc2_w 1.0
dadd 
dcmpg 
ifge COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dstore 11
ldc2_w 1.0
ldc2_w 0.0
dcmpg 
ifge COLOCATRUE_6
dconst_0 
goto SAIDA_7
COLOCATRUE_6:
dconst_1 
SAIDA_7:
dstore 13
ldc2_w 0.0
ldc2_w 0.0
dconst_0 
dcmpg 
ifeq SAIDA_8
pop2 
dconst_1 
SAIDA_8:
dstore 15
ldc2_w 0.0
ldc2_w 1.0
dconst_0 
dcmpg 
ifeq SAIDA_9
pop2 
dconst_1 
SAIDA_9:
dstore 17
ldc2_w 1.0
ldc2_w 0.0
dconst_0 
dcmpg 
ifeq SAIDA_10
pop2 
dconst_1 
SAIDA_10:
dstore 19
ldc2_w 1.0
ldc2_w 1.0
dconst_0 
dcmpg 
ifeq SAIDA_11
pop2 
dconst_1 
SAIDA_11:
dstore 21
dload_1
ldc2_w 1.0
dadd 
ldc2_w 2.0
dmul 
ldc2_w 1.0
ldc2_w 3.0
dadd 
dcmpg 
ifge COLOCATRUE_12
dconst_0 
goto SAIDA_13
COLOCATRUE_12:
dconst_1 
SAIDA_13:
dload 5
ldc2_w 1.0
dload_3
dadd 
dcmpg 
ifeq COLOCATRUE_14
dconst_0 
goto SAIDA_15
COLOCATRUE_14:
dconst_1 
SAIDA_15:
dconst_0 
dcmpg 
ifeq SAIDA_16
pop2 
dconst_1 
SAIDA_16:
dstore 23
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 9
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 11
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 13
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 15
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 17
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 19
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 21
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 23
invokevirtual java/io/PrintStream/println(D)V 
return 
.end method 
