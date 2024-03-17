package pratica07.enums;

public enum StatusPedido {
   NOVO {
      @Override
      public String getDescricao() {
         return "Pedido realizado, aguardando processamento.";
      }
   },
   PROCESSANDO {
      @Override
      public String getDescricao() {
         return "Pedido em processamento.";
      }
   },
   ENVIADO {
      @Override
      public String getDescricao() {
         return "Pedido enviado para o endereço de entrega.";
      }
   },
   ENTREGUE {
      @Override
      public String getDescricao() {
         return "Pedido entregue ao destinatário.";
      }
   };
   
   // Método abstrato que será implementado por cada constante
   public abstract String getDescricao();
}
