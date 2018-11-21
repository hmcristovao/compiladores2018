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
.limit stack 70 
.limit locals 14
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
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste C\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 10
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite 5 numeros entre 10 e 30\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
dstore 6
LABELINICIOENQUANTO_37:
dload 6
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_38
dconst_0 
goto SAIDA_39
COLOCATRUE_38:
dconst_1 
SAIDA_39:
dconst_0 
dcmpg 
ifeq LABELFALSE_36

new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 8
dload 8
ldc2_w 11.0
dcmpg 
ifeq COLOCATRUE_22
dconst_0 
goto SAIDA_23
COLOCATRUE_22:
dconst_1 
SAIDA_23:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_21

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 1.0
dadd 
dstore 10
LABELFALSECASO_21:
dload 8
ldc2_w 15.0
dcmpg 
ifeq COLOCATRUE_25
dconst_0 
goto SAIDA_26
COLOCATRUE_25:
dconst_1 
SAIDA_26:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_24

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 1.0
dadd 
dstore 10
LABELFALSECASO_24:
dload 8
ldc2_w 20.0
dcmpg 
ifeq COLOCATRUE_28
dconst_0 
goto SAIDA_29
COLOCATRUE_28:
dconst_1 
SAIDA_29:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_27

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 1.0
dadd 
dstore 10
LABELFALSECASO_27:
dload 8
ldc2_w 25.0
dcmpg 
ifeq COLOCATRUE_31
dconst_0 
goto SAIDA_32
COLOCATRUE_31:
dconst_1 
SAIDA_32:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_30

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 1.0
dadd 
dstore 10
LABELFALSECASO_30:
dload 8
ldc2_w 26.0
dcmpg 
ifeq COLOCATRUE_34
dconst_0 
goto SAIDA_35
COLOCATRUE_34:
dconst_1 
SAIDA_35:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_33

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 1.0
dadd 
dstore 10
LABELFALSECASO_33:
dload 6
ldc2_w 1.0
dadd 
dstore 6
goto LABELINICIOENQUANTO_37

LABELFALSE_36:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 10
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " acertos"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 10
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_41
dconst_0 
goto SAIDA_42
COLOCATRUE_41:
dconst_1 
SAIDA_42:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_40

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nazarado"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_40:
dload 10
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_44
dconst_0 
goto SAIDA_45
COLOCATRUE_44:
dconst_1 
SAIDA_45:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_43

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\naruim"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_43:
dload 10
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_47
dconst_0 
goto SAIDA_48
COLOCATRUE_47:
dconst_1 
SAIDA_48:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_46

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nmediano"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_46:
dload 10
ldc2_w 3.0
dcmpg 
ifeq COLOCATRUE_50
dconst_0 
goto SAIDA_51
COLOCATRUE_50:
dconst_1 
SAIDA_51:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_49

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nsortudo"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_49:
dload 10
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_53
dconst_0 
goto SAIDA_54
COLOCATRUE_53:
dconst_1 
SAIDA_54:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_52

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ncagao"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_52:
dload 10
ldc2_w 5.0
dcmpg 
ifeq COLOCATRUE_56
dconst_0 
goto SAIDA_57
COLOCATRUE_56:
dconst_1 
SAIDA_57:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_55

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nvc nao existe!"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_55:
return 
.end method 
