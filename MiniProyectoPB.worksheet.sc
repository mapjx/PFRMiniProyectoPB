// Regla de Simpson Normal
def simpsonNormal(a:Int, b:Int, f:Double => Double) : Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}

val function1 = (x: Double) => -Math.pow(x, 2) + (8 * x) - 12
val function2 = (x: Double) => 3 * Math.pow(x, 2)
val function3 = (x: Double) => x + (2 * Math.pow(x, 2)) - Math.pow(x, 3) + (5 * Math.pow(x, 4))
val function4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2) + x)
val function5 = (x: Double) => Math.pow(Math.E, x)
val function6 = (x: Double) => 1 / Math.sqrt(x - 1)
val function7 = (x: Double) => 1 / (1 + Math.pow(x, 2))

val resFunction = simpsonNormal(3,5,function1)
val resFunction = simpsonNormal(0,2,function2)
val resFunction = simpsonNormal(-1,1,function3)
val resFunction = simpsonNormal(1,2,function4)
val resFunction = simpsonNormal(0,1,function5)
val resFunction = simpsonNormal(2,3,function6)
val resFunction = simpsonNormal(0,1,function7)


// Regla de Simpson 1/3 Compuesta



// Regla de Simpson 1/3 Extendida

def simpsonExtendida(a: Int, b: Int, f: Double => Double) = {
	val n = 2 * (b-a)
	val h: Double = (b-a)/n.toDouble
	val rangImp = (1 until n by 2).map(i => f (a + (i*h))).sum
	val rangPar = (2 to n-2 by 2).map(j=>f(a+(j*h))).sum
	(h/3)*(f(a)+(4*rangImp)+(2*rangPar)+f(b))
	}

val function1 = (x: Double) => -Math.pow(x, 2) + (8 * x) - 12
val function2 = (x: Double) => 3 * Math.pow(x, 2)
val function3 = (x: Double) => x + (2 * Math.pow(x, 2)) - Math.pow(x, 3) + (5 * Math.pow(x, 4))
val function4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2) + x)
val function5 = (x: Double) => Math.pow(Math.E, x)
val function6 = (x: Double) => 1 / Math.sqrt(x - 1)
val function7 = (x: Double) => 1 / (1 + Math.pow(x, 2))

val resFunction = simpsonExtendida(3,5,function1)
val resFunction = simpsonExtendida(0,2,function2)
val resFunction = simpsonExtendida(-1,1,function3)
val resFunction = simpsonExtendida(1,2,function4)
val resFunction = simpsonExtendida(0,1,function5)
val resFunction = simpsonExtendida(2,3,function6)
val resFunction = simpsonExtendida(0,1,function7)
