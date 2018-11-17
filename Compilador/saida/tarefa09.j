.source prog_destino.java 
.class public tarefa09
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 8 
.limit locals 9
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
ldc2_w 1.0
ldc2_w 2.0
ldc2_w 3.0
ldc2_w 2.0
invokestatic java/lang/Math/pow(DD)D 
dmul 
ldc2_w 2.0
dmul 
dadd 
dload_1
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/println(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/println(D)V 
return 
.end method 
