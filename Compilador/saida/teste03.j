.source prog_destino.java 
.class public teste03
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 100 
.limit locals 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de comando condicional simples\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
ldc2_w 1.0
dstore_1
ldc2_w 2.0
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite um numero para n:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 5
dload 5
dload_1
dcmpg 
ifeq COLOCATRUE_1
dconst_0 
goto SAIDA_2
COLOCATRUE_1:
dconst_1 
SAIDA_2:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "n eh igual a variavel var1"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Comando entre as condicionais"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
dload 5
dload_3
dcmpg 
ifeq COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dconst_0 
dcmpg 
ifeq LABELFALSE_3

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "n eh igual a variavel var2"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
LABELFALSE_3:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nFim do teste!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method 
