.source prog_destino.java 
.class public tarefa06
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
.limit locals 16
ldc "aaaa"
astore_1
ldc "bbbbb"
astore_2
ldc "hello"
astore 6
ldc "world"
astore 7
ldc2_w 10.0
dstore 8
dload 8
ldc2_w 1.0
dadd 
dstore 10
return 
.end method 
