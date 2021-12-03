class Punto(var id: String) {

    var x: Int = 0
    var y: Int = 0

    constructor(x: Int, y: Int) : this(id = "") {
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "El punto es: $id [$x,$y]"
    }

    // (RA2.c) Crea un método llamado obtenerCoordenadas
    fun obtenerCoordenadas(): Pair<Int, Int> = Pair(x, y)


    companion object {
        // (RA2.e,f) Create un método estático (método de clase) con nombre componenteDeVector
        fun componenteDeVector(pA: Punto, pB: Punto) {
            return Punto(pA.id + pB.id, pB.x - pA.x, pB.y - pA.y)
        }

        // *OPCIONAL (RA2.e,f) Create un método estático (método de clase) con nombre distancia
        fun distancia(pa: Punto, pb: Punto): Double {
            return
        }

    // (RA6.a,c) Create un método estático (método de clase) con nombre localizacionGeograficaNS
        fun localizacionGeograficaNS(punto1: Punto, punto2: Punto): Map<Punto, MutableList<Punto>> {
            var norte = mutableListOf<Punto>()
            var sur = mutableListOf<Punto>()
            var mapa = mapOf(punto1 to norte, punto2 to sur)
            if (punto1.y >= 0) {
                norte.add(punto1)
            } else {
                sur.add(punto1)
            }
            if (punto2.y>0)
            {
                norte.add(punto2)
            }else{
                sur.add(punto2)
            }
            return (mapa)
        }

    }

}


fun main(args: Array<String>) {

    var punto1: Punto = Punto(x = 7, y = 4)
    println(punto1.obtenerCoordenadas())


}