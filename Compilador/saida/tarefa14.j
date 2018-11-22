.source prog_destino.java 
.class public tarefa14
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 40 
.limit locals 17
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 20.0
dstore_1
LABELINICIOREPETIR_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
dload_1
ldc2_w 1.0
dsub 
dstore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_1
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_1
dconst_0 
goto SAIDA_2
COLOCATRUE_1:
dconst_1 
SAIDA_2:
dconst_0 
dcmpg 
ifeq LABELINICIOREPETIR_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste B\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELINICIOREPETIR_10:
ldc2_w 0.0
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite um numero para ver sua tabuada de multiplicacao ou 0 para sair:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload_3
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_8
dconst_0 
goto SAIDA_9
COLOCATRUE_8:
dconst_1 
SAIDA_9:
dconst_0 
dcmpg 
ifeq LABELFALSE_7

LABELINICIOENQUANTO_4:
dload 5
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_5
dconst_0 
goto SAIDA_6
COLOCATRUE_5:
dconst_1 
SAIDA_6:
dconst_0 
dcmpg 
ifeq LABELFALSE_3

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " x "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
dload 5
dmul 
invokevirtual java/io/PrintStream/print(D)V 
dload 5
ldc2_w 1.0
dadd 
dstore 5
goto LABELINICIOENQUANTO_4

LABELFALSE_3:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_7:
dload_3
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_11
dconst_0 
goto SAIDA_12
COLOCATRUE_11:
dconst_1 
SAIDA_12:
dconst_0 
dcmpg 
ifeq LABELINICIOREPETIR_10

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nFoi digitado o numero 0! programa encerrado!\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste C\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 7
ldc2_w 0.0
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n Escreva 0 se quiser ver o Teste C! \n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 11
dload 11
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_20
dconst_0 
goto SAIDA_21
COLOCATRUE_20:
dconst_1 
SAIDA_21:
dconst_0 
dcmpg 
ifeq LABELFALSE_19

LABELINICIOREPETIR_16:
LABELINICIOREPETIR_13:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n Z :"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 9
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " C : "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/print(D)V 
dload 7
ldc2_w 1.0
dadd 
dstore 7
dload 7
ldc2_w 10.0
dcmpg 
ifeq COLOCATRUE_14
dconst_0 
goto SAIDA_15
COLOCATRUE_14:
dconst_1 
SAIDA_15:
dconst_0 
dcmpg 
ifeq LABELINICIOREPETIR_13

ldc2_w 0.0
dstore 7
dload 9
ldc2_w 1.0
dadd 
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 9
ldc2_w 10.0
dcmpg 
ifeq COLOCATRUE_17
dconst_0 
goto SAIDA_18
COLOCATRUE_17:
dconst_1 
SAIDA_18:
dconst_0 
dcmpg 
ifeq LABELINICIOREPETIR_16

LABELFALSE_19:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste D\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 13
LABELINICIOREPETIR_22:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nAperte 1 !\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 13
dload 13
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_23
dconst_0 
goto SAIDA_24
COLOCATRUE_23:
dconst_1 
SAIDA_24:
dconst_0 
dcmpg 
ifeq LABELINICIOREPETIR_22

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nObrigado\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
return 
.end method 
