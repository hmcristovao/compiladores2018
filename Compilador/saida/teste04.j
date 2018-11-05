.source prog_destino.java 
.class public teste04
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
.limit locals 5
ldc2_w 1.0
dstore_1
LABELINICIOENQUANTO_1:
dload_1
ldc2_w 1.0
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
ldc "Digite um valor para n:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Enquanto n igual a 1 solicita outro valor"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nFim do enquanto. O valor de n = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/println(D)V 
return 
.end method 
