.source prog_destino.java 
.class public teste15
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 52 
.limit locals 7
ldc2_w 2.0
dstore_1
ldc2_w 0.0
ldc2_w 0.0
ddiv 
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
ldc2_w 0.0
ddiv 
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
return 
.end method 
