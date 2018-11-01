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
.limit stack 400
.limit locals 16
ldc2_w 5.0
dstore 7

ldc2_w 2.0
ldc2_w 3.0
ldc2_w 5.0
dadd
dmul
dstore_1

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/println(D)V

dload_1
ldc2_w 2.0
ddiv
dstore_3

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/println(D)V

dload_1
ldc2_w 16.0
dcmpg
istore 5

ldc2_w 0.0
ldc2_w 1.0
ior
dstore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/println(D)V

dload_3
ldc2_w 8.0
dcmpg
dload_1
ldc2_w 10.0
dcmpg
ior
istore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/println(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Digite um numero:\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner.nextDouble()D
dstore 9

dload 9
dload 7
dcmpg
ifne LabelFalse_0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "igual a variavel d\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


LabelFalse_0:

ldc2_w 1.0
dstore 9

LabelEnquanto_2:

dload 9
ldc2_w 1.0
dcmpg
ifne LabelFalse_1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "entre com o valor de n:\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner.nextDouble()D
dstore 9

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "n = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 9
invokevirtual java/io/PrintStream/println(D)V


goto LabelEnquanto_2

LabelFalse_1:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nProximo enquanto\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

LabelEnquanto_4:

dload 7
ldc2_w 5.0
dcmpg
ifne LabelFalse_3
dload 7
ldc2_w 1.0
dadd
dstore 7

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 7
invokevirtual java/io/PrintStream/println(D)V


goto LabelEnquanto_4

LabelFalse_3:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Teste de concatenação\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

ldc "Compila"
dstore 11

ldc "dores\n"
dstore 12

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 11
aload 12
ldc "Digite um numero:\nigual a variavel d\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

aload 11
aload 12
ldc "entre com o valor de n:\nn = "
dstore 13

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 13
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

return
.end method
