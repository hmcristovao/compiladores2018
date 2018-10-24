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
dstore 1 
;end atribuicao 

;begin atribuicao 
ldc "merda"
astore 3 
;end atribuicao 

;begin atribuicao 
ldc " kkk"
astore 4 
;end atribuicao 

;begin atribuicao 
ldc2_w 9.0
ldc2_w 9.0
dadd
dstore 1 
;end atribuicao 

;begin atribuicao 
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 3
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 4
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
;end concatenacao
astore 5 
;end atribuicao 

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 5
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

return
.end method
