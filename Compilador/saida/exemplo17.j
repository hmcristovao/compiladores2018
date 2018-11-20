.source prog_destino.java 
.class public exemplo17
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 5 
.limit locals 11
ldc2_w 0.0
dstore_1
ldc2_w 0.0
dstore_3
ldc2_w 0.0
dstore 5
ldc2_w 0.0
dstore 7
LABELINICIOENQUANTO_1:
dload 7
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

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite um valor: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload_1
dload_3
dadd 
dstore_1
dload 5
ldc2_w 1.0
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite: 0 - continuar ou 1 - terminar: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 7
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Media:"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
dload 5
ddiv 
invokevirtual java/io/PrintStream/print(D)V 
return 
.end method 
