.source prog_destino.java 
.class public tarefa02
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 26 
.limit locals 18
ldc2_w 3.0
ldc2_w 4.0
ldc2_w 3.0
dadd 
ldc2_w 3.0
invokestatic java/lang/Math/pow(DD)D 
invokestatic java/lang/Math/pow(DD)D 
dstore 11
ldc2_w 1.0
ldc2_w 2.0
dadd 
dstore_1
ldc2_w 1.0
ldc2_w 2.0
dadd 
ldc2_w 5.0
dadd 
dstore_3
dload_1
dload_1
ldc2_w 1.0
dsub 
dmul 
dload_3
ldc2_w 2.0
dsub 
dmul 
dload_1
ldc2_w 3.0
dsub 
dmul 
dload_3
dadd 
dstore 5
dload 11
dstore 7
dload_1
dload_3
dload 5
dload 7
dload_1
dload_3
dload 5
dload 7
dload_1
dload_3
dload 5
dload 7
ldc2_w 1.0
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dadd 
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
dload_3
dadd 
dload 5
dadd 
dload 7
dadd 
dload 9
dadd 
dload 11
dadd 
invokevirtual java/io/PrintStream/println(D)V 
return 
.end method 
