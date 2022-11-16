val function1 = (x: Double) => -Math.pow(x, 2) + (8 * x) - 12
val function2 = (x: Double) => 3 * Math.pow(x, 2)
val function3 = (x: Double) => x + (2 * Math.pow(x, 2)) - Math.pow(x, 3) + (5 * Math.pow(x, 4))
val function4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2) + x)
val function5 = (x: Double) => Math.pow(Math.E, x)
val function6 = (x: Double) => 1 / Math.sqrt(x - 1)
val function7 = (x: Double) => 1 / (1 + Math.pow(x, 2))

// Regla de Simpson Normal
def simpsonNormal(a:Int, b:Int, f:Double => Double) : Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}

val resFunction = simpsonNormal(3,5,function1)
val resFunction = simpsonNormal(0,2,function2)
val resFunction = simpsonNormal(-1,1,function3)
val resFunction = simpsonNormal(1,2,function4)
val resFunction = simpsonNormal(0,1,function5)
val resFunction = simpsonNormal(2,3,function6)
val resFunction = simpsonNormal(0,1,function7)


def function_error(x: Double, y: Double): Double = math.abs(x-y)

val res1 = 7.33
val res2 = 8
val res3 = 3.333
val res4 = 1.09861
val res5 = 1.71828
val res6 = 0.828427
val res7 = 0.785398

val funcion_error = (function1, res1)
val funcion_error = (function2, res2)
val funcion_error = (function3, res3)
val funcion_error = (function4, res4)
val funcion_error = (function5, res5)
val funcion_error = (function6, res6)
val funcion_error = (function7, res7)


// Regla de Simpson 1/3 Compuesta



// Regla de Simpson 1/3 Extendida
