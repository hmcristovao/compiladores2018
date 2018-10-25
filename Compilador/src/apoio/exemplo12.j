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
.limit stack 4
.limit locals5
ldc "Teste"
dstore_1

ldc "Concatenar"
dstore_2

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 1
aload 2
ldc "TesteConcatenar"
invokevirtual java/io/PrintStream/println(D)V

return
.end method
