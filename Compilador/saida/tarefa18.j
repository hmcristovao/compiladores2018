.source prog_destino.java 
.class public tarefa18
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 53 
.limit locals 25
ldc2_w 0.0
dstore_1
dload_1
dstore_3
dload_3
dstore 5
ldc2_w 0.0
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "*****Primeiro Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
dstore_1
LABELINICIOENQUANTO_9:
dload_1
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_10
dconst_0 
goto SAIDA_11
COLOCATRUE_10:
dconst_1 
SAIDA_11:
dconst_0 
dcmpg 
ifeq LABELFALSE_8

ldc2_w 1.0
dstore_3
LABELINICIOENQUANTO_5:
dload_3
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_6
dconst_0 
goto SAIDA_7
COLOCATRUE_6:
dconst_1 
SAIDA_7:
dconst_0 
dcmpg 
ifeq LABELFALSE_4

ldc2_w 1.0
dstore 5
LABELINICIOENQUANTO_1:
dload 5
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "i = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ j = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ k = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 9
ldc2_w 1.0
dadd 
dstore 9
dload 5
ldc2_w 1.0
dadd 
dstore 5
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
dload_3
ldc2_w 1.0
dadd 
dstore_3
goto LABELINICIOENQUANTO_5

LABELFALSE_4:
dload_1
ldc2_w 1.0
dadd 
dstore_1
goto LABELINICIOENQUANTO_9

LABELFALSE_8:
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 9
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " possibilidades\n\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n*****Segundo Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore 11
LABELINICIOENQUANTO_21:
dload 11
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_22
dconst_0 
goto SAIDA_23
COLOCATRUE_22:
dconst_1 
SAIDA_23:
dconst_0 
dcmpg 
ifeq LABELFALSE_20

ldc2_w 2.0
dstore 13
LABELINICIOENQUANTO_17:
dload 13
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_18
dconst_0 
goto SAIDA_19
COLOCATRUE_18:
dconst_1 
SAIDA_19:
dconst_0 
dcmpg 
ifeq LABELFALSE_16

ldc2_w 2.0
dstore 15
LABELINICIOENQUANTO_13:
dload 15
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_14
dconst_0 
goto SAIDA_15
COLOCATRUE_14:
dconst_1 
SAIDA_15:
dconst_0 
dcmpg 
ifeq LABELFALSE_12

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "var_1 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 11
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ var_2 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 13
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ var_3 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 15
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 15
ldc2_w 1.0
dadd 
dstore 15
goto LABELINICIOENQUANTO_13

LABELFALSE_12:
dload 13
ldc2_w 1.0
dadd 
dstore 13
goto LABELINICIOENQUANTO_17

LABELFALSE_16:
dload 11
ldc2_w 1.0
dadd 
dstore 11
goto LABELINICIOENQUANTO_21

LABELFALSE_20:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n*****Terceiro Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore 17
LABELINICIOENQUANTO_43:
dload 17
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_44
dconst_0 
goto SAIDA_45
COLOCATRUE_44:
dconst_1 
SAIDA_45:
dconst_0 
dcmpg 
ifeq LABELFALSE_42

ldc2_w 2.0
dstore 19
LABELINICIOENQUANTO_39:
dload 19
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_40
dconst_0 
goto SAIDA_41
COLOCATRUE_40:
dconst_1 
SAIDA_41:
dconst_0 
dcmpg 
ifeq LABELFALSE_38

ldc2_w 2.0
dstore 21
LABELINICIOENQUANTO_35:
dload 21
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_36
dconst_0 
goto SAIDA_37
COLOCATRUE_36:
dconst_1 
SAIDA_37:
dconst_0 
dcmpg 
ifeq LABELFALSE_34

dload 17
dload 19
dcmpg 
ifeq COLOCATRUE_29
dconst_0 
goto SAIDA_30
COLOCATRUE_29:
dconst_1 
SAIDA_30:
dload 19
dload 21
dcmpg 
ifeq COLOCATRUE_31
dconst_0 
goto SAIDA_32
COLOCATRUE_31:
dconst_1 
SAIDA_32:
dconst_1 
dcmpg 
ifeq SAIDA_33
pop2 
dconst_0 
SAIDA_33:
dconst_0 
dcmpg 
ifeq LABELFALSE_28

ldc2_w 0.0
dstore 7
LABELINICIOENQUANTO_25:
dload 7
dload 17
ldc2_w 1.0
dsub 
dcmpg 
iflt COLOCATRUE_26
dconst_0 
goto SAIDA_27
COLOCATRUE_26:
dconst_1 
SAIDA_27:
dconst_0 
dcmpg 
ifeq LABELFALSE_24

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "indices iguais\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 7
ldc2_w 1.0
dadd 
dstore 7
goto LABELINICIOENQUANTO_25

LABELFALSE_24:
LABELFALSE_28:
dload 21
ldc2_w 1.0
dadd 
dstore 21
goto LABELINICIOENQUANTO_35

LABELFALSE_34:
dload 19
ldc2_w 1.0
dadd 
dstore 19
goto LABELINICIOENQUANTO_39

LABELFALSE_38:
dload 17
ldc2_w 1.0
dadd 
dstore 17
goto LABELINICIOENQUANTO_43

LABELFALSE_42:
return 
.end method 
