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
ldc2_w 3.0
dadd
ldc2_w 5.0
dadd
dstore 1 
;end atribuicao 

;begin atribuicao 
ldc2_w 33.0
dstore 3 
;end atribuicao 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.nextDouble:()D
dstore 1 
;end entrada 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.nextDouble:()D
dstore 3 
;end entrada 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.nextDouble:()D
dstore 5 
;end entrada 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.nextDouble:()D
dstore 7 
;end entrada 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.next:()Ljava/lang/String;
dstore 9 
;end entrada 

;begin entrada
new java/util/Scanner
dup
getstatic java/lang/System.in:Ljava/io/InputStream;
invokespecial java/util/Scanner."<init>":(Ljava/io/InputStream;)V
astore_3
aload_3
invokevirtual java/util/Scanner.next:()Ljava/lang/String;
dstore 10 
;end entrada 

;begin atribuicao 
ldc2_w 99.0
dstore 7 
;end atribuicao 

;begin atribuicao 
;begin concatenacao
ldc "hello world"
;end concatenacao
dstore 10 
;end atribuicao 

;begin se exp falso
dload 7
dload 10
;begin igual logico
dcmpg
;end igual logico
dconst_0
dcmpg
ifeq condicionalSimples_0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "ihu"
invokevirtual java/io/PrintStream/println(D)V

;end se exp falso

:condicionalSimples_0
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 10
ldc2_w 10.0
dadd
invokevirtual java/io/PrintStream/println(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 9
ldc2_w 99.0
ldc2_w 4.0
dmul
dsub
invokevirtual java/io/PrintStream/println(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc2_w 10.0
ldc2_w 2.0
dadd
invokevirtual java/io/PrintStream/println(D)V

:enquantoInicio_1
;begin se exp falso
dload 3
dload 1
;begin igual logico
dcmpg
;end igual logico
dconst_0
dcmpg
ifeq enquantoFim_2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "hehe"
invokevirtual java/io/PrintStream/println(D)V

;end se exp falso

goto enquantoInicio_1

:enquantoFim_2
return
.end method
