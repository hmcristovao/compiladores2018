numero soma<-0, valor<-0, cont <-0, aux<-0;

enquanto (aux=0)

   exibe "Digite um valor: ";
   le  valor;

   soma <- soma + valor;
   cont <- cont + 1;

   exibe "Digite: 0 - continuar ou 1 - terminar: ";
   le  aux;

fimenquanto

exibe "Media:", soma/cont;