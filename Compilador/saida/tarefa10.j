.source prog_destino.java 
.class public tarefa10
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 23 
.limit locals 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "==================================="
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste A"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite um valor negativo ou de 5 a 10:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
dload_1
ldc2_w 0.0
dcmpg 
iflt COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dload_1
ldc2_w 5.0
dcmpg 
ifge COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dload_1
ldc2_w 10.000001
dcmpg 
iflt COLOCATRUE_6
dconst_0 
goto SAIDA_7
COLOCATRUE_6:
dconst_1 
SAIDA_7:
dconst_1 
dcmpg 
ifeq SAIDA_8
pop2 
dconst_0 
SAIDA_8:
dconst_0 
dcmpg 
ifeq SAIDA_9
pop2 
dconst_1 
SAIDA_9:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "ok!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
goto LABELSAIDA_1

LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "errado!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
LABELSAIDA_1:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "==================================="
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste B"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
ldc2_w 10.0
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite um valor de 'a' abaixo de 50;"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n-Para exibir o valor de a, digite abaixo de 10;"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "-Para exibir o valor de b, digite 10 ou mais;"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "-Se a = 25 exibe mensagem diferente(Caso de um 'se' dentro de um 'senao');"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
LABELINICIOENQUANTO_18:
dload_3
ldc2_w 50.0
dcmpg 
iflt COLOCATRUE_19
dconst_0 
goto SAIDA_20
COLOCATRUE_19:
dconst_1 
SAIDA_20:
dconst_0 
dcmpg 
ifeq LABELFALSE_17

dload_3
ldc2_w 10.0
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
ldc "\nValor de a"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/println(D)V 
goto LABELSAIDA_14

LABELFALSE_13:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nValor de b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/println(D)V 
dload_3
ldc2_w 25.0
dcmpg 
ifeq COLOCATRUE_11
dconst_0 
goto SAIDA_12
COLOCATRUE_11:
dconst_1 
SAIDA_12:
dconst_0 
dcmpg 
ifeq LABELFALSE_10

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Voce entrou em uma condicional dentro de uma condicional(Inception!)"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
LABELFALSE_10:
LABELSAIDA_14:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite um valor de a"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
goto LABELINICIOENQUANTO_18

LABELFALSE_17:
return 
.end method 
