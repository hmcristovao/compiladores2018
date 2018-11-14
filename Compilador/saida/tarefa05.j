.source prog_destino.java 
.class public tarefa05
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 4 
.limit locals 6
ldc "testes"
astore_1
ldc2_w 2.0
ldc2_w 1.0
dadd 
dstore_2
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload 1
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_2
invokevirtual java/io/PrintStream/println(D)V 
return 
.end method 
