error id: file:///D:/!PATRONES2/Reproductor.java
file:///D:/!PATRONES2/Reproductor.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[56,1]

error in qdox parser
file content:
```java
offset: 1782
uri: file:///D:/!PATRONES2/Reproductor.java
text:
```scala


// 3. El Contexto (Context)
public class Reproductor {
    private EstrategiaCalidad estrategia;
    private String resolucionActual;
    private String bitrateActual;
    private double velocidadRedSimulada;

public class Reproductor {
    private EstrategiaCalidad estrategia;
    private String resolucionActual;
    private String bitrateActual;
    private double velocidadRedSimulada;

    public Reproductor(double velocidadInicial) {
        this.velocidadRedSimulada = velocidadInicial;
        this.resolucionActual = "Desconocida";
        this.bitrateActual = "0 Kbps";
    }

    public void setEstrategia(EstrategiaCalidad nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public void ejecutar() {
        if (estrategia == null) {
            System.out.println("Error: Sin estrategia definida.");
            return;
        }

        System.out.println("Iniciando Reproducción");
        estrategia.configurarCalidad(this);

        System.out.println("   Reproductor " + resolucionActual + " | " + bitrateActual);
        System.out.println("                                  ");
    }

    // Helper para simplificar estrategias
    public void aplicarConfiguracion(String resolucion, String bitrate) {
        this.resolucionActual = resolucion;
        this.bitrateActual = bitrate;
        System.out.println("   Config  " + resolucion + " / " + bitrate);
    }

    public double getVelocidadRed() {
        return velocidadRedSimulada;
    }

    // Solo para pruebas
    public void simularCambioRed(double nuevaVelocidad) {
        this.velocidadRedSimulada = nuevaVelocidad;
        System.out.println("\n Simulacion: Nueva velocidad: " + nuevaVelocidad + " Mbps");
    }
}
@@
```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:936)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	java.base/java.lang.Thread.run(Thread.java:1474)
```
#### Short summary: 

QDox parse error in file:///D:/!PATRONES2/Reproductor.java