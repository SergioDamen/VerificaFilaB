EVENTO

-Attributi:
  -nomeEvento:String                    nome dell'evento.
  -prezzo:float                         prezzo di un biglietto dell'evento,.
  -numeroBigliettiVenduti:int           totale dei biglietti che sono gia' stati venduti.
  -numeroBigliettiResidui:int           totale dei biglietti che posso essere venduti.
-Metodi:
  +Evento(String, float, int, int)      metodo costruttore di un oggetto Evento.
  +vendiBiglietto(int):boolean          metodo che vende un numero inserito di biglietti dopo il controllo di canVendiBiglietti.
  +ristampaBiglietti(int):boolean       metodo che ristampa un numero inserito di biglietti.
  -canVendiBiglietto(int):boolean       metodo di servizio che controlla sela vendita e' possibile.
  +equals(Object):boolean               metodo che confronta gli attributi nomeEvento & prezzo.
  +toString():String                    metodo che mi stampa le informazioni di uno oggetto.
