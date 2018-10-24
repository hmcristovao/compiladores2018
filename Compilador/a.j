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
.limit locals 100
;begin atribuicao 
ldc2_w 10.0
ldc2_w 55.0
dadd
dstore 1 
;end atribuicao 

;begin atribuicao 
ldc2_w 33.0
dstore 3 
;end atribuicao 

;begin atribuicao 
ldc "Digite um numero: "
astore 9 
;end atribuicao 

aload 9
astore_3
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextDouble()D
dstore 1 
;end entrada 

;begin atribuicao 
dload 1
ldc2_w 1.0
dadd
dstore 1 
;end atribuicao 

;begin concatenacao
ldc "resultado final"
;end concatenacao
astore_3
getstatic java/lang/System/out Ljava/io/PrintStream;
;begin concatenacao
ldc "resultado final"
;end concatenacao
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 1
invokevirtual java/io/PrintStream/println(D)V
return
.end method
