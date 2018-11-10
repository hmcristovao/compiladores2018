.source prog_destino.java 
.class public teste01
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 50 
.limit locals 15
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de declaracoes, variaveis a,b,d,x,c"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
ldc2_w 5.0
dstore 8
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste atribuicoes de cte e expressao aritmetica"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
ldc2_w 2.0
dstore_1
ldc2_w 3.0
ldc2_w 1.0
ldc2_w 2.0
dadd 
dmul 
dstore_3
dload_1
ldc2_w 1.0
dsub 
dload_3
ldc2_w 2.0
dsub 
dmul 
dload 8
ldc2_w 3.0
dsub 
dmul 
ldc2_w 1.0
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de exibicoes de expressoes"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "a = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "b = 3*(1+2) = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "c = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 8
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "d = (a-1)*(b-2)*(c-3)+1 = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de entrada de numero e exibicao multipla - digite um numero para n:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 10
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Proximos 3 sucessores de n = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 10
ldc2_w 1.0
dadd 
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 10
ldc2_w 2.0
dadd 
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 10
ldc2_w 3.0
dadd 
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de atribuicao de string"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
ldc "string de teste"
astore 12
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload 12
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste de entrada de string - digite uma string para x:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 7
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "String digitada para x = "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload 7
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method 
