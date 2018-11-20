.source prog_destino.java 
.class public tarefa11
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 12 
.limit locals 7
ldc2_w 0.0
dstore_1
LABELINICIOENQUANTO_5:
dload_1
ldc2_w 10.0
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

ldc2_w 0.0
dstore_3
LABELINICIOENQUANTO_1:
dload_3
ldc2_w 10.0
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

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " "
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
goto LABELINICIOENQUANTO_1

LABELFALSE_0:
dload_1
ldc2_w 1.0
dadd 
dstore_1
goto LABELINICIOENQUANTO_5

LABELFALSE_4:
return 
.end method 
