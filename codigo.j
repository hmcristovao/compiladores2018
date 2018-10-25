.source prog_destino.java
.class public prog_destino
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
.limit locals 100
ldc2_w 0.0
dstore 1 

ldc2_w 0.0
dstore 3 

ldc2_w 0.0
dstore 5 

ldc2_w 0.0
dstore 7 

LabelInicio-0: 

dload 7
ldc2_w 0.0
dcmpg
ifeq LABEL_00
dconst_0 
goto LABEL_01
LABEL_00:
dconst_1 
LABEL_01:
dconst_0
dcmpg
ifeq LabelFalse-1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite um valor: "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner.nextDouble()D
dstore 3 

dload 1
dload 3
dadd
dstore 1 

dload 5
ldc2_w 1.0
dadd
dstore 5 

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite: 0 - continuar ou 1 - terminar: "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner.nextDouble()D
dstore 7 


goto LabelInicio-0

LabelFalse-1: 

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Media:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 1
dload 5
ddiv
invokevirtual java/io/PrintStream/println(D)V

return
.end method
