.source prog_destino.java 
.class public tarefa13
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 25 
.limit locals 13
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 01\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 10.0
dstore_1
LABELINICIOFAZERENQUANTO_1:
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_1
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

goto LABELINICIOFAZERENQUANTO_1

LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 02\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore_3
LABELINICIOFAZERENQUANTO_5:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "y: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_3
ldc2_w 1.0
dadd 
dstore_3
dload_3
ldc2_w 11.0
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

goto LABELINICIOFAZERENQUANTO_5

LABELFALSE_4:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 03\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELINICIOFAZERENQUANTO_16:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Informe um valor para calcular o fatorial, 0 para sair: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 5
dload 5
dstore 7
ldc2_w 1.0
dstore 9
LABELINICIOFAZERENQUANTO_9:
dload 9
dload 7
dmul 
dstore 9
dload 7
ldc2_w 1.0
dsub 
dstore 7
dload 7
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_10
dconst_0 
goto SAIDA_11
COLOCATRUE_10:
dconst_1 
SAIDA_11:
dconst_0 
dcmpg 
ifeq LABELFALSE_8

goto LABELINICIOFAZERENQUANTO_9

LABELFALSE_8:
dload 5
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_13
dconst_0 
goto SAIDA_14
COLOCATRUE_13:
dconst_1 
SAIDA_14:
dconst_0 
dcmpg 
ifeq LABELFALSE_12

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Resultado fatorial: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 9
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_12:
dload 5
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_17
dconst_0 
goto SAIDA_18
COLOCATRUE_17:
dconst_1 
SAIDA_18:
dconst_0 
dcmpg 
ifeq LABELFALSE_15

goto LABELINICIOFAZERENQUANTO_16

LABELFALSE_15:
return 
.end method 
