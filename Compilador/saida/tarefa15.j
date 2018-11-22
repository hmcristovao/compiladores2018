.source prog_destino.java 
.class public tarefa15
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 13 
.limit locals 11
ldc2_w 2.0
ldc2_w 3.0
invokestatic java/lang/Math/pow(DD)D 
dstore_1
ldc2_w 2.0
ldc2_w 1.0
ldc2_w 2.0
ddiv 
invokestatic java/lang/Math/pow(DD)D 
dstore_3
ldc2_w 0.0
dstore 7
LABELINICIOENQUANTO_1:
dload 7
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dconst_0 
dcmpg 
ifeq LABELFALSE_0

dload_1
dload_3
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 7
ldc2_w 1.0
dadd 
dstore 7
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
return 
.end method 
